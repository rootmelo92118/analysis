package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ct */
abstract class C1954ct<E> extends AbstractList<E> implements C2014eo<E> {

    /* renamed from: a */
    private boolean f7577a = true;

    C1954ct() {
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
        mo13579c();
        return super.add(e);
    }

    public void add(int i, E e) {
        mo13579c();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo13579c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo13579c();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo13579c();
        super.clear();
    }

    /* renamed from: a */
    public boolean mo13573a() {
        return this.f7577a;
    }

    /* renamed from: b */
    public final void mo13578b() {
        this.f7577a = false;
    }

    public E remove(int i) {
        mo13579c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo13579c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo13579c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo13579c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo13579c();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo13579c() {
        if (!this.f7577a) {
            throw new UnsupportedOperationException();
        }
    }
}
