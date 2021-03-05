package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cu */
final class C1955cu {

    /* renamed from: a */
    private static final Class<?> f7578a = m9064a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f7579b = (m9064a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m9065a() {
        return f7578a != null && !f7579b;
    }

    /* renamed from: b */
    static Class<?> m9066b() {
        return f7578a;
    }

    /* renamed from: a */
    private static <T> Class<T> m9064a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
