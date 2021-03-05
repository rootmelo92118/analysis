package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.wn */
final class C1760wn {

    /* renamed from: a */
    private final Object f6774a;

    /* renamed from: b */
    private volatile int f6775b;

    /* renamed from: c */
    private volatile long f6776c;

    private C1760wn() {
        this.f6774a = new Object();
        this.f6775b = C1761wo.f6777a;
        this.f6776c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8260a(int r5, int r6) {
        /*
            r4 = this;
            r4.m8261d()
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r0 = r0.mo9996a()
            java.lang.Object r2 = r4.f6774a
            monitor-enter(r2)
            int r3 = r4.f6775b     // Catch:{ all -> 0x0020 }
            if (r3 == r5) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0014:
            r4.f6775b = r6     // Catch:{ all -> 0x0020 }
            int r5 = r4.f6775b     // Catch:{ all -> 0x0020 }
            int r6 = com.google.android.gms.internal.ads.C1761wo.f6779c     // Catch:{ all -> 0x0020 }
            if (r5 != r6) goto L_0x001e
            r4.f6776c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1760wn.m8260a(int, int):void");
    }

    /* renamed from: d */
    private final void m8261d() {
        long a = zzbv.zzlm().mo9996a();
        synchronized (this.f6774a) {
            if (this.f6775b == C1761wo.f6779c) {
                if (this.f6776c + ((Long) bre.m6321e().mo12778a(C1557p.f6007cI)).longValue() <= a) {
                    this.f6775b = C1761wo.f6777a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13137a(boolean z) {
        if (z) {
            m8260a(C1761wo.f6777a, C1761wo.f6778b);
        } else {
            m8260a(C1761wo.f6778b, C1761wo.f6777a);
        }
    }

    /* renamed from: a */
    public final boolean mo13138a() {
        m8261d();
        return this.f6775b == C1761wo.f6778b;
    }

    /* renamed from: b */
    public final boolean mo13139b() {
        m8261d();
        return this.f6775b == C1761wo.f6779c;
    }

    /* renamed from: c */
    public final void mo13140c() {
        m8260a(C1761wo.f6778b, C1761wo.f6779c);
    }

    /* synthetic */ C1760wn(C1759wm wmVar) {
        this();
    }
}
