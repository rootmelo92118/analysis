package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bh */
public final class C1915bh extends C2109hy<C1915bh> {

    /* renamed from: c */
    private static volatile C1915bh[] f7449c;

    /* renamed from: a */
    public Integer f7450a = null;

    /* renamed from: b */
    public Long f7451b = null;

    /* renamed from: a */
    public static C1915bh[] m8950a() {
        if (f7449c == null) {
            synchronized (C2114ic.f7953b) {
                if (f7449c == null) {
                    f7449c = new C1915bh[0];
                }
            }
        }
        return f7449c;
    }

    public C1915bh() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1915bh)) {
            return false;
        }
        C1915bh bhVar = (C1915bh) obj;
        if (this.f7450a == null) {
            if (bhVar.f7450a != null) {
                return false;
            }
        } else if (!this.f7450a.equals(bhVar.f7450a)) {
            return false;
        }
        if (this.f7451b == null) {
            if (bhVar.f7451b != null) {
                return false;
            }
        } else if (!this.f7451b.equals(bhVar.f7451b)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bhVar.f7939L == null || bhVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bhVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f7450a == null ? 0 : this.f7450a.hashCode())) * 31) + (this.f7451b == null ? 0 : this.f7451b.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7450a != null) {
            hwVar.mo14071a(1, this.f7450a.intValue());
        }
        if (this.f7451b != null) {
            hwVar.mo14078b(2, this.f7451b.longValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7450a != null) {
            b += C2107hw.m10223b(1, this.f7450a.intValue());
        }
        return this.f7451b != null ? b + C2107hw.m10228c(2, this.f7451b.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f7450a = Integer.valueOf(hvVar.mo14060d());
            } else if (a == 16) {
                this.f7451b = Long.valueOf(hvVar.mo14062e());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
