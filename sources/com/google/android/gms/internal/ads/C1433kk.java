package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kk */
final class C1433kk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abg f5640a;

    /* renamed from: b */
    private final /* synthetic */ C1431ki f5641b;

    C1433kk(C1431ki kiVar, abg abg) {
        this.f5641b = kiVar;
        this.f5640a = abg;
    }

    public final void run() {
        for (abg abg : this.f5641b.f5633k.keySet()) {
            if (abg != this.f5640a) {
                ((C1424kb) this.f5641b.f5633k.get(abg)).mo12668a();
            }
        }
    }
}
