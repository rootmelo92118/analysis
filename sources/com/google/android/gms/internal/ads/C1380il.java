package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.il */
final class C1380il implements abt {

    /* renamed from: a */
    private final /* synthetic */ C1387is f5492a;

    /* renamed from: b */
    private final /* synthetic */ C1366hy f5493b;

    C1380il(C1366hy hyVar, C1387is isVar) {
        this.f5493b = hyVar;
        this.f5492a = isVar;
    }

    /* renamed from: a */
    public final void mo10095a() {
        synchronized (this.f5493b.f5455a) {
            int unused = this.f5493b.f5462h = 1;
            C1772wz.m8287a("Failed loading new engine. Marking new engine destroyable.");
            this.f5492a.mo12627c();
        }
    }
}
