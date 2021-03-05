package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class avt<E> extends AbstractList<E> {

    /* renamed from: c */
    private static final avv f2723c = avv.m4301a(avt.class);

    /* renamed from: a */
    List<E> f2724a;

    /* renamed from: b */
    Iterator<E> f2725b;

    public avt(List<E> list, Iterator<E> it) {
        this.f2724a = list;
        this.f2725b = it;
    }

    public E get(int i) {
        if (this.f2724a.size() > i) {
            return this.f2724a.get(i);
        }
        if (this.f2725b.hasNext()) {
            this.f2724a.add(this.f2725b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new avu(this);
    }

    public int size() {
        f2723c.mo11314a("potentially expensive size() call");
        f2723c.mo11314a("blowup running");
        while (this.f2725b.hasNext()) {
            this.f2724a.add(this.f2725b.next());
        }
        return this.f2724a.size();
    }
}
