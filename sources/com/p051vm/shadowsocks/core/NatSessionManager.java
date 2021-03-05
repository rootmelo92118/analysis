package com.p051vm.shadowsocks.core;

import android.util.SparseArray;
import com.p051vm.shadowsocks.tcpip.CommonMethods;

/* renamed from: com.vm.shadowsocks.core.NatSessionManager */
public class NatSessionManager {
    static final int MAX_SESSION_COUNT = 60;
    static final long SESSION_TIMEOUT_NS = 60000000000L;
    static final SparseArray<NatSession> Sessions = new SparseArray<>();

    public static NatSession getSession(int i) {
        return Sessions.get(i);
    }

    public static int getSessionCount() {
        return Sessions.size();
    }

    static void clearExpiredSessions() {
        long nanoTime = System.nanoTime();
        for (int size = Sessions.size() - 1; size >= 0; size--) {
            if (nanoTime - Sessions.valueAt(size).LastNanoTime > SESSION_TIMEOUT_NS) {
                Sessions.removeAt(size);
            }
        }
    }

    public static NatSession createSession(int i, int i2, short s) {
        if (Sessions.size() > 60) {
            clearExpiredSessions();
        }
        NatSession natSession = new NatSession();
        natSession.LastNanoTime = System.nanoTime();
        natSession.RemoteIP = i2;
        natSession.RemotePort = s;
        if (ProxyConfig.isFakeIP(i2)) {
            natSession.RemoteHost = DnsProxy.reverseLookup(i2);
        }
        if (natSession.RemoteHost == null) {
            natSession.RemoteHost = CommonMethods.ipIntToString(i2);
        }
        Sessions.put(i, natSession);
        return natSession;
    }
}
