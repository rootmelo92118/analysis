package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gt */
class C2073gt extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C2064gk f7851a;

    private C2073gt(C2064gk gkVar) {
        this.f7851a = gkVar;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C2072gs(this.f7851a, (C2065gl) null);
    }

    public int size() {
        return this.f7851a.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f7851a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f7851a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f7851a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f7851a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ C2073gt(C2064gk gkVar, C2065gl glVar) {
        this(gkVar);
    }
}
