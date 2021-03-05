package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bd */
public final class C1911bd extends C2109hy<C1911bd> {

    /* renamed from: e */
    private static volatile C1911bd[] f7428e;

    /* renamed from: a */
    public String f7429a = null;

    /* renamed from: b */
    public Boolean f7430b = null;

    /* renamed from: c */
    public Boolean f7431c = null;

    /* renamed from: d */
    public Integer f7432d = null;

    /* renamed from: a */
    public static C1911bd[] m8935a() {
        if (f7428e == null) {
            synchronized (C2114ic.f7953b) {
                if (f7428e == null) {
                    f7428e = new C1911bd[0];
                }
            }
        }
        return f7428e;
    }

    public C1911bd() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1911bd)) {
            return false;
        }
        C1911bd bdVar = (C1911bd) obj;
        if (this.f7429a == null) {
            if (bdVar.f7429a != null) {
                return false;
            }
        } else if (!this.f7429a.equals(bdVar.f7429a)) {
            return false;
        }
        if (this.f7430b == null) {
            if (bdVar.f7430b != null) {
                return false;
            }
        } else if (!this.f7430b.equals(bdVar.f7430b)) {
            return false;
        }
        if (this.f7431c == null) {
            if (bdVar.f7431c != null) {
                return false;
            }
        } else if (!this.f7431c.equals(bdVar.f7431c)) {
            return false;
        }
        if (this.f7432d == null) {
            if (bdVar.f7432d != null) {
                return false;
            }
        } else if (!this.f7432d.equals(bdVar.f7432d)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bdVar.f7939L == null || bdVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bdVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7429a == null ? 0 : this.f7429a.hashCode())) * 31) + (this.f7430b == null ? 0 : this.f7430b.hashCode())) * 31) + (this.f7431c == null ? 0 : this.f7431c.hashCode())) * 31) + (this.f7432d == null ? 0 : this.f7432d.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7429a != null) {
            hwVar.mo14075a(1, this.f7429a);
        }
        if (this.f7430b != null) {
            hwVar.mo14076a(2, this.f7430b.booleanValue());
        }
        if (this.f7431c != null) {
            hwVar.mo14076a(3, this.f7431c.booleanValue());
        }
        if (this.f7432d != null) {
            hwVar.mo14071a(4, this.f7432d.intValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7429a != null) {
            b += C2107hw.m10225b(1, this.f7429a);
        }
        if (this.f7430b != null) {
            this.f7430b.booleanValue();
            b += C2107hw.m10222b(2) + 1;
        }
        if (this.f7431c != null) {
            this.f7431c.booleanValue();
            b += C2107hw.m10222b(3) + 1;
        }
        return this.f7432d != null ? b + C2107hw.m10223b(4, this.f7432d.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f7429a = hvVar.mo14059c();
            } else if (a == 16) {
                this.f7430b = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 24) {
                this.f7431c = Boolean.valueOf(hvVar.mo14056b());
            } else if (a == 32) {
                this.f7432d = Integer.valueOf(hvVar.mo14060d());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
