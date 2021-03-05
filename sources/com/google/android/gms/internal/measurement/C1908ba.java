package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ba */
public final class C1908ba extends C2109hy<C1908ba> {

    /* renamed from: a */
    public Integer f7413a = null;

    /* renamed from: b */
    public Boolean f7414b = null;

    /* renamed from: c */
    public String f7415c = null;

    /* renamed from: d */
    public String f7416d = null;

    /* renamed from: e */
    public String f7417e = null;

    public C1908ba() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1908ba)) {
            return false;
        }
        C1908ba baVar = (C1908ba) obj;
        if (this.f7413a == null) {
            if (baVar.f7413a != null) {
                return false;
            }
        } else if (!this.f7413a.equals(baVar.f7413a)) {
            return false;
        }
        if (this.f7414b == null) {
            if (baVar.f7414b != null) {
                return false;
            }
        } else if (!this.f7414b.equals(baVar.f7414b)) {
            return false;
        }
        if (this.f7415c == null) {
            if (baVar.f7415c != null) {
                return false;
            }
        } else if (!this.f7415c.equals(baVar.f7415c)) {
            return false;
        }
        if (this.f7416d == null) {
            if (baVar.f7416d != null) {
                return false;
            }
        } else if (!this.f7416d.equals(baVar.f7416d)) {
            return false;
        }
        if (this.f7417e == null) {
            if (baVar.f7417e != null) {
                return false;
            }
        } else if (!this.f7417e.equals(baVar.f7417e)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return baVar.f7939L == null || baVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(baVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7413a == null ? 0 : this.f7413a.intValue())) * 31) + (this.f7414b == null ? 0 : this.f7414b.hashCode())) * 31) + (this.f7415c == null ? 0 : this.f7415c.hashCode())) * 31) + (this.f7416d == null ? 0 : this.f7416d.hashCode())) * 31) + (this.f7417e == null ? 0 : this.f7417e.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7413a != null) {
            hwVar.mo14071a(1, this.f7413a.intValue());
        }
        if (this.f7414b != null) {
            hwVar.mo14076a(2, this.f7414b.booleanValue());
        }
        if (this.f7415c != null) {
            hwVar.mo14075a(3, this.f7415c);
        }
        if (this.f7416d != null) {
            hwVar.mo14075a(4, this.f7416d);
        }
        if (this.f7417e != null) {
            hwVar.mo14075a(5, this.f7417e);
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7413a != null) {
            b += C2107hw.m10223b(1, this.f7413a.intValue());
        }
        if (this.f7414b != null) {
            this.f7414b.booleanValue();
            b += C2107hw.m10222b(2) + 1;
        }
        if (this.f7415c != null) {
            b += C2107hw.m10225b(3, this.f7415c);
        }
        if (this.f7416d != null) {
            b += C2107hw.m10225b(4, this.f7416d);
        }
        return this.f7417e != null ? b + C2107hw.m10225b(5, this.f7417e) : b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C1908ba mo13498a(C2106hv hvVar) {
        int d;
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = hvVar.mo14060d();
                    if (d < 0 || d > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(d);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.f7413a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    hvVar.mo14063e(hvVar.mo14067i());
                    mo14082a(hvVar, a);
                }
            } else if (a == 16) {
                this.f7414b = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 26) {
                this.f7415c = hvVar.mo14059c();
            } else if (a == 34) {
                this.f7416d = hvVar.mo14059c();
            } else if (a == 42) {
                this.f7417e = hvVar.mo14059c();
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(d);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
