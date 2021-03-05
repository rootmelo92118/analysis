package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ck */
final class C2208ck implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f8282a;

    /* renamed from: b */
    private final /* synthetic */ C2200cc f8283b;

    C2208ck(C2200cc ccVar, boolean z) {
        this.f8283b = ccVar;
        this.f8282a = z;
    }

    public final void run() {
        boolean C = this.f8283b.f8222q.mo14307C();
        boolean B = this.f8283b.f8222q.mo14306B();
        this.f8283b.f8222q.mo14316a(this.f8282a);
        if (B == this.f8282a) {
            this.f8283b.f8222q.mo14235r().mo14838x().mo14842a("Default data collection state already set to", Boolean.valueOf(this.f8282a));
        }
        if (this.f8283b.f8222q.mo14307C() == C || this.f8283b.f8222q.mo14307C() != this.f8283b.f8222q.mo14306B()) {
            this.f8283b.f8222q.mo14235r().mo14835k().mo14843a("Default data collection is different than actual status", Boolean.valueOf(this.f8282a), Boolean.valueOf(C));
        }
        this.f8283b.m10639C();
    }
}
