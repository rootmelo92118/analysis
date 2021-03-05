package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.he */
final class C2085he implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f7864a = this.f7865b.f7860a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C2083hc f7865b;

    C2085he(C2083hc hcVar) {
        this.f7865b = hcVar;
    }

    public final boolean hasNext() {
        return this.f7864a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return this.f7864a.next();
    }
}
