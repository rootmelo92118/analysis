package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ax */
public final class C1904ax extends C2109hy<C1904ax> {

    /* renamed from: d */
    private static volatile C1904ax[] f7393d;

    /* renamed from: a */
    public Integer f7394a = null;

    /* renamed from: b */
    public C1909bb[] f7395b = C1909bb.m8927a();

    /* renamed from: c */
    public C1905ay[] f7396c = C1905ay.m8914a();

    /* renamed from: e */
    private Boolean f7397e = null;

    /* renamed from: f */
    private Boolean f7398f = null;

    /* renamed from: a */
    public static C1904ax[] m8910a() {
        if (f7393d == null) {
            synchronized (C2114ic.f7953b) {
                if (f7393d == null) {
                    f7393d = new C1904ax[0];
                }
            }
        }
        return f7393d;
    }

    public C1904ax() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1904ax)) {
            return false;
        }
        C1904ax axVar = (C1904ax) obj;
        if (this.f7394a == null) {
            if (axVar.f7394a != null) {
                return false;
            }
        } else if (!this.f7394a.equals(axVar.f7394a)) {
            return false;
        }
        if (!C2114ic.m10272a((Object[]) this.f7395b, (Object[]) axVar.f7395b) || !C2114ic.m10272a((Object[]) this.f7396c, (Object[]) axVar.f7396c)) {
            return false;
        }
        if (this.f7397e == null) {
            if (axVar.f7397e != null) {
                return false;
            }
        } else if (!this.f7397e.equals(axVar.f7397e)) {
            return false;
        }
        if (this.f7398f == null) {
            if (axVar.f7398f != null) {
                return false;
            }
        } else if (!this.f7398f.equals(axVar.f7398f)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return axVar.f7939L == null || axVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(axVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7394a == null ? 0 : this.f7394a.hashCode())) * 31) + C2114ic.m10268a((Object[]) this.f7395b)) * 31) + C2114ic.m10268a((Object[]) this.f7396c)) * 31) + (this.f7397e == null ? 0 : this.f7397e.hashCode())) * 31) + (this.f7398f == null ? 0 : this.f7398f.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7394a != null) {
            hwVar.mo14071a(1, this.f7394a.intValue());
        }
        if (this.f7395b != null && this.f7395b.length > 0) {
            for (C1909bb bbVar : this.f7395b) {
                if (bbVar != null) {
                    hwVar.mo14074a(2, (C2116ie) bbVar);
                }
            }
        }
        if (this.f7396c != null && this.f7396c.length > 0) {
            for (C1905ay ayVar : this.f7396c) {
                if (ayVar != null) {
                    hwVar.mo14074a(3, (C2116ie) ayVar);
                }
            }
        }
        if (this.f7397e != null) {
            hwVar.mo14076a(4, this.f7397e.booleanValue());
        }
        if (this.f7398f != null) {
            hwVar.mo14076a(5, this.f7398f.booleanValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7394a != null) {
            b += C2107hw.m10223b(1, this.f7394a.intValue());
        }
        if (this.f7395b != null && this.f7395b.length > 0) {
            int i = b;
            for (C1909bb bbVar : this.f7395b) {
                if (bbVar != null) {
                    i += C2107hw.m10224b(2, (C2116ie) bbVar);
                }
            }
            b = i;
        }
        if (this.f7396c != null && this.f7396c.length > 0) {
            for (C1905ay ayVar : this.f7396c) {
                if (ayVar != null) {
                    b += C2107hw.m10224b(3, (C2116ie) ayVar);
                }
            }
        }
        if (this.f7397e != null) {
            this.f7397e.booleanValue();
            b += C2107hw.m10222b(4) + 1;
        }
        if (this.f7398f == null) {
            return b;
        }
        this.f7398f.booleanValue();
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
                this.f7394a = Integer.valueOf(hvVar.mo14060d());
            } else if (a == 18) {
                int a2 = C2119ih.m10286a(hvVar, 18);
                int length = this.f7395b == null ? 0 : this.f7395b.length;
                C1909bb[] bbVarArr = new C1909bb[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7395b, 0, bbVarArr, 0, length);
                }
                while (length < bbVarArr.length - 1) {
                    bbVarArr[length] = new C1909bb();
                    hvVar.mo14052a((C2116ie) bbVarArr[length]);
                    hvVar.mo14049a();
                    length++;
                }
                bbVarArr[length] = new C1909bb();
                hvVar.mo14052a((C2116ie) bbVarArr[length]);
                this.f7395b = bbVarArr;
            } else if (a == 26) {
                int a3 = C2119ih.m10286a(hvVar, 26);
                int length2 = this.f7396c == null ? 0 : this.f7396c.length;
                C1905ay[] ayVarArr = new C1905ay[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f7396c, 0, ayVarArr, 0, length2);
                }
                while (length2 < ayVarArr.length - 1) {
                    ayVarArr[length2] = new C1905ay();
                    hvVar.mo14052a((C2116ie) ayVarArr[length2]);
                    hvVar.mo14049a();
                    length2++;
                }
                ayVarArr[length2] = new C1905ay();
                hvVar.mo14052a((C2116ie) ayVarArr[length2]);
                this.f7396c = ayVarArr;
            } else if (a == 32) {
                this.f7397e = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 40) {
                this.f7398f = Boolean.valueOf(hvVar.mo14056b());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
