package com.p051vm.shadowsocks.core;

import android.annotation.SuppressLint;
import android.util.Log;
import com.p051vm.shadowsocks.tcpip.CommonMethods;
import com.p051vm.shadowsocks.tunnel.Config;
import com.p051vm.shadowsocks.tunnel.httpconnect.HttpConnectConfig;
import com.p051vm.shadowsocks.tunnel.shadowsocks.ShadowsocksConfig;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.vm.shadowsocks.core.ProxyConfig */
public class ProxyConfig {
    public static String AppInstallID = null;
    public static String AppVersion = null;
    public static final int FAKE_NETWORK_IP = CommonMethods.ipStringToInt("172.25.0.0");
    public static final int FAKE_NETWORK_MASK = CommonMethods.ipStringToInt("255.255.0.0");
    public static final boolean IS_DEBUG = false;
    public static final ProxyConfig Instance = new ProxyConfig();
    public boolean globalMode = false;
    ArrayList<IPAddress> m_DnsList = new ArrayList<>();
    HashMap<String, Boolean> m_DomainMap = new HashMap<>();
    ArrayList<IPAddress> m_IpList = new ArrayList<>();
    public ArrayList<Config> m_ProxyList = new ArrayList<>();
    ArrayList<IPAddress> m_RouteList = new ArrayList<>();
    TimerTask m_Task = new TimerTask() {
        public void run() {
            refreshProxyServer();
        }

        /* access modifiers changed from: package-private */
        public void refreshProxyServer() {
            int i = 0;
            while (i < ProxyConfig.this.m_ProxyList.size()) {
                try {
                    try {
                        Config config = ProxyConfig.this.m_ProxyList.get(0);
                        InetAddress byName = InetAddress.getByName(config.ServerAddress.getHostName());
                        if (byName != null && !byName.equals(config.ServerAddress.getAddress())) {
                            config.ServerAddress = new InetSocketAddress(byName, config.ServerAddress.getPort());
                        }
                    } catch (Exception unused) {
                    }
                    i++;
                } catch (Exception unused2) {
                    return;
                }
            }
        }
    };
    Timer m_Timer = new Timer();
    int m_dns_ttl;
    boolean m_isolate_http_host_header = true;
    int m_mtu;
    boolean m_outside_china_use_proxy = true;
    String m_session_name;
    String m_user_agent;
    String m_welcome_info;

    private String[] downloadConfig(String str) {
        return null;
    }

    /* renamed from: com.vm.shadowsocks.core.ProxyConfig$IPAddress */
    public class IPAddress {
        public final String Address;
        public final int PrefixLength;

        public IPAddress(String str, int i) {
            this.Address = str;
            this.PrefixLength = i;
        }

        public IPAddress(String str) {
            String[] split = str.split("/");
            String str2 = split[0];
            int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 32;
            this.Address = str2;
            this.PrefixLength = parseInt;
        }

        @SuppressLint({"DefaultLocale"})
        public String toString() {
            return String.format("%s/%d", new Object[]{this.Address, Integer.valueOf(this.PrefixLength)});
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return toString().equals(obj.toString());
        }
    }

    public ProxyConfig() {
        this.m_Timer.schedule(this.m_Task, 120000, 120000);
    }

    public static boolean isFakeIP(int i) {
        return (i & FAKE_NETWORK_MASK) == FAKE_NETWORK_IP;
    }

    public Config getDefaultProxy() {
        if (this.m_ProxyList.size() > 0) {
            return this.m_ProxyList.get(0);
        }
        return null;
    }

    public Config getDefaultTunnelConfig(InetSocketAddress inetSocketAddress) {
        return getDefaultProxy();
    }

    public IPAddress getDefaultLocalIP() {
        if (this.m_IpList.size() > 0) {
            return this.m_IpList.get(0);
        }
        return new IPAddress("10.8.0.2", 32);
    }

    public ArrayList<IPAddress> getDnsList() {
        return this.m_DnsList;
    }

    public ArrayList<IPAddress> getRouteList() {
        return this.m_RouteList;
    }

