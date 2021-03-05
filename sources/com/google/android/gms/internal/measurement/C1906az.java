package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.az */
public final class C1906az extends C2109hy<C1906az> {

    /* renamed from: e */
    private static volatile C1906az[] f7407e;

    /* renamed from: a */
    public C1910bc f7408a = null;

    /* renamed from: b */
    public C1908ba f7409b = null;

    /* renamed from: c */
    public Boolean f7410c = null;

    /* renamed from: d */
    public String f7411d = null;

    /* renamed from: a */
    public static C1906az[] m8918a() {
        if (f7407e == null) {
            synchronized (C2114ic.f7953b) {
                if (f7407e == null) {
                    f7407e = new C1906az[0];
                }
            }
        }
        return f7407e;
    }

    public C1906az() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1906az)) {
            return false;
        }
        C1906az azVar = (C1906az) obj;
        if (this.f7408a == null) {
            if (azVar.f7408a != null) {
                return false;
            }
        } else if (!this.f7408a.equals(azVar.f7408a)) {
            return false;
        }
        if (this.f7409b == null) {
            if (azVar.f7409b != null) {
                return false;
            }
        } else if (!this.f7409b.equals(azVar.f7409b)) {
            return false;
        }
        if (this.f7410c == null) {
            if (azVar.f7410c != null) {
                return false;
            }
        } else if (!this.f7410c.equals(azVar.f7410c)) {
            return false;
        }
        if (this.f7411d == null) {
            if (azVar.f7411d != null) {
                return false;
            }
        } else if (!this.f7411d.equals(azVar.f7411d)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return azVar.f7939L == null || azVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(azVar.f7939L);
    }

    public final int hashCode() {
        int i;
        int i2;
        C1910bc bcVar = this.f7408a;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        int i3 = 0;
        if (bcVar == null) {
            i = 0;
        } else {
            i = bcVar.hashCode();
        }
        int i4 = hashCode + i;
        C1908ba baVar = this.f7409b;
        int i5 = i4 * 31;
        if (baVar == null) {
            i2 = 0;
        } else {
            i2 = baVar.hashCode();
        }
        int hashCode2 = (((((i5 + i2) * 31) + (this.f7410c == null ? 0 : this.f7410c.hashCode())) * 31) + (this.f7411d == null ? 0 : this.f7411d.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i3 = this.f7939L.hashCode();
        }
        return hashCode2 + i3;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7408a != null) {
            hwVar.mo14074a(1, (C2116ie) this.f7408a);
        }
        if (this.f7409b != null) {
            hwVar.mo14074a(2, (C2116ie) this.f7409b);
        }
        if (this.f7410c != null) {
            hwVar.mo14076a(3, this.f7410c.booleanValue());
        }
        if (this.f7411d != null) {
            hwVar.mo14075a(4, this.f7411d);
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7408a != null) {
            b += C2107hw.m10224b(1, (C2116ie) this.f7408a);
        }
        if (this.f7409b != null) {
            b += C2107hw.m10224b(2, (C2116ie) this.f7409b);
        }
        if (this.f7410c != null) {
            this.f7410c.booleanValue();
            b += C2107hw.m10222b(3) + 1;
        }
        return this.f7411d != null ? b + C2107hw.m10225b(4, this.f7411d) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f7408a == null) {
                    this.f7408a = new C1910bc();
                }
                hvVar.mo14052a((C2116ie) this.f7408a);
            } else if (a == 18) {
                if (this.f7409b == null) {
                    this.f7409b = new C1908ba();
                }
                hvVar.mo14052a((C2116ie) this.f7409b);
            } else if (a == 24) {
                this.f7410c = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 34) {
                this.f7411d = hvVar.mo14059c();
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
