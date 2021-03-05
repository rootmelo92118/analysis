package com.google.android.gms.internal.ads;

public final class bqc extends aug<bqc> {

    /* renamed from: a */
    public Integer f5076a = null;

    /* renamed from: b */
    public Integer f5077b = null;

    /* renamed from: c */
    public Integer f5078c = null;

    public bqc() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f5076a != null) {
            aue.mo11270a(1, this.f5076a.intValue());
        }
        if (this.f5077b != null) {
            aue.mo11270a(2, this.f5077b.intValue());
        }
        if (this.f5078c != null) {
            aue.mo11270a(3, this.f5078c.intValue());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f5076a != null) {
            a += aue.m4143b(1, this.f5076a.intValue());
        }
        if (this.f5077b != null) {
            a += aue.m4143b(2, this.f5077b.intValue());
        }
        return this.f5078c != null ? a + aue.m4143b(3, this.f5078c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f5076a = Integer.valueOf(aud.mo11265g());
            } else if (a == 16) {
                this.f5077b = Integer.valueOf(aud.mo11265g());
            } else if (a == 24) {
                this.f5078c = Integer.valueOf(aud.mo11265g());
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
