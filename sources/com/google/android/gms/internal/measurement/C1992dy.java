package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dy */
final class C1992dy {

    /* renamed from: a */
    private static final C1990dw<?> f7645a = new C1991dx();

    /* renamed from: b */
    private static final C1990dw<?> f7646b = m9481c();

    /* renamed from: c */
    private static C1990dw<?> m9481c() {
        try {
            return (C1990dw) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C1990dw<?> m9479a() {
        return f7645a;
    }

    /* renamed from: b */
    static C1990dw<?> m9480b() {
        if (f7646b != null) {
            return f7646b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
