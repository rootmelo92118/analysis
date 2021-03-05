package com.google.android.gms.internal.ads;

final class bdc {

    /* renamed from: a */
    private static final long[] f3642a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f3643b = new byte[8];

    /* renamed from: c */
    private int f3644c;

    /* renamed from: d */
    private int f3645d;

    /* renamed from: a */
    public final void mo11716a() {
        this.f3644c = 0;
        this.f3645d = 0;
    }

    /* renamed from: a */
    public final long mo11715a(bci bci, boolean z, boolean z2, int i) {
        if (this.f3644c == 0) {
            if (!bci.mo11672a(this.f3643b, 0, 1, z)) {
                return -1;
            }
            this.f3645d = m5020a(this.f3643b[0] & 255);
            if (this.f3645d != -1) {
                this.f3644c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        if (this.f3645d > i) {
            this.f3644c = 0;
            return -2;
        }
        if (this.f3645d != 1) {
            bci.mo11675b(this.f3643b, 1, this.f3645d - 1);
        }
        this.f3644c = 0;
        return m5021a(this.f3643b, this.f3645d, z2);
    }

    /* renamed from: b */
    public final int mo11717b() {
        return this.f3645d;
    }

    /* renamed from: a */
    public static int m5020a(int i) {
        for (int i2 = 0; i2 < f3642a.length; i2++) {
            if ((f3642a[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static long m5021a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f3642a[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
