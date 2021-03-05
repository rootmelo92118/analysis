package com.google.android.gms.internal.ads;

final class asg {

    /* renamed from: a */
    private static final ase f2426a = m3695c();

    /* renamed from: b */
    private static final ase f2427b = new asf();

    /* renamed from: a */
    static ase m3693a() {
        return f2426a;
    }

    /* renamed from: b */
    static ase m3694b() {
        return f2427b;
    }

    /* renamed from: c */
    private static ase m3695c() {
        try {
            return (ase) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
