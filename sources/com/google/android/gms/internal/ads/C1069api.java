package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.api */
public final class C1069api extends aug<C1069api> {

    /* renamed from: a */
    public Long f2183a = null;

    /* renamed from: b */
    private String f2184b = null;

    /* renamed from: c */
    private byte[] f2185c = null;

    public C1069api() {
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2183a != null) {
            aue.mo11277b(1, this.f2183a.longValue());
        }
        if (this.f2184b != null) {
            aue.mo11274a(3, this.f2184b);
        }
        if (this.f2185c != null) {
            aue.mo11276a(4, this.f2185c);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2183a != null) {
            a += aue.m4151d(1, this.f2183a.longValue());
        }
        if (this.f2184b != null) {
            a += aue.m4145b(3, this.f2184b);
        }
        return this.f2185c != null ? a + aue.m4146b(4, this.f2185c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f2183a = Long.valueOf(aud.mo11266h());
            } else if (a == 26) {
                this.f2184b = aud.mo11262e();
            } else if (a == 34) {
                this.f2185c = aud.mo11264f();
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
