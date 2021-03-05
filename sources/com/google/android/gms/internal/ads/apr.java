package com.google.android.gms.internal.ads;

import android.support.p037v7.widget.ActivityChooserView;
import java.util.List;

final class apr implements asn {

    /* renamed from: a */
    private final apo f2202a;

    /* renamed from: b */
    private int f2203b;

    /* renamed from: c */
    private int f2204c;

    /* renamed from: d */
    private int f2205d = 0;

    /* renamed from: a */
    public static apr m3095a(apo apo) {
        if (apo.f2191c != null) {
            return apo.f2191c;
        }
        return new apr(apo);
    }

    private apr(apo apo) {
        this.f2202a = (apo) aqp.m3497a(apo, "input");
        this.f2202a.f2191c = this;
    }

    /* renamed from: a */
    public final int mo10845a() {
        if (this.f2205d != 0) {
            this.f2203b = this.f2205d;
            this.f2205d = 0;
        } else {
            this.f2203b = this.f2202a.mo10817a();
        }
        return (this.f2203b == 0 || this.f2203b == this.f2204c) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : this.f2203b >>> 3;
    }

    /* renamed from: b */
    public final int mo10850b() {
        return this.f2203b;
    }

    /* renamed from: c */
    public final boolean mo10855c() {
        if (this.f2202a.mo10843t() || this.f2203b == this.f2204c) {
            return false;
        }
        return this.f2202a.mo10821b(this.f2203b);
    }

    /* renamed from: a */
    private final void m3097a(int i) {
        if ((this.f2203b & 7) != i) {
            throw aqv.m3512f();
        }
    }

    /* renamed from: d */
    public final double mo10856d() {
        m3097a(1);
        return this.f2202a.mo10820b();
    }

    /* renamed from: e */
    public final float mo10858e() {
        m3097a(5);
        return this.f2202a.mo10822c();
    }

    /* renamed from: f */
    public final long mo10860f() {
        m3097a(0);
        return this.f2202a.mo10825d();
    }

    /* renamed from: g */
    public final long mo10862g() {
        m3097a(0);
        return this.f2202a.mo10826e();
    }

    /* renamed from: h */
    public final int mo10864h() {
        m3097a(0);
        return this.f2202a.mo10828f();
    }

    /* renamed from: i */
    public final long mo10866i() {
        m3097a(1);
        return this.f2202a.mo10830g();
    }

    /* renamed from: j */
    public final int mo10868j() {
        m3097a(5);
        return this.f2202a.mo10831h();
    }

    /* renamed from: k */
    public final boolean mo10871k() {
        m3097a(0);
        return this.f2202a.mo10832i();
    }

    /* renamed from: l */
    public final String mo10872l() {
        m3097a(2);
        return this.f2202a.mo10833j();
    }

    /* renamed from: m */
    public final String mo10874m() {
        m3097a(2);
        return this.f2202a.mo10834k();
    }

    /* renamed from: a */
    public final <T> T mo10846a(aso<T> aso, apz apz) {
        m3097a(2);
        return m3100c(aso, apz);
    }

    /* renamed from: b */
    public final <T> T mo10851b(aso<T> aso, apz apz) {
        m3097a(3);
        return m3102d(aso, apz);
    }

    /* renamed from: c */
    private final <T> T m3100c(aso<T> aso, apz apz) {
        int m = this.f2202a.mo10836m();
        if (this.f2202a.f2189a < this.f2202a.f2190b) {
            int d = this.f2202a.mo10824d(m);
            T a = aso.mo11101a();
            this.f2202a.f2189a++;
            aso.mo11102a(a, this, apz);
            aso.mo11108c(a);
            this.f2202a.mo10819a(0);
            apo apo = this.f2202a;
            apo.f2189a--;
            this.f2202a.mo10827e(d);
            return a;
        }
        throw aqv.m3513g();
    }

