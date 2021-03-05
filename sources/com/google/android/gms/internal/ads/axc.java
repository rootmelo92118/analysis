package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class axc extends asl<Integer, Long> {

    /* renamed from: a */
    public long f3019a;

    /* renamed from: b */
    public long f3020b;

    public axc() {
        this.f3019a = -1;
        this.f3020b = -1;
    }

    public axc(String str) {
        this();
        mo11117a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo11116a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f3019a));
        hashMap.put(1, Long.valueOf(this.f3020b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11117a(String str) {
        HashMap b = m3703b(str);
        if (b != null) {
            this.f3019a = ((Long) b.get(0)).longValue();
            this.f3020b = ((Long) b.get(1)).longValue();
        }
    }
}
