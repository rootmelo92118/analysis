package com.google.android.gms.internal.ads;

public final class avh extends aug<avh> {

    /* renamed from: f */
    private static volatile avh[] f2677f;

    /* renamed from: a */
    public Integer f2678a = null;

    /* renamed from: b */
    public String f2679b = null;

    /* renamed from: c */
    public ave f2680c = null;

    /* renamed from: d */
    public Integer f2681d = null;

    /* renamed from: e */
    public String[] f2682e = auq.f2592c;

    /* renamed from: g */
    private avf f2683g = null;

    /* renamed from: h */
    private Integer f2684h = null;

    /* renamed from: i */
    private int[] f2685i = auq.f2590a;

    /* renamed from: j */
    private String f2686j = null;

    /* renamed from: b */
    public static avh[] m4262b() {
        if (f2677f == null) {
            synchronized (auk.f2580b) {
                if (f2677f == null) {
                    f2677f = new avh[0];
                }
            }
        }
        return f2677f;
    }

    public avh() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        aue.mo11270a(1, this.f2678a.intValue());
        if (this.f2679b != null) {
            aue.mo11274a(2, this.f2679b);
        }
        if (this.f2680c != null) {
            aue.mo11273a(3, (aum) this.f2680c);
        }
        if (this.f2683g != null) {
            aue.mo11273a(4, (aum) this.f2683g);
        }
        if (this.f2684h != null) {
            aue.mo11270a(5, this.f2684h.intValue());
        }
        if (this.f2685i != null && this.f2685i.length > 0) {
            for (int a : this.f2685i) {
                aue.mo11270a(6, a);
            }
        }
        if (this.f2686j != null) {
            aue.mo11274a(7, this.f2686j);
        }
        if (this.f2681d != null) {
            aue.mo11270a(8, this.f2681d.intValue());
        }
        if (this.f2682e != null && this.f2682e.length > 0) {
            for (String str : this.f2682e) {
                if (str != null) {
                    aue.mo11274a(9, str);
                }
            }
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a() + aue.m4143b(1, this.f2678a.intValue());
        if (this.f2679b != null) {
            a += aue.m4145b(2, this.f2679b);
        }
        if (this.f2680c != null) {
            a += aue.m4144b(3, (aum) this.f2680c);
        }
        if (this.f2683g != null) {
            a += aue.m4144b(4, (aum) this.f2683g);
        }
        if (this.f2684h != null) {
            a += aue.m4143b(5, this.f2684h.intValue());
        }
        if (this.f2685i != null && this.f2685i.length > 0) {
            int i = 0;
            for (int a2 : this.f2685i) {
                i += aue.m4135a(a2);
            }
            a = a + i + (this.f2685i.length * 1);
        }
        if (this.f2686j != null) {
            a += aue.m4145b(7, this.f2686j);
        }
        if (this.f2681d != null) {
            a += aue.m4143b(8, this.f2681d.intValue());
        }
        if (this.f2682e == null || this.f2682e.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        for (String str : this.f2682e) {
            if (str != null) {
                i3++;
                i2 += aue.m4138a(str);
            }
        }
        return a + i2 + (i3 * 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final avh mo10483a(aud aud) {
        int c;
        while (true) {
            int a = aud.mo11250a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f2678a = Integer.valueOf(aud.mo11258c());
                    break;
                case 18:
                    this.f2679b = aud.mo11262e();
                    break;
                case 26:
                    if (this.f2680c == null) {
                        this.f2680c = new ave();
                    }
                    aud.mo11253a((aum) this.f2680c);
                    break;
                case 34:
                    if (this.f2683g == null) {
                        this.f2683g = new avf();
                    }
                    aud.mo11253a((aum) this.f2683g);
                    break;
                case 40:
                    this.f2684h = Integer.valueOf(aud.mo11258c());
                    break;
                case 48:
                    int a2 = auq.m4197a(aud, 48);
                    int length = this.f2685i == null ? 0 : this.f2685i.length;
                    int[] iArr = new int[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f2685i, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aud.mo11258c();
                        aud.mo11250a();
                        length++;
                    }
                    iArr[length] = aud.mo11258c();
                    this.f2685i = iArr;
                    break;
                case 50:
                    int c2 = aud.mo11259c(aud.mo11265g());
                    int j = aud.mo11268j();
                    int i = 0;
                    while (aud.mo11267i() > 0) {
                        aud.mo11258c();
                        i++;
                    }
                    aud.mo11263e(j);
                    int length2 = this.f2685i == null ? 0 : this.f2685i.length;
                    int[] iArr2 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f2685i, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aud.mo11258c();
                        length2++;
                    }
                    this.f2685i = iArr2;
                    aud.mo11260d(c2);
                    break;
                case 58:
                    this.f2686j = aud.mo11262e();
                    break;
                case 64:
                    try {
                        c = aud.mo11258c();
                        if (c >= 0 && c <= 3) {
                            this.f2681d = Integer.valueOf(c);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(c);
                            sb.append(" is not a valid enum AdResourceType");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        aud.mo11263e(aud.mo11268j());
                        mo11281a(aud, a);
                        break;
                    }
                case 74:
                    int a3 = auq.m4197a(aud, 74);
                    int length3 = this.f2682e == null ? 0 : this.f2682e.length;
                    String[] strArr = new String[(a3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f2682e, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = aud.mo11262e();
                        aud.mo11250a();
                        length3++;
                    }
                    strArr[length3] = aud.mo11262e();
                    this.f2682e = strArr;
                    break;
                default:
                    if (super.mo11281a(aud, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(c);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
