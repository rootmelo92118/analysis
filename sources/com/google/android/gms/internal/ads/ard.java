package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class ard extends aow<String> implements are, RandomAccess {

    /* renamed from: a */
    private static final ard f2374a;

    /* renamed from: b */
    private static final are f2375b = f2374a;

    /* renamed from: c */
    private final List<Object> f2376c;

    public ard() {
        this(10);
    }

    public ard(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private ard(ArrayList<Object> arrayList) {
        this.f2376c = arrayList;
    }

    public final int size() {
        return this.f2376c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo10767c();
        if (collection instanceof are) {
            collection = ((are) collection).mo11055d();
        }
        boolean addAll = this.f2376c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo10767c();
        this.f2376c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo11053a(apc apc) {
        mo10767c();
        this.f2376c.add(apc);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo11054b(int i) {
        return this.f2376c.get(i);
    }

    /* renamed from: a */
    private static String m3524a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof apc) {
            return ((apc) obj).mo10799c();
        }
        return aqp.m3500b((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo11055d() {
        return Collections.unmodifiableList(this.f2376c);
    }

    /* renamed from: e */
    public final are mo11056e() {
        return mo10761a() ? new atj(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo10767c();
        return m3524a(this.f2376c.set(i, (String) obj));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        mo10767c();
        Object remove = this.f2376c.remove(i);
        this.modCount++;
        return m3524a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo10761a() {
        return super.mo10761a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo10767c();
        this.f2376c.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ aqu mo10785a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f2376c);
            return new ard((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f2376c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof apc) {
            apc apc = (apc) obj;
            String c = apc.mo10799c();
            if (apc.mo10800d()) {
                this.f2376c.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        String b = aqp.m3500b(bArr);
        if (aqp.m3499a(bArr)) {
            this.f2376c.set(i, b);
        }
        return b;
    }

    static {
        ard ard = new ard();
        f2374a = ard;
        ard.mo10766b();
    }
}
