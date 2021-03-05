package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ew */
final class C2022ew<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Map.Entry<K, Object>> f7768a;

    public C2022ew(Iterator<Map.Entry<K, Object>> it) {
        this.f7768a = it;
    }

    public final boolean hasNext() {
        return this.f7768a.hasNext();
    }

    public final void remove() {
        this.f7768a.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f7768a.next();
        return next.getValue() instanceof C2018es ? new C2021ev(next) : next;
    }
}
