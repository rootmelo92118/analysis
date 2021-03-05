package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1895at;

/* renamed from: com.google.android.gms.internal.measurement.bl */
public final class C1919bl extends C2109hy<C1919bl> {

    /* renamed from: N */
    private static volatile C1919bl[] f7465N;

    /* renamed from: A */
    public C1914bg[] f7466A = C1914bg.m8946a();

    /* renamed from: B */
    public String f7467B = null;

    /* renamed from: C */
    public Integer f7468C = null;

    /* renamed from: D */
    public String f7469D = null;

    /* renamed from: E */
    public Long f7470E = null;

    /* renamed from: F */
    public Long f7471F = null;

    /* renamed from: G */
    public String f7472G = null;

    /* renamed from: H */
    public Integer f7473H = null;

    /* renamed from: I */
    public String f7474I = null;

    /* renamed from: J */
    public C1895at.C1898b f7475J = null;

    /* renamed from: K */
    public int[] f7476K = C2119ih.f7958a;

    /* renamed from: O */
    private Integer f7477O = null;

    /* renamed from: P */
    private Integer f7478P = null;

    /* renamed from: Q */
    private String f7479Q = null;

    /* renamed from: R */
    private Long f7480R = null;

    /* renamed from: a */
    public Integer f7481a = null;

    /* renamed from: b */
    public C1916bi[] f7482b = C1916bi.m8954a();

    /* renamed from: c */
    public C1922bo[] f7483c = C1922bo.m8976a();

    /* renamed from: d */
    public Long f7484d = null;

    /* renamed from: e */
    public Long f7485e = null;

    /* renamed from: f */
    public Long f7486f = null;

    /* renamed from: g */
    public Long f7487g = null;

    /* renamed from: h */
    public Long f7488h = null;

    /* renamed from: i */
    public String f7489i = null;

    /* renamed from: j */
    public String f7490j = null;

    /* renamed from: k */
    public String f7491k = null;

    /* renamed from: l */
    public String f7492l = null;

    /* renamed from: m */
    public Integer f7493m = null;

    /* renamed from: n */
    public String f7494n = null;

    /* renamed from: o */
    public String f7495o = null;

    /* renamed from: p */
    public String f7496p = null;

    /* renamed from: q */
    public Long f7497q = null;

    /* renamed from: r */
    public Long f7498r = null;

    /* renamed from: s */
    public String f7499s = null;

    /* renamed from: t */
    public Boolean f7500t = null;

    /* renamed from: u */
    public String f7501u = null;

    /* renamed from: v */
    public Long f7502v = null;

    /* renamed from: w */
    public Integer f7503w = null;

    /* renamed from: x */
    public String f7504x = null;

    /* renamed from: y */
    public String f7505y = null;

    /* renamed from: z */
    public Boolean f7506z = null;

    /* renamed from: a */
    public static C1919bl[] m8965a() {
        if (f7465N == null) {
            synchronized (C2114ic.f7953b) {
                if (f7465N == null) {
                    f7465N = new C1919bl[0];
                }
            }
        }
        return f7465N;
    }