    public int getDnsTTL() {
        if (this.m_dns_ttl < 30) {
            this.m_dns_ttl = 30;
        }
        return this.m_dns_ttl;
    }

    public String getWelcomeInfo() {
        return this.m_welcome_info;
    }

    public String getSessionName() {
        if (this.m_session_name == null) {
            this.m_session_name = getDefaultProxy().ServerAddress.getHostName();
        }
        return this.m_session_name;
    }

    public String getUserAgent() {
        if (this.m_user_agent == null || this.m_user_agent.isEmpty()) {
            this.m_user_agent = System.getProperty("http.agent");
        }
        return this.m_user_agent;
    }

    public int getMTU() {
        if (this.m_mtu <= 1400 || this.m_mtu > 20000) {
            return 20000;
        }
        return this.m_mtu;
    }

    private Boolean getDomainState(String str) {
        String lowerCase = str.toLowerCase();
        while (lowerCase.length() > 0) {
            Boolean bool = this.m_DomainMap.get(lowerCase);
            if (bool != null) {
                return bool;
            }
            int indexOf = lowerCase.indexOf(46) + 1;
            if (indexOf <= 0 || indexOf >= lowerCase.length()) {
                return null;
            }
            lowerCase = lowerCase.substring(indexOf);
        }
        return null;
    }

    public boolean needProxy(String str, int i) {
        Boolean domainState;
        if (this.globalMode) {
            return true;
        }
        if (str != null && (domainState = getDomainState(str)) != null) {
            return domainState.booleanValue();
        }
        if (isFakeIP(i)) {
            return true;
        }
        if (!this.m_outside_china_use_proxy || i == 0) {
            return false;
        }
        return !ChinaIpMaskManager.isIPInChina(i);
    }

