package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.gd */
final class C2057gd {

    /* renamed from: a */
    private static final C2057gd f7818a = new C2057gd();

    /* renamed from: b */
    private final C2062gi f7819b = new C2032ff();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C2061gh<?>> f7820c = new ConcurrentHashMap();

    /* renamed from: a */
    public static C2057gd m9772a() {
        return f7818a;
    }

    /* renamed from: a */
    public final <T> C2061gh<T> mo13936a(Class<T> cls) {
        C2010ek.m9562a(cls, "messageType");
        C2061gh<T> ghVar = (C2061gh) this.f7820c.get(cls);
        if (ghVar != null) {
            return ghVar;
        }
        C2061gh<T> a = this.f7819b.mo13902a(cls);
        C2010ek.m9562a(cls, "messageType");
        C2010ek.m9562a(a, "schema");
        C2061gh<T> putIfAbsent = this.f7820c.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: a */
    public final <T> C2061gh<T> mo13937a(T t) {
        return mo13936a(t.getClass());
    }

    private C2057gd() {
    }
}
