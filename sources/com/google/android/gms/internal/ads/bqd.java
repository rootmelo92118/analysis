package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bph;

public final class bqd extends aug<bqd> {

    /* renamed from: a */
    private static volatile bqd[] f5079a;

    /* renamed from: b */
    private bph.C1185r f5080b = null;

    /* renamed from: c */
    private bph.C1189t f5081c = null;

    /* renamed from: d */
    private bph.C1191u f5082d = null;

    /* renamed from: e */
    private bph.C1193v f5083e = null;

    /* renamed from: f */
    private bph.C1180p f5084f = null;

    /* renamed from: g */
    private bph.C1187s f5085g = null;

    /* renamed from: h */
    private bqe f5086h = null;

    /* renamed from: i */
    private Integer f5087i = null;

    /* renamed from: j */
    private Integer f5088j = null;

    /* renamed from: k */
    private bph.C1176n f5089k = null;

    /* renamed from: l */
    private Integer f5090l = null;

    /* renamed from: m */
    private Integer f5091m = null;

    /* renamed from: n */
    private Integer f5092n = null;

    /* renamed from: o */
    private Integer f5093o = null;

    /* renamed from: p */
    private Integer f5094p = null;

    /* renamed from: q */
    private Long f5095q = null;

    /* renamed from: b */
    public static bqd[] m6240b() {
        if (f5079a == null) {
            synchronized (auk.f2580b) {
                if (f5079a == null) {
                    f5079a = new bqd[0];
                }
            }
        }
        return f5079a;
    }

    public bqd() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f5080b != null) {
            aue.mo11272a(5, (arw) this.f5080b);
        }
        if (this.f5081c != null) {
            aue.mo11272a(6, (arw) this.f5081c);
        }
        if (this.f5082d != null) {
            aue.mo11272a(7, (arw) this.f5082d);
        }
        if (this.f5083e != null) {
            aue.mo11272a(8, (arw) this.f5083e);
        }
        if (this.f5084f != null) {
            aue.mo11272a(9, (arw) this.f5084f);
        }
        if (this.f5085g != null) {
            aue.mo11272a(10, (arw) this.f5085g);
        }
        if (this.f5086h != null) {
            aue.mo11273a(11, (aum) this.f5086h);
        }
        if (this.f5087i != null) {
            aue.mo11270a(12, this.f5087i.intValue());
        }
        if (this.f5088j != null) {
            aue.mo11270a(13, this.f5088j.intValue());
        }
        if (this.f5089k != null) {
            aue.mo11272a(14, (arw) this.f5089k);
        }
        if (this.f5090l != null) {
            aue.mo11270a(15, this.f5090l.intValue());
        }
        if (this.f5091m != null) {
            aue.mo11270a(16, this.f5091m.intValue());
        }
        if (this.f5092n != null) {
            aue.mo11270a(17, this.f5092n.intValue());
        }
        if (this.f5093o != null) {
            aue.mo11270a(18, this.f5093o.intValue());
        }
        if (this.f5094p != null) {
            aue.mo11270a(19, this.f5094p.intValue());
        }
        if (this.f5095q != null) {
            aue.mo11271a(20, this.f5095q.longValue());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f5080b != null) {
            a += apt.m3165c(5, (arw) this.f5080b);
        }
        if (this.f5081c != null) {
            a += apt.m3165c(6, (arw) this.f5081c);
        }
        if (this.f5082d != null) {
            a += apt.m3165c(7, (arw) this.f5082d);
        }
        if (this.f5083e != null) {
            a += apt.m3165c(8, (arw) this.f5083e);
        }
        if (this.f5084f != null) {
            a += apt.m3165c(9, (arw) this.f5084f);
        }
        if (this.f5085g != null) {
            a += apt.m3165c(10, (arw) this.f5085g);
        }
        if (this.f5086h != null) {
            a += aue.m4144b(11, (aum) this.f5086h);
        }
        if (this.f5087i != null) {
            a += aue.m4143b(12, this.f5087i.intValue());
        }
        if (this.f5088j != null) {
            a += aue.m4143b(13, this.f5088j.intValue());
        }
        if (this.f5089k != null) {
            a += apt.m3165c(14, (arw) this.f5089k);
        }
        if (this.f5090l != null) {
            a += aue.m4143b(15, this.f5090l.intValue());
        }
        if (this.f5091m != null) {
            a += aue.m4143b(16, this.f5091m.intValue());
        }
        if (this.f5092n != null) {
            a += aue.m4143b(17, this.f5092n.intValue());
        }
        if (this.f5093o != null) {
            a += aue.m4143b(18, this.f5093o.intValue());
        }
        if (this.f5094p != null) {
            a += aue.m4143b(19, this.f5094p.intValue());
        }
        return this.f5095q != null ? a + aue.m4149c(20, this.f5095q.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            switch (a) {
                case 0:
                    return this;
                case 42:
                    this.f5080b = (bph.C1185r) aud.mo11251a(bph.C1185r.m6194a());
                    break;
                case 50:
                    this.f5081c = (bph.C1189t) aud.mo11251a(bph.C1189t.m6200a());
                    break;
                case 58:
                    this.f5082d = (bph.C1191u) aud.mo11251a(bph.C1191u.m6203a());
                    break;
                case 66:
                    this.f5083e = (bph.C1193v) aud.mo11251a(bph.C1193v.m6206a());
                    break;
                case 74:
                    this.f5084f = (bph.C1180p) aud.mo11251a(bph.C1180p.m6185a());
                    break;
                case 82:
                    this.f5085g = (bph.C1187s) aud.mo11251a(bph.C1187s.m6197a());
                    break;
                case 90:
                    if (this.f5086h == null) {
                        this.f5086h = new bqe();
                    }
                    aud.mo11253a((aum) this.f5086h);
                    break;
                case 96:
                    this.f5087i = Integer.valueOf(aud.mo11265g());
                    break;
                case 104:
                    this.f5088j = Integer.valueOf(aud.mo11265g());
                    break;
                case 114:
                    this.f5089k = (bph.C1176n) aud.mo11251a(bph.C1176n.m6180a());
                    break;
                case 120:
                    this.f5090l = Integer.valueOf(aud.mo11265g());
                    break;
                case 128:
                    this.f5091m = Integer.valueOf(aud.mo11265g());
                    break;
                case 136:
                    this.f5092n = Integer.valueOf(aud.mo11265g());
                    break;
                case 144:
                    this.f5093o = Integer.valueOf(aud.mo11265g());
                    break;
                case 152:
                    this.f5094p = Integer.valueOf(aud.mo11265g());
                    break;
                case 160:
                    this.f5095q = Long.valueOf(aud.mo11266h());
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
