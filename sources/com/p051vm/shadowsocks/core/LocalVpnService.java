package com.p051vm.shadowsocks.core;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.p051vm.constants.Constants;
import com.p051vm.shadowsocks.core.ProxyConfig;
import com.p051vm.shadowsocks.dns.DnsPacket;
import com.p051vm.shadowsocks.sockhome.C2545R;
import com.p051vm.shadowsocks.sockhome.HomeActivity;
import com.p051vm.shadowsocks.tcpip.CommonMethods;
import com.p051vm.shadowsocks.tcpip.IPHeader;
import com.p051vm.shadowsocks.tcpip.TCPHeader;
import com.p051vm.shadowsocks.tcpip.UDPHeader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.vm.shadowsocks.core.LocalVpnService */
public class LocalVpnService extends VpnService implements Runnable {

    /* renamed from: ID */
    private static int f9022ID;
    public static LocalVpnService Instance;
    public static AtomicBoolean IsRunning = new AtomicBoolean(false);
    private static int KeepTimeMin = 480;
    private static int LOCAL_IP;
    public static String ProxyUrl;
    /* access modifiers changed from: private */
    public static ConcurrentHashMap<onStatusChangedListener, Object> m_OnStatusChangedListeners = new ConcurrentHashMap<>();
    private static long startTimeStamp = System.currentTimeMillis();
    private ByteBuffer m_DNSBuffer = ((ByteBuffer) ByteBuffer.wrap(this.m_Packet).position(28)).slice();
    private DnsProxy m_DnsProxy;
    private Handler m_Handler = new Handler();
    private IPHeader m_IPHeader = new IPHeader(this.m_Packet, 0);
    private byte[] m_Packet = new byte[20000];
    private long m_ReceivedBytes;
    private long m_SentBytes;
    private TCPHeader m_TCPHeader = new TCPHeader(this.m_Packet, 20);
    private TcpProxyServer m_TcpProxyServer;
    private UDPHeader m_UDPHeader = new UDPHeader(this.m_Packet, 20);
    private ParcelFileDescriptor m_VPNInterface;
    private FileOutputStream m_VPNOutputStream;
    private Thread m_VPNThread;

    /* renamed from: com.vm.shadowsocks.core.LocalVpnService$onStatusChangedListener */
    public interface onStatusChangedListener {
        void onLogReceived(String str);

        void onStatusChanged(String str, Boolean bool);
    }

    public LocalVpnService() {
        f9022ID++;
        Instance = this;
    }

    public void onCreate() {
        this.m_VPNThread = new Thread(this, "VPNServiceThread");
        this.m_VPNThread.start();
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        IsRunning.set(true);
        return super.onStartCommand(intent, i, i2);
    }

    public static void addOnStatusChangedListener(onStatusChangedListener onstatuschangedlistener) {
        if (!m_OnStatusChangedListeners.containsKey(onstatuschangedlistener)) {
            m_OnStatusChangedListeners.put(onstatuschangedlistener, 1);
        }
    }

    public static void removeOnStatusChangedListener(onStatusChangedListener onstatuschangedlistener) {
        if (m_OnStatusChangedListeners.containsKey(onstatuschangedlistener)) {
            m_OnStatusChangedListeners.remove(onstatuschangedlistener);
        }
    }

    private void onStatusChanged(final String str, final boolean z) {
        this.m_Handler.post(new Runnable() {
            public void run() {
                for (Map.Entry key : LocalVpnService.m_OnStatusChangedListeners.entrySet()) {
                    ((onStatusChangedListener) key.getKey()).onStatusChanged(str, Boolean.valueOf(z));
                }
            }
        });
    }

