package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class ars implements arr {
    ars() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo11081a(Object obj) {
        return (arq) obj;
    }

    /* renamed from: f */
    public final arp<?, ?> mo11086f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo11082b(Object obj) {
        return (arq) obj;
    }

    /* renamed from: c */
    public final boolean mo11083c(Object obj) {
        return !((arq) obj).mo11072d();
    }

    /* renamed from: d */
    public final Object mo11084d(Object obj) {
        ((arq) obj).mo11070c();
        return obj;
    }

    /* renamed from: e */
    public final Object mo11085e(Object obj) {
        return arq.m3569a().mo11069b();
    }

    /* renamed from: a */
    public final Object mo11080a(Object obj, Object obj2) {
        arq arq = (arq) obj;
        arq arq2 = (arq) obj2;
        if (!arq2.isEmpty()) {
            if (!arq.mo11072d()) {
                arq = arq.mo11069b();
            }
            arq.mo11068a(arq2);
        }
        return arq;
    }

    /* renamed from: a */
    public final int mo11079a(int i, Object obj, Object obj2) {
        arq arq = (arq) obj;
        if (arq.isEmpty()) {
            return 0;
        }
        Iterator it = arq.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
