package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class asz implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f2458a;

    /* renamed from: b */
    private boolean f2459b;

    /* renamed from: c */
    private Iterator<Map.Entry<K, V>> f2460c;

    /* renamed from: d */
    private final /* synthetic */ asr f2461d;

    private asz(asr asr) {
        this.f2461d = asr;
        this.f2458a = -1;
    }

    public final boolean hasNext() {
        if (this.f2458a + 1 < this.f2461d.f2443b.size() || (!this.f2461d.f2444c.isEmpty() && m3842a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f2459b) {
            this.f2459b = false;
            this.f2461d.m3828f();
            if (this.f2458a < this.f2461d.f2443b.size()) {
                asr asr = this.f2461d;
                int i = this.f2458a;
                this.f2458a = i - 1;
                Object unused = asr.m3825c(i);
                return;
            }
            m3842a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m3842a() {
        if (this.f2460c == null) {
            this.f2460c = this.f2461d.f2444c.entrySet().iterator();
        }
        return this.f2460c;
    }

    public final /* synthetic */ Object next() {
        this.f2459b = true;
        int i = this.f2458a + 1;
        this.f2458a = i;
        if (i < this.f2461d.f2443b.size()) {
            return (Map.Entry) this.f2461d.f2443b.get(this.f2458a);
        }
        return (Map.Entry) m3842a().next();
    }

    /* synthetic */ asz(asr asr, ass ass) {
        this(asr);
    }
}