    /* renamed from: d */
    private final <T> T m3102d(aso<T> aso, apz apz) {
        int i = this.f2204c;
        this.f2204c = ((this.f2203b >>> 3) << 3) | 4;
        try {
            T a = aso.mo11101a();
            aso.mo11102a(a, this, apz);
            aso.mo11108c(a);
            if (this.f2203b == this.f2204c) {
                return a;
            }
            throw aqv.m3514h();
        } finally {
            this.f2204c = i;
        }
    }

    /* renamed from: n */
    public final apc mo10876n() {
        m3097a(2);
        return this.f2202a.mo10835l();
    }

    /* renamed from: o */
    public final int mo10878o() {
        m3097a(0);
        return this.f2202a.mo10836m();
    }

    /* renamed from: p */
    public final int mo10880p() {
        m3097a(0);
        return this.f2202a.mo10837n();
    }

    /* renamed from: q */
    public final int mo10882q() {
        m3097a(5);
        return this.f2202a.mo10838o();
    }

    /* renamed from: r */
    public final long mo10884r() {
        m3097a(1);
        return this.f2202a.mo10839p();
    }

    /* renamed from: s */
    public final int mo10885s() {
        m3097a(0);
        return this.f2202a.mo10840q();
    }

    /* renamed from: t */
    public final long mo10886t() {
        m3097a(0);
        return this.f2202a.mo10841r();
    }

