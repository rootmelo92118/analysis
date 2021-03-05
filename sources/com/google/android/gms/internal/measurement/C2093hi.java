package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hi */
final class C2093hi {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m10128d(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m10129e(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m10130f(byte b) {
        return b < -16;
    }

    /* renamed from: g */
    private static boolean m10131g(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10125b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10124b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m10131g(b2)) {
            throw C2015ep.m9579h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10123b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m10131g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m10131g(b3)))) {
            throw C2015ep.m9579h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10122b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m10131g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m10131g(b3) || m10131g(b4)) {
            throw C2015ep.m9579h();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
