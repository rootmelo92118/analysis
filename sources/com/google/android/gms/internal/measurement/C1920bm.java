package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bm */
public final class C1920bm extends C2109hy<C1920bm> {

    /* renamed from: a */
    public long[] f7507a = C2119ih.f7959b;

    /* renamed from: b */
    public long[] f7508b = C2119ih.f7959b;

    /* renamed from: c */
    public C1915bh[] f7509c = C1915bh.m8950a();

    /* renamed from: d */
    public C1921bn[] f7510d = C1921bn.m8972a();

    public C1920bm() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1920bm)) {
            return false;
        }
        C1920bm bmVar = (C1920bm) obj;
        if (!C2114ic.m10271a(this.f7507a, bmVar.f7507a) || !C2114ic.m10271a(this.f7508b, bmVar.f7508b) || !C2114ic.m10272a((Object[]) this.f7509c, (Object[]) bmVar.f7509c) || !C2114ic.m10272a((Object[]) this.f7510d, (Object[]) bmVar.f7510d)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return bmVar.f7939L == null || bmVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(bmVar.f7939L);
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + C2114ic.m10267a(this.f7507a)) * 31) + C2114ic.m10267a(this.f7508b)) * 31) + C2114ic.m10268a((Object[]) this.f7509c)) * 31) + C2114ic.m10268a((Object[]) this.f7510d)) * 31) + ((this.f7939L == null || this.f7939L.mo14095b()) ? 0 : this.f7939L.hashCode());
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7507a != null && this.f7507a.length > 0) {
            for (long a : this.f7507a) {
                hwVar.mo14072a(1, a);
            }
        }
        if (this.f7508b != null && this.f7508b.length > 0) {
            for (long a2 : this.f7508b) {
                hwVar.mo14072a(2, a2);
            }
        }
        if (this.f7509c != null && this.f7509c.length > 0) {
            for (C1915bh bhVar : this.f7509c) {
                if (bhVar != null) {
                    hwVar.mo14074a(3, (C2116ie) bhVar);
                }
            }
        }
        if (this.f7510d != null && this.f7510d.length > 0) {
            for (C1921bn bnVar : this.f7510d) {
                if (bnVar != null) {
                    hwVar.mo14074a(4, (C2116ie) bnVar);
                }
            }
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7507a != null && this.f7507a.length > 0) {
            int i = 0;
            for (long a : this.f7507a) {
                i += C2107hw.m10216a(a);
            }
            b = b + i + (this.f7507a.length * 1);
        }
        if (this.f7508b != null && this.f7508b.length > 0) {
            int i2 = 0;
            for (long a2 : this.f7508b) {
                i2 += C2107hw.m10216a(a2);
            }
            b = b + i2 + (this.f7508b.length * 1);
        }
        if (this.f7509c != null && this.f7509c.length > 0) {
            int i3 = b;
            for (C1915bh bhVar : this.f7509c) {
                if (bhVar != null) {
                    i3 += C2107hw.m10224b(3, (C2116ie) bhVar);
                }
            }
            b = i3;
        }
        if (this.f7510d != null && this.f7510d.length > 0) {
            for (C1921bn bnVar : this.f7510d) {
                if (bnVar != null) {
                    b += C2107hw.m10224b(4, (C2116ie) bnVar);
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
            if (a == 8) {
                int a2 = C2119ih.m10286a(hvVar, 8);
                int length = this.f7507a == null ? 0 : this.f7507a.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7507a, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = hvVar.mo14062e();
                    hvVar.mo14049a();
                    length++;
                }
                jArr[length] = hvVar.mo14062e();
                this.f7507a = jArr;
            } else if (a == 10) {
                int c = hvVar.mo14058c(hvVar.mo14060d());
                int i = hvVar.mo14067i();
                int i2 = 0;
                while (hvVar.mo14066h() > 0) {
                    hvVar.mo14062e();
                    i2++;
                }
                hvVar.mo14063e(i);
                int length2 = this.f7507a == null ? 0 : this.f7507a.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f7507a, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = hvVar.mo14062e();
                    length2++;
                }
                this.f7507a = jArr2;
                hvVar.mo14061d(c);
            } else if (a == 16) {
                int a3 = C2119ih.m10286a(hvVar, 16);
                int length3 = this.f7508b == null ? 0 : this.f7508b.length;
                long[] jArr3 = new long[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f7508b, 0, jArr3, 0, length3);
                }
                while (length3 < jArr3.length - 1) {
                    jArr3[length3] = hvVar.mo14062e();
                    hvVar.mo14049a();
                    length3++;
                }
                jArr3[length3] = hvVar.mo14062e();
                this.f7508b = jArr3;
            } else if (a == 18) {
                int c2 = hvVar.mo14058c(hvVar.mo14060d());
                int i3 = hvVar.mo14067i();
                int i4 = 0;
                while (hvVar.mo14066h() > 0) {
                    hvVar.mo14062e();
                    i4++;
                }
                hvVar.mo14063e(i3);
                int length4 = this.f7508b == null ? 0 : this.f7508b.length;
                long[] jArr4 = new long[(i4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.f7508b, 0, jArr4, 0, length4);
                }
                while (length4 < jArr4.length) {
                    jArr4[length4] = hvVar.mo14062e();
                    length4++;
                }
                this.f7508b = jArr4;
                hvVar.mo14061d(c2);
            } else if (a == 26) {
                int a4 = C2119ih.m10286a(hvVar, 26);
                int length5 = this.f7509c == null ? 0 : this.f7509c.length;
                C1915bh[] bhVarArr = new C1915bh[(a4 + length5)];
                if (length5 != 0) {
                    System.arraycopy(this.f7509c, 0, bhVarArr, 0, length5);
                }
                while (length5 < bhVarArr.length - 1) {
                    bhVarArr[length5] = new C1915bh();
                    hvVar.mo14052a((C2116ie) bhVarArr[length5]);
                    hvVar.mo14049a();
                    length5++;
                }
                bhVarArr[length5] = new C1915bh();
                hvVar.mo14052a((C2116ie) bhVarArr[length5]);
                this.f7509c = bhVarArr;
            } else if (a == 34) {
                int a5 = C2119ih.m10286a(hvVar, 34);
                int length6 = this.f7510d == null ? 0 : this.f7510d.length;
                C1921bn[] bnVarArr = new C1921bn[(a5 + length6)];
                if (length6 != 0) {
                    System.arraycopy(this.f7510d, 0, bnVarArr, 0, length6);
                }
                while (length6 < bnVarArr.length - 1) {
                    bnVarArr[length6] = new C1921bn();
                    hvVar.mo14052a((C2116ie) bnVarArr[length6]);
                    hvVar.mo14049a();
                    length6++;
                }
                bnVarArr[length6] = new C1921bn();
                hvVar.mo14052a((C2116ie) bnVarArr[length6]);
                this.f7510d = bnVarArr;
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
