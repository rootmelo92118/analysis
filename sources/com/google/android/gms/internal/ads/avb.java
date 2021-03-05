package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aur;

public final class avb extends aug<avb> {

    /* renamed from: a */
    public Integer f2641a = null;

    /* renamed from: b */
    public String f2642b = null;

    /* renamed from: c */
    public String f2643c = null;

    /* renamed from: d */
    public avc f2644d = null;

    /* renamed from: e */
    public avh[] f2645e = avh.m4262b();

    /* renamed from: f */
    public String f2646f = null;

    /* renamed from: g */
    public avg f2647g = null;

    /* renamed from: h */
    public avi f2648h = null;

    /* renamed from: i */
    public String[] f2649i = auq.f2592c;

    /* renamed from: j */
    public String[] f2650j = auq.f2592c;

    /* renamed from: k */
    private aur.C1091a.C1095c f2651k = null;

    /* renamed from: l */
    private String f2652l = null;

    /* renamed from: m */
    private Boolean f2653m = null;

    /* renamed from: n */
    private String[] f2654n = auq.f2592c;

    /* renamed from: o */
    private String f2655o = null;

    /* renamed from: p */
    private Boolean f2656p = null;

    /* renamed from: q */
    private Boolean f2657q = null;

    /* renamed from: r */
    private byte[] f2658r = null;

