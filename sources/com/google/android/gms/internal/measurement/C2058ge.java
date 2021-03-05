package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ge */
final class C2058ge<E> extends C1954ct<E> {

    /* renamed from: a */
    private static final C2058ge<Object> f7821a;

    /* renamed from: b */
    private final List<E> f7822b;

    /* renamed from: d */
    public static <E> C2058ge<E> m9775d() {
        return f7821a;
    }

    C2058ge() {
        this(new ArrayList(10));
    }

    private C2058ge(List<E> list) {
        this.f7822b = list;
    }

    public final void add(int i, E e) {
        mo13579c();
        this.f7822b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f7822b.get(i);
    }

    public final E remove(int i) {
        mo13579c();
        E remove = this.f7822b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo13579c();
        E e2 = this.f7822b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f7822b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ C2014eo mo13588a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f7822b);
            return new C2058ge(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        C2058ge<Object> geVar = new C2058ge<>();
        f7821a = geVar;
        geVar.mo13578b();
    }
}
