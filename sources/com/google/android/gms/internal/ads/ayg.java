package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutionException;

public final class ayg extends aza {

    /* renamed from: d */
    private static final azb<aun> f3116d = new azb<>();

    /* renamed from: e */
    private final Context f3117e;

    /* renamed from: f */
    private ahf f3118f = null;

    public ayg(axq axq, String str, String str2, akd akd, int i, int i2, Context context, ahf ahf) {
        super(axq, str, str2, akd, i, 27);
        this.f3117e = context;
        this.f3118f = ahf;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11418a() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.azb<com.google.android.gms.internal.ads.aun> r0 = f3116d
            android.content.Context r1 = r9.f3117e
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.mo11427a(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.aun r1 = (com.google.android.gms.internal.ads.aun) r1     // Catch:{ all -> 0x0110 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f2583a     // Catch:{ all -> 0x0110 }
            boolean r4 = com.google.android.gms.internal.ads.axx.m4436b(r4)     // Catch:{ all -> 0x0110 }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = r1.f2583a     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = "E"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0110 }
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = r1.f2583a     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x00db
            com.google.android.gms.internal.ads.ahf r1 = r9.f3118f     // Catch:{ all -> 0x0110 }
            r1 = 0
            boolean r4 = com.google.android.gms.internal.ads.axx.m4436b(r1)     // Catch:{ all -> 0x0110 }
            r5 = 3
            r6 = 2
            if (r4 != 0) goto L_0x0046
            r4 = 4
            goto L_0x0089
        L_0x0046:
            com.google.android.gms.internal.ads.ahf r4 = r9.f3118f     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.axx.m4436b(r1)     // Catch:{ all -> 0x0110 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0110 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0110 }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.axq r4 = r9.f3147a     // Catch:{ all -> 0x0110 }
            boolean r4 = r4.mo11382i()     // Catch:{ all -> 0x0110 }
            if (r4 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C1557p.f5988bq     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.m r7 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0110 }
            java.lang.Object r4 = r7.mo12778a(r4)     // Catch:{ all -> 0x0110 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0110 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0110 }
            if (r4 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C1557p.f5989br     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.m r7 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0110 }
            java.lang.Object r4 = r7.mo12778a(r4)     // Catch:{ all -> 0x0110 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0110 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0110 }
            if (r4 == 0) goto L_0x0083
            r4 = 1
            goto L_0x0084
        L_0x0083:
            r4 = 0
        L_0x0084:
            if (r4 == 0) goto L_0x0088
            r4 = 3
            goto L_0x0089
        L_0x0088:
            r4 = 2
        L_0x0089:
            java.lang.reflect.Method r7 = r9.f3149c     // Catch:{ all -> 0x0110 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0110 }
            android.content.Context r8 = r9.f3117e     // Catch:{ all -> 0x0110 }
            r5[r3] = r8     // Catch:{ all -> 0x0110 }
            if (r4 != r6) goto L_0x0094
            r3 = 1
        L_0x0094:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0110 }
            r5[r2] = r3     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C1557p.f5982bk     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.m r3 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0110 }
            java.lang.Object r2 = r3.mo12778a(r2)     // Catch:{ all -> 0x0110 }
            r5[r6] = r2     // Catch:{ all -> 0x0110 }
            java.lang.Object r2 = r7.invoke(r1, r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.aun r3 = new com.google.android.gms.internal.ads.aun     // Catch:{ all -> 0x0110 }
            r3.<init>(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r3.f2583a     // Catch:{ all -> 0x0110 }
            boolean r2 = com.google.android.gms.internal.ads.axx.m4436b(r2)     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x00c3
            java.lang.String r2 = r3.f2583a     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = "E"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x00d8
        L_0x00c3:
            switch(r4) {
                case 3: goto L_0x00cc;
                case 4: goto L_0x00c7;
                default: goto L_0x00c6;
            }     // Catch:{ all -> 0x0110 }
        L_0x00c6:
            goto L_0x00d8
        L_0x00c7:
            java.lang.String r1 = r1.f1833a     // Catch:{ all -> 0x0110 }
            r3.f2583a = r1     // Catch:{ all -> 0x0110 }
            goto L_0x00d8
        L_0x00cc:
            java.lang.String r1 = r9.m4467c()     // Catch:{ all -> 0x0110 }
            boolean r2 = com.google.android.gms.internal.ads.axx.m4436b(r1)     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x00d8
            r3.f2583a = r1     // Catch:{ all -> 0x0110 }
        L_0x00d8:
            r0.set(r3)     // Catch:{ all -> 0x0110 }
        L_0x00db:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.aun r1 = (com.google.android.gms.internal.ads.aun) r1     // Catch:{ all -> 0x0110 }
            monitor-exit(r0)     // Catch:{ all -> 0x0110 }
            com.google.android.gms.internal.ads.akd r2 = r9.f3148b
            monitor-enter(r2)
            if (r1 == 0) goto L_0x010c
            com.google.android.gms.internal.ads.akd r0 = r9.f3148b     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r1.f2583a     // Catch:{ all -> 0x010a }
            r0.f1939n = r3     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.akd r0 = r9.f3148b     // Catch:{ all -> 0x010a }
            long r3 = r1.f2584b     // Catch:{ all -> 0x010a }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x010a }
            r0.f1945t = r3     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.akd r0 = r9.f3148b     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r1.f2585c     // Catch:{ all -> 0x010a }
            r0.f1944s = r3     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.akd r0 = r9.f3148b     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r1.f2586d     // Catch:{ all -> 0x010a }
            r0.f1883C = r3     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.akd r0 = r9.f3148b     // Catch:{ all -> 0x010a }
            java.lang.String r1 = r1.f2587e     // Catch:{ all -> 0x010a }
            r0.f1884D = r1     // Catch:{ all -> 0x010a }
            goto L_0x010c
        L_0x010a:
            r0 = move-exception
            goto L_0x010e
        L_0x010c:
            monitor-exit(r2)     // Catch:{ all -> 0x010a }
            return
        L_0x010e:
            monitor-exit(r2)     // Catch:{ all -> 0x010a }
            throw r0
        L_0x0110:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0110 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ayg.mo11418a():void");
    }

    /* renamed from: c */
    private final String m4467c() {
        try {
            if (this.f3147a.mo11385l() != null) {
                this.f3147a.mo11385l().get();
            }
            akd k = this.f3147a.mo11384k();
            if (k == null || k.f1939n == null) {
                return null;
            }
            return k.f1939n;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
