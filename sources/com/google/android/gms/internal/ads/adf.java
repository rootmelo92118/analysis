package com.google.android.gms.internal.ads;

@C1598qn
final class adf implements Runnable {

    /* renamed from: a */
    private zzbdk f1433a;

    /* renamed from: b */
    private boolean f1434b = false;

    adf(zzbdk zzbdk) {
        this.f1433a = zzbdk;
    }

    public final void run() {
        if (!this.f1434b) {
            this.f1433a.mo13373o();
            m1777c();
        }
    }

    /* renamed from: a */
    public final void mo10191a() {
        this.f1434b = true;
        this.f1433a.mo13373o();
    }

    /* renamed from: b */
    public final void mo10192b() {
        this.f1434b = false;
        m1777c();
    }

    /* renamed from: c */
    private final void m1777c() {
        C1782xi.f6838a.removeCallbacks(this);
        C1782xi.f6838a.postDelayed(this, 250);
    }
}
