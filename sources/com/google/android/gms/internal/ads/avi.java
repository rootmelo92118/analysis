package com.google.android.gms.internal.ads;

public final class avi extends aug<avi> {

    /* renamed from: a */
    public String f2687a = null;

    /* renamed from: b */
    public Long f2688b = null;

    /* renamed from: c */
    public Boolean f2689c = null;

    public avi() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2687a != null) {
            aue.mo11274a(1, this.f2687a);
        }
        if (this.f2688b != null) {
            aue.mo11277b(2, this.f2688b.longValue());
        }
        if (this.f2689c != null) {
            aue.mo11275a(3, this.f2689c.booleanValue());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2687a != null) {
            a += aue.m4145b(1, this.f2687a);
        }
        if (this.f2688b != null) {
            a += aue.m4151d(2, this.f2688b.longValue());
        }
        if (this.f2689c == null) {
            return a;
        }
        this.f2689c.booleanValue();
        return a + aue.m4142b(3) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f2687a = aud.mo11262e();
            } else if (a == 16) {
                this.f2688b = Long.valueOf(aud.mo11255b());
            } else if (a == 24) {
                this.f2689c = Boolean.valueOf(aud.mo11261d());
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
