package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bi */
public final class C1916bi extends C2109hy<C1916bi> {

    /* renamed from: f */
    private static volatile C1916bi[] f7452f;

    /* renamed from: a */
    public C1917bj[] f7453a = C1917bj.m8958a();

    /* renamed from: b */
    public String f7454b = null;

    /* renamed from: c */
    public Long f7455c = null;

    /* renamed from: d */
    public Long f7456d = null;

    /* renamed from: e */
    public Integer f7457e = null;

    /* renamed from: a */
    public static C1916bi[] m8954a() {
        if (f7452f == null) {
            synchronized (C2114ic.f7953b) {
                if (f7452f == null) {
                    f7452f = new C1916bi[0];
                }
            }
        }
        return f7452f;
    }

    public C1916bi() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1916bi)) {
            return false;
        }
        C1916bi biVar = (C1916bi) obj;
        if (!C2114ic.m10272a((Object[]) this.f7453a, (Object[]) biVar.f7453a)) {
            return false;
        }
        if (this.f7454b == null) {
            if (biVar.f7454b != null) {
                return false;
            }
        } else if (!this.f7454b.equals(biVar.f7454b)) {
            return false;
        }
        if (this.f7455c == null) {
            if (biVar.f7455c != null) {
                return false;
            }
        } else if (!this.f7455c.equals(biVar.f7455c)) {
            return false;
        }
        if (this.f7456d == null) {
            if (biVar.f7456d != null) {
                return false;
            }
        } else if (!this.f7456d.equals(biVar.f7456d)) {
            return false;
        }
        if (this.f7457e == null) {
            if (biVar.f7457e != null) {
                return false;
            }
        } else if (!this.f7457e.equals(biVar.f7457e)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return biVar.f7939L == null || biVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(biVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + C2114ic.m10268a((Object[]) this.f7453a)) * 31) + (this.f7454b == null ? 0 : this.f7454b.hashCode())) * 31) + (this.f7455c == null ? 0 : this.f7455c.hashCode())) * 31) + (this.f7456d == null ? 0 : this.f7456d.hashCode())) * 31) + (this.f7457e == null ? 0 : this.f7457e.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7453a != null && this.f7453a.length > 0) {
            for (C1917bj bjVar : this.f7453a) {
                if (bjVar != null) {
                    hwVar.mo14074a(1, (C2116ie) bjVar);
                }
            }
        }
        if (this.f7454b != null) {
            hwVar.mo14075a(2, this.f7454b);
        }
        if (this.f7455c != null) {
            hwVar.mo14078b(3, this.f7455c.longValue());
        }
        if (this.f7456d != null) {
            hwVar.mo14078b(4, this.f7456d.longValue());
        }
        if (this.f7457e != null) {
            hwVar.mo14071a(5, this.f7457e.intValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7453a != null && this.f7453a.length > 0) {
            for (C1917bj bjVar : this.f7453a) {
                if (bjVar != null) {
                    b += C2107hw.m10224b(1, (C2116ie) bjVar);
                }
            }
        }
        if (this.f7454b != null) {
            b += C2107hw.m10225b(2, this.f7454b);
        }
        if (this.f7455c != null) {
            b += C2107hw.m10228c(3, this.f7455c.longValue());
        }
        if (this.f7456d != null) {
            b += C2107hw.m10228c(4, this.f7456d.longValue());
        }
        return this.f7457e != null ? b + C2107hw.m10223b(5, this.f7457e.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = C2119ih.m10286a(hvVar, 10);
                int length = this.f7453a == null ? 0 : this.f7453a.length;
                C1917bj[] bjVarArr = new C1917bj[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7453a, 0, bjVarArr, 0, length);
                }
                while (length < bjVarArr.length - 1) {
                    bjVarArr[length] = new C1917bj();
                    hvVar.mo14052a((C2116ie) bjVarArr[length]);
                    hvVar.mo14049a();
                    length++;
                }
                bjVarArr[length] = new C1917bj();
                hvVar.mo14052a((C2116ie) bjVarArr[length]);
                this.f7453a = bjVarArr;
            } else if (a == 18) {
                this.f7454b = hvVar.mo14059c();
            } else if (a == 24) {
                this.f7455c = Long.valueOf(hvVar.mo14062e());
            } else if (a == 32) {
                this.f7456d = Long.valueOf(hvVar.mo14062e());
            } else if (a == 40) {
                this.f7457e = Integer.valueOf(hvVar.mo14060d());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