    /* renamed from: a */
    public final void mo10847a(List<Double> list) {
        int a;
        int a2;
        if (list instanceof apw) {
            apw apw = (apw) list;
            switch (this.f2203b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f2202a.mo10836m();
                    m3099b(m);
                    int u = this.f2202a.mo10844u() + m;
                    do {
                        apw.mo10967a(this.f2202a.mo10820b());
                    } while (this.f2202a.mo10844u() < u);
                    return;
                default:
                    throw aqv.m3512f();
            }
            do {
                apw.mo10967a(this.f2202a.mo10820b());
                if (!this.f2202a.mo10843t()) {
                    a2 = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a2 == this.f2203b);
            this.f2205d = a2;
            return;
        }
        switch (this.f2203b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f2202a.mo10836m();
                m3099b(m2);
                int u2 = this.f2202a.mo10844u() + m2;
                do {
                    list.add(Double.valueOf(this.f2202a.mo10820b()));
                } while (this.f2202a.mo10844u() < u2);
                return;
            default:
                throw aqv.m3512f();
        }
        do {
            list.add(Double.valueOf(this.f2202a.mo10820b()));
            if (!this.f2202a.mo10843t()) {
                a = this.f2202a.mo10817a();
            } else {
                return;
            }
        } while (a == this.f2203b);
        this.f2205d = a;
    }

    /* renamed from: b */
    public final void mo10852b(List<Float> list) {
        int a;
        int a2;
        if (list instanceof aqk) {
            aqk aqk = (aqk) list;
            int i = this.f2203b & 7;
            if (i == 2) {
                int m = this.f2202a.mo10836m();
                m3101c(m);
                int u = this.f2202a.mo10844u() + m;
                do {
                    aqk.mo11009a(this.f2202a.mo10822c());
                } while (this.f2202a.mo10844u() < u);
            } else if (i == 5) {
                do {
                    aqk.mo11009a(this.f2202a.mo10822c());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 2) {
                int m2 = this.f2202a.mo10836m();
                m3101c(m2);
                int u2 = this.f2202a.mo10844u() + m2;
                do {
                    list.add(Float.valueOf(this.f2202a.mo10822c()));
                } while (this.f2202a.mo10844u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f2202a.mo10822c()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: c */
    public final void mo10854c(List<Long> list) {
        int a;
        int a2;
        if (list instanceof arj) {
            arj arj = (arj) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    arj.mo11062a(this.f2202a.mo10825d());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    arj.mo11062a(this.f2202a.mo10825d());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f2202a.mo10825d()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Long.valueOf(this.f2202a.mo10825d()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: d */
    public final void mo10857d(List<Long> list) {
        int a;
        int a2;
        if (list instanceof arj) {
            arj arj = (arj) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    arj.mo11062a(this.f2202a.mo10826e());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    arj.mo11062a(this.f2202a.mo10826e());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f2202a.mo10826e()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Long.valueOf(this.f2202a.mo10826e()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: e */
    public final void mo10859e(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    aqo.mo11033c(this.f2202a.mo10828f());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    aqo.mo11033c(this.f2202a.mo10828f());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10828f()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10828f()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: f */
    public final void mo10861f(List<Long> list) {
        int a;
        int a2;
        if (list instanceof arj) {
            arj arj = (arj) list;
            switch (this.f2203b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f2202a.mo10836m();
                    m3099b(m);
                    int u = this.f2202a.mo10844u() + m;
                    do {
                        arj.mo11062a(this.f2202a.mo10830g());
                    } while (this.f2202a.mo10844u() < u);
                    return;
                default:
                    throw aqv.m3512f();
            }
            do {
                arj.mo11062a(this.f2202a.mo10830g());
                if (!this.f2202a.mo10843t()) {
                    a2 = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a2 == this.f2203b);
            this.f2205d = a2;
            return;
        }
        switch (this.f2203b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f2202a.mo10836m();
                m3099b(m2);
                int u2 = this.f2202a.mo10844u() + m2;
                do {
                    list.add(Long.valueOf(this.f2202a.mo10830g()));
                } while (this.f2202a.mo10844u() < u2);
                return;
            default:
                throw aqv.m3512f();
        }
        do {
            list.add(Long.valueOf(this.f2202a.mo10830g()));
            if (!this.f2202a.mo10843t()) {
                a = this.f2202a.mo10817a();
            } else {
                return;
            }
        } while (a == this.f2203b);
        this.f2205d = a;
    }

    /* renamed from: g */
    public final void mo10863g(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            int i = this.f2203b & 7;
            if (i == 2) {
                int m = this.f2202a.mo10836m();
                m3101c(m);
                int u = this.f2202a.mo10844u() + m;
                do {
                    aqo.mo11033c(this.f2202a.mo10831h());
                } while (this.f2202a.mo10844u() < u);
            } else if (i == 5) {
                do {
                    aqo.mo11033c(this.f2202a.mo10831h());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 2) {
                int m2 = this.f2202a.mo10836m();
                m3101c(m2);
                int u2 = this.f2202a.mo10844u() + m2;
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10831h()));
                } while (this.f2202a.mo10844u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10831h()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: h */
    public final void mo10865h(List<Boolean> list) {
        int a;
        int a2;
        if (list instanceof apa) {
            apa apa = (apa) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    apa.mo10786a(this.f2202a.mo10832i());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    apa.mo10786a(this.f2202a.mo10832i());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2202a.mo10832i()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Boolean.valueOf(this.f2202a.mo10832i()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: i */
    public final void mo10867i(List<String> list) {
        m3098a(list, false);
    }

    /* renamed from: j */
    public final void mo10869j(List<String> list) {
        m3098a(list, true);
    }

    /* renamed from: a */
    private final void m3098a(List<String> list, boolean z) {
        int a;
        int a2;
        if ((this.f2203b & 7) != 2) {
            throw aqv.m3512f();
        } else if (!(list instanceof are) || z) {
            do {
                list.add(z ? mo10874m() : mo10872l());
                if (!this.f2202a.mo10843t()) {
                    a = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a == this.f2203b);
            this.f2205d = a;
        } else {
            are are = (are) list;
            do {
                are.mo11053a(mo10876n());
                if (!this.f2202a.mo10843t()) {
                    a2 = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a2 == this.f2203b);
            this.f2205d = a2;
        }
    }

    /* renamed from: a */
    public final <T> void mo10848a(List<T> list, aso<T> aso, apz apz) {
        int a;
        if ((this.f2203b & 7) == 2) {
            int i = this.f2203b;
            do {
                list.add(m3100c(aso, apz));
                if (!this.f2202a.mo10843t() && this.f2205d == 0) {
                    a = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a == i);
            this.f2205d = a;
            return;
        }
        throw aqv.m3512f();
    }

    /* renamed from: b */
    public final <T> void mo10853b(List<T> list, aso<T> aso, apz apz) {
        int a;
        if ((this.f2203b & 7) == 3) {
            int i = this.f2203b;
            do {
                list.add(m3102d(aso, apz));
                if (!this.f2202a.mo10843t() && this.f2205d == 0) {
                    a = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a == i);
            this.f2205d = a;
            return;
        }
        throw aqv.m3512f();
    }

    /* renamed from: k */
    public final void mo10870k(List<apc> list) {
        int a;
        if ((this.f2203b & 7) == 2) {
            do {
                list.add(mo10876n());
                if (!this.f2202a.mo10843t()) {
                    a = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a == this.f2203b);
            this.f2205d = a;
            return;
        }
        throw aqv.m3512f();
    }

    /* renamed from: l */
    public final void mo10873l(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    aqo.mo11033c(this.f2202a.mo10836m());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    aqo.mo11033c(this.f2202a.mo10836m());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10836m()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10836m()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: m */
    public final void mo10875m(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    aqo.mo11033c(this.f2202a.mo10837n());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    aqo.mo11033c(this.f2202a.mo10837n());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10837n()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10837n()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: n */
    public final void mo10877n(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            int i = this.f2203b & 7;
            if (i == 2) {
                int m = this.f2202a.mo10836m();
                m3101c(m);
                int u = this.f2202a.mo10844u() + m;
                do {
                    aqo.mo11033c(this.f2202a.mo10838o());
                } while (this.f2202a.mo10844u() < u);
            } else if (i == 5) {
                do {
                    aqo.mo11033c(this.f2202a.mo10838o());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 2) {
                int m2 = this.f2202a.mo10836m();
                m3101c(m2);
                int u2 = this.f2202a.mo10844u() + m2;
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10838o()));
                } while (this.f2202a.mo10844u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10838o()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: o */
    public final void mo10879o(List<Long> list) {
        int a;
        int a2;
        if (list instanceof arj) {
            arj arj = (arj) list;
            switch (this.f2203b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f2202a.mo10836m();
                    m3099b(m);
                    int u = this.f2202a.mo10844u() + m;
                    do {
                        arj.mo11062a(this.f2202a.mo10839p());
                    } while (this.f2202a.mo10844u() < u);
                    return;
                default:
                    throw aqv.m3512f();
            }
            do {
                arj.mo11062a(this.f2202a.mo10839p());
                if (!this.f2202a.mo10843t()) {
                    a2 = this.f2202a.mo10817a();
                } else {
                    return;
                }
            } while (a2 == this.f2203b);
            this.f2205d = a2;
            return;
        }
        switch (this.f2203b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f2202a.mo10836m();
                m3099b(m2);
                int u2 = this.f2202a.mo10844u() + m2;
                do {
                    list.add(Long.valueOf(this.f2202a.mo10839p()));
                } while (this.f2202a.mo10844u() < u2);
                return;
            default:
                throw aqv.m3512f();
        }
        do {
            list.add(Long.valueOf(this.f2202a.mo10839p()));
            if (!this.f2202a.mo10843t()) {
                a = this.f2202a.mo10817a();
            } else {
                return;
            }
        } while (a == this.f2203b);
        this.f2205d = a;
    }

    /* renamed from: p */
    public final void mo10881p(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aqo) {
            aqo aqo = (aqo) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    aqo.mo11033c(this.f2202a.mo10840q());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    aqo.mo11033c(this.f2202a.mo10840q());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10840q()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Integer.valueOf(this.f2202a.mo10840q()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: q */
    public final void mo10883q(List<Long> list) {
        int a;
        int a2;
        if (list instanceof arj) {
            arj arj = (arj) list;
            int i = this.f2203b & 7;
            if (i == 0) {
                do {
                    arj.mo11062a(this.f2202a.mo10841r());
                    if (!this.f2202a.mo10843t()) {
                        a2 = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a2 == this.f2203b);
                this.f2205d = a2;
            } else if (i == 2) {
                int u = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    arj.mo11062a(this.f2202a.mo10841r());
                } while (this.f2202a.mo10844u() < u);
                m3103d(u);
            } else {
                throw aqv.m3512f();
            }
        } else {
            int i2 = this.f2203b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f2202a.mo10841r()));
                    if (!this.f2202a.mo10843t()) {
                        a = this.f2202a.mo10817a();
                    } else {
                        return;
                    }
                } while (a == this.f2203b);
                this.f2205d = a;
            } else if (i2 == 2) {
                int u2 = this.f2202a.mo10844u() + this.f2202a.mo10836m();
                do {
                    list.add(Long.valueOf(this.f2202a.mo10841r()));
                } while (this.f2202a.mo10844u() < u2);
                m3103d(u2);
            } else {
                throw aqv.m3512f();
            }
        }
    }

    /* renamed from: b */
    private static void m3099b(int i) {
        if ((i & 7) != 0) {
            throw aqv.m3514h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo10855c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.ads.aqv("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo10849a(java.util.Map<K, V> r6, com.google.android.gms.internal.ads.arp<K, V> r7, com.google.android.gms.internal.ads.apz r8) {
        /*
            r5 = this;
            r0 = 2
            r5.m3097a((int) r0)
            com.google.android.gms.internal.ads.apo r0 = r5.f2202a
            int r0 = r0.mo10836m()
            com.google.android.gms.internal.ads.apo r1 = r5.f2202a
            int r0 = r1.mo10824d(r0)
            K r1 = r7.f2391b
            V r2 = r7.f2393d
        L_0x0014:
            int r3 = r5.mo10845a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.ads.apo r4 = r5.f2202a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo10843t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo10855c()     // Catch:{ aqw -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.ads.atw r3 = r7.f2392c     // Catch:{ aqw -> 0x004f }
            V r4 = r7.f2393d     // Catch:{ aqw -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ aqw -> 0x004f }
            java.lang.Object r3 = r5.m3096a((com.google.android.gms.internal.ads.atw) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.ads.apz) r8)     // Catch:{ aqw -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.ads.atw r3 = r7.f2390a     // Catch:{ aqw -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m3096a((com.google.android.gms.internal.ads.atw) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.ads.apz) r4)     // Catch:{ aqw -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.ads.aqv r3 = new com.google.android.gms.internal.ads.aqv     // Catch:{ aqw -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ aqw -> 0x004f }
            throw r3     // Catch:{ aqw -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo10855c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.ads.aqv r6 = new com.google.android.gms.internal.ads.aqv     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.ads.apo r6 = r5.f2202a
            r6.mo10827e(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.ads.apo r7 = r5.f2202a
            r7.mo10827e(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.apr.mo10849a(java.util.Map, com.google.android.gms.internal.ads.arp, com.google.android.gms.internal.ads.apz):void");
    }

    /* renamed from: a */
    private final Object m3096a(atw atw, Class<?> cls, apz apz) {
        switch (aps.f2206a[atw.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo10871k());
            case 2:
                return mo10876n();
            case 3:
                return Double.valueOf(mo10856d());
            case 4:
                return Integer.valueOf(mo10880p());
            case 5:
                return Integer.valueOf(mo10868j());
            case 6:
                return Long.valueOf(mo10866i());
            case 7:
                return Float.valueOf(mo10858e());
            case 8:
                return Integer.valueOf(mo10864h());
            case 9:
                return Long.valueOf(mo10862g());
            case 10:
                m3097a(2);
                return m3100c(asj.m3697a().mo11112a(cls), apz);
            case 11:
                return Integer.valueOf(mo10882q());
            case 12:
                return Long.valueOf(mo10884r());
            case 13:
                return Integer.valueOf(mo10885s());
            case 14:
                return Long.valueOf(mo10886t());
            case 15:
                return mo10874m();
            case 16:
                return Integer.valueOf(mo10878o());
            case 17:
                return Long.valueOf(mo10860f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m3101c(int i) {
        if ((i & 3) != 0) {
            throw aqv.m3514h();
        }
    }

    /* renamed from: d */
    private final void m3103d(int i) {
        if (this.f2202a.mo10844u() != i) {
            throw aqv.m3507a();
        }
    }
}
