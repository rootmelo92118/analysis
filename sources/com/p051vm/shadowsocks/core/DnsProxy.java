package com.p051vm.shadowsocks.core;

import android.util.SparseArray;
import com.p051vm.shadowsocks.dns.DnsPacket;
import com.p051vm.shadowsocks.dns.Question;
import com.p051vm.shadowsocks.dns.Resource;
import com.p051vm.shadowsocks.dns.ResourcePointer;
import com.p051vm.shadowsocks.tcpip.CommonMethods;
import com.p051vm.shadowsocks.tcpip.IPHeader;
import com.p051vm.shadowsocks.tcpip.UDPHeader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vm.shadowsocks.core.DnsProxy */
public class DnsProxy implements Runnable {
    private static final ConcurrentHashMap<String, Integer> DomainIPMaps = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, String> IPDomainMaps = new ConcurrentHashMap<>();
    private final long QUERY_TIMEOUT_NS = 10000000000L;
    public boolean Stopped;
    private DatagramSocket m_Client = new DatagramSocket(0);
    private SparseArray<QueryState> m_QueryArray = new SparseArray<>();
    private short m_QueryID;
    private Thread m_ReceivedThread;

    /* renamed from: com.vm.shadowsocks.core.DnsProxy$QueryState */
    private class QueryState {
        public int ClientIP;
        public short ClientPort;
        public short ClientQueryID;
        public long QueryNanoTime;
        public int RemoteIP;
        public short RemotePort;

        private QueryState() {
        }
    }

    public static String reverseLookup(int i) {
        return IPDomainMaps.get(Integer.valueOf(i));
    }

    public void start() {
        this.m_ReceivedThread = new Thread(this);
        this.m_ReceivedThread.setName("DnsProxyThread");
        this.m_ReceivedThread.start();
    }

