package com.google.android.gms.internal.measurement;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.dm */
final class C1974dm implements C2060gg {

    /* renamed from: a */
    private final C1971dj f7609a;

    /* renamed from: b */
    private int f7610b;

    /* renamed from: c */
    private int f7611c;

    /* renamed from: d */
    private int f7612d = 0;

    /* renamed from: a */
    public static C1974dm m9175a(C1971dj djVar) {
        if (djVar.f7598c != null) {
            return djVar.f7598c;
        }
        return new C1974dm(djVar);
    }

    private C1974dm(C1971dj djVar) {
        this.f7609a = (C1971dj) C2010ek.m9562a(djVar, "input");
        this.f7609a.f7598c = this;
    }

    /* renamed from: a */
    public final int mo13647a() {
        if (this.f7612d != 0) {
            this.f7610b = this.f7612d;
            this.f7612d = 0;
        } else {
            this.f7610b = this.f7609a.mo13619a();
        }
        return (this.f7610b == 0 || this.f7610b == this.f7611c) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : this.f7610b >>> 3;
    }

    /* renamed from: b */
    public final int mo13652b() {
        return this.f7610b;
    }

    /* renamed from: c */
    public final boolean mo13657c() {
        if (this.f7609a.mo13645t() || this.f7610b == this.f7611c) {
            return false;
        }
        return this.f7609a.mo13623b(this.f7610b);
    }

    /* renamed from: a */
    private final void m9177a(int i) {
        if ((this.f7610b & 7) != i) {
            throw C2015ep.m9576e();
        }
    }

    /* renamed from: d */
    public final double mo13658d() {
        m9177a(1);
        return this.f7609a.mo13622b();
    }

    /* renamed from: e */
    public final float mo13660e() {
        m9177a(5);
        return this.f7609a.mo13624c();
    }

    /* renamed from: f */
    public final long mo13662f() {
        m9177a(0);
        return this.f7609a.mo13627d();
    }

    /* renamed from: g */
    public final long mo13664g() {
        m9177a(0);
        return this.f7609a.mo13628e();
    }

    /* renamed from: h */
    public final int mo13666h() {
        m9177a(0);
        return this.f7609a.mo13630f();
    }

    /* renamed from: i */
    public final long mo13668i() {
        m9177a(1);
        return this.f7609a.mo13632g();
    }

    /* renamed from: j */
    public final int mo13670j() {
        m9177a(5);
        return this.f7609a.mo13633h();
    }

    /* renamed from: k */
    public final boolean mo13673k() {
        m9177a(0);
        return this.f7609a.mo13634i();
    }

    /* renamed from: l */
    public final String mo13674l() {
        m9177a(2);
        return this.f7609a.mo13635j();
    }

    /* renamed from: m */
    public final String mo13676m() {
        m9177a(2);
        return this.f7609a.mo13636k();
    }

    /* renamed from: a */
    public final <T> T mo13648a(C2061gh<T> ghVar, C1988dv dvVar) {
        m9177a(2);
        return m9180c(ghVar, dvVar);
    }

    /* renamed from: b */
    public final <T> T mo13653b(C2061gh<T> ghVar, C1988dv dvVar) {
        m9177a(3);
        return m9182d(ghVar, dvVar);
    }

    /* renamed from: c */
    private final <T> T m9180c(C2061gh<T> ghVar, C1988dv dvVar) {
        int m = this.f7609a.mo13638m();
        if (this.f7609a.f7596a < this.f7609a.f7597b) {
            int d = this.f7609a.mo13626d(m);
            T a = ghVar.mo13926a();
            this.f7609a.f7596a++;
            ghVar.mo13927a(a, this, dvVar);
            ghVar.mo13932c(a);
            this.f7609a.mo13621a(0);
            C1971dj djVar = this.f7609a;
            djVar.f7596a--;
            this.f7609a.mo13629e(d);
            return a;
        }
        throw C2015ep.m9577f();
    }

