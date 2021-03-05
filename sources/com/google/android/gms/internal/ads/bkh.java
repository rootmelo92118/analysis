package com.google.android.gms.internal.ads;

public final class bkh {

    /* renamed from: a */
    public byte[] f4559a;

    /* renamed from: b */
    private int f4560b;

    /* renamed from: c */
    private int f4561c;

    public bkh() {
    }

    public bkh(int i) {
        this.f4559a = new byte[i];
        this.f4561c = i;
    }

    public bkh(byte[] bArr) {
        this.f4559a = bArr;
        this.f4561c = bArr.length;
    }

    /* renamed from: a */
    public final void mo12048a(int i) {
        mo12049a(mo12057e() < i ? new byte[i] : this.f4559a, i);
    }

    /* renamed from: a */
    public final void mo12049a(byte[] bArr, int i) {
        this.f4559a = bArr;
        this.f4561c = i;
        this.f4560b = 0;
    }

    /* renamed from: a */
    public final void mo12047a() {
        this.f4560b = 0;
        this.f4561c = 0;
    }

    /* renamed from: b */
    public final int mo12051b() {
        return this.f4561c - this.f4560b;
    }

    /* renamed from: c */
    public final int mo12053c() {
        return this.f4561c;
    }

    /* renamed from: b */
    public final void mo12052b(int i) {
        bjy.m5689a(i >= 0 && i <= this.f4559a.length);
        this.f4561c = i;
    }

    /* renamed from: d */
    public final int mo12055d() {
        return this.f4560b;
    }

    /* renamed from: e */
    public final int mo12057e() {
        if (this.f4559a == null) {
            return 0;
        }
        return this.f4559a.length;
    }

    /* renamed from: c */
    public final void mo12054c(int i) {
        bjy.m5689a(i >= 0 && i <= this.f4561c);
        this.f4560b = i;
    }

    /* renamed from: d */
    public final void mo12056d(int i) {
        mo12054c(this.f4560b + i);
    }

    /* renamed from: a */
    public final void mo12050a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f4559a, this.f4560b, bArr, i, i2);
        this.f4560b += i2;
    }

    /* renamed from: f */
    public final int mo12059f() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: g */
    public final int mo12060g() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        return ((bArr[i] & 255) << 8) | (bArr2[i2] & 255);
    }

    /* renamed from: h */
    public final int mo12061h() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        return (bArr[i] & 255) | ((bArr2[i2] & 255) << 8);
    }

    /* renamed from: i */
    public final short mo12062i() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        return (short) (((bArr[i] & 255) << 8) | (bArr2[i2] & 255));
    }

    /* renamed from: j */
    public final long mo12063j() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.f4559a;
        int i3 = this.f4560b;
        this.f4560b = i3 + 1;
        long j2 = j | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.f4559a;
        int i4 = this.f4560b;
        this.f4560b = i4 + 1;
        return j2 | (255 & ((long) bArr4[i4]));
    }

    /* renamed from: k */
    public final long mo12064k() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.f4559a;
        int i3 = this.f4560b;
        this.f4560b = i3 + 1;
        long j2 = j | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.f4559a;
        int i4 = this.f4560b;
        this.f4560b = i4 + 1;
        return j2 | ((255 & ((long) bArr4[i4])) << 24);
    }

    /* renamed from: l */
    public final int mo12065l() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr2[i2] & 255) << 16);
        byte[] bArr3 = this.f4559a;
        int i3 = this.f4560b;
        this.f4560b = i3 + 1;
        byte b2 = b | ((bArr3[i3] & 255) << 8);
        byte[] bArr4 = this.f4559a;
        int i4 = this.f4560b;
        this.f4560b = i4 + 1;
        return b2 | (bArr4[i4] & 255);
    }

    /* renamed from: m */
    public final long mo12066m() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.f4559a;
        int i3 = this.f4560b;
        this.f4560b = i3 + 1;
        long j2 = j | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.f4559a;
        int i4 = this.f4560b;
        this.f4560b = i4 + 1;
        long j3 = j2 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.f4559a;
        int i5 = this.f4560b;
        this.f4560b = i5 + 1;
        long j4 = j3 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.f4559a;
        int i6 = this.f4560b;
        this.f4560b = i6 + 1;
        long j5 = j4 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.f4559a;
        int i7 = this.f4560b;
        this.f4560b = i7 + 1;
        long j6 = j5 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.f4559a;
        int i8 = this.f4560b;
        this.f4560b = i8 + 1;
        return j6 | (255 & ((long) bArr8[i8]));
    }

    /* renamed from: n */
    public final int mo12067n() {
        byte[] bArr = this.f4559a;
        int i = this.f4560b;
        this.f4560b = i + 1;
        byte[] bArr2 = this.f4559a;
        int i2 = this.f4560b;
        this.f4560b = i2 + 1;
        byte b = ((bArr[i] & 255) << 8) | (bArr2[i2] & 255);
        this.f4560b += 2;
        return b;
    }

    /* renamed from: o */
    public final int mo12068o() {
        int l = mo12065l();
        if (l >= 0) {
            return l;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(l);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: p */
    public final long mo12069p() {
        long m = mo12066m();
        if (m >= 0) {
            return m;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(m);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final String mo12058e(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f4560b + i) - 1;
        String str = new String(this.f4559a, this.f4560b, (i2 >= this.f4561c || this.f4559a[i2] != 0) ? i : i - 1);
        this.f4560b += i;
        return str;
    }

    /* renamed from: q */
    public final String mo12070q() {
        if (mo12051b() == 0) {
            return null;
        }
        int i = this.f4560b;
        while (i < this.f4561c && this.f4559a[i] != 0) {
            i++;
        }
        String str = new String(this.f4559a, this.f4560b, i - this.f4560b);
        this.f4560b = i;
        if (this.f4560b < this.f4561c) {
            this.f4560b++;
        }
        return str;
    }
}
