package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bph;

public final class bpy extends aug<bpy> {

    /* renamed from: a */
    public String f5047a = null;

    /* renamed from: b */
    private bph.C1146a[] f5048b = new bph.C1146a[0];

    /* renamed from: c */
    private bpo f5049c = null;

    /* renamed from: d */
    private bpo f5050d = null;

    /* renamed from: e */
    private bpo f5051e = null;

    public bpy() {
        this.f2569Z = null;
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f5047a != null) {
            aue.mo11274a(1, this.f5047a);
        }
        if (this.f5048b != null && this.f5048b.length > 0) {
            for (bph.C1146a aVar : this.f5048b) {
                if (aVar != null) {
                    aue.mo11272a(2, (arw) aVar);
                }
            }
        }
        if (!(this.f5049c == null || this.f5049c == null)) {
            aue.mo11270a(3, this.f5049c.mo10648a());
        }
        if (!(this.f5050d == null || this.f5050d == null)) {
            aue.mo11270a(4, this.f5050d.mo10648a());
        }
        if (!(this.f5051e == null || this.f5051e == null)) {
            aue.mo11270a(5, this.f5051e.mo10648a());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f5047a != null) {
            a += aue.m4145b(1, this.f5047a);
        }
        if (this.f5048b != null && this.f5048b.length > 0) {
            for (bph.C1146a aVar : this.f5048b) {
                if (aVar != null) {
                    a += apt.m3165c(2, (arw) aVar);
                }
            }
        }
        if (!(this.f5049c == null || this.f5049c == null)) {
            a += aue.m4143b(3, this.f5049c.mo10648a());
        }
        if (!(this.f5050d == null || this.f5050d == null)) {
            a += aue.m4143b(4, this.f5050d.mo10648a());
        }
        return (this.f5051e == null || this.f5051e == null) ? a : a + aue.m4143b(5, this.f5051e.mo10648a());
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f5047a = aud.mo11262e();
            } else if (a == 18) {
                int a2 = auq.m4197a(aud, 18);
                int length = this.f5048b == null ? 0 : this.f5048b.length;
                bph.C1146a[] aVarArr = new bph.C1146a[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f5048b, 0, aVarArr, 0, length);
                }
                while (length < aVarArr.length - 1) {
                    aVarArr[length] = (bph.C1146a) aud.mo11251a(bph.C1146a.m6134a());
                    aud.mo11250a();
                    length++;
                }
                aVarArr[length] = (bph.C1146a) aud.mo11251a(bph.C1146a.m6134a());
                this.f5048b = aVarArr;
            } else if (a == 24) {
                int j = aud.mo11268j();
                int g = aud.mo11265g();
                if (g != 1000) {
                    switch (g) {
                        case 0:
                        case 1:
                            break;
                        default:
                            aud.mo11263e(j);
                            mo11281a(aud, a);
                            continue;
                    }
                }
                this.f5049c = bpo.m6214a(g);
            } else if (a == 32) {
                int j2 = aud.mo11268j();
                int g2 = aud.mo11265g();
                if (g2 != 1000) {
                    switch (g2) {
                        case 0:
                        case 1:
                            break;
                        default:
                            aud.mo11263e(j2);
                            mo11281a(aud, a);
                            continue;
                    }
                }
                this.f5050d = bpo.m6214a(g2);
            } else if (a == 40) {
                int j3 = aud.mo11268j();
                int g3 = aud.mo11265g();
                if (g3 != 1000) {
                    switch (g3) {
                        case 0:
                        case 1:
                            break;
                        default:
                            aud.mo11263e(j3);
                            mo11281a(aud, a);
                            continue;
                    }
                }
                this.f5051e = bpo.m6214a(g3);
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
