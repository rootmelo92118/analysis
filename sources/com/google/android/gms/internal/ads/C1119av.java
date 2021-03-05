package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.av */
final class C1119av implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1090au f2639a;

    C1119av(C1090au auVar) {
        this.f2639a = auVar;
    }

    public final void run() {
        if (this.f2639a.f2542p != null) {
            this.f2639a.f2542p.mo11800l();
            this.f2639a.f2542p.mo11799k();
            this.f2639a.f2542p.mo11802n();
        }
        C1133bg unused = this.f2639a.f2542p = null;
    }
}
