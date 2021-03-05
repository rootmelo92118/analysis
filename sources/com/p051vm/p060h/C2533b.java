package com.p051vm.p060h;

/* renamed from: com.vm.h.b */
/* compiled from: Base64 */
public class C2533b {

    /* renamed from: a */
    private static final byte[] f9020a = new byte[128];

    /* renamed from: b */
    private static final char[] f9021b = new char[64];

    /* renamed from: a */
    private static boolean m11860a(char c) {
        return c == ' ' || c == 13 || c == 10 || c == 9;
    }

    /* renamed from: b */
    private static boolean m11862b(char c) {
        return c == '=';
    }

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            f9020a[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            f9020a[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f9020a[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f9020a[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        f9020a[43] = 62;
        f9020a[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            f9021b[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            f9021b[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            f9021b[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        f9021b[62] = '+';
        f9021b[63] = '/';
    }

    /* renamed from: c */
    private static boolean m11863c(char c) {
        return c < 128 && f9020a[c] != -1;
    }

    /* renamed from: a */
    public static byte[] m11861a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int a = m11859a(charArray);
        if (a % 4 != 0) {
            return null;
        }
        int i = a / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(i * 3)];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i - 1) {
            int i5 = i3 + 1;
            char c = charArray[i3];
            if (m11863c(c)) {
                int i6 = i5 + 1;
                char c2 = charArray[i5];
                if (m11863c(c2)) {
                    int i7 = i6 + 1;
                    char c3 = charArray[i6];
                    if (m11863c(c3)) {
                        int i8 = i7 + 1;
                        char c4 = charArray[i7];
                        if (m11863c(c4)) {
                            byte b = f9020a[c];
                            byte b2 = f9020a[c2];
                            byte b3 = f9020a[c3];
                            byte b4 = f9020a[c4];
                            int i9 = i4 + 1;
                            bArr[i4] = (byte) ((b << 2) | (b2 >> 4));
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((b2 & 15) << 4) | ((b3 >> 2) & 15));
                            i4 = i10 + 1;
                            bArr[i10] = (byte) ((b3 << 6) | b4);
                            i2++;
                            i3 = i8;
                        }
                    }
                }
            }
            return null;
        }
        int i11 = i3 + 1;
        char c5 = charArray[i3];
        if (m11863c(c5)) {
            int i12 = i11 + 1;
            char c6 = charArray[i11];
            if (m11863c(c6)) {
                byte b5 = f9020a[c5];
                byte b6 = f9020a[c6];
                int i13 = i12 + 1;
                char c7 = charArray[i12];
                char c8 = charArray[i13];
                if (m11863c(c7) && m11863c(c8)) {
                    byte b7 = f9020a[c7];
                    byte b8 = f9020a[c8];
                    int i14 = i4 + 1;
                    bArr[i4] = (byte) ((b5 << 2) | (b6 >> 4));
                    bArr[i14] = (byte) (((b6 & 15) << 4) | ((b7 >> 2) & 15));
                    bArr[i14 + 1] = (byte) (b8 | (b7 << 6));
                    return bArr;
                } else if (!m11862b(c7) || !m11862b(c8)) {
                    if (m11862b(c7) || !m11862b(c8)) {
                        return null;
                    }
                    byte b9 = f9020a[c7];
                    if ((b9 & 3) != 0) {
                        return null;
                    }
                    int i15 = i2 * 3;
                    byte[] bArr2 = new byte[(i15 + 2)];
                    System.arraycopy(bArr, 0, bArr2, 0, i15);
                    bArr2[i4] = (byte) ((b5 << 2) | (b6 >> 4));
                    bArr2[i4 + 1] = (byte) (((b9 >> 2) & 15) | ((b6 & 15) << 4));
                    return bArr2;
                } else if ((b6 & 15) != 0) {
                    return null;
                } else {
                    int i16 = i2 * 3;
                    byte[] bArr3 = new byte[(i16 + 1)];
                    System.arraycopy(bArr, 0, bArr3, 0, i16);
                    bArr3[i4] = (byte) ((b5 << 2) | (b6 >> 4));
                    return bArr3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static int m11859a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!m11860a(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }
}
