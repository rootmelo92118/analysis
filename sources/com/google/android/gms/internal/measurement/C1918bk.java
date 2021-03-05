package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bk */
public final class C1918bk extends C2109hy<C1918bk> {

    /* renamed from: a */
    public C1919bl[] f7464a = C1919bl.m8965a();

    public C1918bk() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1918bk)) {
            return false;
        }
        C1918bk bkVar = (C1918bk) obj;
        if (!C2114ic.m10272a((Object[]) this.f7464a, (Object[]) bkVar.f7464a)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bkVar.f7939L == null || bkVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bkVar.f7939L);
    }

    public final int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + C2114ic.m10268a((Object[]) this.f7464a)) * 31) + ((this.f7939L == null || this.f7939L.mo14095b()) ? 0 : this.f7939L.hashCode());
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7464a != null && this.f7464a.length > 0) {
            for (C1919bl blVar : this.f7464a) {
                if (blVar != null) {
                    hwVar.mo14074a(1, (C2116ie) blVar);
                }
            }
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7464a != null && this.f7464a.length > 0) {
            for (C1919bl blVar : this.f7464a) {
                if (blVar != null) {
                    b += C2107hw.m10224b(1, (C2116ie) blVar);
                }
            }
        }
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = C2119ih.m10286a(hvVar, 10);
                int length = this.f7464a == null ? 0 : this.f7464a.length;
                C1919bl[] blVarArr = new C1919bl[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7464a, 0, blVarArr, 0, length);
                }
                while (length < blVarArr.length - 1) {
                    blVarArr[length] = new C1919bl();
                    hvVar.mo14052a((C2116ie) blVarArr[length]);
                    hvVar.mo14049a();
                    length++;
                }
                blVarArr[length] = new C1919bl();
                hvVar.mo14052a((C2116ie) blVarArr[length]);
                this.f7464a = blVarArr;
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
