package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class axo extends asl<Integer, Object> {

    /* renamed from: a */
    public Long f3040a;

    /* renamed from: b */
    public Boolean f3041b;

    /* renamed from: c */
    public Boolean f3042c;

    public axo() {
    }

    public axo(String str) {
        mo11117a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11117a(String str) {
        HashMap b = m3703b(str);
        if (b != null) {
            this.f3040a = (Long) b.get(0);
            this.f3041b = (Boolean) b.get(1);
            this.f3042c = (Boolean) b.get(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo11116a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f3040a);
        hashMap.put(1, this.f3041b);
        hashMap.put(2, this.f3042c);
        return hashMap;
    }
}
