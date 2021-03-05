package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bn */
public final class C1921bn extends C2109hy<C1921bn> {

    /* renamed from: c */
    private static volatile C1921bn[] f7511c;

    /* renamed from: a */
    public Integer f7512a = null;

    /* renamed from: b */
    public long[] f7513b = C2119ih.f7959b;

    /* renamed from: a */
    public static C1921bn[] m8972a() {
        if (f7511c == null) {
            synchronized (C2114ic.f7953b) {
                if (f7511c == null) {
                    f7511c = new C1921bn[0];
                }
            }
        }
        return f7511c;
    }

    public C1921bn() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1921bn)) {
            return false;
        }
        C1921bn bnVar = (C1921bn) obj;
        if (this.f7512a == null) {
            if (bnVar.f7512a != null) {
                return false;
            }
        } else if (!this.f7512a.equals(bnVar.f7512a)) {
            return false;
        }
        if (!C2114ic.m10271a(this.f7513b, bnVar.f7513b)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bnVar.f7939L == null || bnVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bnVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f7512a == null ? 0 : this.f7512a.hashCode())) * 31) + C2114ic.m10267a(this.f7513b)) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7512a != null) {
            hwVar.mo14071a(1, this.f7512a.intValue());
        }
        if (this.f7513b != null && this.f7513b.length > 0) {
            for (long b : this.f7513b) {
                hwVar.mo14078b(2, b);
            }
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7512a != null) {
            b += C2107hw.m10223b(1, this.f7512a.intValue());
        }
        if (this.f7513b == null || this.f7513b.length <= 0) {
            return b;
        }
        int i = 0;
        for (long a : this.f7513b) {
            i += C2107hw.m10216a(a);
        }
        return b + i + (this.f7513b.length * 1);
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f7512a = Integer.valueOf(hvVar.mo14060d());
            } else if (a == 16) {
                int a2 = C2119ih.m10286a(hvVar, 16);
                int length = this.f7513b == null ? 0 : this.f7513b.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7513b, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = hvVar.mo14062e();
                    hvVar.mo14049a();
                    length++;
                }
                jArr[length] = hvVar.mo14062e();
                this.f7513b = jArr;
            } else if (a == 18) {
                int c = hvVar.mo14058c(hvVar.mo14060d());
                int i = hvVar.mo14067i();
                int i2 = 0;
                while (hvVar.mo14066h() > 0) {
                    hvVar.mo14062e();
                    i2++;
                }
                hvVar.mo14063e(i);
                int length2 = this.f7513b == null ? 0 : this.f7513b.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f7513b, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = hvVar.mo14062e();
                    length2++;
                }
                this.f7513b = jArr2;
                hvVar.mo14061d(c);
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
