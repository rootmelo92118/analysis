package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class atk implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f2475a = this.f2477c.f2474a.listIterator(this.f2476b);

    /* renamed from: b */
    private final /* synthetic */ int f2476b;

    /* renamed from: c */
    private final /* synthetic */ atj f2477c;

    atk(atj atj, int i) {
        this.f2477c = atj;
        this.f2476b = i;
    }

    public final boolean hasNext() {
        return this.f2475a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f2475a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f2475a.nextIndex();
    }

    public final int previousIndex() {
        return this.f2475a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return this.f2475a.previous();
    }

    public final /* synthetic */ Object next() {
        return this.f2475a.next();
    }
}
