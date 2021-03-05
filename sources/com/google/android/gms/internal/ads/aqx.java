package com.google.android.gms.internal.ads;

public enum aqx {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(apc.class, apc.class, apc.f2174a),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: k */
    private final Class<?> f2364k;

    /* renamed from: l */
    private final Class<?> f2365l;

    /* renamed from: m */
    private final Object f2366m;

    private aqx(Class<?> cls, Class<?> cls2, Object obj) {
        this.f2364k = cls;
        this.f2365l = cls2;
        this.f2366m = obj;
    }

    /* renamed from: a */
    public final Class<?> mo11039a() {
        return this.f2365l;
    }
}