    public void sendUDPPacket(IPHeader iPHeader, UDPHeader uDPHeader) {
        try {
            CommonMethods.ComputeUDPChecksum(iPHeader, uDPHeader);
            this.m_VPNOutputStream.write(iPHeader.m_Data, iPHeader.m_Offset, iPHeader.getTotalLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public String getAppInstallID() {
        SharedPreferences sharedPreferences = getSharedPreferences("SmartProxy", 0);
        String string = sharedPreferences.getString("AppInstallID", (String) null);
        if (string != null && !string.isEmpty()) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("AppInstallID", uuid);
        edit.apply();
        return uuid;
    }

    /* access modifiers changed from: package-private */
    public String getVersionName() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "0.0";
        }
    }

    public synchronized void run() {
        try {
            ProxyConfig.AppInstallID = getAppInstallID();
            ProxyConfig.AppVersion = getVersionName();
            waitUntilPreapred();
            try {
                ProxyConfig.Instance.loadFromFile(getResources().openRawResource(C2545R.raw.config));
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null || message.isEmpty()) {
                    e.toString();
                }
            }
            this.m_TcpProxyServer = new TcpProxyServer(0);
            this.m_TcpProxyServer.start();
            this.m_DnsProxy = new DnsProxy();
            this.m_DnsProxy.start();
            while (true) {
                if (IsRunning.get()) {
                    try {
                        ProxyConfig.Instance.m_ProxyList.clear();
                        ProxyConfig.Instance.addProxyToList(ProxyUrl);
                        runVPN();
                    } catch (Exception e2) {
                        String message2 = e2.getMessage();
                        if (message2 == null || message2.isEmpty()) {
                            message2 = e2.toString();
                        }
                        IsRunning.set(false);
                        onStatusChanged(message2, false);
                    }
                } else {
                    Thread.sleep(10);
                }
            }
        } catch (Exception | InterruptedException unused) {
            dispose();
        } catch (Throwable th) {
            dispose();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        throw new java.lang.Exception("LocalServer stopped.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void runVPN() {
        /*
            r8 = this;
            android.os.ParcelFileDescriptor r0 = r8.establishVPN()
            r8.m_VPNInterface = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            android.os.ParcelFileDescriptor r1 = r8.m_VPNInterface
            java.io.FileDescriptor r1 = r1.getFileDescriptor()
            r0.<init>(r1)
            r8.m_VPNOutputStream = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream
            android.os.ParcelFileDescriptor r1 = r8.m_VPNInterface
            java.io.FileDescriptor r1 = r1.getFileDescriptor()
            r0.<init>(r1)
            java.lang.String r1 = "VPN_START_COMPLATE"
            java.util.concurrent.atomic.AtomicBoolean r2 = IsRunning
            boolean r2 = r2.get()
            r8.onStatusChanged(r1, r2)
            com.vm.a.a r1 = com.p051vm.p052a.C2505a.m11786a((android.content.Context) r8)
            java.lang.Integer r1 = r1.mo15454a()
            if (r1 == 0) goto L_0x0038
            int r1 = r1.intValue()
            goto L_0x003a
        L_0x0038:
            int r1 = KeepTimeMin
        L_0x003a:
            KeepTimeMin = r1
            long r1 = java.lang.System.currentTimeMillis()
            startTimeStamp = r1
            r1 = 0
        L_0x0043:
            r2 = -1
            if (r1 == r2) goto L_0x0098
            java.util.concurrent.atomic.AtomicBoolean r1 = IsRunning
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0098
        L_0x004e:
            byte[] r1 = r8.m_Packet
            int r1 = r0.read(r1)
            if (r1 <= 0) goto L_0x007b
            java.util.concurrent.atomic.AtomicBoolean r2 = IsRunning
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x007b
            com.vm.shadowsocks.core.DnsProxy r2 = r8.m_DnsProxy
            boolean r2 = r2.Stopped
            if (r2 != 0) goto L_0x0070
            com.vm.shadowsocks.core.TcpProxyServer r2 = r8.m_TcpProxyServer
            boolean r2 = r2.Stopped
            if (r2 != 0) goto L_0x0070
            com.vm.shadowsocks.tcpip.IPHeader r2 = r8.m_IPHeader
            r8.onIPPacketReceived(r2, r1)
            goto L_0x004e
        L_0x0070:
            r0.close()
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "LocalServer stopped."
            r0.<init>(r1)
            throw r0
        L_0x007b:
            long r2 = startTimeStamp
            int r4 = KeepTimeMin
            int r4 = r4 * 60
            long r4 = (long) r4
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r2 = r2 + r4
            long r4 = java.lang.System.currentTimeMillis()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0092
            r8.disconnectVPN()
        L_0x0092:
            r2 = 2
            java.lang.Thread.sleep(r2)
            goto L_0x0043
        L_0x0098:
            r0.close()
            r8.disconnectVPN()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051vm.shadowsocks.core.LocalVpnService.runVPN():void");
    }

    /* access modifiers changed from: package-private */
    public void onIPPacketReceived(IPHeader iPHeader, int i) {
        String parseHost;
        byte protocol = iPHeader.getProtocol();
        if (protocol == 6) {
            TCPHeader tCPHeader = this.m_TCPHeader;
            tCPHeader.m_Offset = iPHeader.getHeaderLength();
            if (iPHeader.getSourceIP() != LOCAL_IP) {
                return;
            }
            if (tCPHeader.getSourcePort() == this.m_TcpProxyServer.Port) {
                NatSession session = NatSessionManager.getSession(tCPHeader.getDestinationPort());
                if (session != null) {
                    iPHeader.setSourceIP(iPHeader.getDestinationIP());
                    tCPHeader.setSourcePort(session.RemotePort);
                    iPHeader.setDestinationIP(LOCAL_IP);
                    CommonMethods.ComputeTCPChecksum(iPHeader, tCPHeader);
                    this.m_VPNOutputStream.write(iPHeader.m_Data, iPHeader.m_Offset, i);
                    this.m_ReceivedBytes += (long) i;
                    return;
                }
                return;
            }
            short sourcePort = tCPHeader.getSourcePort();
            NatSession session2 = NatSessionManager.getSession(sourcePort);
            if (!(session2 != null && session2.RemoteIP == iPHeader.getDestinationIP() && session2.RemotePort == tCPHeader.getDestinationPort())) {
                session2 = NatSessionManager.createSession(sourcePort, iPHeader.getDestinationIP(), tCPHeader.getDestinationPort());
            }
            session2.LastNanoTime = System.nanoTime();
            session2.PacketSent++;
            int dataLength = iPHeader.getDataLength() - tCPHeader.getHeaderLength();
            if (session2.PacketSent != 2 || dataLength != 0) {
                if (session2.BytesSent == 0 && dataLength > 10 && (parseHost = HttpHostHeaderParser.parseHost(tCPHeader.m_Data, tCPHeader.m_Offset + tCPHeader.getHeaderLength(), dataLength)) != null) {
                    session2.RemoteHost = parseHost;
                }
                iPHeader.setSourceIP(iPHeader.getDestinationIP());
                iPHeader.setDestinationIP(LOCAL_IP);
                tCPHeader.setDestinationPort(this.m_TcpProxyServer.Port);
                CommonMethods.ComputeTCPChecksum(iPHeader, tCPHeader);
                this.m_VPNOutputStream.write(iPHeader.m_Data, iPHeader.m_Offset, i);
                session2.BytesSent += dataLength;
                this.m_SentBytes += (long) i;
            }
        } else if (protocol == 17) {
            UDPHeader uDPHeader = this.m_UDPHeader;
            uDPHeader.m_Offset = iPHeader.getHeaderLength();
            if (iPHeader.getSourceIP() == LOCAL_IP && uDPHeader.getDestinationPort() == 53) {
                this.m_DNSBuffer.clear();
                this.m_DNSBuffer.limit(iPHeader.getDataLength() - 8);
                DnsPacket FromBytes = DnsPacket.FromBytes(this.m_DNSBuffer);
                if (FromBytes != null && FromBytes.Header.QuestionCount > 0) {
                    this.m_DnsProxy.onDnsRequestReceived(iPHeader, uDPHeader, FromBytes);
                }
            }
        }
    }

    private void waitUntilPreapred() {
        while (prepare(this) != null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private ParcelFileDescriptor establishVPN() {
        VpnService.Builder builder = new VpnService.Builder(this);
        builder.setMtu(ProxyConfig.Instance.getMTU());
        ProxyConfig.IPAddress defaultLocalIP = ProxyConfig.Instance.getDefaultLocalIP();
        LOCAL_IP = CommonMethods.ipStringToInt(defaultLocalIP.Address);
        builder.addAddress(defaultLocalIP.Address, defaultLocalIP.PrefixLength);
        Iterator<ProxyConfig.IPAddress> it = ProxyConfig.Instance.getDnsList().iterator();
        while (it.hasNext()) {
            builder.addDnsServer(it.next().Address);
        }
        if (ProxyConfig.Instance.getRouteList().size() > 0) {
            Iterator<ProxyConfig.IPAddress> it2 = ProxyConfig.Instance.getRouteList().iterator();
            while (it2.hasNext()) {
                ProxyConfig.IPAddress next = it2.next();
                builder.addRoute(next.Address, next.PrefixLength);
            }
            builder.addRoute(CommonMethods.ipIntToString(ProxyConfig.FAKE_NETWORK_IP), 16);
        } else {
            builder.addRoute("0.0.0.0", 0);
        }
        Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = (String) method.invoke((Object) null, new Object[]{strArr[i]});
            if (str != null && !"".equals(str) && !arrayList.contains(str)) {
                arrayList.add(str);
                if (str.replaceAll("\\d", "").length() == 3) {
                    builder.addRoute(str, 32);
                } else {
                    builder.addRoute(str, 128);
                }
            }
        }
        if (AppProxyManager.isLollipopOrAbove) {
            builder.addAllowedApplication("com.vm.shadowsocks.sockhome");
            for (Map.Entry key : AppProxyManager.proxyAppInfo.entrySet()) {
                try {
                    builder.addAllowedApplication((String) key.getKey());
                } catch (Exception unused) {
                }
            }
        }
        builder.setConfigureIntent(PendingIntent.getActivity(this, 0, new Intent(this, HomeActivity.class), 0));
        builder.setSession(ProxyConfig.Instance.getSessionName());
        return builder.establish();
    }

    public void disconnectVPN() {
        try {
            if (this.m_VPNInterface != null) {
                this.m_VPNInterface.close();
                this.m_VPNInterface = null;
            }
        } catch (Exception unused) {
        }
        onStatusChanged(Constants.VPN_KEEP_TIME_OVER_SHUTDOWN, IsRunning.get());
        this.m_VPNOutputStream = null;
    }

    private synchronized void dispose() {
        disconnectVPN();
        if (this.m_TcpProxyServer != null) {
            this.m_TcpProxyServer.stop();
            this.m_TcpProxyServer = null;
        }
        if (this.m_DnsProxy != null) {
            this.m_DnsProxy.stop();
            this.m_DnsProxy = null;
        }
        stopSelf();
        IsRunning.set(false);
        System.exit(0);
    }

    public void onDestroy() {
        if (this.m_VPNThread != null) {
            this.m_VPNThread.interrupt();
        }
    }
}
