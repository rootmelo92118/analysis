package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class azb<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f3155a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo11427a(String str) {
        synchronized (this) {
            if (!this.f3155a.containsKey(str)) {
                this.f3155a.put(str, new AtomicReference());
            }
        }
        return this.f3155a.get(str);
    }
}
