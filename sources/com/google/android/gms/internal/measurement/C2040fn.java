package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fn */
final class C2040fn {

    /* renamed from: a */
    private static final C2038fl f7791a = m9692c();

    /* renamed from: b */
    private static final C2038fl f7792b = new C2039fm();

    /* renamed from: a */
    static C2038fl m9690a() {
        return f7791a;
    }

    /* renamed from: b */
    static C2038fl m9691b() {
        return f7792b;
    }

    /* renamed from: c */
    private static C2038fl m9692c() {
        try {
            return (C2038fl) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
