package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.e */
final class C2251e implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f8400a = this.f8401b.f8648a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzad f8401b;

    C2251e(zzad zzad) {
        this.f8401b = zzad;
    }

    public final boolean hasNext() {
        return this.f8400a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return this.f8400a.next();
    }
}
