package com.google.android.gms.internal.ads;

public final class bki {

    /* renamed from: a */
    private byte[] f4562a;

    /* renamed from: b */
    private int f4563b;

    /* renamed from: c */
    private int f4564c;

    /* renamed from: d */
    private int f4565d = 0;

    public bki(byte[] bArr, int i, int i2) {
        this.f4562a = bArr;
        this.f4564c = i;
        this.f4563b = i2;
        m5789e();
    }

    /* renamed from: a */
    public final void mo12071a(int i) {
        int i2 = this.f4564c;
        this.f4564c += i / 8;
        this.f4565d += i % 8;
        if (this.f4565d > 7) {
            this.f4564c++;
            this.f4565d -= 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f4564c) {
                m5789e();
                return;
            } else if (m5787c(i2)) {
                this.f4564c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12072a() {
        return mo12074b(1) == 1;
    }

    /* renamed from: b */
    public final int mo12074b(int i) {
        byte b;
        byte b2;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = m5787c(this.f4564c + 1) ? this.f4564c + 2 : this.f4564c + 1;
            if (this.f4565d != 0) {
                b2 = ((this.f4562a[i4] & 255) >>> (8 - this.f4565d)) | ((this.f4562a[this.f4564c] & 255) << this.f4565d);
            } else {
                b2 = this.f4562a[this.f4564c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f4564c = i4;
        }
        if (i > 0) {
            int i5 = this.f4565d + i;
            byte b4 = (byte) (255 >> (8 - i));
            int i6 = m5787c(this.f4564c + 1) ? this.f4564c + 2 : this.f4564c + 1;
            if (i5 > 8) {
                b = (b4 & (((255 & this.f4562a[i6]) >> (16 - i5)) | ((this.f4562a[this.f4564c] & 255) << (i5 - 8)))) | b3;
                this.f4564c = i6;
            } else {
                b = (b4 & ((255 & this.f4562a[this.f4564c]) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.f4564c = i6;
                }
            }
            b3 = b;
            this.f4565d = i5 % 8;
        }
        m5789e();
        return b3;
    }

    /* renamed from: b */
    public final int mo12073b() {
        return m5788d();
    }

    /* renamed from: c */
    public final int mo12075c() {
        int d = m5788d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    /* renamed from: d */
    private final int m5788d() {
        int i = 0;
        int i2 = 0;
        while (!mo12072a()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo12074b(i2);
        }
        return i3 + i;
    }

    /* renamed from: c */
    private final boolean m5787c(int i) {
        return 2 <= i && i < this.f4563b && this.f4562a[i] == 3 && this.f4562a[i + -2] == 0 && this.f4562a[i - 1] == 0;
    }

    /* renamed from: e */
    private final void m5789e() {
        bjy.m5691b(this.f4564c >= 0 && this.f4565d >= 0 && this.f4565d < 8 && (this.f4564c < this.f4563b || (this.f4564c == this.f4563b && this.f4565d == 0)));
    }
}
