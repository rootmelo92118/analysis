package com.google.android.gms.internal.ads;

final /* synthetic */ class aco implements Runnable {

    /* renamed from: a */
    private final zzbdi f1349a;

    private aco(zzbdi zzbdi) {
        this.f1349a = zzbdi;
    }

    /* renamed from: a */
    static Runnable m1713a(zzbdi zzbdi) {
        return new aco(zzbdi);
    }

    public final void run() {
        this.f1349a.mo13329b();
    }
}
