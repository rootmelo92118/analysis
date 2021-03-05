package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gs */
final class C2072gs implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f7847a;

    /* renamed from: b */
    private boolean f7848b;

    /* renamed from: c */
    private Iterator<Map.Entry<K, V>> f7849c;

    /* renamed from: d */
    private final /* synthetic */ C2064gk f7850d;

    private C2072gs(C2064gk gkVar) {
        this.f7850d = gkVar;
        this.f7847a = -1;
    }

    public final boolean hasNext() {
        if (this.f7847a + 1 < this.f7850d.f7832b.size() || (!this.f7850d.f7833c.isEmpty() && m9912a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f7848b) {
            this.f7848b = false;
            this.f7850d.m9898f();
            if (this.f7847a < this.f7850d.f7832b.size()) {
                C2064gk gkVar = this.f7850d;
                int i = this.f7847a;
                this.f7847a = i - 1;
                Object unused = gkVar.m9895c(i);
                return;
            }
            m9912a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m9912a() {
        if (this.f7849c == null) {
            this.f7849c = this.f7850d.f7833c.entrySet().iterator();
        }
        return this.f7849c;
    }

    public final /* synthetic */ Object next() {
        this.f7848b = true;
        int i = this.f7847a + 1;
        this.f7847a = i;
        if (i < this.f7850d.f7832b.size()) {
            return (Map.Entry) this.f7850d.f7832b.get(this.f7847a);
        }
        return (Map.Entry) m9912a().next();
    }

    /* synthetic */ C2072gs(C2064gk gkVar, C2065gl glVar) {
        this(gkVar);
    }
}
