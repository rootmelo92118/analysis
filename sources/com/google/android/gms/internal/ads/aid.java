package com.google.android.gms.internal.ads;

public final class aid extends aug<aid> {

    /* renamed from: a */
    public String f1833a;

    /* renamed from: b */
    public String f1834b;

    /* renamed from: c */
    private String f1835c;

    /* renamed from: d */
    private String f1836d;

    /* renamed from: e */
    private String f1837e;

    /* renamed from: f */
    private String f1838f;

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f1833a != null) {
            aue.mo11274a(1, this.f1833a);
        }
        if (this.f1835c != null) {
            aue.mo11274a(2, this.f1835c);
        }
        if (this.f1836d != null) {
            aue.mo11274a(3, this.f1836d);
        }
        if (this.f1837e != null) {
            aue.mo11274a(4, this.f1837e);
        }
        if (this.f1838f != null) {
            aue.mo11274a(5, this.f1838f);
        }
        if (this.f1834b != null) {
            aue.mo11274a(6, this.f1834b);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f1833a != null) {
            a += aue.m4145b(1, this.f1833a);
        }
        if (this.f1835c != null) {
            a += aue.m4145b(2, this.f1835c);
        }
        if (this.f1836d != null) {
            a += aue.m4145b(3, this.f1836d);
        }
        if (this.f1837e != null) {
            a += aue.m4145b(4, this.f1837e);
        }
        if (this.f1838f != null) {
            a += aue.m4145b(5, this.f1838f);
        }
        return this.f1834b != null ? a + aue.m4145b(6, this.f1834b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f1833a = aud.mo11262e();
            } else if (a == 18) {
                this.f1835c = aud.mo11262e();
            } else if (a == 26) {
                this.f1836d = aud.mo11262e();
            } else if (a == 34) {
                this.f1837e = aud.mo11262e();
            } else if (a == 42) {
                this.f1838f = aud.mo11262e();
            } else if (a == 50) {
                this.f1834b = aud.mo11262e();
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
