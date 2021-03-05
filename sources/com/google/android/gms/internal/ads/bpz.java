package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bph;

public final class bpz extends aug<bpz> {

    /* renamed from: a */
    public String f5052a = null;

    /* renamed from: b */
    public bqc f5053b = null;

    /* renamed from: c */
    private bph.C1176n f5054c = null;

    /* renamed from: d */
    private Integer f5055d = null;

    /* renamed from: e */
    private Integer f5056e = null;

    /* renamed from: f */
    private bpo f5057f = null;

    /* renamed from: g */
    private bpo f5058g = null;

    /* renamed from: h */
    private bpo f5059h = null;

    public bpz() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f5052a != null) {
            aue.mo11274a(1, this.f5052a);
        }
        if (this.f5054c != null) {
            aue.mo11272a(2, (arw) this.f5054c);
        }
        if (this.f5055d != null) {
            aue.mo11270a(3, this.f5055d.intValue());
        }
        if (this.f5053b != null) {
            aue.mo11273a(4, (aum) this.f5053b);
        }
        if (this.f5056e != null) {
            aue.mo11270a(5, this.f5056e.intValue());
        }
        if (!(this.f5057f == null || this.f5057f == null)) {
            aue.mo11270a(6, this.f5057f.mo10648a());
        }
        if (!(this.f5058g == null || this.f5058g == null)) {
            aue.mo11270a(7, this.f5058g.mo10648a());
        }
        if (!(this.f5059h == null || this.f5059h == null)) {
            aue.mo11270a(8, this.f5059h.mo10648a());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f5052a != null) {
            a += aue.m4145b(1, this.f5052a);
        }
        if (this.f5054c != null) {
            a += apt.m3165c(2, (arw) this.f5054c);
        }
        if (this.f5055d != null) {
            a += aue.m4143b(3, this.f5055d.intValue());
        }
        if (this.f5053b != null) {
            a += aue.m4144b(4, (aum) this.f5053b);
        }
        if (this.f5056e != null) {
            a += aue.m4143b(5, this.f5056e.intValue());
        }
        if (!(this.f5057f == null || this.f5057f == null)) {
            a += aue.m4143b(6, this.f5057f.mo10648a());
        }
        if (!(this.f5058g == null || this.f5058g == null)) {
            a += aue.m4143b(7, this.f5058g.mo10648a());
        }
        return (this.f5059h == null || this.f5059h == null) ? a : a + aue.m4143b(8, this.f5059h.mo10648a());
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f5052a = aud.mo11262e();
            } else if (a == 18) {
                this.f5054c = (bph.C1176n) aud.mo11251a(bph.C1176n.m6180a());
            } else if (a == 24) {
                this.f5055d = Integer.valueOf(aud.mo11265g());
            } else if (a == 34) {
                if (this.f5053b == null) {
                    this.f5053b = new bqc();
                }
                aud.mo11253a((aum) this.f5053b);
            } else if (a == 40) {
                this.f5056e = Integer.valueOf(aud.mo11265g());
            } else if (a == 48) {
                int j = aud.mo11268j();
                int g = aud.mo11265g();
                if (g != 1000) {
                    switch (g) {
                        case 0:
                        case 1:
                            break;
                        default:
                            aud.mo11263e(j);
                            mo11281a(aud, a);
                            continue;
                    }
                }
                this.f5057f = bpo.m6214a(g);
            } else if (a == 56) {
                int j2 = aud.mo11268j();
                int g2 = aud.mo11265g();
                if (g2 != 1000) {
                    switch (g2) {
                        case 0:
                        case 1:
                            break;
                        default:
                            aud.mo11263e(j2);
                            mo11281a(aud, a);
                            continue;
                    }
                }
                this.f5058g = bpo.m6214a(g2);
            } else if (a == 64) {
                int j3 = aud.mo11268j();
                int g3 = aud.mo11265g();
                if (g3 != 1000) {
                    switch (g3) {
                        case 0:
                        case 1:
                            break;
                        default:
                            aud.mo11263e(j3);
                            mo11281a(aud, a);
                            continue;
                    }
                }
                this.f5059h = bpo.m6214a(g3);
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
