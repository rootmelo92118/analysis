package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ik */
final class C1379ik implements abv<C1355hn> {

    /* renamed from: a */
    private final /* synthetic */ C1387is f5490a;

    /* renamed from: b */
    private final /* synthetic */ C1366hy f5491b;

    C1379ik(C1366hy hyVar, C1387is isVar) {
        this.f5491b = hyVar;
        this.f5490a = isVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10096a(Object obj) {
        synchronized (this.f5491b.f5455a) {
            int unused = this.f5491b.f5462h = 0;
            if (!(this.f5491b.f5461g == null || this.f5490a == this.f5491b.f5461g)) {
                C1772wz.m8287a("New JS engine is loaded, marking previous one as destroyable.");
                this.f5491b.f5461g.mo12627c();
            }
            C1387is unused2 = this.f5491b.f5461g = this.f5490a;
        }
    }
}
