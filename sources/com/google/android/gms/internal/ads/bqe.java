package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bph;

public final class bqe extends aug<bqe> {

    /* renamed from: a */
    private bqc f5096a = null;

    /* renamed from: b */
    private bpo f5097b = null;

    /* renamed from: c */
    private bph.C1182q f5098c = null;

    /* renamed from: d */
    private bph.C1176n f5099d = null;

    public bqe() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f5096a != null) {
            aue.mo11273a(1, (aum) this.f5096a);
        }
        if (!(this.f5097b == null || this.f5097b == null)) {
            aue.mo11270a(2, this.f5097b.mo10648a());
        }
        if (this.f5098c != null) {
            aue.mo11272a(3, (arw) this.f5098c);
        }
        if (this.f5099d != null) {
            aue.mo11272a(4, (arw) this.f5099d);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f5096a != null) {
            a += aue.m4144b(1, (aum) this.f5096a);
        }
        if (!(this.f5097b == null || this.f5097b == null)) {
            a += aue.m4143b(2, this.f5097b.mo10648a());
        }
        if (this.f5098c != null) {
            a += apt.m3165c(3, (arw) this.f5098c);
        }
        return this.f5099d != null ? a + apt.m3165c(4, (arw) this.f5099d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f5096a == null) {
                    this.f5096a = new bqc();
                }
                aud.mo11253a((aum) this.f5096a);
            } else if (a == 16) {
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
                this.f5097b = bpo.m6214a(g);
            } else if (a == 26) {
                this.f5098c = (bph.C1182q) aud.mo11251a(bph.C1182q.m6188a());
            } else if (a == 34) {
                this.f5099d = (bph.C1176n) aud.mo11251a(bph.C1176n.m6180a());
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
