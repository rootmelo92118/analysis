package com.google.android.gms.internal.ads;

public final class bkg {

    /* renamed from: a */
    private byte[] f4555a;

    /* renamed from: b */
    private int f4556b;

    /* renamed from: c */
    private int f4557c;

    /* renamed from: d */
    private int f4558d;

    public bkg() {
    }

    public bkg(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private bkg(byte[] bArr, int i) {
        this.f4555a = bArr;
        this.f4558d = i;
    }

    /* renamed from: a */
    public final int mo12046a(int i) {
        byte b;
        byte b2;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        int i3 = i;
        byte b3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.f4557c != 0) {
                b2 = ((this.f4555a[this.f4556b + 1] & 255) >>> (8 - this.f4557c)) | ((this.f4555a[this.f4556b] & 255) << this.f4557c);
            } else {
                b2 = this.f4555a[this.f4556b];
            }
            i3 -= 8;
            b3 |= (255 & b2) << i3;
            this.f4556b++;
        }
        if (i3 > 0) {
            int i5 = this.f4557c + i3;
            byte b4 = (byte) (255 >> (8 - i3));
            if (i5 > 8) {
                b = (b4 & (((this.f4555a[this.f4556b] & 255) << (i5 - 8)) | ((255 & this.f4555a[this.f4556b + 1]) >> (16 - i5)))) | b3;
                this.f4556b++;
            } else {
                b = (b4 & ((this.f4555a[this.f4556b] & 255) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.f4556b++;
                }
            }
            b3 = b;
            this.f4557c = i5 % 8;
        }
        if (this.f4556b >= 0 && this.f4557c >= 0 && this.f4557c < 8 && (this.f4556b < this.f4558d || (this.f4556b == this.f4558d && this.f4557c == 0))) {
            z = true;
        }
        bjy.m5691b(z);
        return b3;
    }
}
