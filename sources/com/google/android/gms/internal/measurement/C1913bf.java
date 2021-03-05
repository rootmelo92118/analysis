package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bf */
public final class C1913bf extends C2109hy<C1913bf> {

    /* renamed from: c */
    private static volatile C1913bf[] f7441c;

    /* renamed from: a */
    public String f7442a = null;

    /* renamed from: b */
    public String f7443b = null;

    /* renamed from: a */
    public static C1913bf[] m8942a() {
        if (f7441c == null) {
            synchronized (C2114ic.f7953b) {
                if (f7441c == null) {
                    f7441c = new C1913bf[0];
                }
            }
        }
        return f7441c;
    }

    public C1913bf() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1913bf)) {
            return false;
        }
        C1913bf bfVar = (C1913bf) obj;
        if (this.f7442a == null) {
            if (bfVar.f7442a != null) {
                return false;
            }
        } else if (!this.f7442a.equals(bfVar.f7442a)) {
            return false;
        }
        if (this.f7443b == null) {
            if (bfVar.f7443b != null) {
                return false;
            }
        } else if (!this.f7443b.equals(bfVar.f7443b)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bfVar.f7939L == null || bfVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bfVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f7442a == null ? 0 : this.f7442a.hashCode())) * 31) + (this.f7443b == null ? 0 : this.f7443b.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7442a != null) {
            hwVar.mo14075a(1, this.f7442a);
        }
        if (this.f7443b != null) {
            hwVar.mo14075a(2, this.f7443b);
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7442a != null) {
            b += C2107hw.m10225b(1, this.f7442a);
        }
        return this.f7443b != null ? b + C2107hw.m10225b(2, this.f7443b) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f7442a = hvVar.mo14059c();
            } else if (a == 18) {
                this.f7443b = hvVar.mo14059c();
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
