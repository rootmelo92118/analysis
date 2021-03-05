package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class aow<E> extends AbstractList<E> implements aqu<E> {

    /* renamed from: a */
    private boolean f2152a = true;

    aow() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        mo10767c();
        return super.add(e);
    }

    public void add(int i, E e) {
        mo10767c();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo10767c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo10767c();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo10767c();
        super.clear();
    }

    /* renamed from: a */
    public boolean mo10761a() {
        return this.f2152a;
    }

    /* renamed from: b */
    public final void mo10766b() {
        this.f2152a = false;
    }

    public E remove(int i) {
        mo10767c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo10767c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo10767c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo10767c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo10767c();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo10767c() {
        if (!this.f2152a) {
            throw new UnsupportedOperationException();
        }
    }
}
