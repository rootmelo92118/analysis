package com.google.android.gms.internal.ads;

public final class ang extends aug<ang> {

    /* renamed from: a */
    private Long f2076a = null;

    /* renamed from: b */
    private Integer f2077b = null;

    /* renamed from: c */
    private Boolean f2078c = null;

    /* renamed from: d */
    private int[] f2079d = auq.f2590a;

    /* renamed from: e */
    private Long f2080e = null;

    public ang() {
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2076a != null) {
            aue.mo11277b(1, this.f2076a.longValue());
        }
        if (this.f2077b != null) {
            aue.mo11270a(2, this.f2077b.intValue());
        }
        if (this.f2078c != null) {
            aue.mo11275a(3, this.f2078c.booleanValue());
        }
        if (this.f2079d != null && this.f2079d.length > 0) {
            for (int a : this.f2079d) {
                aue.mo11270a(4, a);
            }
        }
        if (this.f2080e != null) {
            aue.mo11271a(5, this.f2080e.longValue());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2076a != null) {
            a += aue.m4151d(1, this.f2076a.longValue());
        }
        if (this.f2077b != null) {
            a += aue.m4143b(2, this.f2077b.intValue());
        }
        if (this.f2078c != null) {
            this.f2078c.booleanValue();
            a += aue.m4142b(3) + 1;
        }
        if (this.f2079d != null && this.f2079d.length > 0) {
            int i = 0;
            for (int a2 : this.f2079d) {
                i += aue.m4135a(a2);
            }
            a = a + i + (this.f2079d.length * 1);
        }
        return this.f2080e != null ? a + aue.m4149c(5, this.f2080e.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aum mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f2076a = Long.valueOf(aud.mo11266h());
            } else if (a == 16) {
                this.f2077b = Integer.valueOf(aud.mo11265g());
            } else if (a == 24) {
                this.f2078c = Boolean.valueOf(aud.mo11261d());
            } else if (a == 32) {
                int a2 = auq.m4197a(aud, 32);
                int length = this.f2079d == null ? 0 : this.f2079d.length;
                int[] iArr = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f2079d, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = aud.mo11265g();
                    aud.mo11250a();
                    length++;
                }
                iArr[length] = aud.mo11265g();
                this.f2079d = iArr;
            } else if (a == 34) {
                int c = aud.mo11259c(aud.mo11265g());
                int j = aud.mo11268j();
                int i = 0;
                while (aud.mo11267i() > 0) {
                    aud.mo11265g();
                    i++;
                }
                aud.mo11263e(j);
                int length2 = this.f2079d == null ? 0 : this.f2079d.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f2079d, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = aud.mo11265g();
                    length2++;
                }
                this.f2079d = iArr2;
                aud.mo11260d(c);
            } else if (a == 40) {
                this.f2080e = Long.valueOf(aud.mo11266h());
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
