package com.google.android.gms.internal.ads;

final class aox {

    /* renamed from: a */
    private static final Class<?> f2153a = m2952a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f2154b = (m2952a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m2953a() {
        return f2153a != null && !f2154b;
    }

    /* renamed from: b */
    static Class<?> m2954b() {
        return f2153a;
    }

    /* renamed from: a */
    private static <T> Class<T> m2952a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