    public avb() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2642b != null) {
            aue.mo11274a(1, this.f2642b);
        }
        if (this.f2643c != null) {
            aue.mo11274a(2, this.f2643c);
        }
        if (this.f2652l != null) {
            aue.mo11274a(3, this.f2652l);
        }
        if (this.f2645e != null && this.f2645e.length > 0) {
            for (avh avh : this.f2645e) {
                if (avh != null) {
                    aue.mo11273a(4, (aum) avh);
                }
            }
        }
        if (this.f2653m != null) {
            aue.mo11275a(5, this.f2653m.booleanValue());
        }
        if (this.f2654n != null && this.f2654n.length > 0) {
            for (String str : this.f2654n) {
                if (str != null) {
                    aue.mo11274a(6, str);
                }
            }
        }
        if (this.f2655o != null) {
            aue.mo11274a(7, this.f2655o);
        }
        if (this.f2656p != null) {
            aue.mo11275a(8, this.f2656p.booleanValue());
        }
        if (this.f2657q != null) {
            aue.mo11275a(9, this.f2657q.booleanValue());
        }
        if (this.f2641a != null) {
            aue.mo11270a(10, this.f2641a.intValue());
        }
        if (!(this.f2651k == null || this.f2651k == null)) {
            aue.mo11270a(11, this.f2651k.mo10648a());
        }
        if (this.f2644d != null) {
            aue.mo11273a(12, (aum) this.f2644d);
        }
        if (this.f2646f != null) {
            aue.mo11274a(13, this.f2646f);
        }
        if (this.f2647g != null) {
            aue.mo11273a(14, (aum) this.f2647g);
        }
        if (this.f2658r != null) {
            aue.mo11276a(15, this.f2658r);
        }
        if (this.f2648h != null) {
            aue.mo11273a(17, (aum) this.f2648h);
        }
        if (this.f2649i != null && this.f2649i.length > 0) {
            for (String str2 : this.f2649i) {
                if (str2 != null) {
                    aue.mo11274a(20, str2);
                }
            }
        }
        if (this.f2650j != null && this.f2650j.length > 0) {
            for (String str3 : this.f2650j) {
                if (str3 != null) {
                    aue.mo11274a(21, str3);
                }
            }
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2642b != null) {
            a += aue.m4145b(1, this.f2642b);
        }
        if (this.f2643c != null) {
            a += aue.m4145b(2, this.f2643c);
        }
        if (this.f2652l != null) {
            a += aue.m4145b(3, this.f2652l);
        }
        if (this.f2645e != null && this.f2645e.length > 0) {
            int i = a;
            for (avh avh : this.f2645e) {
                if (avh != null) {
                    i += aue.m4144b(4, (aum) avh);
                }
            }
            a = i;
        }
        if (this.f2653m != null) {
            this.f2653m.booleanValue();
            a += aue.m4142b(5) + 1;
        }
        if (this.f2654n != null && this.f2654n.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f2654n) {
                if (str != null) {
                    i3++;
                    i2 += aue.m4138a(str);
                }
            }
            a = a + i2 + (i3 * 1);
        }
        if (this.f2655o != null) {
            a += aue.m4145b(7, this.f2655o);
        }
        if (this.f2656p != null) {
            this.f2656p.booleanValue();
            a += aue.m4142b(8) + 1;
        }
        if (this.f2657q != null) {
            this.f2657q.booleanValue();
            a += aue.m4142b(9) + 1;
        }
        if (this.f2641a != null) {
            a += aue.m4143b(10, this.f2641a.intValue());
        }
        if (!(this.f2651k == null || this.f2651k == null)) {
            a += aue.m4143b(11, this.f2651k.mo10648a());
        }
        if (this.f2644d != null) {
            a += aue.m4144b(12, (aum) this.f2644d);
        }
        if (this.f2646f != null) {
            a += aue.m4145b(13, this.f2646f);
        }
        if (this.f2647g != null) {
            a += aue.m4144b(14, (aum) this.f2647g);
        }
        if (this.f2658r != null) {
            a += aue.m4146b(15, this.f2658r);
        }
        if (this.f2648h != null) {
            a += aue.m4144b(17, (aum) this.f2648h);
        }
        if (this.f2649i != null && this.f2649i.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (String str2 : this.f2649i) {
                if (str2 != null) {
                    i5++;
                    i4 += aue.m4138a(str2);
                }
            }
            a = a + i4 + (i5 * 2);
        }
        if (this.f2650j == null || this.f2650j.length <= 0) {
            return a;
        }
        int i6 = 0;
        int i7 = 0;
        for (String str3 : this.f2650j) {
            if (str3 != null) {
                i7++;
                i6 += aue.m4138a(str3);
            }
        }
        return a + i6 + (i7 * 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final avb mo10483a(aud aud) {
        int c;
        while (true) {
            int a = aud.mo11250a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f2642b = aud.mo11262e();
                    break;
                case 18:
                    this.f2643c = aud.mo11262e();
                    break;
                case 26:
                    this.f2652l = aud.mo11262e();
                    break;
                case 34:
                    int a2 = auq.m4197a(aud, 34);
                    int length = this.f2645e == null ? 0 : this.f2645e.length;
                    avh[] avhArr = new avh[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f2645e, 0, avhArr, 0, length);
                    }
                    while (length < avhArr.length - 1) {
                        avhArr[length] = new avh();
                        aud.mo11253a((aum) avhArr[length]);
                        aud.mo11250a();
                        length++;
                    }
                    avhArr[length] = new avh();
                    aud.mo11253a((aum) avhArr[length]);
                    this.f2645e = avhArr;
                    break;
                case 40:
                    this.f2653m = Boolean.valueOf(aud.mo11261d());
                    break;
                case 50:
                    int a3 = auq.m4197a(aud, 50);
                    int length2 = this.f2654n == null ? 0 : this.f2654n.length;
                    String[] strArr = new String[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f2654n, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aud.mo11262e();
                        aud.mo11250a();
                        length2++;
                    }
                    strArr[length2] = aud.mo11262e();
                    this.f2654n = strArr;
                    break;
                case 58:
                    this.f2655o = aud.mo11262e();
                    break;
                case 64:
                    this.f2656p = Boolean.valueOf(aud.mo11261d());
                    break;
                case 72:
                    this.f2657q = Boolean.valueOf(aud.mo11261d());
                    break;
                case 80:
                    try {
                        c = aud.mo11258c();
                        if (c >= 0 && c <= 9) {
                            this.f2641a = Integer.valueOf(c);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append(c);
                            sb.append(" is not a valid enum ReportType");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        aud.mo11263e(aud.mo11268j());
                        mo11281a(aud, a);
                        break;
                    }
                case 88:
                    int j = aud.mo11268j();
                    int c2 = aud.mo11258c();
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f2651k = aur.C1091a.C1095c.m4202a(c2);
                            break;
                        default:
                            aud.mo11263e(j);
                            mo11281a(aud, a);
                            break;
                    }
                case 98:
                    if (this.f2644d == null) {
                        this.f2644d = new avc();
                    }
                    aud.mo11253a((aum) this.f2644d);
                    break;
                case 106:
                    this.f2646f = aud.mo11262e();
                    break;
                case 114:
                    if (this.f2647g == null) {
                        this.f2647g = new avg();
                    }
                    aud.mo11253a((aum) this.f2647g);
                    break;
                case 122:
                    this.f2658r = aud.mo11264f();
                    break;
                case 138:
                    if (this.f2648h == null) {
                        this.f2648h = new avi();
                    }
                    aud.mo11253a((aum) this.f2648h);
                    break;
                case 162:
                    int a4 = auq.m4197a(aud, 162);
                    int length3 = this.f2649i == null ? 0 : this.f2649i.length;
                    String[] strArr2 = new String[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f2649i, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = aud.mo11262e();
                        aud.mo11250a();
                        length3++;
                    }
                    strArr2[length3] = aud.mo11262e();
                    this.f2649i = strArr2;
                    break;
                case 170:
                    int a5 = auq.m4197a(aud, 170);
                    int length4 = this.f2650j == null ? 0 : this.f2650j.length;
                    String[] strArr3 = new String[(a5 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.f2650j, 0, strArr3, 0, length4);
                    }
                    while (length4 < strArr3.length - 1) {
                        strArr3[length4] = aud.mo11262e();
                        aud.mo11250a();
                        length4++;
                    }
                    strArr3[length4] = aud.mo11262e();
                    this.f2650j = strArr3;
                    break;
                default:
                    if (super.mo11281a(aud, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append(c);
        sb2.append(" is not a valid enum ReportType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
