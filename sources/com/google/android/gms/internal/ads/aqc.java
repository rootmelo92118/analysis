package com.google.android.gms.internal.ads;

final class aqc {

    /* renamed from: a */
    private static final aqa<?> f2244a = new aqb();

    /* renamed from: b */
    private static final aqa<?> f2245b = m3408c();

    /* renamed from: c */
    private static aqa<?> m3408c() {
        try {
            return (aqa) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static aqa<?> m3406a() {
        return f2244a;
    }

    /* renamed from: b */
    static aqa<?> m3407b() {
        if (f2245b != null) {
            return f2245b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
