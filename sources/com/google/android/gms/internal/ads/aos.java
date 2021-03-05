package com.google.android.gms.internal.ads;

public final class aos {

    /* renamed from: a */
    private final byte[] f2148a = new byte[256];

    /* renamed from: b */
    private int f2149b;

    /* renamed from: c */
    private int f2150c;

    public aos(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f2148a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.f2148a[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.f2148a[i2];
            this.f2148a[i2] = this.f2148a[b];
            this.f2148a[b] = b2;
        }
        this.f2149b = 0;
        this.f2150c = 0;
    }

    /* renamed from: a */
    public final void mo10752a(byte[] bArr) {
        int i = this.f2149b;
        int i2 = this.f2150c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f2148a[i]) & 255;
            byte b = this.f2148a[i];
            this.f2148a[i] = this.f2148a[i2];
            this.f2148a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f2148a[(this.f2148a[i] + this.f2148a[i2]) & 255]);
        }
        this.f2149b = i;
        this.f2150c = i2;
    }
}
