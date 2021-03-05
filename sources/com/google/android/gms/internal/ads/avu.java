package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class avu implements Iterator<E> {

    /* renamed from: a */
    private int f2726a = 0;

    /* renamed from: b */
    private final /* synthetic */ avt f2727b;

    avu(avt avt) {
        this.f2727b = avt;
    }

    public final boolean hasNext() {
        return this.f2726a < this.f2727b.f2724a.size() || this.f2727b.f2725b.hasNext();
    }

    public final E next() {
        while (this.f2726a >= this.f2727b.f2724a.size()) {
            this.f2727b.f2724a.add(this.f2727b.f2725b.next());
        }
        List<E> list = this.f2727b.f2724a;
        int i = this.f2726a;
        this.f2726a = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
