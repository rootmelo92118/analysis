package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bph;

public final class bqa extends aug<bqa> {

    /* renamed from: a */
    private bph.C1153d.C1155b f5062a = null;

    /* renamed from: b */
    private bqc f5063b = null;

    /* renamed from: c */
    private String f5064c = null;

    /* renamed from: d */
    private String f5065d = null;

    public bqa() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (!(this.f5062a == null || this.f5062a == null)) {
            aue.mo11270a(5, this.f5062a.mo10648a());
        }
        if (this.f5063b != null) {
            aue.mo11273a(6, (aum) this.f5063b);
        }
        if (this.f5064c != null) {
            aue.mo11274a(7, this.f5064c);
        }
        if (this.f5065d != null) {
            aue.mo11274a(8, this.f5065d);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (!(this.f5062a == null || this.f5062a == null)) {
            a += aue.m4143b(5, this.f5062a.mo10648a());
        }
        if (this.f5063b != null) {
            a += aue.m4144b(6, (aum) this.f5063b);
        }
        if (this.f5064c != null) {
            a += aue.m4145b(7, this.f5064c);
        }
        return this.f5065d != null ? a + aue.m4145b(8, this.f5065d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a != 0) {
                if (a == 40) {
                    int j = aud.mo11268j();
                    int g = aud.mo11265g();
                    switch (g) {
                        case 0:
                        case 1:
                        case 2:
                            this.f5062a = bph.C1153d.C1155b.m6148a(g);
                            break;
                        default:
                            aud.mo11263e(j);
                            mo11281a(aud, a);
                            break;
                    }
                } else if (a == 50) {
                    if (this.f5063b == null) {
                        this.f5063b = new bqc();
                    }
                    aud.mo11253a((aum) this.f5063b);
                } else if (a == 58) {
                    this.f5064c = aud.mo11262e();
                } else if (a == 66) {
                    this.f5065d = aud.mo11262e();
                } else if (!super.mo11281a(aud, a)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}
