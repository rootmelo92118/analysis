package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ay */
public final class C1905ay extends C2109hy<C1905ay> {

    /* renamed from: g */
    private static volatile C1905ay[] f7399g;

    /* renamed from: a */
    public Integer f7400a = null;

    /* renamed from: b */
    public String f7401b = null;

    /* renamed from: c */
    public C1906az[] f7402c = C1906az.m8918a();

    /* renamed from: d */
    public C1908ba f7403d = null;

    /* renamed from: e */
    public Boolean f7404e = null;

    /* renamed from: f */
    public Boolean f7405f = null;

    /* renamed from: h */
    private Boolean f7406h = null;

    /* renamed from: a */
    public static C1905ay[] m8914a() {
        if (f7399g == null) {
            synchronized (C2114ic.f7953b) {
                if (f7399g == null) {
                    f7399g = new C1905ay[0];
                }
            }
        }
        return f7399g;
    }

    public C1905ay() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1905ay)) {
            return false;
        }
        C1905ay ayVar = (C1905ay) obj;
        if (this.f7400a == null) {
            if (ayVar.f7400a != null) {
                return false;
            }
        } else if (!this.f7400a.equals(ayVar.f7400a)) {
            return false;
        }
        if (this.f7401b == null) {
            if (ayVar.f7401b != null) {
                return false;
            }
        } else if (!this.f7401b.equals(ayVar.f7401b)) {
            return false;
        }
        if (!C2114ic.m10272a((Object[]) this.f7402c, (Object[]) ayVar.f7402c)) {
            return false;
        }
        if (this.f7406h == null) {
            if (ayVar.f7406h != null) {
                return false;
            }
        } else if (!this.f7406h.equals(ayVar.f7406h)) {
            return false;
        }
        if (this.f7403d == null) {
            if (ayVar.f7403d != null) {
                return false;
            }
        } else if (!this.f7403d.equals(ayVar.f7403d)) {
            return false;
        }
        if (this.f7404e == null) {
            if (ayVar.f7404e != null) {
                return false;
            }
        } else if (!this.f7404e.equals(ayVar.f7404e)) {
            return false;
        }
        if (this.f7405f == null) {
            if (ayVar.f7405f != null) {
                return false;
            }
        } else if (!this.f7405f.equals(ayVar.f7405f)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return ayVar.f7939L == null || ayVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(ayVar.f7939L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7400a == null ? 0 : this.f7400a.hashCode())) * 31) + (this.f7401b == null ? 0 : this.f7401b.hashCode())) * 31) + C2114ic.m10268a((Object[]) this.f7402c)) * 31) + (this.f7406h == null ? 0 : this.f7406h.hashCode());
        C1908ba baVar = this.f7403d;
        int i3 = hashCode * 31;
        if (baVar == null) {
            i = 0;
        } else {
            i = baVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f7404e == null ? 0 : this.f7404e.hashCode())) * 31) + (this.f7405f == null ? 0 : this.f7405f.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i2 = this.f7939L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7400a != null) {
            hwVar.mo14071a(1, this.f7400a.intValue());
        }
        if (this.f7401b != null) {
            hwVar.mo14075a(2, this.f7401b);
        }
        if (this.f7402c != null && this.f7402c.length > 0) {
            for (C1906az azVar : this.f7402c) {
                if (azVar != null) {
                    hwVar.mo14074a(3, (C2116ie) azVar);
                }
            }
        }
        if (this.f7406h != null) {
            hwVar.mo14076a(4, this.f7406h.booleanValue());
        }
        if (this.f7403d != null) {
            hwVar.mo14074a(5, (C2116ie) this.f7403d);
        }
        if (this.f7404e != null) {
            hwVar.mo14076a(6, this.f7404e.booleanValue());
        }
        if (this.f7405f != null) {
            hwVar.mo14076a(7, this.f7405f.booleanValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7400a != null) {
            b += C2107hw.m10223b(1, this.f7400a.intValue());
        }
        if (this.f7401b != null) {
            b += C2107hw.m10225b(2, this.f7401b);
        }
        if (this.f7402c != null && this.f7402c.length > 0) {
            for (C1906az azVar : this.f7402c) {
                if (azVar != null) {
                    b += C2107hw.m10224b(3, (C2116ie) azVar);
                }
            }
        }
        if (this.f7406h != null) {
            this.f7406h.booleanValue();
            b += C2107hw.m10222b(4) + 1;
        }
        if (this.f7403d != null) {
            b += C2107hw.m10224b(5, (C2116ie) this.f7403d);
        }
        if (this.f7404e != null) {
            this.f7404e.booleanValue();
            b += C2107hw.m10222b(6) + 1;
        }
        if (this.f7405f == null) {
            return b;
        }
        this.f7405f.booleanValue();
        return b + C2107hw.m10222b(7) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f7400a = Integer.valueOf(hvVar.mo14060d());
            } else if (a == 18) {
                this.f7401b = hvVar.mo14059c();
            } else if (a == 26) {
                int a2 = C2119ih.m10286a(hvVar, 26);
                int length = this.f7402c == null ? 0 : this.f7402c.length;
                C1906az[] azVarArr = new C1906az[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7402c, 0, azVarArr, 0, length);
                }
                while (length < azVarArr.length - 1) {
                    azVarArr[length] = new C1906az();
                    hvVar.mo14052a((C2116ie) azVarArr[length]);
                    hvVar.mo14049a();
                    length++;
                }
                azVarArr[length] = new C1906az();
                hvVar.mo14052a((C2116ie) azVarArr[length]);
                this.f7402c = azVarArr;
            } else if (a == 32) {
                this.f7406h = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 42) {
                if (this.f7403d == null) {
                    this.f7403d = new C1908ba();
                }
                hvVar.mo14052a((C2116ie) this.f7403d);
            } else if (a == 48) {
                this.f7404e = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 56) {
                this.f7405f = Boolean.valueOf(hvVar.mo14056b());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
