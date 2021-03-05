package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class aqp {

    /* renamed from: a */
    static final Charset f2347a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f2348b;

    /* renamed from: c */
    private static final Charset f2349c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f2350d;

    /* renamed from: e */
    private static final apo f2351e;

    /* renamed from: a */
    public static int m3493a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m3494a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static boolean m3498a(arw arw) {
        return false;
    }

    /* renamed from: a */
    static <T> T m3495a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m3497a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m3499a(byte[] bArr) {
        return atp.m4006a(bArr);
    }

    /* renamed from: b */
    public static String m3500b(byte[] bArr) {
        return new String(bArr, f2347a);
    }

    /* renamed from: c */
    public static int m3501c(byte[] bArr) {
        int length = bArr.length;
        int a = m3492a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m3492a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m3496a(Object obj, Object obj2) {
        return ((arw) obj).mo11021o().mo10759a((arw) obj2).mo11029e();
    }

    static {
        byte[] bArr = new byte[0];
        f2348b = bArr;
        f2350d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f2348b;
        f2351e = apo.m3032a(bArr2, 0, bArr2.length, false);
    }
}
