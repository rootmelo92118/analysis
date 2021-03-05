package com.google.android.gms.internal.ads;

public final class amf extends aug<amf> {

    /* renamed from: a */
    public Long f2040a = null;

    /* renamed from: b */
    public Long f2041b = null;

    /* renamed from: c */
    public Long f2042c = null;

    /* renamed from: d */
    private Long f2043d = null;

    /* renamed from: e */
    private Long f2044e = null;

    public amf() {
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2043d != null) {
            aue.mo11277b(1, this.f2043d.longValue());
        }
        if (this.f2044e != null) {
            aue.mo11277b(2, this.f2044e.longValue());
        }
        if (this.f2040a != null) {
            aue.mo11277b(3, this.f2040a.longValue());
        }
        if (this.f2041b != null) {
            aue.mo11277b(4, this.f2041b.longValue());
        }
        if (this.f2042c != null) {
            aue.mo11277b(5, this.f2042c.longValue());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2043d != null) {
            a += aue.m4151d(1, this.f2043d.longValue());
        }
        if (this.f2044e != null) {
            a += aue.m4151d(2, this.f2044e.longValue());
        }
        if (this.f2040a != null) {
            a += aue.m4151d(3, this.f2040a.longValue());
        }
        if (this.f2041b != null) {
            a += aue.m4151d(4, this.f2041b.longValue());
        }
        return this.f2042c != null ? a + aue.m4151d(5, this.f2042c.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f2043d = Long.valueOf(aud.mo11266h());
            } else if (a == 16) {
                this.f2044e = Long.valueOf(aud.mo11266h());
            } else if (a == 24) {
                this.f2040a = Long.valueOf(aud.mo11266h());
            } else if (a == 32) {
                this.f2041b = Long.valueOf(aud.mo11266h());
            } else if (a == 40) {
                this.f2042c = Long.valueOf(aud.mo11266h());
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
