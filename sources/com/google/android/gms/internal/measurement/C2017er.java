package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.er */
public enum C2017er {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C1958cx.class, C1958cx.class, C1958cx.f7583a),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: k */
    private final Class<?> f7764k;

    /* renamed from: l */
    private final Class<?> f7765l;

    /* renamed from: m */
    private final Object f7766m;

    private C2017er(Class<?> cls, Class<?> cls2, Object obj) {
        this.f7764k = cls;
        this.f7765l = cls2;
        this.f7766m = obj;
    }

    /* renamed from: a */
    public final Class<?> mo13836a() {
        return this.f7765l;
    }
}
