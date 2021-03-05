package com.google.firebase.iid;

import android.support.p034v4.util.ArrayMap;
import android.util.Pair;
import com.google.android.gms.p040b.C0741g;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.s */
final class C2409s {

    /* renamed from: a */
    private final Executor f8912a;
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<Pair<String, String>, C0741g<String>> f8913b = new ArrayMap();

    C2409s(Executor executor) {
        this.f8912a = executor;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.p040b.C0741g<java.lang.String> mo15037a(java.lang.String r4, java.lang.String r5, com.google.firebase.iid.C2411u r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0081 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0081 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.b.g<java.lang.String>> r4 = r3.f8913b     // Catch:{ all -> 0x0081 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0081 }
            com.google.android.gms.b.g r4 = (com.google.android.gms.p040b.C0741g) r4     // Catch:{ all -> 0x0081 }
            r5 = 3
            if (r4 == 0) goto L_0x003f
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0081 }
            int r0 = r0.length()     // Catch:{ all -> 0x0081 }
            int r0 = r0 + 29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r1.<init>(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            r1.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0081 }
        L_0x003d:
            monitor-exit(r3)
            return r4
        L_0x003f:
            java.lang.String r4 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0081 }
            int r1 = r1.length()     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "Making new request for: "
            r2.append(r1)     // Catch:{ all -> 0x0081 }
            r2.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x0081 }
        L_0x006b:
            com.google.android.gms.b.g r4 = r6.mo14996a()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.Executor r5 = r3.f8912a     // Catch:{ all -> 0x0081 }
            com.google.firebase.iid.t r6 = new com.google.firebase.iid.t     // Catch:{ all -> 0x0081 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0081 }
            com.google.android.gms.b.g r4 = r4.mo9480b(r5, r6)     // Catch:{ all -> 0x0081 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.b.g<java.lang.String>> r5 = r3.f8913b     // Catch:{ all -> 0x0081 }
            r5.put(r0, r4)     // Catch:{ all -> 0x0081 }
            monitor-exit(r3)
            return r4
        L_0x0081:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2409s.mo15037a(java.lang.String, java.lang.String, com.google.firebase.iid.u):com.google.android.gms.b.g");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C0741g mo15036a(Pair pair, C0741g gVar) {
        synchronized (this) {
            this.f8913b.remove(pair);
        }
        return gVar;
    }
}
