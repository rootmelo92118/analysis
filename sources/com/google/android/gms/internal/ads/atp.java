package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class atp {

    /* renamed from: a */
    private static final atr f2504a;

    /* renamed from: a */
    public static boolean m4006a(byte[] bArr) {
        return f2504a.mo11228a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m4008b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m4009b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m4010b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m4007a(byte[] bArr, int i, int i2) {
        return f2504a.mo11228a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m4013d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m4008b(b);
            case 1:
                return m4009b(b, bArr[i]);
            case 2:
                return m4010b((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    static int m4003a(CharSequence charSequence) {
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
                                throw new att(i2, length2);
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
    static int m4004a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f2504a.mo11226a(charSequence, bArr, i, i2);
    }

    /* renamed from: b */
    static String m4011b(byte[] bArr, int i, int i2) {
        return f2504a.mo11229b(bArr, i, i2);
    }

    /* renamed from: a */
    static void m4005a(CharSequence charSequence, ByteBuffer byteBuffer) {
        atr atr = f2504a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m4004a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            atr.mo11227a(charSequence, byteBuffer);
        } else {
            atr.m4029b(charSequence, byteBuffer);
        }
    }

    static {
        atr atr;
        if (!(atn.m3926a() && atn.m3931b()) || aox.m2953a()) {
            atr = new ats();
        } else {
            atr = new atu();
        }
        f2504a = atr;
    }
}
