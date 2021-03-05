package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bc */
public final class C1910bc extends C2109hy<C1910bc> {

    /* renamed from: a */
    public Integer f7424a = null;

    /* renamed from: b */
    public String f7425b = null;

    /* renamed from: c */
    public Boolean f7426c = null;

    /* renamed from: d */
    public String[] f7427d = C2119ih.f7960c;

    public C1910bc() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1910bc)) {
            return false;
        }
        C1910bc bcVar = (C1910bc) obj;
        if (this.f7424a == null) {
            if (bcVar.f7424a != null) {
                return false;
            }
        } else if (!this.f7424a.equals(bcVar.f7424a)) {
            return false;
        }
        if (this.f7425b == null) {
            if (bcVar.f7425b != null) {
                return false;
            }
        } else if (!this.f7425b.equals(bcVar.f7425b)) {
            return false;
        }
        if (this.f7426c == null) {
            if (bcVar.f7426c != null) {
                return false;
            }
        } else if (!this.f7426c.equals(bcVar.f7426c)) {
            return false;
        }
        if (!C2114ic.m10272a((Object[]) this.f7427d, (Object[]) bcVar.f7427d)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bcVar.f7939L == null || bcVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bcVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7424a == null ? 0 : this.f7424a.intValue())) * 31) + (this.f7425b == null ? 0 : this.f7425b.hashCode())) * 31) + (this.f7426c == null ? 0 : this.f7426c.hashCode())) * 31) + C2114ic.m10268a((Object[]) this.f7427d)) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7424a != null) {
            hwVar.mo14071a(1, this.f7424a.intValue());
        }
        if (this.f7425b != null) {
            hwVar.mo14075a(2, this.f7425b);
        }
        if (this.f7426c != null) {
            hwVar.mo14076a(3, this.f7426c.booleanValue());
        }
        if (this.f7427d != null && this.f7427d.length > 0) {
            for (String str : this.f7427d) {
                if (str != null) {
                    hwVar.mo14075a(4, str);
                }
            }
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7424a != null) {
            b += C2107hw.m10223b(1, this.f7424a.intValue());
        }
        if (this.f7425b != null) {
            b += C2107hw.m10225b(2, this.f7425b);
        }
        if (this.f7426c != null) {
            this.f7426c.booleanValue();
            b += C2107hw.m10222b(3) + 1;
        }
        if (this.f7427d == null || this.f7427d.length <= 0) {
            return b;
        }
        int i = 0;
        int i2 = 0;
        for (String str : this.f7427d) {
            if (str != null) {
                i2++;
                i += C2107hw.m10218a(str);
            }
        }
        return b + i + (i2 * 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C1910bc mo13498a(C2106hv hvVar) {
        int d;
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = hvVar.mo14060d();
                    if (d < 0 || d > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(d);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.f7424a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    hvVar.mo14063e(hvVar.mo14067i());
                    mo14082a(hvVar, a);
                }
            } else if (a == 18) {
                this.f7425b = hvVar.mo14059c();
            } else if (a == 24) {
                this.f7426c = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 34) {
                int a2 = C2119ih.m10286a(hvVar, 34);
                int length = this.f7427d == null ? 0 : this.f7427d.length;
                String[] strArr = new String[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7427d, 0, strArr, 0, length);
                }
                while (length < strArr.length - 1) {
                    strArr[length] = hvVar.mo14059c();
                    hvVar.mo14049a();
                    length++;
                }
                strArr[length] = hvVar.mo14059c();
                this.f7427d = strArr;
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(d);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
