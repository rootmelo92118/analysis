package org.p063a.p064a.p065a;

import org.p063a.p068b.C2575b;

/* renamed from: org.a.a.a.e */
public class C2558e extends C2561h {
    /* renamed from: a */
    public static void m11918a(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i2 = 16;
        if (iArr3.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr4.length != 16) {
            throw new IllegalArgumentException();
        } else if (i % 2 == 0) {
            int i3 = iArr3[0];
            int i4 = iArr3[1];
            int i5 = iArr3[2];
            int i6 = iArr3[3];
            int i7 = iArr3[4];
            int i8 = iArr3[5];
            int i9 = iArr3[6];
            int i10 = 7;
            int i11 = iArr3[7];
            int i12 = 8;
            int i13 = iArr3[8];
            int i14 = iArr3[9];
            int i15 = iArr3[10];
            int i16 = iArr3[11];
            int i17 = 12;
            int i18 = iArr3[12];
            int i19 = iArr3[13];
            int i20 = iArr3[14];
            int i21 = iArr3[15];
            int i22 = i;
            while (i22 > 0) {
                int i23 = i3 + i7;
                int a = m11942a(i18 ^ i23, i2);
                int i24 = i13 + a;
                int a2 = m11942a(i7 ^ i24, i17);
                int i25 = i23 + a2;
                int a3 = m11942a(a ^ i25, i12);
                int i26 = i24 + a3;
                int a4 = m11942a(a2 ^ i26, i10);
                int i27 = i4 + i8;
                int a5 = m11942a(i19 ^ i27, i2);
                int i28 = i14 + a5;
                int a6 = m11942a(i8 ^ i28, i17);
                int i29 = i27 + a6;
                int a7 = m11942a(a5 ^ i29, i12);
                int i30 = i28 + a7;
                int a8 = m11942a(a6 ^ i30, i10);
                int i31 = i5 + i9;
                int a9 = m11942a(i20 ^ i31, i2);
                int i32 = i15 + a9;
                int a10 = m11942a(i9 ^ i32, i17);
                int i33 = i31 + a10;
                int a11 = m11942a(a9 ^ i33, i12);
                int i34 = i32 + a11;
                int a12 = m11942a(a10 ^ i34, i10);
                int i35 = i6 + i11;
                int a13 = m11942a(i21 ^ i35, 16);
                int i36 = i16 + a13;
                int a14 = m11942a(i11 ^ i36, i17);
                int i37 = i35 + a14;
                int a15 = m11942a(a13 ^ i37, 8);
                int i38 = i36 + a15;
                int a16 = m11942a(a14 ^ i38, 7);
                int i39 = i25 + a8;
                int a17 = m11942a(a15 ^ i39, 16);
                int i40 = i34 + a17;
                int a18 = m11942a(a8 ^ i40, 12);
                i3 = i39 + a18;
                i21 = m11942a(a17 ^ i3, 8);
                i15 = i40 + i21;
                i8 = m11942a(a18 ^ i15, 7);
                int i41 = i29 + a12;
                int a19 = m11942a(a3 ^ i41, 16);
                int i42 = i38 + a19;
                int a20 = m11942a(a12 ^ i42, 12);
                i4 = i41 + a20;
                i18 = m11942a(a19 ^ i4, 8);
                i16 = i42 + i18;
                i9 = m11942a(a20 ^ i16, 7);
                int i43 = i33 + a16;
                int a21 = m11942a(a7 ^ i43, 16);
                int i44 = i26 + a21;
                int a22 = m11942a(a16 ^ i44, 12);
                i5 = i43 + a22;
                i19 = m11942a(a21 ^ i5, 8);
                i13 = i44 + i19;
                i11 = m11942a(a22 ^ i13, 7);
                int i45 = i37 + a4;
                int a23 = m11942a(a11 ^ i45, 16);
                int i46 = i30 + a23;
                int a24 = m11942a(a4 ^ i46, 12);
                i6 = i45 + a24;
                i20 = m11942a(a23 ^ i6, 8);
                i14 = i46 + i20;
                i7 = m11942a(a24 ^ i14, 7);
                i22 -= 2;
                i2 = 16;
                i17 = 12;
                i12 = 8;
                i10 = 7;
            }
            iArr4[0] = i3 + iArr3[0];
            iArr4[1] = i4 + iArr3[1];
            iArr4[2] = i5 + iArr3[2];
            iArr4[3] = i6 + iArr3[3];
            iArr4[4] = i7 + iArr3[4];
            iArr4[5] = i8 + iArr3[5];
            iArr4[6] = i9 + iArr3[6];
            iArr4[7] = i11 + iArr3[7];
            iArr4[8] = i13 + iArr3[8];
            iArr4[9] = i14 + iArr3[9];
            iArr4[10] = i15 + iArr3[10];
            iArr4[11] = i16 + iArr3[11];
            iArr4[12] = i18 + iArr3[12];
            iArr4[13] = i19 + iArr3[13];
            iArr4[14] = i20 + iArr3[14];
            iArr4[15] = i21 + iArr3[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    /* renamed from: a */
    public String mo15781a() {
        return "ChaCha" + this.f9088c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15782a(byte[] bArr) {
        m11918a(this.f9088c, this.f9089d, this.f9090e);
        C2575b.m11979a(this.f9090e, bArr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15783a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 16 || bArr.length == 32) {
                mo15789a(bArr.length, this.f9089d, 0);
                C2575b.m11978a(bArr, 0, this.f9089d, 4, 4);
                C2575b.m11978a(bArr, bArr.length - 16, this.f9089d, 8, 4);
            } else {
                throw new IllegalArgumentException(mo15781a() + " requires 128 bit or 256 bit key");
            }
        }
        C2575b.m11978a(bArr2, 0, this.f9089d, 14, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15785c() {
        int[] iArr = this.f9089d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            int[] iArr2 = this.f9089d;
            iArr2[13] = iArr2[13] + 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15786d() {
        int[] iArr = this.f9089d;
        this.f9089d[13] = 0;
        iArr[12] = 0;
    }
}
