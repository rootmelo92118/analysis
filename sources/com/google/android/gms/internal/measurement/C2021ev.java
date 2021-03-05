package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ev */
final class C2021ev<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    private Map.Entry<K, C2018es> f7767a;

    private C2021ev(Map.Entry<K, C2018es> entry) {
        this.f7767a = entry;
    }

    public final K getKey() {
        return this.f7767a.getKey();
    }

    public final Object getValue() {
        if (this.f7767a.getValue() == null) {
            return null;
        }
        return C2018es.m9582a();
    }

    /* renamed from: a */
    public final C2018es mo13840a() {
        return this.f7767a.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C2043fq) {
            return this.f7767a.getValue().mo13847a((C2043fq) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