    public boolean isIsolateHttpHostHeader() {
        return this.m_isolate_http_host_header;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|14|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] readConfigFromFile(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 8192(0x2000, float:1.14794E-41)
            r2 = 0
            r3 = 0
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0036 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0036 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0036 }
        L_0x0010:
            int r3 = r4.read(r1)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            if (r3 <= 0) goto L_0x0021
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r1, r2, r3, r6)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r0.append(r5)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            goto L_0x0010
        L_0x0021:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            java.lang.String r1 = "\\n"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r4.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r0
        L_0x002f:
            r8 = move-exception
            r3 = r4
            goto L_0x0047
        L_0x0032:
            r3 = r4
            goto L_0x0036
        L_0x0034:
            r8 = move-exception
            goto L_0x0047
        L_0x0036:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "Can't read config file: %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0034 }
            r4[r2] = r8     // Catch:{ all -> 0x0034 }
            java.lang.String r8 = java.lang.String.format(r1, r4)     // Catch:{ all -> 0x0034 }
            r0.<init>(r8)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0047:
            if (r3 == 0) goto L_0x004c
            r3.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051vm.shadowsocks.core.ProxyConfig.readConfigFromFile(java.lang.String):java.lang.String[]");
    }

    public void loadFromFile(InputStream inputStream) {
        byte[] bArr = new byte[inputStream.available()];
        inputStream.read(bArr);
        loadFromLines(new String(bArr).split("\\r?\\n"));
    }

    public void loadFromUrl(String str) {
        String[] strArr;
        if (str.charAt(0) == '/') {
            strArr = readConfigFromFile(str);
        } else {
            strArr = downloadConfig(str);
        }
        loadFromLines(strArr);
    }

    /* access modifiers changed from: protected */
    public void loadFromLines(String[] strArr) {
        this.m_IpList.clear();
        this.m_DnsList.clear();
        this.m_RouteList.clear();
        this.m_ProxyList.clear();
        this.m_DomainMap.clear();
        int i = 0;
        for (String str : strArr) {
            i++;
            String[] split = str.split("\\s+");
            if (split.length >= 2) {
                String trim = split[0].toLowerCase(Locale.ENGLISH).trim();
                try {
                    if (!trim.startsWith("#")) {
                        if (trim.equals("ip")) {
                            addIPAddressToList(split, 1, this.m_IpList);
                        } else if (trim.equals("dns")) {
                            addIPAddressToList(split, 1, this.m_DnsList);
                        } else if (trim.equals("route")) {
                            addIPAddressToList(split, 1, this.m_RouteList);
                        } else if (trim.equals("proxy")) {
                            addProxyToList(split, 1);
                        } else if (trim.equals("direct_domain")) {
                            addDomainToHashMap(split, 1, false);
                        } else if (trim.equals("proxy_domain")) {
                            addDomainToHashMap(split, 1, true);
                        } else if (trim.equals("dns_ttl")) {
                            this.m_dns_ttl = Integer.parseInt(split[1]);
                        } else if (trim.equals("welcome_info")) {
                            this.m_welcome_info = str.substring(str.indexOf(" ")).trim();
                        } else if (trim.equals("session_name")) {
                            this.m_session_name = split[1];
                        } else if (trim.equals("user_agent")) {
                            this.m_user_agent = str.substring(str.indexOf(" ")).trim();
                        } else if (trim.equals("outside_china_use_proxy")) {
                            this.m_outside_china_use_proxy = convertToBool(split[1]);
                        } else if (trim.equals("isolate_http_host_header")) {
                            this.m_isolate_http_host_header = convertToBool(split[1]);
                        } else if (trim.equals("mtu")) {
                            this.m_mtu = Integer.parseInt(split[1]);
                        }
                    }
                } catch (Exception e) {
                    throw new Exception(String.format("config file parse error: line:%d, tag:%s, error:%s", new Object[]{Integer.valueOf(i), trim, e}));
                }
            }
        }
        if (this.m_ProxyList.size() == 0) {
            tryAddProxy(strArr);
        }
    }

    private void tryAddProxy(String[] strArr) {
        for (String matcher : strArr) {
            Matcher matcher2 = Pattern.compile("proxy\\s+([^:]+):(\\d+)", 2).matcher(matcher);
            while (matcher2.find()) {
                HttpConnectConfig httpConnectConfig = new HttpConnectConfig();
                httpConnectConfig.ServerAddress = new InetSocketAddress(matcher2.group(1), Integer.parseInt(matcher2.group(2)));
                if (!this.m_ProxyList.contains(httpConnectConfig)) {
                    Log.v("--tryAddProxy--", httpConnectConfig + "");
                    this.m_ProxyList.add(httpConnectConfig);
                    this.m_DomainMap.put(httpConnectConfig.ServerAddress.getHostName(), false);
                }
            }
        }
    }

    public void addProxyToList(String str) {
        Config config;
        Log.v("--proxyString--", str);
        if (str.startsWith("ss://")) {
            config = ShadowsocksConfig.parse(str);
        } else {
            if (!str.toLowerCase().startsWith("http://")) {
                str = "http://" + str;
            }
            config = HttpConnectConfig.parse(str);
        }
        if (!this.m_ProxyList.contains(config)) {
            Log.v("--addProxyToList--", config + "");
            this.m_ProxyList.add(config);
            this.m_DomainMap.put(config.ServerAddress.getHostName(), false);
        }
    }

    private void addProxyToList(String[] strArr, int i) {
        while (i < strArr.length) {
            addProxyToList(strArr[i].trim());
            i++;
        }
    }

    private void addDomainToHashMap(String[] strArr, int i, Boolean bool) {
        while (i < strArr.length) {
            String trim = strArr[i].toLowerCase().trim();
            if (trim.charAt(0) == '.') {
                trim = trim.substring(1);
            }
            this.m_DomainMap.put(trim, bool);
            i++;
        }
    }

    private boolean convertToBool(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String trim = str.toLowerCase(Locale.ENGLISH).trim();
        if (trim.equals("on") || trim.equals("1") || trim.equals("true") || trim.equals("yes")) {
            return true;
        }
        return false;
    }

    private void addIPAddressToList(String[] strArr, int i, ArrayList<IPAddress> arrayList) {
        while (i < strArr.length) {
            String lowerCase = strArr[i].trim().toLowerCase();
            if (!lowerCase.startsWith("#")) {
                IPAddress iPAddress = new IPAddress(lowerCase);
                if (!arrayList.contains(iPAddress)) {
                    arrayList.add(iPAddress);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