    public C1919bl() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1919bl)) {
            return false;
        }
        C1919bl blVar = (C1919bl) obj;
        if (this.f7481a == null) {
            if (blVar.f7481a != null) {
                return false;
            }
        } else if (!this.f7481a.equals(blVar.f7481a)) {
            return false;
        }
        if (!C2114ic.m10272a((Object[]) this.f7482b, (Object[]) blVar.f7482b) || !C2114ic.m10272a((Object[]) this.f7483c, (Object[]) blVar.f7483c)) {
            return false;
        }
        if (this.f7484d == null) {
            if (blVar.f7484d != null) {
                return false;
            }
        } else if (!this.f7484d.equals(blVar.f7484d)) {
            return false;
        }
        if (this.f7485e == null) {
            if (blVar.f7485e != null) {
                return false;
            }
        } else if (!this.f7485e.equals(blVar.f7485e)) {
            return false;
        }
        if (this.f7486f == null) {
            if (blVar.f7486f != null) {
                return false;
            }
        } else if (!this.f7486f.equals(blVar.f7486f)) {
            return false;
        }
        if (this.f7487g == null) {
            if (blVar.f7487g != null) {
                return false;
            }
        } else if (!this.f7487g.equals(blVar.f7487g)) {
            return false;
        }
        if (this.f7488h == null) {
            if (blVar.f7488h != null) {
                return false;
            }
        } else if (!this.f7488h.equals(blVar.f7488h)) {
            return false;
        }
        if (this.f7489i == null) {
            if (blVar.f7489i != null) {
                return false;
            }
        } else if (!this.f7489i.equals(blVar.f7489i)) {
            return false;
        }
        if (this.f7490j == null) {
            if (blVar.f7490j != null) {
                return false;
            }
        } else if (!this.f7490j.equals(blVar.f7490j)) {
            return false;
        }
        if (this.f7491k == null) {
            if (blVar.f7491k != null) {
                return false;
            }
        } else if (!this.f7491k.equals(blVar.f7491k)) {
            return false;
        }
        if (this.f7492l == null) {
            if (blVar.f7492l != null) {
                return false;
            }
        } else if (!this.f7492l.equals(blVar.f7492l)) {
            return false;
        }
        if (this.f7493m == null) {
            if (blVar.f7493m != null) {
                return false;
            }
        } else if (!this.f7493m.equals(blVar.f7493m)) {
            return false;
        }
        if (this.f7494n == null) {
            if (blVar.f7494n != null) {
                return false;
            }
        } else if (!this.f7494n.equals(blVar.f7494n)) {
            return false;
        }
        if (this.f7495o == null) {
            if (blVar.f7495o != null) {
                return false;
            }
        } else if (!this.f7495o.equals(blVar.f7495o)) {
            return false;
        }
        if (this.f7496p == null) {
            if (blVar.f7496p != null) {
                return false;
            }
        } else if (!this.f7496p.equals(blVar.f7496p)) {
            return false;
        }
        if (this.f7497q == null) {
            if (blVar.f7497q != null) {
                return false;
            }
        } else if (!this.f7497q.equals(blVar.f7497q)) {
            return false;
        }
        if (this.f7498r == null) {
            if (blVar.f7498r != null) {
                return false;
            }
        } else if (!this.f7498r.equals(blVar.f7498r)) {
            return false;
        }
        if (this.f7499s == null) {
            if (blVar.f7499s != null) {
                return false;
            }
        } else if (!this.f7499s.equals(blVar.f7499s)) {
            return false;
        }
        if (this.f7500t == null) {
            if (blVar.f7500t != null) {
                return false;
            }
        } else if (!this.f7500t.equals(blVar.f7500t)) {
            return false;
        }
        if (this.f7501u == null) {
            if (blVar.f7501u != null) {
                return false;
            }
        } else if (!this.f7501u.equals(blVar.f7501u)) {
            return false;
        }
        if (this.f7502v == null) {
            if (blVar.f7502v != null) {
                return false;
            }
        } else if (!this.f7502v.equals(blVar.f7502v)) {
            return false;
        }
        if (this.f7503w == null) {
            if (blVar.f7503w != null) {
                return false;
            }
        } else if (!this.f7503w.equals(blVar.f7503w)) {
            return false;
        }
        if (this.f7504x == null) {
            if (blVar.f7504x != null) {
                return false;
            }
        } else if (!this.f7504x.equals(blVar.f7504x)) {
            return false;
        }
        if (this.f7505y == null) {
            if (blVar.f7505y != null) {
                return false;
            }
        } else if (!this.f7505y.equals(blVar.f7505y)) {
            return false;
        }
        if (this.f7506z == null) {
            if (blVar.f7506z != null) {
                return false;
            }
        } else if (!this.f7506z.equals(blVar.f7506z)) {
            return false;
        }
        if (!C2114ic.m10272a((Object[]) this.f7466A, (Object[]) blVar.f7466A)) {
            return false;
        }
        if (this.f7467B == null) {
            if (blVar.f7467B != null) {
                return false;
            }
        } else if (!this.f7467B.equals(blVar.f7467B)) {
            return false;
        }
        if (this.f7468C == null) {
            if (blVar.f7468C != null) {
                return false;
            }
        } else if (!this.f7468C.equals(blVar.f7468C)) {
            return false;
        }
        if (this.f7477O == null) {
            if (blVar.f7477O != null) {
                return false;
            }
        } else if (!this.f7477O.equals(blVar.f7477O)) {
            return false;
        }
        if (this.f7478P == null) {
            if (blVar.f7478P != null) {
                return false;
            }
        } else if (!this.f7478P.equals(blVar.f7478P)) {
            return false;
        }
        if (this.f7469D == null) {
            if (blVar.f7469D != null) {
                return false;
            }
        } else if (!this.f7469D.equals(blVar.f7469D)) {
            return false;
        }
        if (this.f7470E == null) {
            if (blVar.f7470E != null) {
                return false;
            }
        } else if (!this.f7470E.equals(blVar.f7470E)) {
            return false;
        }
        if (this.f7471F == null) {
            if (blVar.f7471F != null) {
                return false;
            }
        } else if (!this.f7471F.equals(blVar.f7471F)) {
            return false;
        }
        if (this.f7472G == null) {
            if (blVar.f7472G != null) {
                return false;
            }
        } else if (!this.f7472G.equals(blVar.f7472G)) {
            return false;
        }
        if (this.f7479Q == null) {
            if (blVar.f7479Q != null) {
                return false;
            }
        } else if (!this.f7479Q.equals(blVar.f7479Q)) {
            return false;
        }
        if (this.f7473H == null) {
            if (blVar.f7473H != null) {
                return false;
            }
        } else if (!this.f7473H.equals(blVar.f7473H)) {
            return false;
        }
        if (this.f7474I == null) {
            if (blVar.f7474I != null) {
                return false;
            }
        } else if (!this.f7474I.equals(blVar.f7474I)) {
            return false;
        }
        if (this.f7475J == null) {
            if (blVar.f7475J != null) {
                return false;
            }
        } else if (!this.f7475J.equals(blVar.f7475J)) {
            return false;
        }
        if (!C2114ic.m10270a(this.f7476K, blVar.f7476K)) {
            return false;
        }
        if (this.f7480R == null) {
            if (blVar.f7480R != null) {
                return false;
            }
        } else if (!this.f7480R.equals(blVar.f7480R)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return blVar.f7939L == null || blVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(blVar.f7939L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7481a == null ? 0 : this.f7481a.hashCode())) * 31) + C2114ic.m10268a((Object[]) this.f7482b)) * 31) + C2114ic.m10268a((Object[]) this.f7483c)) * 31) + (this.f7484d == null ? 0 : this.f7484d.hashCode())) * 31) + (this.f7485e == null ? 0 : this.f7485e.hashCode())) * 31) + (this.f7486f == null ? 0 : this.f7486f.hashCode())) * 31) + (this.f7487g == null ? 0 : this.f7487g.hashCode())) * 31) + (this.f7488h == null ? 0 : this.f7488h.hashCode())) * 31) + (this.f7489i == null ? 0 : this.f7489i.hashCode())) * 31) + (this.f7490j == null ? 0 : this.f7490j.hashCode())) * 31) + (this.f7491k == null ? 0 : this.f7491k.hashCode())) * 31) + (this.f7492l == null ? 0 : this.f7492l.hashCode())) * 31) + (this.f7493m == null ? 0 : this.f7493m.hashCode())) * 31) + (this.f7494n == null ? 0 : this.f7494n.hashCode())) * 31) + (this.f7495o == null ? 0 : this.f7495o.hashCode())) * 31) + (this.f7496p == null ? 0 : this.f7496p.hashCode())) * 31) + (this.f7497q == null ? 0 : this.f7497q.hashCode())) * 31) + (this.f7498r == null ? 0 : this.f7498r.hashCode())) * 31) + (this.f7499s == null ? 0 : this.f7499s.hashCode())) * 31) + (this.f7500t == null ? 0 : this.f7500t.hashCode())) * 31) + (this.f7501u == null ? 0 : this.f7501u.hashCode())) * 31) + (this.f7502v == null ? 0 : this.f7502v.hashCode())) * 31) + (this.f7503w == null ? 0 : this.f7503w.hashCode())) * 31) + (this.f7504x == null ? 0 : this.f7504x.hashCode())) * 31) + (this.f7505y == null ? 0 : this.f7505y.hashCode())) * 31) + (this.f7506z == null ? 0 : this.f7506z.hashCode())) * 31) + C2114ic.m10268a((Object[]) this.f7466A)) * 31) + (this.f7467B == null ? 0 : this.f7467B.hashCode())) * 31) + (this.f7468C == null ? 0 : this.f7468C.hashCode())) * 31) + (this.f7477O == null ? 0 : this.f7477O.hashCode())) * 31) + (this.f7478P == null ? 0 : this.f7478P.hashCode())) * 31) + (this.f7469D == null ? 0 : this.f7469D.hashCode())) * 31) + (this.f7470E == null ? 0 : this.f7470E.hashCode())) * 31) + (this.f7471F == null ? 0 : this.f7471F.hashCode())) * 31) + (this.f7472G == null ? 0 : this.f7472G.hashCode())) * 31) + (this.f7479Q == null ? 0 : this.f7479Q.hashCode())) * 31) + (this.f7473H == null ? 0 : this.f7473H.hashCode())) * 31) + (this.f7474I == null ? 0 : this.f7474I.hashCode());
        C1895at.C1898b bVar = this.f7475J;
        int i3 = hashCode * 31;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        int a = (((((i3 + i) * 31) + C2114ic.m10266a(this.f7476K)) * 31) + (this.f7480R == null ? 0 : this.f7480R.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i2 = this.f7939L.hashCode();
        }
        return a + i2;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7481a != null) {
            hwVar.mo14071a(1, this.f7481a.intValue());
        }
        if (this.f7482b != null && this.f7482b.length > 0) {
            for (C1916bi biVar : this.f7482b) {
                if (biVar != null) {
                    hwVar.mo14074a(2, (C2116ie) biVar);
                }
            }
        }
        if (this.f7483c != null && this.f7483c.length > 0) {
            for (C1922bo boVar : this.f7483c) {
                if (boVar != null) {
                    hwVar.mo14074a(3, (C2116ie) boVar);
                }
            }
        }
        if (this.f7484d != null) {
            hwVar.mo14078b(4, this.f7484d.longValue());
        }
        if (this.f7485e != null) {
            hwVar.mo14078b(5, this.f7485e.longValue());
        }
        if (this.f7486f != null) {
            hwVar.mo14078b(6, this.f7486f.longValue());
        }
        if (this.f7488h != null) {
            hwVar.mo14078b(7, this.f7488h.longValue());
        }
        if (this.f7489i != null) {
            hwVar.mo14075a(8, this.f7489i);
        }
        if (this.f7490j != null) {
            hwVar.mo14075a(9, this.f7490j);
        }
        if (this.f7491k != null) {
            hwVar.mo14075a(10, this.f7491k);
        }
        if (this.f7492l != null) {
            hwVar.mo14075a(11, this.f7492l);
        }
        if (this.f7493m != null) {
            hwVar.mo14071a(12, this.f7493m.intValue());
        }
        if (this.f7494n != null) {
            hwVar.mo14075a(13, this.f7494n);
        }
        if (this.f7495o != null) {
            hwVar.mo14075a(14, this.f7495o);
        }
        if (this.f7496p != null) {
            hwVar.mo14075a(16, this.f7496p);
        }
        if (this.f7497q != null) {
            hwVar.mo14078b(17, this.f7497q.longValue());
        }
        if (this.f7498r != null) {
            hwVar.mo14078b(18, this.f7498r.longValue());
        }
        if (this.f7499s != null) {
            hwVar.mo14075a(19, this.f7499s);
        }
        if (this.f7500t != null) {
            hwVar.mo14076a(20, this.f7500t.booleanValue());
        }
        if (this.f7501u != null) {
            hwVar.mo14075a(21, this.f7501u);
        }
        if (this.f7502v != null) {
            hwVar.mo14078b(22, this.f7502v.longValue());
        }
        if (this.f7503w != null) {
            hwVar.mo14071a(23, this.f7503w.intValue());
        }
        if (this.f7504x != null) {
            hwVar.mo14075a(24, this.f7504x);
        }
        if (this.f7505y != null) {
            hwVar.mo14075a(25, this.f7505y);
        }
        if (this.f7487g != null) {
            hwVar.mo14078b(26, this.f7487g.longValue());
        }
        if (this.f7506z != null) {
            hwVar.mo14076a(28, this.f7506z.booleanValue());
        }
        if (this.f7466A != null && this.f7466A.length > 0) {
            for (C1914bg bgVar : this.f7466A) {
                if (bgVar != null) {
                    hwVar.mo14074a(29, (C2116ie) bgVar);
                }
            }
        }
        if (this.f7467B != null) {
            hwVar.mo14075a(30, this.f7467B);
        }
        if (this.f7468C != null) {
            hwVar.mo14071a(31, this.f7468C.intValue());
        }
        if (this.f7477O != null) {
            hwVar.mo14071a(32, this.f7477O.intValue());
        }
        if (this.f7478P != null) {
            hwVar.mo14071a(33, this.f7478P.intValue());
        }
        if (this.f7469D != null) {
            hwVar.mo14075a(34, this.f7469D);
        }
        if (this.f7470E != null) {
            hwVar.mo14078b(35, this.f7470E.longValue());
        }
        if (this.f7471F != null) {
            hwVar.mo14078b(36, this.f7471F.longValue());
        }
        if (this.f7472G != null) {
            hwVar.mo14075a(37, this.f7472G);
        }
        if (this.f7479Q != null) {
            hwVar.mo14075a(38, this.f7479Q);
        }
        if (this.f7473H != null) {
            hwVar.mo14071a(39, this.f7473H.intValue());
        }
        if (this.f7474I != null) {
            hwVar.mo14075a(41, this.f7474I);
        }
        if (this.f7475J != null) {
            hwVar.mo14073a(44, (C2043fq) this.f7475J);
        }
        if (this.f7476K != null && this.f7476K.length > 0) {
            for (int c : this.f7476K) {
                hwVar.mo14081c(45, 0);
                hwVar.mo14080c(c);
            }
        }
        if (this.f7480R != null) {
            hwVar.mo14078b(46, this.f7480R.longValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7481a != null) {
            b += C2107hw.m10223b(1, this.f7481a.intValue());
        }
        if (this.f7482b != null && this.f7482b.length > 0) {
            int i = b;
            for (C1916bi biVar : this.f7482b) {
                if (biVar != null) {
                    i += C2107hw.m10224b(2, (C2116ie) biVar);
                }
            }
            b = i;
        }
        if (this.f7483c != null && this.f7483c.length > 0) {
            int i2 = b;
            for (C1922bo boVar : this.f7483c) {
                if (boVar != null) {
                    i2 += C2107hw.m10224b(3, (C2116ie) boVar);
                }
            }
            b = i2;
        }
        if (this.f7484d != null) {
            b += C2107hw.m10228c(4, this.f7484d.longValue());
        }
        if (this.f7485e != null) {
            b += C2107hw.m10228c(5, this.f7485e.longValue());
        }
        if (this.f7486f != null) {
            b += C2107hw.m10228c(6, this.f7486f.longValue());
        }
        if (this.f7488h != null) {
            b += C2107hw.m10228c(7, this.f7488h.longValue());
        }
        if (this.f7489i != null) {
            b += C2107hw.m10225b(8, this.f7489i);
        }
        if (this.f7490j != null) {
            b += C2107hw.m10225b(9, this.f7490j);
        }
        if (this.f7491k != null) {
            b += C2107hw.m10225b(10, this.f7491k);
        }
        if (this.f7492l != null) {
            b += C2107hw.m10225b(11, this.f7492l);
        }
        if (this.f7493m != null) {
            b += C2107hw.m10223b(12, this.f7493m.intValue());
        }
        if (this.f7494n != null) {
            b += C2107hw.m10225b(13, this.f7494n);
        }
        if (this.f7495o != null) {
            b += C2107hw.m10225b(14, this.f7495o);
        }
        if (this.f7496p != null) {
            b += C2107hw.m10225b(16, this.f7496p);
        }
        if (this.f7497q != null) {
            b += C2107hw.m10228c(17, this.f7497q.longValue());
        }
        if (this.f7498r != null) {
            b += C2107hw.m10228c(18, this.f7498r.longValue());
        }
        if (this.f7499s != null) {
            b += C2107hw.m10225b(19, this.f7499s);
        }
        if (this.f7500t != null) {
            this.f7500t.booleanValue();
            b += C2107hw.m10222b(20) + 1;
        }
        if (this.f7501u != null) {
            b += C2107hw.m10225b(21, this.f7501u);
        }
        if (this.f7502v != null) {
            b += C2107hw.m10228c(22, this.f7502v.longValue());
        }
        if (this.f7503w != null) {
            b += C2107hw.m10223b(23, this.f7503w.intValue());
        }
        if (this.f7504x != null) {
            b += C2107hw.m10225b(24, this.f7504x);
        }
        if (this.f7505y != null) {
            b += C2107hw.m10225b(25, this.f7505y);
        }
        if (this.f7487g != null) {
            b += C2107hw.m10228c(26, this.f7487g.longValue());
        }
        if (this.f7506z != null) {
            this.f7506z.booleanValue();
            b += C2107hw.m10222b(28) + 1;
        }
        if (this.f7466A != null && this.f7466A.length > 0) {
            int i3 = b;
            for (C1914bg bgVar : this.f7466A) {
                if (bgVar != null) {
                    i3 += C2107hw.m10224b(29, (C2116ie) bgVar);
                }
            }
            b = i3;
        }
        if (this.f7467B != null) {
            b += C2107hw.m10225b(30, this.f7467B);
        }
        if (this.f7468C != null) {
            b += C2107hw.m10223b(31, this.f7468C.intValue());
        }
        if (this.f7477O != null) {
            b += C2107hw.m10223b(32, this.f7477O.intValue());
        }
        if (this.f7478P != null) {
            b += C2107hw.m10223b(33, this.f7478P.intValue());
        }
        if (this.f7469D != null) {
            b += C2107hw.m10225b(34, this.f7469D);
        }
        if (this.f7470E != null) {
            b += C2107hw.m10228c(35, this.f7470E.longValue());
        }
        if (this.f7471F != null) {
            b += C2107hw.m10228c(36, this.f7471F.longValue());
        }
        if (this.f7472G != null) {
            b += C2107hw.m10225b(37, this.f7472G);
        }
        if (this.f7479Q != null) {
            b += C2107hw.m10225b(38, this.f7479Q);
        }
        if (this.f7473H != null) {
            b += C2107hw.m10223b(39, this.f7473H.intValue());
        }
        if (this.f7474I != null) {
            b += C2107hw.m10225b(41, this.f7474I);
        }
        if (this.f7475J != null) {
            b += C1976do.m9245c(44, (C2043fq) this.f7475J);
        }
        if (this.f7476K != null && this.f7476K.length > 0) {
            int i4 = 0;
            for (int d : this.f7476K) {
                i4 += C2107hw.m10229d(d);
            }
            b = b + i4 + (this.f7476K.length * 2);
        }
        return this.f7480R != null ? b + C2107hw.m10228c(46, this.f7480R.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f7481a = Integer.valueOf(hvVar.mo14060d());
                    break;
                case 18:
                    int a2 = C2119ih.m10286a(hvVar, 18);
                    int length = this.f7482b == null ? 0 : this.f7482b.length;
                    C1916bi[] biVarArr = new C1916bi[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f7482b, 0, biVarArr, 0, length);
                    }
                    while (length < biVarArr.length - 1) {
                        biVarArr[length] = new C1916bi();
                        hvVar.mo14052a((C2116ie) biVarArr[length]);
                        hvVar.mo14049a();
                        length++;
                    }
                    biVarArr[length] = new C1916bi();
                    hvVar.mo14052a((C2116ie) biVarArr[length]);
                    this.f7482b = biVarArr;
                    break;
                case 26:
                    int a3 = C2119ih.m10286a(hvVar, 26);
                    int length2 = this.f7483c == null ? 0 : this.f7483c.length;
                    C1922bo[] boVarArr = new C1922bo[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f7483c, 0, boVarArr, 0, length2);
                    }
                    while (length2 < boVarArr.length - 1) {
                        boVarArr[length2] = new C1922bo();
                        hvVar.mo14052a((C2116ie) boVarArr[length2]);
                        hvVar.mo14049a();
                        length2++;
                    }
                    boVarArr[length2] = new C1922bo();
                    hvVar.mo14052a((C2116ie) boVarArr[length2]);
                    this.f7483c = boVarArr;
                    break;
                case 32:
                    this.f7484d = Long.valueOf(hvVar.mo14062e());
                    break;
                case 40:
                    this.f7485e = Long.valueOf(hvVar.mo14062e());
                    break;
                case 48:
                    this.f7486f = Long.valueOf(hvVar.mo14062e());
                    break;
                case 56:
                    this.f7488h = Long.valueOf(hvVar.mo14062e());
                    break;
                case 66:
                    this.f7489i = hvVar.mo14059c();
                    break;
                case 74:
                    this.f7490j = hvVar.mo14059c();
                    break;
                case 82:
                    this.f7491k = hvVar.mo14059c();
                    break;
                case 90:
                    this.f7492l = hvVar.mo14059c();
                    break;
                case 96:
                    this.f7493m = Integer.valueOf(hvVar.mo14060d());
                    break;
                case 106:
                    this.f7494n = hvVar.mo14059c();
                    break;
                case 114:
                    this.f7495o = hvVar.mo14059c();
                    break;
                case 130:
                    this.f7496p = hvVar.mo14059c();
                    break;
                case 136:
                    this.f7497q = Long.valueOf(hvVar.mo14062e());
                    break;
                case 144:
                    this.f7498r = Long.valueOf(hvVar.mo14062e());
                    break;
                case 154:
                    this.f7499s = hvVar.mo14059c();
                    break;
                case 160:
                    this.f7500t = Boolean.valueOf(hvVar.mo14056b());
                    break;
                case 170:
                    this.f7501u = hvVar.mo14059c();
                    break;
                case 176:
                    this.f7502v = Long.valueOf(hvVar.mo14062e());
                    break;
                case 184:
                    this.f7503w = Integer.valueOf(hvVar.mo14060d());
                    break;
                case 194:
                    this.f7504x = hvVar.mo14059c();
                    break;
                case 202:
                    this.f7505y = hvVar.mo14059c();
                    break;
                case 208:
                    this.f7487g = Long.valueOf(hvVar.mo14062e());
                    break;
                case 224:
                    this.f7506z = Boolean.valueOf(hvVar.mo14056b());
                    break;
                case 234:
                    int a4 = C2119ih.m10286a(hvVar, 234);
                    int length3 = this.f7466A == null ? 0 : this.f7466A.length;
                    C1914bg[] bgVarArr = new C1914bg[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f7466A, 0, bgVarArr, 0, length3);
                    }
                    while (length3 < bgVarArr.length - 1) {
                        bgVarArr[length3] = new C1914bg();
                        hvVar.mo14052a((C2116ie) bgVarArr[length3]);
                        hvVar.mo14049a();
                        length3++;
                    }
                    bgVarArr[length3] = new C1914bg();
                    hvVar.mo14052a((C2116ie) bgVarArr[length3]);
                    this.f7466A = bgVarArr;
                    break;
                case 242:
                    this.f7467B = hvVar.mo14059c();
                    break;
                case 248:
                    this.f7468C = Integer.valueOf(hvVar.mo14060d());
                    break;
                case 256:
                    this.f7477O = Integer.valueOf(hvVar.mo14060d());
                    break;
                case 264:
                    this.f7478P = Integer.valueOf(hvVar.mo14060d());
                    break;
                case 274:
                    this.f7469D = hvVar.mo14059c();
                    break;
                case 280:
                    this.f7470E = Long.valueOf(hvVar.mo14062e());
                    break;
                case 288:
                    this.f7471F = Long.valueOf(hvVar.mo14062e());
                    break;
                case 298:
                    this.f7472G = hvVar.mo14059c();
                    break;
                case 306:
                    this.f7479Q = hvVar.mo14059c();
                    break;
                case 312:
                    this.f7473H = Integer.valueOf(hvVar.mo14060d());
                    break;
                case 330:
                    this.f7474I = hvVar.mo14059c();
                    break;
                case 354:
                    C1895at.C1898b bVar = (C1895at.C1898b) hvVar.mo14050a(C1895at.C1898b.m8902b());
                    if (this.f7475J != null) {
                        bVar = (C1895at.C1898b) ((C2003ei) ((C1895at.C1898b.C1899a) ((C1895at.C1898b.C1899a) this.f7475J.mo13816g()).mo13570a(bVar)).mo13828g());
                    }
                    this.f7475J = bVar;
                    break;
                case 360:
                    int a5 = C2119ih.m10286a(hvVar, 360);
                    int length4 = this.f7476K == null ? 0 : this.f7476K.length;
                    int[] iArr = new int[(a5 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.f7476K, 0, iArr, 0, length4);
                    }
                    while (length4 < iArr.length - 1) {
                        iArr[length4] = hvVar.mo14060d();
                        hvVar.mo14049a();
                        length4++;
                    }
                    iArr[length4] = hvVar.mo14060d();
                    this.f7476K = iArr;
                    break;
                case 362:
                    int c = hvVar.mo14058c(hvVar.mo14060d());
                    int i = hvVar.mo14067i();
                    int i2 = 0;
                    while (hvVar.mo14066h() > 0) {
                        hvVar.mo14060d();
                        i2++;
                    }
                    hvVar.mo14063e(i);
                    int length5 = this.f7476K == null ? 0 : this.f7476K.length;
                    int[] iArr2 = new int[(i2 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.f7476K, 0, iArr2, 0, length5);
                    }
                    while (length5 < iArr2.length) {
                        iArr2[length5] = hvVar.mo14060d();
                        length5++;
                    }
                    this.f7476K = iArr2;
                    hvVar.mo14061d(c);
                    break;
                case 368:
                    this.f7480R = Long.valueOf(hvVar.mo14062e());
                    break;
                default:
                    if (super.mo14082a(hvVar, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
