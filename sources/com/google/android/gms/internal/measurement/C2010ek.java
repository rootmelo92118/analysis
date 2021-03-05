package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.ek */
public final class C2010ek {

    /* renamed from: a */
    static final Charset f7747a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f7748b;

    /* renamed from: c */
    private static final Charset f7749c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f7750d;

    /* renamed from: e */
    private static final C1971dj f7751e;

    /* renamed from: a */
    public static int m9558a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m9559a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static boolean m9563a(C2043fq fqVar) {
        return false;
    }

    /* renamed from: a */
    static <T> T m9560a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m9562a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m9564a(byte[] bArr) {
        return C2092hh.m10109a(bArr);
    }

    /* renamed from: b */
    public static String m9565b(byte[] bArr) {
        return new String(bArr, f7747a);
    }

    /* renamed from: c */
    public static int m9566c(byte[] bArr) {
        int length = bArr.length;
        int a = m9557a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m9557a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m9561a(Object obj, Object obj2) {
        return ((C2043fq) obj).mo13819j().mo13571a((C2043fq) obj2).mo13827e();
    }

    static {
        byte[] bArr = new byte[0];
        f7748b = bArr;
        f7750d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f7748b;
        f7751e = C1971dj.m9113a(bArr2, 0, bArr2.length, false);
    }
}
