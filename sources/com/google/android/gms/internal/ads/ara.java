package com.google.android.gms.internal.ads;

import java.util.Map;

final class ara<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    private Map.Entry<K, aqy> f2368a;

    private ara(Map.Entry<K, aqy> entry) {
        this.f2368a = entry;
    }

    public final K getKey() {
        return this.f2368a.getKey();
    }

    public final Object getValue() {
        if (this.f2368a.getValue() == null) {
            return null;
        }
        return aqy.m3518a();
    }

    /* renamed from: a */
    public final aqy mo11043a() {
        return this.f2368a.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof arw) {
            return this.f2368a.getValue().mo11050a((arw) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
