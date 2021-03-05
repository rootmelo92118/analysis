package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bg */
public final class C1914bg extends C2109hy<C1914bg> {

    /* renamed from: e */
    private static volatile C1914bg[] f7444e;

    /* renamed from: a */
    public Integer f7445a = null;

    /* renamed from: b */
    public C1920bm f7446b = null;

    /* renamed from: c */
    public C1920bm f7447c = null;

    /* renamed from: d */
    public Boolean f7448d = null;

    /* renamed from: a */
    public static C1914bg[] m8946a() {
        if (f7444e == null) {
            synchronized (C2114ic.f7953b) {
                if (f7444e == null) {
                    f7444e = new C1914bg[0];
                }
            }
        }
        return f7444e;
    }

    public C1914bg() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1914bg)) {
            return false;
        }
        C1914bg bgVar = (C1914bg) obj;
        if (this.f7445a == null) {
            if (bgVar.f7445a != null) {
                return false;
            }
        } else if (!this.f7445a.equals(bgVar.f7445a)) {
            return false;
        }
        if (this.f7446b == null) {
            if (bgVar.f7446b != null) {
                return false;
            }
        } else if (!this.f7446b.equals(bgVar.f7446b)) {
            return false;
        }
        if (this.f7447c == null) {
            if (bgVar.f7447c != null) {
                return false;
            }
        } else if (!this.f7447c.equals(bgVar.f7447c)) {
            return false;
        }
        if (this.f7448d == null) {
            if (bgVar.f7448d != null) {
                return false;
            }
        } else if (!this.f7448d.equals(bgVar.f7448d)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bgVar.f7939L == null || bgVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bgVar.f7939L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + (this.f7445a == null ? 0 : this.f7445a.hashCode());
        C1920bm bmVar = this.f7446b;
        int i4 = hashCode * 31;
        if (bmVar == null) {
            i = 0;
        } else {
            i = bmVar.hashCode();
        }
        int i5 = i4 + i;
        C1920bm bmVar2 = this.f7447c;
        int i6 = i5 * 31;
        if (bmVar2 == null) {
            i2 = 0;
        } else {
            i2 = bmVar2.hashCode();
        }
        int hashCode2 = (((i6 + i2) * 31) + (this.f7448d == null ? 0 : this.f7448d.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i3 = this.f7939L.hashCode();
        }
        return hashCode2 + i3;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7445a != null) {
            hwVar.mo14071a(1, this.f7445a.intValue());
        }
        if (this.f7446b != null) {
            hwVar.mo14074a(2, (C2116ie) this.f7446b);
        }
        if (this.f7447c != null) {
            hwVar.mo14074a(3, (C2116ie) this.f7447c);
        }
        if (this.f7448d != null) {
            hwVar.mo14076a(4, this.f7448d.booleanValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7445a != null) {
            b += C2107hw.m10223b(1, this.f7445a.intValue());
        }
        if (this.f7446b != null) {
            b += C2107hw.m10224b(2, (C2116ie) this.f7446b);
        }
        if (this.f7447c != null) {
            b += C2107hw.m10224b(3, (C2116ie) this.f7447c);
        }
        if (this.f7448d == null) {
            return b;
        }
        this.f7448d.booleanValue();
        return b + C2107hw.m10222b(4) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f7445a = Integer.valueOf(hvVar.mo14060d());
            } else if (a == 18) {
                if (this.f7446b == null) {
                    this.f7446b = new C1920bm();
                }
                hvVar.mo14052a((C2116ie) this.f7446b);
            } else if (a == 26) {
                if (this.f7447c == null) {
                    this.f7447c = new C1920bm();
                }
                hvVar.mo14052a((C2116ie) this.f7447c);
            } else if (a == 32) {
                this.f7448d = Boolean.valueOf(hvVar.mo14056b());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
