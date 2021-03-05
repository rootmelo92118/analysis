package com.google.android.gms.internal.ads;

public final class aoh extends aug<aoh> {

    /* renamed from: a */
    public byte[] f2129a = null;

    /* renamed from: b */
    public byte[] f2130b = null;

    /* renamed from: c */
    public byte[] f2131c = null;

    /* renamed from: d */
    public byte[] f2132d = null;

    public aoh() {
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2129a != null) {
            aue.mo11276a(1, this.f2129a);
        }
        if (this.f2130b != null) {
            aue.mo11276a(2, this.f2130b);
        }
        if (this.f2131c != null) {
            aue.mo11276a(3, this.f2131c);
        }
        if (this.f2132d != null) {
            aue.mo11276a(4, this.f2132d);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2129a != null) {
            a += aue.m4146b(1, this.f2129a);
        }
        if (this.f2130b != null) {
            a += aue.m4146b(2, this.f2130b);
        }
        if (this.f2131c != null) {
            a += aue.m4146b(3, this.f2131c);
        }
        return this.f2132d != null ? a + aue.m4146b(4, this.f2132d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f2129a = aud.mo11264f();
            } else if (a == 18) {
                this.f2130b = aud.mo11264f();
            } else if (a == 26) {
                this.f2131c = aud.mo11264f();
            } else if (a == 34) {
                this.f2132d = aud.mo11264f();
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