    public void stop() {
        this.Stopped = true;
        if (this.m_Client != null) {
            this.m_Client.close();
            this.m_Client = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0002] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            com.vm.shadowsocks.tcpip.IPHeader r1 = new com.vm.shadowsocks.tcpip.IPHeader     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r1.Default()     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            com.vm.shadowsocks.tcpip.UDPHeader r2 = new com.vm.shadowsocks.tcpip.UDPHeader     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r3 = 20
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r4 = 28
            r3.position(r4)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            java.nio.ByteBuffer r3 = r3.slice()     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            int r6 = r0.length     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            int r6 = r6 - r4
            r5.<init>(r0, r4, r6)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
        L_0x0028:
            java.net.DatagramSocket r6 = r7.m_Client     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            if (r6 == 0) goto L_0x0057
            java.net.DatagramSocket r6 = r7.m_Client     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            boolean r6 = r6.isClosed()     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            if (r6 != 0) goto L_0x0057
            int r6 = r0.length     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            int r6 = r6 - r4
            r5.setLength(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            java.net.DatagramSocket r6 = r7.m_Client     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r6.receive(r5)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r3.clear()     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            int r6 = r5.getLength()     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r3.limit(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            com.vm.shadowsocks.dns.DnsPacket r6 = com.p051vm.shadowsocks.dns.DnsPacket.FromBytes(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0052 }
            if (r6 == 0) goto L_0x0028
            r7.OnDnsResponseReceived(r1, r2, r6)     // Catch:{ Exception -> 0x0028, all -> 0x0052 }
            goto L_0x0028
        L_0x0052:
            r0 = move-exception
            r7.stop()
            throw r0
        L_0x0057:
            r7.stop()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051vm.shadowsocks.core.DnsProxy.run():void");
    }

    private int getFirstIP(DnsPacket dnsPacket) {
        for (int i = 0; i < dnsPacket.Header.ResourceCount; i++) {
            Resource resource = dnsPacket.Resources[i];
            if (resource.Type == 1) {
                return CommonMethods.readInt(resource.Data, 0);
            }
        }
        return 0;
    }

    private void tamperDnsResponse(byte[] bArr, DnsPacket dnsPacket, int i) {
        Question question = dnsPacket.Questions[0];
        dnsPacket.Header.setResourceCount(1);
        dnsPacket.Header.setAResourceCount(0);
        dnsPacket.Header.setEResourceCount(0);
        ResourcePointer resourcePointer = new ResourcePointer(bArr, question.Offset() + question.Length());
        resourcePointer.setDomain(-16372);
        resourcePointer.setType(question.Type);
        resourcePointer.setClass(question.Class);
        resourcePointer.setTTL(ProxyConfig.Instance.getDnsTTL());
        resourcePointer.setDataLength(4);
        resourcePointer.setIP(i);
        dnsPacket.Size = question.Length() + 12 + 16;
    }

    private int getOrCreateFakeIP(String str) {
        Integer valueOf;
        Integer num = DomainIPMaps.get(str);
        if (num == null) {
            int hashCode = str.hashCode();
            do {
                valueOf = Integer.valueOf(ProxyConfig.FAKE_NETWORK_IP | (65535 & hashCode));
                hashCode++;
            } while (IPDomainMaps.containsKey(valueOf));
            DomainIPMaps.put(str, valueOf);
            IPDomainMaps.put(valueOf, str);
            num = valueOf;
        }
        return num.intValue();
    }

    private boolean dnsPollution(byte[] bArr, DnsPacket dnsPacket) {
        if (dnsPacket.Header.QuestionCount > 0) {
            Question question = dnsPacket.Questions[0];
            if (question.Type == 1) {
                if (ProxyConfig.Instance.needProxy(question.Domain, getFirstIP(dnsPacket))) {
                    tamperDnsResponse(bArr, dnsPacket, getOrCreateFakeIP(question.Domain));
                    return true;
                }
            }
        }
        return false;
    }

    private void OnDnsResponseReceived(IPHeader iPHeader, UDPHeader uDPHeader, DnsPacket dnsPacket) {
        QueryState queryState;
        synchronized (this.m_QueryArray) {
            queryState = this.m_QueryArray.get(dnsPacket.Header.f9028ID);
            if (queryState != null) {
                this.m_QueryArray.remove(dnsPacket.Header.f9028ID);
            }
        }
        if (queryState != null) {
            dnsPollution(uDPHeader.m_Data, dnsPacket);
            dnsPacket.Header.setID(queryState.ClientQueryID);
            iPHeader.setSourceIP(queryState.RemoteIP);
            iPHeader.setDestinationIP(queryState.ClientIP);
            iPHeader.setProtocol(IPHeader.UDP);
            iPHeader.setTotalLength(dnsPacket.Size + 28);
            uDPHeader.setSourcePort(queryState.RemotePort);
            uDPHeader.setDestinationPort(queryState.ClientPort);
            uDPHeader.setTotalLength(dnsPacket.Size + 8);
            LocalVpnService.Instance.sendUDPPacket(iPHeader, uDPHeader);
        }
    }

    private int getIPFromCache(String str) {
        Integer num = DomainIPMaps.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private boolean interceptDns(IPHeader iPHeader, UDPHeader uDPHeader, DnsPacket dnsPacket) {
        Question question = dnsPacket.Questions[0];
        if (question.Type != 1 || !ProxyConfig.Instance.needProxy(question.Domain, getIPFromCache(question.Domain))) {
            return false;
        }
        tamperDnsResponse(iPHeader.m_Data, dnsPacket, getOrCreateFakeIP(question.Domain));
        int sourceIP = iPHeader.getSourceIP();
        short sourcePort = uDPHeader.getSourcePort();
        iPHeader.setSourceIP(iPHeader.getDestinationIP());
        iPHeader.setDestinationIP(sourceIP);
        iPHeader.setTotalLength(dnsPacket.Size + 28);
        uDPHeader.setSourcePort(uDPHeader.getDestinationPort());
        uDPHeader.setDestinationPort(sourcePort);
        uDPHeader.setTotalLength(dnsPacket.Size + 8);
        LocalVpnService.Instance.sendUDPPacket(iPHeader, uDPHeader);
        return true;
    }

    private void clearExpiredQueries() {
        long nanoTime = System.nanoTime();
        for (int size = this.m_QueryArray.size() - 1; size >= 0; size--) {
            if (nanoTime - this.m_QueryArray.valueAt(size).QueryNanoTime > 10000000000L) {
                this.m_QueryArray.removeAt(size);
            }
        }
    }

    public void onDnsRequestReceived(IPHeader iPHeader, UDPHeader uDPHeader, DnsPacket dnsPacket) {
        if (!interceptDns(iPHeader, uDPHeader, dnsPacket)) {
            QueryState queryState = new QueryState();
            queryState.ClientQueryID = dnsPacket.Header.f9028ID;
            queryState.QueryNanoTime = System.nanoTime();
            queryState.ClientIP = iPHeader.getSourceIP();
            queryState.ClientPort = uDPHeader.getSourcePort();
            queryState.RemoteIP = iPHeader.getDestinationIP();
            queryState.RemotePort = uDPHeader.getDestinationPort();
            this.m_QueryID = (short) (this.m_QueryID + 1);
            dnsPacket.Header.setID(this.m_QueryID);
            synchronized (this.m_QueryArray) {
                clearExpiredQueries();
                this.m_QueryArray.put(this.m_QueryID, queryState);
            }
            InetSocketAddress inetSocketAddress = new InetSocketAddress(CommonMethods.ipIntToInet4Address(queryState.RemoteIP), queryState.RemotePort);
            DatagramPacket datagramPacket = new DatagramPacket(uDPHeader.m_Data, uDPHeader.m_Offset + 8, dnsPacket.Size);
            datagramPacket.setSocketAddress(inetSocketAddress);
            try {
                if (LocalVpnService.Instance.protect(this.m_Client)) {
                    this.m_Client.send(datagramPacket);
                }
            } catch (IOException unused) {
            }
        }
    }
}
