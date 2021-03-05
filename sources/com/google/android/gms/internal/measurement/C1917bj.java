package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bj */
public final class C1917bj extends C2109hy<C1917bj> {

    /* renamed from: e */
    private static volatile C1917bj[] f7458e;

    /* renamed from: a */
    public String f7459a = null;

    /* renamed from: b */
    public String f7460b = null;

    /* renamed from: c */
    public Long f7461c = null;

    /* renamed from: d */
    public Double f7462d = null;

    /* renamed from: f */
    private Float f7463f = null;

    /* renamed from: a */
    public static C1917bj[] m8958a() {
        if (f7458e == null) {
            synchronized (C2114ic.f7953b) {
                if (f7458e == null) {
                    f7458e = new C1917bj[0];
                }
            }
        }
        return f7458e;
    }

    public C1917bj() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1917bj)) {
            return false;
        }
        C1917bj bjVar = (C1917bj) obj;
        if (this.f7459a == null) {
            if (bjVar.f7459a != null) {
                return false;
            }
        } else if (!this.f7459a.equals(bjVar.f7459a)) {
            return false;
        }
        if (this.f7460b == null) {
            if (bjVar.f7460b != null) {
                return false;
            }
        } else if (!this.f7460b.equals(bjVar.f7460b)) {
            return false;
        }
        if (this.f7461c == null) {
            if (bjVar.f7461c != null) {
                return false;
            }
        } else if (!this.f7461c.equals(bjVar.f7461c)) {
            return false;
        }
        if (this.f7463f == null) {
            if (bjVar.f7463f != null) {
                return false;
            }
        } else if (!this.f7463f.equals(bjVar.f7463f)) {
            return false;
        }
        if (this.f7462d == null) {
            if (bjVar.f7462d != null) {
                return false;
            }
        } else if (!this.f7462d.equals(bjVar.f7462d)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bjVar.f7939L == null || bjVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bjVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7459a == null ? 0 : this.f7459a.hashCode())) * 31) + (this.f7460b == null ? 0 : this.f7460b.hashCode())) * 31) + (this.f7461c == null ? 0 : this.f7461c.hashCode())) * 31) + (this.f7463f == null ? 0 : this.f7463f.hashCode())) * 31) + (this.f7462d == null ? 0 : this.f7462d.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7459a != null) {
            hwVar.mo14075a(1, this.f7459a);
        }
        if (this.f7460b != null) {
            hwVar.mo14075a(2, this.f7460b);
        }
        if (this.f7461c != null) {
            hwVar.mo14078b(3, this.f7461c.longValue());
        }
        if (this.f7463f != null) {
            hwVar.mo14070a(4, this.f7463f.floatValue());
        }
        if (this.f7462d != null) {
            hwVar.mo14069a(5, this.f7462d.doubleValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7459a != null) {
            b += C2107hw.m10225b(1, this.f7459a);
        }
        if (this.f7460b != null) {
            b += C2107hw.m10225b(2, this.f7460b);
        }
        if (this.f7461c != null) {
            b += C2107hw.m10228c(3, this.f7461c.longValue());
        }
        if (this.f7463f != null) {
            this.f7463f.floatValue();
            b += C2107hw.m10222b(4) + 4;
        }
        if (this.f7462d == null) {
            return b;
        }
        this.f7462d.doubleValue();
        return b + C2107hw.m10222b(5) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f7459a = hvVar.mo14059c();
            } else if (a == 18) {
                this.f7460b = hvVar.mo14059c();
            } else if (a == 24) {
                this.f7461c = Long.valueOf(hvVar.mo14062e());
            } else if (a == 37) {
                this.f7463f = Float.valueOf(Float.intBitsToFloat(hvVar.mo14064f()));
            } else if (a == 41) {
                this.f7462d = Double.valueOf(Double.longBitsToDouble(hvVar.mo14065g()));
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
