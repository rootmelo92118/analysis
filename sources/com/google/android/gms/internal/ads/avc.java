package com.google.android.gms.internal.ads;

public final class avc extends aug<avc> {

    /* renamed from: a */
    public String f2659a = null;

    public avc() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2659a != null) {
            aue.mo11274a(1, this.f2659a);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        return this.f2659a != null ? a + aue.m4145b(1, this.f2659a) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f2659a = aud.mo11262e();
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
