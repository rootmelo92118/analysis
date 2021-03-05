package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.measurement.hh */
final class C2092hh {

    /* renamed from: a */
    private static final C2094hj f7890a;

    /* renamed from: a */
    public static boolean m10109a(byte[] bArr) {
        return f7890a.mo14045a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m10111b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m10112b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m10113b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m10110a(byte[] bArr, int i, int i2) {
        return f7890a.mo14045a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m10116d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m10111b(b);
            case 1:
                return m10112b(b, bArr[i]);
            case 2:
                return m10113b((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    static int m10106a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C2096hl(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m10107a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f7890a.mo14043a(charSequence, bArr, i, i2);
    }

    /* renamed from: b */
    static String m10114b(byte[] bArr, int i, int i2) {
        return f7890a.mo14046b(bArr, i, i2);
    }

    /* renamed from: a */
    static void m10108a(CharSequence charSequence, ByteBuffer byteBuffer) {
        C2094hj hjVar = f7890a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m10107a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            hjVar.mo14044a(charSequence, byteBuffer);
        } else {
            C2094hj.m10132b(charSequence, byteBuffer);
        }
    }

    static {
        C2094hj hjVar;
        if (!(C2086hf.m10028a() && C2086hf.m10033b()) || C1955cu.m9065a()) {
            hjVar = new C2095hk();
        } else {
            hjVar = new C2097hm();
        }
        f7890a = hjVar;
    }
}
