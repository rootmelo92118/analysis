package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gm */
final class C2066gm implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f7838a;

    /* renamed from: b */
    private Iterator<Map.Entry<K, V>> f7839b;

    /* renamed from: c */
    private final /* synthetic */ C2064gk f7840c;

    private C2066gm(C2064gk gkVar) {
        this.f7840c = gkVar;
        this.f7838a = this.f7840c.f7832b.size();
    }

    public final boolean hasNext() {
        return (this.f7838a > 0 && this.f7838a <= this.f7840c.f7832b.size()) || m9908a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m9908a() {
        if (this.f7839b == null) {
            this.f7839b = this.f7840c.f7836f.entrySet().iterator();
        }
        return this.f7839b;
    }

    public final /* synthetic */ Object next() {
        if (m9908a().hasNext()) {
            return (Map.Entry) m9908a().next();
        }
        List b = this.f7840c.f7832b;
        int i = this.f7838a - 1;
        this.f7838a = i;
        return (Map.Entry) b.get(i);
    }

    /* synthetic */ C2066gm(C2064gk gkVar, C2065gl glVar) {
        this(gkVar);
    }
}
