package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bo */
public final class C1922bo extends C2109hy<C1922bo> {

    /* renamed from: f */
    private static volatile C1922bo[] f7514f;

    /* renamed from: a */
    public Long f7515a = null;

    /* renamed from: b */
    public String f7516b = null;

    /* renamed from: c */
    public String f7517c = null;

    /* renamed from: d */
    public Long f7518d = null;

    /* renamed from: e */
    public Double f7519e = null;

    /* renamed from: g */
    private Float f7520g = null;

    /* renamed from: a */
    public static C1922bo[] m8976a() {
        if (f7514f == null) {
            synchronized (C2114ic.f7953b) {
                if (f7514f == null) {
                    f7514f = new C1922bo[0];
                }
            }
        }
        return f7514f;
    }

    public C1922bo() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1922bo)) {
            return false;
        }
        C1922bo boVar = (C1922bo) obj;
        if (this.f7515a == null) {
            if (boVar.f7515a != null) {
                return false;
            }
        } else if (!this.f7515a.equals(boVar.f7515a)) {
            return false;
        }
        if (this.f7516b == null) {
            if (boVar.f7516b != null) {
                return false;
            }
        } else if (!this.f7516b.equals(boVar.f7516b)) {
            return false;
        }
        if (this.f7517c == null) {
            if (boVar.f7517c != null) {
                return false;
            }
        } else if (!this.f7517c.equals(boVar.f7517c)) {
            return false;
        }
        if (this.f7518d == null) {
            if (boVar.f7518d != null) {
                return false;
            }
        } else if (!this.f7518d.equals(boVar.f7518d)) {
            return false;
        }
        if (this.f7520g == null) {
            if (boVar.f7520g != null) {
                return false;
            }
        } else if (!this.f7520g.equals(boVar.f7520g)) {
            return false;
        }
        if (this.f7519e == null) {
            if (boVar.f7519e != null) {
                return false;
            }
        } else if (!this.f7519e.equals(boVar.f7519e)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return boVar.f7939L == null || boVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(boVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7515a == null ? 0 : this.f7515a.hashCode())) * 31) + (this.f7516b == null ? 0 : this.f7516b.hashCode())) * 31) + (this.f7517c == null ? 0 : this.f7517c.hashCode())) * 31) + (this.f7518d == null ? 0 : this.f7518d.hashCode())) * 31) + (this.f7520g == null ? 0 : this.f7520g.hashCode())) * 31) + (this.f7519e == null ? 0 : this.f7519e.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7515a != null) {
            hwVar.mo14078b(1, this.f7515a.longValue());
        }
        if (this.f7516b != null) {
            hwVar.mo14075a(2, this.f7516b);
        }
        if (this.f7517c != null) {
            hwVar.mo14075a(3, this.f7517c);
        }
        if (this.f7518d != null) {
            hwVar.mo14078b(4, this.f7518d.longValue());
        }
        if (this.f7520g != null) {
            hwVar.mo14070a(5, this.f7520g.floatValue());
        }
        if (this.f7519e != null) {
            hwVar.mo14069a(6, this.f7519e.doubleValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7515a != null) {
            b += C2107hw.m10228c(1, this.f7515a.longValue());
        }
        if (this.f7516b != null) {
            b += C2107hw.m10225b(2, this.f7516b);
        }
        if (this.f7517c != null) {
            b += C2107hw.m10225b(3, this.f7517c);
        }
        if (this.f7518d != null) {
            b += C2107hw.m10228c(4, this.f7518d.longValue());
        }
        if (this.f7520g != null) {
            this.f7520g.floatValue();
            b += C2107hw.m10222b(5) + 4;
        }
        if (this.f7519e == null) {
            return b;
        }
        this.f7519e.doubleValue();
        return b + C2107hw.m10222b(6) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f7515a = Long.valueOf(hvVar.mo14062e());
            } else if (a == 18) {
                this.f7516b = hvVar.mo14059c();
            } else if (a == 26) {
                this.f7517c = hvVar.mo14059c();
            } else if (a == 32) {
                this.f7518d = Long.valueOf(hvVar.mo14062e());
            } else if (a == 45) {
                this.f7520g = Float.valueOf(Float.intBitsToFloat(hvVar.mo14064f()));
            } else if (a == 49) {
                this.f7519e = Double.valueOf(Double.longBitsToDouble(hvVar.mo14065g()));
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
