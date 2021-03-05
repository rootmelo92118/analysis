package com.google.android.gms.internal.ads;

public final class avg extends aug<avg> {

    /* renamed from: a */
    public Integer f2674a = null;

    /* renamed from: b */
    public String f2675b = null;

    /* renamed from: c */
    public byte[] f2676c = null;

    public avg() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2674a != null) {
            aue.mo11270a(1, this.f2674a.intValue());
        }
        if (this.f2675b != null) {
            aue.mo11274a(2, this.f2675b);
        }
        if (this.f2676c != null) {
            aue.mo11276a(3, this.f2676c);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2674a != null) {
            a += aue.m4143b(1, this.f2674a.intValue());
        }
        if (this.f2675b != null) {
            a += aue.m4145b(2, this.f2675b);
        }
        return this.f2676c != null ? a + aue.m4146b(3, this.f2676c) : a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final avg mo10483a(aud aud) {
        int c;
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    c = aud.mo11258c();
                    if (c < 0 || c > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(c);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.f2674a = Integer.valueOf(c);
                    }
                } catch (IllegalArgumentException unused) {
                    aud.mo11263e(aud.mo11268j());
                    mo11281a(aud, a);
                }
            } else if (a == 18) {
                this.f2675b = aud.mo11262e();
            } else if (a == 26) {
                this.f2676c = aud.mo11264f();
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(c);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }
}
