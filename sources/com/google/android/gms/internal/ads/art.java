package com.google.android.gms.internal.ads;

final class art {

    /* renamed from: a */
    private static final arr f2396a = m3593c();

    /* renamed from: b */
    private static final arr f2397b = new ars();

    /* renamed from: a */
    static arr m3591a() {
        return f2396a;
    }

    /* renamed from: b */
    static arr m3592b() {
        return f2397b;
    }

    /* renamed from: c */
    private static arr m3593c() {
        try {
            return (arr) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