    /* renamed from: d */
    private final <T> T m9182d(C2061gh<T> ghVar, C1988dv dvVar) {
        int i = this.f7611c;
        this.f7611c = ((this.f7610b >>> 3) << 3) | 4;
        try {
            T a = ghVar.mo13926a();
            ghVar.mo13927a(a, this, dvVar);
            ghVar.mo13932c(a);
            if (this.f7610b == this.f7611c) {
                return a;
            }
            throw C2015ep.m9578g();
        } finally {
            this.f7611c = i;
        }
    }

    /* renamed from: n */
    public final C1958cx mo13678n() {
        m9177a(2);
        return this.f7609a.mo13637l();
    }

    /* renamed from: o */
    public final int mo13680o() {
        m9177a(0);
        return this.f7609a.mo13638m();
    }

    /* renamed from: p */
    public final int mo13682p() {
        m9177a(0);
        return this.f7609a.mo13639n();
    }

    /* renamed from: q */
    public final int mo13684q() {
        m9177a(5);
        return this.f7609a.mo13640o();
    }

    /* renamed from: r */
    public final long mo13686r() {
        m9177a(1);
        return this.f7609a.mo13641p();
    }

    /* renamed from: s */
    public final int mo13687s() {
        m9177a(0);
        return this.f7609a.mo13642q();
    }

    /* renamed from: t */
    public final long mo13688t() {
        m9177a(0);
        return this.f7609a.mo13643r();
    }

