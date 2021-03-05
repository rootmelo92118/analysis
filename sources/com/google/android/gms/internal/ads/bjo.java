package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class bjo {

    /* renamed from: a */
    private final Map<String, String> f4496a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f4497b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo12020a() {
        if (this.f4497b == null) {
            this.f4497b = Collections.unmodifiableMap(new HashMap(this.f4496a));
        }
        return this.f4497b;
    }
}
