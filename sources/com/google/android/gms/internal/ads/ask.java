package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class ask<E> extends aow<E> {

    /* renamed from: a */
    private static final ask<Object> f2431a;

    /* renamed from: b */
    private final List<E> f2432b;

    /* renamed from: d */
    public static <E> ask<E> m3701d() {
        return f2431a;
    }

    ask() {
        this(new ArrayList(10));
    }

    private ask(List<E> list) {
        this.f2432b = list;
    }

    public final void add(int i, E e) {
        mo10767c();
        this.f2432b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f2432b.get(i);
    }

    public final E remove(int i) {
        mo10767c();
        E remove = this.f2432b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo10767c();
        E e2 = this.f2432b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f2432b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ aqu mo10785a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f2432b);
            return new ask(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        ask<Object> ask = new ask<>();
        f2431a = ask;
        ask.mo10766b();
    }
}
