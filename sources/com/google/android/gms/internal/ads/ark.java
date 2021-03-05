package com.google.android.gms.internal.ads;

public final class ark extends aug<ark> {

    /* renamed from: a */
    public byte[][] f2383a = auq.f2593d;

    /* renamed from: b */
    public byte[] f2384b = null;

    /* renamed from: c */
    public Integer f2385c;

    /* renamed from: d */
    private Integer f2386d;

    public ark() {
        this.f2582aa = -1;
    }

    /* renamed from: a */
    public final void mo10484a(aue aue) {
        if (this.f2383a != null && this.f2383a.length > 0) {
            for (byte[] bArr : this.f2383a) {
                if (bArr != null) {
                    aue.mo11276a(1, bArr);
                }
            }
        }
        if (this.f2384b != null) {
            aue.mo11276a(2, this.f2384b);
        }
        if (this.f2386d != null) {
            aue.mo11270a(3, this.f2386d.intValue());
        }
        if (this.f2385c != null) {
            aue.mo11270a(4, this.f2385c.intValue());
        }
        super.mo10484a(aue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10482a() {
        int a = super.mo10482a();
        if (this.f2383a != null && this.f2383a.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.f2383a) {
                if (bArr != null) {
                    i2++;
                    i += aue.m4147b(bArr);
                }
            }
            a = a + i + (i2 * 1);
        }
        if (this.f2384b != null) {
            a += aue.m4146b(2, this.f2384b);
        }
        if (this.f2386d != null) {
            a += aue.m4143b(3, this.f2386d.intValue());
        }
        return this.f2385c != null ? a + aue.m4143b(4, this.f2385c.intValue()) : a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ark mo10483a(aud aud) {
        while (true) {
            int a = aud.mo11250a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = auq.m4197a(aud, 10);
                int length = this.f2383a == null ? 0 : this.f2383a.length;
                byte[][] bArr = new byte[(a2 + length)][];
                if (length != 0) {
                    System.arraycopy(this.f2383a, 0, bArr, 0, length);
                }
                while (length < bArr.length - 1) {
                    bArr[length] = aud.mo11264f();
                    aud.mo11250a();
                    length++;
                }
                bArr[length] = aud.mo11264f();
                this.f2383a = bArr;
            } else if (a == 18) {
                this.f2384b = aud.mo11264f();
            } else if (a == 24) {
                int j = aud.mo11268j();
                try {
                    this.f2386d = Integer.valueOf(ajc.m2397b(aud.mo11265g()));
                } catch (IllegalArgumentException unused) {
                    aud.mo11263e(j);
                    mo11281a(aud, a);
                }
            } else if (a == 32) {
                int j2 = aud.mo11268j();
                try {
                    this.f2385c = Integer.valueOf(ajc.m2398c(aud.mo11265g()));
                } catch (IllegalArgumentException unused2) {
                    aud.mo11263e(j2);
                    mo11281a(aud, a);
                }
            } else if (!super.mo11281a(aud, a)) {
                return this;
            }
        }
    }
}
