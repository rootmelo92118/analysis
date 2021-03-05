package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class axy extends asl<Integer, Long> {

    /* renamed from: a */
    public Long f3084a;

    /* renamed from: b */
    public Long f3085b;

    /* renamed from: c */
    public Long f3086c;

    public axy() {
    }

    public axy(String str) {
        mo11117a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11117a(String str) {
        HashMap b = m3703b(str);
        if (b != null) {
            this.f3084a = (Long) b.get(0);
            this.f3085b = (Long) b.get(1);
            this.f3086c = (Long) b.get(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo11116a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f3084a);
        hashMap.put(1, this.f3085b);
        hashMap.put(2, this.f3086c);
        return hashMap;
    }
}
