package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.be */
public final class C1912be extends C2109hy<C1912be> {

    /* renamed from: a */
    public Long f7433a = null;

    /* renamed from: b */
    public String f7434b = null;

    /* renamed from: c */
    public C1913bf[] f7435c = C1913bf.m8942a();

    /* renamed from: d */
    public C1911bd[] f7436d = C1911bd.m8935a();

    /* renamed from: e */
    public C1904ax[] f7437e = C1904ax.m8910a();

    /* renamed from: f */
    private Integer f7438f = null;

    /* renamed from: g */
    private String f7439g = null;

    /* renamed from: h */
    private Boolean f7440h = null;

    public C1912be() {
        this.f7939L = null;
        this.f7955M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1912be)) {
            return false;
        }
        C1912be beVar = (C1912be) obj;
        if (this.f7433a == null) {
            if (beVar.f7433a != null) {
                return false;
            }
        } else if (!this.f7433a.equals(beVar.f7433a)) {
            return false;
        }
        if (this.f7434b == null) {
            if (beVar.f7434b != null) {
                return false;
            }
        } else if (!this.f7434b.equals(beVar.f7434b)) {
            return false;
        }
        if (this.f7438f == null) {
            if (beVar.f7438f != null) {
                return false;
            }
        } else if (!this.f7438f.equals(beVar.f7438f)) {
            return false;
        }
        if (!C2114ic.m10272a((Object[]) this.f7435c, (Object[]) beVar.f7435c) || !C2114ic.m10272a((Object[]) this.f7436d, (Object[]) beVar.f7436d) || !C2114ic.m10272a((Object[]) this.f7437e, (Object[]) beVar.f7437e)) {
            return false;
        }
        if (this.f7439g == null) {
            if (beVar.f7439g != null) {
                return false;
            }
        } else if (!this.f7439g.equals(beVar.f7439g)) {
            return false;
        }
        if (this.f7440h == null) {
            if (beVar.f7440h != null) {
                return false;
            }
        } else if (!this.f7440h.equals(beVar.f7440h)) {
            return false;
        }
        if (this.f7939L == null || this.f7939L.mo14095b()) {
            return beVar.f7939L == null || beVar.f7939L.mo14095b();
        }
        return this.f7939L.equals(beVar.f7939L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f7433a == null ? 0 : this.f7433a.hashCode())) * 31) + (this.f7434b == null ? 0 : this.f7434b.hashCode())) * 31) + (this.f7438f == null ? 0 : this.f7438f.hashCode())) * 31) + C2114ic.m10268a((Object[]) this.f7435c)) * 31) + C2114ic.m10268a((Object[]) this.f7436d)) * 31) + C2114ic.m10268a((Object[]) this.f7437e)) * 31) + (this.f7439g == null ? 0 : this.f7439g.hashCode())) * 31) + (this.f7440h == null ? 0 : this.f7440h.hashCode())) * 31;
        if (this.f7939L != null && !this.f7939L.mo14095b()) {
            i = this.f7939L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo13499a(C2107hw hwVar) {
        if (this.f7433a != null) {
            hwVar.mo14078b(1, this.f7433a.longValue());
        }
        if (this.f7434b != null) {
            hwVar.mo14075a(2, this.f7434b);
        }
        if (this.f7438f != null) {
            hwVar.mo14071a(3, this.f7438f.intValue());
        }
        if (this.f7435c != null && this.f7435c.length > 0) {
            for (C1913bf bfVar : this.f7435c) {
                if (bfVar != null) {
                    hwVar.mo14074a(4, (C2116ie) bfVar);
                }
            }
        }
        if (this.f7436d != null && this.f7436d.length > 0) {
            for (C1911bd bdVar : this.f7436d) {
                if (bdVar != null) {
                    hwVar.mo14074a(5, (C2116ie) bdVar);
                }
            }
        }
        if (this.f7437e != null && this.f7437e.length > 0) {
            for (C1904ax axVar : this.f7437e) {
                if (axVar != null) {
                    hwVar.mo14074a(6, (C2116ie) axVar);
                }
            }
        }
        if (this.f7439g != null) {
            hwVar.mo14075a(7, this.f7439g);
        }
        if (this.f7440h != null) {
            hwVar.mo14076a(8, this.f7440h.booleanValue());
        }
        super.mo13499a(hwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo13500b() {
        int b = super.mo13500b();
        if (this.f7433a != null) {
            b += C2107hw.m10228c(1, this.f7433a.longValue());
        }
        if (this.f7434b != null) {
            b += C2107hw.m10225b(2, this.f7434b);
        }
        if (this.f7438f != null) {
            b += C2107hw.m10223b(3, this.f7438f.intValue());
        }
        if (this.f7435c != null && this.f7435c.length > 0) {
            int i = b;
            for (C1913bf bfVar : this.f7435c) {
                if (bfVar != null) {
                    i += C2107hw.m10224b(4, (C2116ie) bfVar);
                }
            }
            b = i;
        }
        if (this.f7436d != null && this.f7436d.length > 0) {
            int i2 = b;
            for (C1911bd bdVar : this.f7436d) {
                if (bdVar != null) {
                    i2 += C2107hw.m10224b(5, (C2116ie) bdVar);
                }
            }
            b = i2;
        }
        if (this.f7437e != null && this.f7437e.length > 0) {
            for (C1904ax axVar : this.f7437e) {
                if (axVar != null) {
                    b += C2107hw.m10224b(6, (C2116ie) axVar);
                }
            }
        }
        if (this.f7439g != null) {
            b += C2107hw.m10225b(7, this.f7439g);
        }
        if (this.f7440h == null) {
            return b;
        }
        this.f7440h.booleanValue();
        return b + C2107hw.m10222b(8) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2116ie mo13498a(C2106hv hvVar) {
        while (true) {
            int a = hvVar.mo14049a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f7433a = Long.valueOf(hvVar.mo14062e());
            } else if (a == 18) {
                this.f7434b = hvVar.mo14059c();
            } else if (a == 24) {
                this.f7438f = Integer.valueOf(hvVar.mo14060d());
            } else if (a == 34) {
                int a2 = C2119ih.m10286a(hvVar, 34);
                int length = this.f7435c == null ? 0 : this.f7435c.length;
                C1913bf[] bfVarArr = new C1913bf[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f7435c, 0, bfVarArr, 0, length);
                }
                while (length < bfVarArr.length - 1) {
                    bfVarArr[length] = new C1913bf();
                    hvVar.mo14052a((C2116ie) bfVarArr[length]);
                    hvVar.mo14049a();
                    length++;
                }
                bfVarArr[length] = new C1913bf();
                hvVar.mo14052a((C2116ie) bfVarArr[length]);
                this.f7435c = bfVarArr;
            } else if (a == 42) {
                int a3 = C2119ih.m10286a(hvVar, 42);
                int length2 = this.f7436d == null ? 0 : this.f7436d.length;
                C1911bd[] bdVarArr = new C1911bd[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f7436d, 0, bdVarArr, 0, length2);
                }
                while (length2 < bdVarArr.length - 1) {
                    bdVarArr[length2] = new C1911bd();
                    hvVar.mo14052a((C2116ie) bdVarArr[length2]);
                    hvVar.mo14049a();
                    length2++;
                }
                bdVarArr[length2] = new C1911bd();
                hvVar.mo14052a((C2116ie) bdVarArr[length2]);
                this.f7436d = bdVarArr;
            } else if (a == 50) {
                int a4 = C2119ih.m10286a(hvVar, 50);
                int length3 = this.f7437e == null ? 0 : this.f7437e.length;
                C1904ax[] axVarArr = new C1904ax[(a4 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f7437e, 0, axVarArr, 0, length3);
                }
                while (length3 < axVarArr.length - 1) {
                    axVarArr[length3] = new C1904ax();
                    hvVar.mo14052a((C2116ie) axVarArr[length3]);
                    hvVar.mo14049a();
                    length3++;
                }
                axVarArr[length3] = new C1904ax();
                hvVar.mo14052a((C2116ie) axVarArr[length3]);
                this.f7437e = axVarArr;
            } else if (a == 58) {
                this.f7439g = hvVar.mo14059c();
            } else if (a == 64) {
                this.f7440h = Boolean.valueOf(hvVar.mo14056b());
            } else if (!super.mo14082a(hvVar, a)) {
                return this;
            }
        }
    }
}
