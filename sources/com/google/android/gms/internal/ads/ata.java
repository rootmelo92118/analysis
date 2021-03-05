package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class ata extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ asr f2465a;

    private ata(asr asr) {
        this.f2465a = asr;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new asz(this.f2465a, (ass) null);
    }

    public int size() {
        return this.f2465a.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f2465a.get(entry.getKey());
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
        this.f2465a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f2465a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f2465a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ ata(asr asr, ass ass) {
        this(asr);
    }
}
