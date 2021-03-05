package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class axp extends asl<Integer, Long> {

    /* renamed from: a */
    public Long f3043a;

    /* renamed from: b */
    public Long f3044b;

    public axp() {
    }

    public axp(String str) {
        mo11117a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11117a(String str) {
        HashMap b = m3703b(str);
        if (b != null) {
            this.f3043a = (Long) b.get(0);
            this.f3044b = (Long) b.get(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo11116a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f3043a);
        hashMap.put(1, this.f3044b);
        return hashMap;
    }
}
