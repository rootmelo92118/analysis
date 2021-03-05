package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bph;

public final class bpx extends aug<bpx> {

    /* renamed from: a */
    public Integer f5036a = null;

    /* renamed from: b */
    public bpy f5037b = null;

    /* renamed from: c */
    private bpo f5038c = null;

    /* renamed from: d */
    private bph.C1149b f5039d = null;

    /* renamed from: e */
    private bph.C1146a[] f5040e = new bph.C1146a[0];

    /* renamed from: f */
    private bph.C1151c f5041f = null;

    /* renamed from: g */
    private bph.C1168j f5042g = null;

    /* renamed from: h */
    private bph.C1166i f5043h = null;

    /* renamed from: i */
    private bph.C1158f f5044i = null;

    /* renamed from: j */
    private bph.C1160g f5045j = null;

    /* renamed from: k */
    private bqd[] f5046k = bqd.m6240b();

    public bpx() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f5036a != null) {
            aue.mo11270a(7, this.f5036a.intValue());
        }
        if (!(this.f5038c == null || this.f5038c == null)) {
            aue.mo11270a(8, this.f5038c.mo10648a());
        }
        if (this.f5039d != null) {
            aue.mo11272a(9, (arw) this.f5039d);
        }
        if (this.f5037b != null) {
            aue.mo11273a(10, (aum) this.f5037b);
        }
        if (this.f5040e != null && this.f5040e.length > 0) {
            for (bph.C1146a aVar : this.f5040e) {
                if (aVar != null) {
                    aue.mo11272a(11, (arw) aVar);
                }
            }
        }
        if (this.f5041f != null) {
            aue.mo11272a(12, (arw) this.f5041f);
        }
        if (this.f5042g != null) {
            aue.mo11272a(13, (arw) this.f5042g);
        }
        if (this.f5043h != null) {
            aue.mo11272a(14, (arw) this.f5043h);
        }
        if (this.f5044i != null) {
            aue.mo11272a(15, (arw) this.f5044i);
        }
        if (this.f5045j != null) {
            aue.mo11272a(16, (arw) this.f5045j);
        }
        if (this.f5046k != null && this.f5046k.length > 0) {
            for (bqd bqd : this.f5046k) {
                if (bqd != null) {
                    aue.mo11273a(17, (aum) bqd);
                }
            }
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f5036a != null) {
            a += aue.m4143b(7, this.f5036a.intValue());
        }
        if (!(this.f5038c == null || this.f5038c == null)) {
            a += aue.m4143b(8, this.f5038c.mo10648a());
        }
        if (this.f5039d != null) {
            a += apt.m3165c(9, (arw) this.f5039d);
        }
        if (this.f5037b != null) {
            a += aue.m4144b(10, (aum) this.f5037b);
        }
        if (this.f5040e != null && this.f5040e.length > 0) {
            int i = a;
            for (bph.C1146a aVar : this.f5040e) {
                if (aVar != null) {
                    i += apt.m3165c(11, (arw) aVar);
                }
            }
            a = i;
        }
        if (this.f5041f != null) {
            a += apt.m3165c(12, (arw) this.f5041f);
        }
        if (this.f5042g != null) {
            a += apt.m3165c(13, (arw) this.f5042g);
        }
        if (this.f5043h != null) {
            a += apt.m3165c(14, (arw) this.f5043h);
        }
        if (this.f5044i != null) {
            a += apt.m3165c(15, (arw) this.f5044i);
        }
        if (this.f5045j != null) {
            a += apt.m3165c(16, (arw) this.f5045j);
        }
        if (this.f5046k != null && this.f5046k.length > 0) {
            for (bqd bqd : this.f5046k) {
                if (bqd != null) {
                    a += aue.m4144b(17, (aum) bqd);
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final bpx mo10483a(aud aud) {
        int g;
        while (true) {
            int a = aud.mo11250a();
            switch (a) {
                case 0:
                    return this;
                case 56:
                    try {
                        g = aud.mo11265g();
                        if (g >= 0 && g <= 9) {
                            this.f5036a = Integer.valueOf(g);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(43);
                            sb.append(g);
                            sb.append(" is not a valid enum AdInitiater");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        aud.mo11263e(aud.mo11268j());
                        mo11281a(aud, a);
                        break;
                    }
                case 64:
                    int j = aud.mo11268j();
                    int g2 = aud.mo11265g();
                    if (g2 != 1000) {
                        switch (g2) {
                            case 0:
                            case 1:
                                break;
                            default:
                                aud.mo11263e(j);
                                mo11281a(aud, a);
                                continue;
                        }
                    }
                    this.f5038c = bpo.m6214a(g2);
                    break;
                case 74:
                    this.f5039d = (bph.C1149b) aud.mo11251a(bph.C1149b.m6140a());
                    break;
                case 82:
                    if (this.f5037b == null) {
                        this.f5037b = new bpy();
                    }
                    aud.mo11253a((aum) this.f5037b);
                    break;
                case 90:
                    int a2 = auq.m4197a(aud, 90);
                    int length = this.f5040e == null ? 0 : this.f5040e.length;
                    bph.C1146a[] aVarArr = new bph.C1146a[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f5040e, 0, aVarArr, 0, length);
                    }
                    while (length < aVarArr.length - 1) {
                        aVarArr[length] = (bph.C1146a) aud.mo11251a(bph.C1146a.m6134a());
                        aud.mo11250a();
                        length++;
                    }
                    aVarArr[length] = (bph.C1146a) aud.mo11251a(bph.C1146a.m6134a());
                    this.f5040e = aVarArr;
                    break;
                case 98:
                    this.f5041f = (bph.C1151c) aud.mo11251a(bph.C1151c.m6143a());
                    break;
                case 106:
                    this.f5042g = (bph.C1168j) aud.mo11251a(bph.C1168j.m6171a());
                    break;
                case 114:
                    this.f5043h = (bph.C1166i) aud.mo11251a(bph.C1166i.m6168a());
                    break;
                case 122:
                    this.f5044i = (bph.C1158f) aud.mo11251a(bph.C1158f.m6153a());
                    break;
                case 130:
                    this.f5045j = (bph.C1160g) aud.mo11251a(bph.C1160g.m6156a());
                    break;
                case 138:
                    int a3 = auq.m4197a(aud, 138);
                    int length2 = this.f5046k == null ? 0 : this.f5046k.length;
                    bqd[] bqdArr = new bqd[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f5046k, 0, bqdArr, 0, length2);
                    }
                    while (length2 < bqdArr.length - 1) {
                        bqdArr[length2] = new bqd();
                        aud.mo11253a((aum) bqdArr[length2]);
                        aud.mo11250a();
                        length2++;
                    }
                    bqdArr[length2] = new bqd();
                    aud.mo11253a((aum) bqdArr[length2]);
                    this.f5046k = bqdArr;
                    break;
                default:
                    if (super.mo11281a(aud, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append(g);
        sb2.append(" is not a valid enum AdInitiater");
        throw new IllegalArgumentException(sb2.toString());
    }
}