    /* renamed from: a */
    public final void mo13649a(List<Double> list) {
        int a;
        int a2;
        if (list instanceof C1984dr) {
            C1984dr drVar = (C1984dr) list;
            switch (this.f7610b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f7609a.mo13638m();
                    m9179b(m);
                    int u = this.f7609a.mo13646u() + m;
                    do {
                        drVar.mo13768a(this.f7609a.mo13622b());
                    } while (this.f7609a.mo13646u() < u);
                    return;
                default:
                    throw C2015ep.m9576e();
            }
            do {
                drVar.mo13768a(this.f7609a.mo13622b());
                if (!this.f7609a.mo13645t()) {
                    a2 = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a2 == this.f7610b);
            this.f7612d = a2;
            return;
        }
        switch (this.f7610b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f7609a.mo13638m();
                m9179b(m2);
                int u2 = this.f7609a.mo13646u() + m2;
                do {
                    list.add(Double.valueOf(this.f7609a.mo13622b()));
                } while (this.f7609a.mo13646u() < u2);
                return;
            default:
                throw C2015ep.m9576e();
        }
        do {
            list.add(Double.valueOf(this.f7609a.mo13622b()));
            if (!this.f7609a.mo13645t()) {
                a = this.f7609a.mo13619a();
            } else {
                return;
            }
        } while (a == this.f7610b);
        this.f7612d = a;
    }

    /* renamed from: b */
    public final void mo13654b(List<Float> list) {
        int a;
        int a2;
        if (list instanceof C2000ef) {
            C2000ef efVar = (C2000ef) list;
            int i = this.f7610b & 7;
            if (i == 2) {
                int m = this.f7609a.mo13638m();
                m9181c(m);
                int u = this.f7609a.mo13646u() + m;
                do {
                    efVar.mo13806a(this.f7609a.mo13624c());
                } while (this.f7609a.mo13646u() < u);
            } else if (i == 5) {
                do {
                    efVar.mo13806a(this.f7609a.mo13624c());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 2) {
                int m2 = this.f7609a.mo13638m();
                m9181c(m2);
                int u2 = this.f7609a.mo13646u() + m2;
                do {
                    list.add(Float.valueOf(this.f7609a.mo13624c()));
                } while (this.f7609a.mo13646u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f7609a.mo13624c()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: c */
    public final void mo13656c(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    feVar.mo13897a(this.f7609a.mo13627d());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    feVar.mo13897a(this.f7609a.mo13627d());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f7609a.mo13627d()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Long.valueOf(this.f7609a.mo13627d()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: d */
    public final void mo13659d(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    feVar.mo13897a(this.f7609a.mo13628e());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    feVar.mo13897a(this.f7609a.mo13628e());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f7609a.mo13628e()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Long.valueOf(this.f7609a.mo13628e()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: e */
    public final void mo13661e(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    ejVar.mo13831c(this.f7609a.mo13630f());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    ejVar.mo13831c(this.f7609a.mo13630f());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13630f()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13630f()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: f */
    public final void mo13663f(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            switch (this.f7610b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f7609a.mo13638m();
                    m9179b(m);
                    int u = this.f7609a.mo13646u() + m;
                    do {
                        feVar.mo13897a(this.f7609a.mo13632g());
                    } while (this.f7609a.mo13646u() < u);
                    return;
                default:
                    throw C2015ep.m9576e();
            }
            do {
                feVar.mo13897a(this.f7609a.mo13632g());
                if (!this.f7609a.mo13645t()) {
                    a2 = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a2 == this.f7610b);
            this.f7612d = a2;
            return;
        }
        switch (this.f7610b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f7609a.mo13638m();
                m9179b(m2);
                int u2 = this.f7609a.mo13646u() + m2;
                do {
                    list.add(Long.valueOf(this.f7609a.mo13632g()));
                } while (this.f7609a.mo13646u() < u2);
                return;
            default:
                throw C2015ep.m9576e();
        }
        do {
            list.add(Long.valueOf(this.f7609a.mo13632g()));
            if (!this.f7609a.mo13645t()) {
                a = this.f7609a.mo13619a();
            } else {
                return;
            }
        } while (a == this.f7610b);
        this.f7612d = a;
    }

    /* renamed from: g */
    public final void mo13665g(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            int i = this.f7610b & 7;
            if (i == 2) {
                int m = this.f7609a.mo13638m();
                m9181c(m);
                int u = this.f7609a.mo13646u() + m;
                do {
                    ejVar.mo13831c(this.f7609a.mo13633h());
                } while (this.f7609a.mo13646u() < u);
            } else if (i == 5) {
                do {
                    ejVar.mo13831c(this.f7609a.mo13633h());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 2) {
                int m2 = this.f7609a.mo13638m();
                m9181c(m2);
                int u2 = this.f7609a.mo13646u() + m2;
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13633h()));
                } while (this.f7609a.mo13646u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13633h()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: h */
    public final void mo13667h(List<Boolean> list) {
        int a;
        int a2;
        if (list instanceof C1956cv) {
            C1956cv cvVar = (C1956cv) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    cvVar.mo13589a(this.f7609a.mo13634i());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    cvVar.mo13589a(this.f7609a.mo13634i());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f7609a.mo13634i()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Boolean.valueOf(this.f7609a.mo13634i()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: i */
    public final void mo13669i(List<String> list) {
        m9178a(list, false);
    }

    /* renamed from: j */
    public final void mo13671j(List<String> list) {
        m9178a(list, true);
    }

    /* renamed from: a */
    private final void m9178a(List<String> list, boolean z) {
        int a;
        int a2;
        if ((this.f7610b & 7) != 2) {
            throw C2015ep.m9576e();
        } else if (!(list instanceof C2025ez) || z) {
            do {
                list.add(z ? mo13676m() : mo13674l());
                if (!this.f7609a.mo13645t()) {
                    a = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a == this.f7610b);
            this.f7612d = a;
        } else {
            C2025ez ezVar = (C2025ez) list;
            do {
                ezVar.mo13850a(mo13678n());
                if (!this.f7609a.mo13645t()) {
                    a2 = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a2 == this.f7610b);
            this.f7612d = a2;
        }
    }

    /* renamed from: a */
    public final <T> void mo13650a(List<T> list, C2061gh<T> ghVar, C1988dv dvVar) {
        int a;
        if ((this.f7610b & 7) == 2) {
            int i = this.f7610b;
            do {
                list.add(m9180c(ghVar, dvVar));
                if (!this.f7609a.mo13645t() && this.f7612d == 0) {
                    a = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a == i);
            this.f7612d = a;
            return;
        }
        throw C2015ep.m9576e();
    }

    /* renamed from: b */
    public final <T> void mo13655b(List<T> list, C2061gh<T> ghVar, C1988dv dvVar) {
        int a;
        if ((this.f7610b & 7) == 3) {
            int i = this.f7610b;
            do {
                list.add(m9182d(ghVar, dvVar));
                if (!this.f7609a.mo13645t() && this.f7612d == 0) {
                    a = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a == i);
            this.f7612d = a;
            return;
        }
        throw C2015ep.m9576e();
    }

    /* renamed from: k */
    public final void mo13672k(List<C1958cx> list) {
        int a;
        if ((this.f7610b & 7) == 2) {
            do {
                list.add(mo13678n());
                if (!this.f7609a.mo13645t()) {
                    a = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a == this.f7610b);
            this.f7612d = a;
            return;
        }
        throw C2015ep.m9576e();
    }

    /* renamed from: l */
    public final void mo13675l(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    ejVar.mo13831c(this.f7609a.mo13638m());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    ejVar.mo13831c(this.f7609a.mo13638m());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13638m()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13638m()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: m */
    public final void mo13677m(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    ejVar.mo13831c(this.f7609a.mo13639n());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    ejVar.mo13831c(this.f7609a.mo13639n());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13639n()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13639n()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: n */
    public final void mo13679n(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            int i = this.f7610b & 7;
            if (i == 2) {
                int m = this.f7609a.mo13638m();
                m9181c(m);
                int u = this.f7609a.mo13646u() + m;
                do {
                    ejVar.mo13831c(this.f7609a.mo13640o());
                } while (this.f7609a.mo13646u() < u);
            } else if (i == 5) {
                do {
                    ejVar.mo13831c(this.f7609a.mo13640o());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 2) {
                int m2 = this.f7609a.mo13638m();
                m9181c(m2);
                int u2 = this.f7609a.mo13646u() + m2;
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13640o()));
                } while (this.f7609a.mo13646u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13640o()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: o */
    public final void mo13681o(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            switch (this.f7610b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f7609a.mo13638m();
                    m9179b(m);
                    int u = this.f7609a.mo13646u() + m;
                    do {
                        feVar.mo13897a(this.f7609a.mo13641p());
                    } while (this.f7609a.mo13646u() < u);
                    return;
                default:
                    throw C2015ep.m9576e();
            }
            do {
                feVar.mo13897a(this.f7609a.mo13641p());
                if (!this.f7609a.mo13645t()) {
                    a2 = this.f7609a.mo13619a();
                } else {
                    return;
                }
            } while (a2 == this.f7610b);
            this.f7612d = a2;
            return;
        }
        switch (this.f7610b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f7609a.mo13638m();
                m9179b(m2);
                int u2 = this.f7609a.mo13646u() + m2;
                do {
                    list.add(Long.valueOf(this.f7609a.mo13641p()));
                } while (this.f7609a.mo13646u() < u2);
                return;
            default:
                throw C2015ep.m9576e();
        }
        do {
            list.add(Long.valueOf(this.f7609a.mo13641p()));
            if (!this.f7609a.mo13645t()) {
                a = this.f7609a.mo13619a();
            } else {
                return;
            }
        } while (a == this.f7610b);
        this.f7612d = a;
    }

    /* renamed from: p */
    public final void mo13683p(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2009ej) {
            C2009ej ejVar = (C2009ej) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    ejVar.mo13831c(this.f7609a.mo13642q());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    ejVar.mo13831c(this.f7609a.mo13642q());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13642q()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Integer.valueOf(this.f7609a.mo13642q()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: q */
    public final void mo13685q(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2031fe) {
            C2031fe feVar = (C2031fe) list;
            int i = this.f7610b & 7;
            if (i == 0) {
                do {
                    feVar.mo13897a(this.f7609a.mo13643r());
                    if (!this.f7609a.mo13645t()) {
                        a2 = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a2 == this.f7610b);
                this.f7612d = a2;
            } else if (i == 2) {
                int u = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    feVar.mo13897a(this.f7609a.mo13643r());
                } while (this.f7609a.mo13646u() < u);
                m9183d(u);
            } else {
                throw C2015ep.m9576e();
            }
        } else {
            int i2 = this.f7610b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f7609a.mo13643r()));
                    if (!this.f7609a.mo13645t()) {
                        a = this.f7609a.mo13619a();
                    } else {
                        return;
                    }
                } while (a == this.f7610b);
                this.f7612d = a;
            } else if (i2 == 2) {
                int u2 = this.f7609a.mo13646u() + this.f7609a.mo13638m();
                do {
                    list.add(Long.valueOf(this.f7609a.mo13643r()));
                } while (this.f7609a.mo13646u() < u2);
                m9183d(u2);
            } else {
                throw C2015ep.m9576e();
            }
        }
    }

    /* renamed from: b */
    private static void m9179b(int i) {
        if ((i & 7) != 0) {
            throw C2015ep.m9578g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo13657c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.measurement.C2015ep("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo13651a(java.util.Map<K, V> r6, com.google.android.gms.internal.measurement.C2036fj<K, V> r7, com.google.android.gms.internal.measurement.C1988dv r8) {
        /*
            r5 = this;
            r0 = 2
            r5.m9177a((int) r0)
            com.google.android.gms.internal.measurement.dj r0 = r5.f7609a
            int r0 = r0.mo13638m()
            com.google.android.gms.internal.measurement.dj r1 = r5.f7609a
            int r0 = r1.mo13626d(r0)
            K r1 = r7.f7786b
            V r2 = r7.f7788d
        L_0x0014:
            int r3 = r5.mo13647a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.measurement.dj r4 = r5.f7609a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo13645t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo13657c()     // Catch:{ eq -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.measurement.ho r3 = r7.f7787c     // Catch:{ eq -> 0x004f }
            V r4 = r7.f7788d     // Catch:{ eq -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ eq -> 0x004f }
            java.lang.Object r3 = r5.m9176a((com.google.android.gms.internal.measurement.C2099ho) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.measurement.C1988dv) r8)     // Catch:{ eq -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.measurement.ho r3 = r7.f7785a     // Catch:{ eq -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m9176a((com.google.android.gms.internal.measurement.C2099ho) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.measurement.C1988dv) r4)     // Catch:{ eq -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.measurement.ep r3 = new com.google.android.gms.internal.measurement.ep     // Catch:{ eq -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ eq -> 0x004f }
            throw r3     // Catch:{ eq -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo13657c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.measurement.ep r6 = new com.google.android.gms.internal.measurement.ep     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.measurement.dj r6 = r5.f7609a
            r6.mo13629e(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.measurement.dj r7 = r5.f7609a
            r7.mo13629e(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1974dm.mo13651a(java.util.Map, com.google.android.gms.internal.measurement.fj, com.google.android.gms.internal.measurement.dv):void");
    }

    /* renamed from: a */
    private final Object m9176a(C2099ho hoVar, Class<?> cls, C1988dv dvVar) {
        switch (C1975dn.f7613a[hoVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo13673k());
            case 2:
                return mo13678n();
            case 3:
                return Double.valueOf(mo13658d());
            case 4:
                return Integer.valueOf(mo13682p());
            case 5:
                return Integer.valueOf(mo13670j());
            case 6:
                return Long.valueOf(mo13668i());
            case 7:
                return Float.valueOf(mo13660e());
            case 8:
                return Integer.valueOf(mo13666h());
            case 9:
                return Long.valueOf(mo13664g());
            case 10:
                m9177a(2);
                return m9180c(C2057gd.m9772a().mo13936a(cls), dvVar);
            case 11:
                return Integer.valueOf(mo13684q());
            case 12:
                return Long.valueOf(mo13686r());
            case 13:
                return Integer.valueOf(mo13687s());
            case 14:
                return Long.valueOf(mo13688t());
            case 15:
                return mo13676m();
            case 16:
                return Integer.valueOf(mo13680o());
            case 17:
                return Long.valueOf(mo13662f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m9181c(int i) {
        if ((i & 3) != 0) {
            throw C2015ep.m9578g();
        }
    }

    /* renamed from: d */
    private final void m9183d(int i) {
        if (this.f7609a.mo13646u() != i) {
            throw C2015ep.m9572a();
        }
    }
}
