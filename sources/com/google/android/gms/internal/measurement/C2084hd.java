package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.hd */
final class C2084hd implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f7861a = this.f7863c.f7860a.listIterator(this.f7862b);

    /* renamed from: b */
    private final /* synthetic */ int f7862b;

    /* renamed from: c */
    private final /* synthetic */ C2083hc f7863c;

    C2084hd(C2083hc hcVar, int i) {
        this.f7863c = hcVar;
        this.f7862b = i;
    }

    public final boolean hasNext() {
        return this.f7861a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f7861a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f7861a.nextIndex();
    }

    public final int previousIndex() {
        return this.f7861a.previousIndex();
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
        return this.f7861a.previous();
    }

    public final /* synthetic */ Object next() {
        return this.f7861a.next();
    }
}
