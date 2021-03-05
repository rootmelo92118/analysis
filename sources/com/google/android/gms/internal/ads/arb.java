package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class arb<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Map.Entry<K, Object>> f2369a;

    public arb(Iterator<Map.Entry<K, Object>> it) {
        this.f2369a = it;
    }

    public final boolean hasNext() {
        return this.f2369a.hasNext();
    }

    public final void remove() {
        this.f2369a.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f2369a.next();
        return next.getValue() instanceof aqy ? new ara(next) : next;
    }
}
