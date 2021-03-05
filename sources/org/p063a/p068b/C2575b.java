package org.p063a.p068b;

/* renamed from: org.a.b.b */
public abstract class C2575b {
    /* renamed from: a */
    public static int m11976a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: a */
    public static void m11977a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: a */
    public static void m11978a(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = m11976a(bArr, i);
            i += 4;
        }
    }

    /* renamed from: a */
    public static void m11979a(int[] iArr, byte[] bArr, int i) {
        for (int a : iArr) {
            m11977a(a, bArr, i);
            i += 4;
        }
    }

    /* renamed from: a */
    public static int[] m11980a(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = m11976a(bArr, i);
            i += 4;
        }
        return iArr;
    }
}
