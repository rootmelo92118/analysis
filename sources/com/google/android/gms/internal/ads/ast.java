package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ast implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f2449a;

    /* renamed from: b */
    private Iterator<Map.Entry<K, V>> f2450b;

    /* renamed from: c */
    private final /* synthetic */ asr f2451c;

    private ast(asr asr) {
        this.f2451c = asr;
        this.f2449a = this.f2451c.f2443b.size();
    }

    public final boolean hasNext() {
        return (this.f2449a > 0 && this.f2449a <= this.f2451c.f2443b.size()) || m3838a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m3838a() {
        if (this.f2450b == null) {
            this.f2450b = this.f2451c.f2447f.entrySet().iterator();
        }
        return this.f2450b;
    }

    public final /* synthetic */ Object next() {
        if (m3838a().hasNext()) {
            return (Map.Entry) m3838a().next();
        }
        List b = this.f2451c.f2443b;
        int i = this.f2449a - 1;
        this.f2449a = i;
        return (Map.Entry) b.get(i);
    }

    /* synthetic */ ast(asr asr, ass ass) {
        this(asr);
    }
}
