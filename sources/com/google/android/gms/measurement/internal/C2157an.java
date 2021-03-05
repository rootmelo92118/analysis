package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.an */
final class C2157an implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2166aw f8089a;

    /* renamed from: b */
    private final /* synthetic */ C2295r f8090b;

    C2157an(C2156am amVar, C2166aw awVar, C2295r rVar) {
        this.f8089a = awVar;
        this.f8090b = rVar;
    }

    public final void run() {
        if (this.f8089a.mo14321f() == null) {
            this.f8090b.mo14830d_().mo14841a("Install Referrer Reporter is null");
            return;
        }
        C2153aj f = this.f8089a.mo14321f();
        f.f8082a.mo14309E();
        f.mo14272a(f.f8082a.mo14231n().getPackageName());
    }
}
