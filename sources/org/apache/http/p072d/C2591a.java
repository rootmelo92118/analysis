package org.apache.http.p072d;

/* renamed from: org.apache.http.d.a */
/* compiled from: Args */
public class C2591a {
    /* renamed from: a */
    public static <T> T m12012a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }

    /* renamed from: a */
    public static int m12011a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }
}
