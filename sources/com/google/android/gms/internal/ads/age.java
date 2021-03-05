package com.google.android.gms.internal.ads;

public final class age extends aug<age> {

    /* renamed from: a */
    public String f1713a = null;

    /* renamed from: b */
    public Long f1714b = null;

    /* renamed from: c */
    private String f1715c = null;

    /* renamed from: d */
    private String f1716d = null;

    /* renamed from: e */
    private String f1717e = null;

    /* renamed from: f */
    private Long f1718f = null;

    /* renamed from: g */
    private Long f1719g = null;

    /* renamed from: h */
    private String f1720h = null;

    /* renamed from: i */
    private Long f1721i = null;

    /* renamed from: j */
    private String f1722j = null;

    public age() {
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f1713a != null) {
            aue.mo11274a(1, this.f1713a);
        }
        if (this.f1714b != null) {
            aue.mo11277b(2, this.f1714b.longValue());
        }
        if (this.f1715c != null) {
            aue.mo11274a(3, this.f1715c);
        }
        if (this.f1716d != null) {
            aue.mo11274a(4, this.f1716d);
        }
        if (this.f1717e != null) {
            aue.mo11274a(5, this.f1717e);
        }
        if (this.f1718f != null) {
            aue.mo11277b(6, this.f1718f.longValue());
        }
        if (this.f1719g != null) {
            aue.mo11277b(7, this.f1719g.longValue());
        }
        if (this.f1720h != null) {
            aue.mo11274a(8, this.f1720h);
        }
        if (this.f1721i != null) {
            aue.mo11277b(9, this.f1721i.longValue());
        }
        if (this.f1722j != null) {
            aue.mo11274a(10, this.f1722j);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f1713a != null) {
            a += aue.m4145b(1, this.f1713a);
        }
        if (this.f1714b != null) {
            a += aue.m4151d(2, this.f1714b.longValue());
        }
        if (this.f1715c != null) {
            a += aue.m4145b(3, this.f1715c);
        }
        if (this.f1716d != null) {
            a += aue.m4145b(4, this.f1716d);
        }
        if (this.f1717e != null) {
            a += aue.m4145b(5, this.f1717e);
        }
        if (this.f1718f != null) {
            a += aue.m4151d(6, this.f1718f.longValue());
        }
        if (this.f1719g != null) {
            a += aue.m4151d(7, this.f1719g.longValue());
        }
        if (this.f1720h != null) {
            a += aue.m4145b(8, this.f1720h);
        }
        if (this.f1721i != null) {
            a += aue.m4151d(9, this.f1721i.longValue());
        }
        return this.f1722j != null ? a + aue.m4145b(10, this.f1722j) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f1713a = aud.mo11262e();
                    break;
                case 16:
                    this.f1714b = Long.valueOf(aud.mo11266h());
                    break;
                case 26:
                    this.f1715c = aud.mo11262e();
                    break;
                case 34:
                    this.f1716d = aud.mo11262e();
                    break;
                case 42:
                    this.f1717e = aud.mo11262e();
                    break;
                case 48:
                    this.f1718f = Long.valueOf(aud.mo11266h());
                    break;
                case 56:
                    this.f1719g = Long.valueOf(aud.mo11266h());
                    break;
                case 66:
                    this.f1720h = aud.mo11262e();
                    break;
                case 72:
                    this.f1721i = Long.valueOf(aud.mo11266h());
                    break;
                case 82:
                    this.f1722j = aud.mo11262e();
                    break;
                default:
                    if (super.mo11281a(aud, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
