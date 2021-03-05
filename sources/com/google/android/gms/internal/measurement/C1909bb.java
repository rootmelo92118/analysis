package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bb */
public final class C1909bb extends C2109hy<C1909bb> {

    /* renamed from: f */
    private static volatile C1909bb[] f7418f;

    /* renamed from: a */
    public Integer f7419a = null;

    /* renamed from: b */
    public String f7420b = null;

    /* renamed from: c */
    public C1906az f7421c = null;

    /* renamed from: d */
    public Boolean f7422d = null;

    /* renamed from: e */
    public Boolean f7423e = null;

    /* renamed from: a */
    public static C1909bb[] m8927a() {
        if (f7418f == null) {
            synchronized (C2114ic.f7953b) {
                if (f7418f == null) {
                    f7418f = new C1909bb[0];
                }
            }
        }
        return f7418f;
    }

    public C1909bb() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1909bb)) {
            return false;
        }
        C1909bb bbVar = (C1909bb) obj;
        if (this.f7419a == null) {
            if (bbVar.f7419a != null) {
                return false;
            }
        } else if (!this.f7419a.equals(bbVar.f7419a)) {
            return false;
        }
        if (this.f7420b == null) {
            if (bbVar.f7420b != null) {
                return false;
            }
        } else if (!this.f7420b.equals(bbVar.f7420b)) {
            return false;
        }
        if (this.f7421c == null) {
            if (bbVar.f7421c != null) {
                return false;
            }
        } else if (!this.f7421c.equals(bbVar.f7421c)) {
            return false;
        }
        if (this.f7422d == null) {
            if (bbVar.f7422d != null) {
                return false;
            }
        } else if (!this.f7422d.equals(bbVar.f7422d)) {
            return false;
        }
        if (this.f7423e == null) {
            if (bbVar.f7423e != null) {
                return false;
            }
        } else if (!this.f7423e.equals(bbVar.f7423e)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bbVar.f7939L == null || bbVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bbVar.f7939L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + (this.f7419a == null ? 0 : this.f7419a.hashCode())) * 31) + (this.f7420b == null ? 0 : this.f7420b.hashCode());
        C1906az azVar = this.f7421c;
        int i3 = hashCode * 31;
        if (azVar == null) {
            i = 0;
        } else {
            i = azVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f7422d == null ? 0 : this.f7422d.hashCode())) * 31) + (this.f7423e == null ? 0 : this.f7423e.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i2 = this.f7939L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7419a != null) {
            hwVar.mo14071a(1, this.f7419a.intValue());
        }
        if (this.f7420b != null) {
            hwVar.mo14075a(2, this.f7420b);
        }
        if (this.f7421c != null) {
            hwVar.mo14074a(3, (C2116ie) this.f7421c);
        }
        if (this.f7422d != null) {
            hwVar.mo14076a(4, this.f7422d.booleanValue());
        }
        if (this.f7423e != null) {
            hwVar.mo14076a(5, this.f7423e.booleanValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7419a != null) {
            b += C2107hw.m10223b(1, this.f7419a.intValue());
        }
        if (this.f7420b != null) {
            b += C2107hw.m10225b(2, this.f7420b);
        }
        if (this.f7421c != null) {
            b += C2107hw.m10224b(3, (C2116ie) this.f7421c);
        }
        if (this.f7422d != null) {
            this.f7422d.booleanValue();
            b += C2107hw.m10222b(4) + 1;
        }
        if (this.f7423e == null) {
            return b;
        }
        this.f7423e.booleanValue();
        return b + C2107hw.m10222b(5) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f7419a = Integer.valueOf(hvVar.mo14060d());
            } else if (a == 18) {
                this.f7420b = hvVar.mo14059c();
            } else if (a == 26) {
                if (this.f7421c == null) {
                    this.f7421c = new C1906az();
                }
                hvVar.mo14052a((C2116ie) this.f7421c);
            } else if (a == 32) {
                this.f7422d = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 40) {
                this.f7423e = Boolean.valueOf(hvVar.mo14056b());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
