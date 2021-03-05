package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ga */
final class C2054ga {

    /* renamed from: a */
    private static final C2051fy f7816a = m9770c();

    /* renamed from: b */
    private static final C2051fy f7817b = new C2052fz();

    /* renamed from: a */
    static C2051fy m9768a() {
        return f7816a;
    }

    /* renamed from: b */
    static C2051fy m9769b() {
        return f7817b;
    }

    /* renamed from: c */
    private static C2051fy m9770c() {
        try {
            return (C2051fy) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
