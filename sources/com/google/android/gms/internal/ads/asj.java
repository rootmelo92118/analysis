package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class asj {

    /* renamed from: a */
    private static final asj f2428a = new asj();

    /* renamed from: b */
    private final asp f2429b;

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, aso<?>> f2430c = new ConcurrentHashMap();

    /* renamed from: a */
    public static asj m3697a() {
        return f2428a;
    }

    /* renamed from: a */
    public final <T> aso<T> mo11112a(Class<T> cls) {
        aqp.m3497a(cls, "messageType");
        aso<T> aso = (aso) this.f2430c.get(cls);
        if (aso != null) {
            return aso;
        }
        aso<T> a = this.f2429b.mo11067a(cls);
        aqp.m3497a(cls, "messageType");
        aqp.m3497a(a, "schema");
        aso<T> putIfAbsent = this.f2430c.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: a */
    public final <T> aso<T> mo11113a(T t) {
        return mo11112a(t.getClass());
    }

    private asj() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        asp asp = null;
        for (int i = 0; i <= 0; i++) {
            asp = m3698a(strArr[0]);
            if (asp != null) {
                break;
            }
        }
        this.f2429b = asp == null ? new arl() : asp;
    }

    /* renamed from: a */
    private static asp m3698a(String str) {
        try {
            return (asp) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
