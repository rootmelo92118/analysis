package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class atl implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f2478a = this.f2479b.f2474a.iterator();

    /* renamed from: b */
    private final /* synthetic */ atj f2479b;

    atl(atj atj) {
        this.f2479b = atj;
    }

    public final boolean hasNext() {
        return this.f2478a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return this.f2478a.next();
    }
}
