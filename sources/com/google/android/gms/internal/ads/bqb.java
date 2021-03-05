package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bph;

public final class bqb extends aug<bqb> {

    /* renamed from: a */
    public String f5066a = null;

    /* renamed from: b */
    public long[] f5067b = auq.f2591b;

    /* renamed from: c */
    public bpz f5068c = null;

    /* renamed from: d */
    public bpx f5069d = null;

    /* renamed from: e */
    private Integer f5070e = null;

    /* renamed from: f */
    private Integer f5071f = null;

    /* renamed from: g */
    private bpo f5072g = null;

    /* renamed from: h */
    private bqc f5073h = null;

    /* renamed from: i */
    private bqa f5074i = null;

    /* renamed from: j */
    private bph.C1162h f5075j = null;

    public bqb() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f5070e != null) {
            aue.mo11270a(9, this.f5070e.intValue());
        }
        if (this.f5066a != null) {
            aue.mo11274a(10, this.f5066a);
        }
        if (this.f5071f != null) {
            int intValue = this.f5071f.intValue();
            aue.mo11279c(11, 0);
            aue.mo11278c(intValue);
        }
        if (!(this.f5072g == null || this.f5072g == null)) {
            aue.mo11270a(12, this.f5072g.mo10648a());
        }
        if (this.f5073h != null) {
            aue.mo11273a(13, (aum) this.f5073h);
        }
        if (this.f5067b != null && this.f5067b.length > 0) {
            for (long a : this.f5067b) {
                aue.mo11271a(14, a);
            }
        }
        if (this.f5068c != null) {
            aue.mo11273a(15, (aum) this.f5068c);
        }
        if (this.f5074i != null) {
            aue.mo11273a(16, (aum) this.f5074i);
        }
        if (this.f5075j != null) {
            aue.mo11272a(17, (arw) this.f5075j);
        }
        if (this.f5069d != null) {
            aue.mo11273a(18, (aum) this.f5069d);
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f5070e != null) {
            a += aue.m4143b(9, this.f5070e.intValue());
        }
        if (this.f5066a != null) {
            a += aue.m4145b(10, this.f5066a);
        }
        if (this.f5071f != null) {
            a += aue.m4142b(11) + aue.m4150d(this.f5071f.intValue());
        }
        if (!(this.f5072g == null || this.f5072g == null)) {
            a += aue.m4143b(12, this.f5072g.mo10648a());
        }
        if (this.f5073h != null) {
            a += aue.m4144b(13, (aum) this.f5073h);
        }
        if (this.f5067b != null && this.f5067b.length > 0) {
            int i = 0;
            for (long a2 : this.f5067b) {
                i += aue.m4136a(a2);
            }
            a = a + i + (this.f5067b.length * 1);
        }
        if (this.f5068c != null) {
            a += aue.m4144b(15, (aum) this.f5068c);
        }
        if (this.f5074i != null) {
            a += aue.m4144b(16, (aum) this.f5074i);
        }
        if (this.f5075j != null) {
            a += apt.m3165c(17, (arw) this.f5075j);
        }
        return this.f5069d != null ? a + aue.m4144b(18, (aum) this.f5069d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            switch (a) {
                case 0:
                    return this;
                case 72:
                    this.f5070e = Integer.valueOf(aud.mo11265g());
                    break;
                case 82:
                    this.f5066a = aud.mo11262e();
                    break;
                case 88:
                    this.f5071f = Integer.valueOf(aud.mo11265g());
                    break;
                case 96:
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
                    this.f5072g = bpo.m6214a(g);
                    break;
                case 106:
                    if (this.f5073h == null) {
                        this.f5073h = new bqc();
                    }
                    aud.mo11253a((aum) this.f5073h);
                    break;
                case 112:
                    int a2 = auq.m4197a(aud, 112);
                    int length = this.f5067b == null ? 0 : this.f5067b.length;
                    long[] jArr = new long[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f5067b, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = aud.mo11266h();
                        aud.mo11250a();
                        length++;
                    }
                    jArr[length] = aud.mo11266h();
                    this.f5067b = jArr;
                    break;
                case 114:
                    int c = aud.mo11259c(aud.mo11265g());
                    int j2 = aud.mo11268j();
                    int i = 0;
                    while (aud.mo11267i() > 0) {
                        aud.mo11266h();
                        i++;
                    }
                    aud.mo11263e(j2);
                    int length2 = this.f5067b == null ? 0 : this.f5067b.length;
                    long[] jArr2 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f5067b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = aud.mo11266h();
                        length2++;
                    }
                    this.f5067b = jArr2;
                    aud.mo11260d(c);
                    break;
                case 122:
                    if (this.f5068c == null) {
                        this.f5068c = new bpz();
                    }
                    aud.mo11253a((aum) this.f5068c);
                    break;
                case 130:
                    if (this.f5074i == null) {
                        this.f5074i = new bqa();
                    }
                    aud.mo11253a((aum) this.f5074i);
                    break;
                case 138:
                    this.f5075j = (bph.C1162h) aud.mo11251a(bph.C1162h.m6159a());
                    break;
                case 146:
                    if (this.f5069d == null) {
                        this.f5069d = new bpx();
                    }
                    aud.mo11253a((aum) this.f5069d);
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
