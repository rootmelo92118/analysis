package com.google.firebase.iid;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.p034v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.p040b.C0742h;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.ac */
final class C2368ac {
    @GuardedBy("this")

    /* renamed from: a */
    private int f8829a = 0;
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<Integer, C0742h<Void>> f8830b = new ArrayMap();
    @GuardedBy("itself")

    /* renamed from: c */
    private final C2415y f8831c;

    C2368ac(C2415y yVar) {
        this.f8831c = yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo14981a() {
        return m11653b() != null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (m11651a(r5, r0) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r4.f8830b.remove(java.lang.Integer.valueOf(r4.f8829a));
        m11652a(r0);
        r4.f8829a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r2.mo9487a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return true;
     */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14982a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.m11653b()     // Catch:{ all -> 0x0042 }
            r1 = 1
            if (r0 != 0) goto L_0x0017
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.m11614f()     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0015
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0042 }
        L_0x0015:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            return r1
        L_0x0017:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            boolean r2 = m11651a(r5, r0)
            if (r2 != 0) goto L_0x0020
            r5 = 0
            return r5
        L_0x0020:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.b.h<java.lang.Void>> r2 = r4.f8830b     // Catch:{ all -> 0x003f }
            int r3 = r4.f8829a     // Catch:{ all -> 0x003f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x003f }
            com.google.android.gms.b.h r2 = (com.google.android.gms.p040b.C0742h) r2     // Catch:{ all -> 0x003f }
            r4.m11652a((java.lang.String) r0)     // Catch:{ all -> 0x003f }
            int r0 = r4.f8829a     // Catch:{ all -> 0x003f }
            int r0 = r0 + r1
            r4.f8829a = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.mo9487a(r0)
            goto L_0x0000
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            throw r5
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2368ac.mo14982a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    @Nullable
    @GuardedBy("this")
    /* renamed from: b */
    private final String m11653b() {
        String a;
        synchronized (this.f8831c) {
            a = this.f8831c.mo15042a();
        }
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        String[] split = a.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    /* renamed from: a */
    private final synchronized boolean m11652a(String str) {
        synchronized (this.f8831c) {
            String a = this.f8831c.mo15042a();
            String valueOf = String.valueOf(",");
            String valueOf2 = String.valueOf(str);
            if (!a.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                return false;
            }
            String valueOf3 = String.valueOf(",");
            String valueOf4 = String.valueOf(str);
            this.f8831c.mo15043a(a.substring((valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).length()));
            return true;
        }
    }

    @WorkerThread
    /* renamed from: a */
    private static boolean m11651a(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str2.equals("S")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        firebaseInstanceId.mo14956a(str3);
                        if (FirebaseInstanceId.m11614f()) {
                            Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                            break;
                        }
                        break;
                    case 1:
                        firebaseInstanceId.mo14961b(str3);
                        if (FirebaseInstanceId.m11614f()) {
                            Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                            break;
                        }
                        break;
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Topic sync failed: ".concat(valueOf) : new String("Topic sync failed: "));
                return false;
            }
        }
        return true;
    }
}
