package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ey */
public final class C2024ey extends C1954ct<String> implements C2025ez, RandomAccess {

    /* renamed from: a */
    private static final C2024ey f7773a;

    /* renamed from: b */
    private static final C2025ez f7774b = f7773a;

    /* renamed from: c */
    private final List<Object> f7775c;

    public C2024ey() {
        this(10);
    }

    public C2024ey(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C2024ey(ArrayList<Object> arrayList) {
        this.f7775c = arrayList;
    }

    public final int size() {
        return this.f7775c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo13579c();
        if (collection instanceof C2025ez) {
            collection = ((C2025ez) collection).mo13852d();
        }
        boolean addAll = this.f7775c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo13579c();
        this.f7775c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo13850a(C1958cx cxVar) {
        mo13579c();
        this.f7775c.add(cxVar);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo13851b(int i) {
        return this.f7775c.get(i);
    }

    /* renamed from: a */
    private static String m9589a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C1958cx) {
            return ((C1958cx) obj).mo13601b();
        }
        return C2010ek.m9565b((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo13852d() {
        return Collections.unmodifiableList(this.f7775c);
    }

    /* renamed from: e */
    public final C2025ez mo13853e() {
        return mo13573a() ? new C2083hc(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo13579c();
        return m9589a(this.f7775c.set(i, (String) obj));
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
        mo13579c();
        Object remove = this.f7775c.remove(i);
        this.modCount++;
        return m9589a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13573a() {
        return super.mo13573a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo13579c();
        this.f7775c.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C2014eo mo13588a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f7775c);
            return new C2024ey((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f7775c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C1958cx) {
            C1958cx cxVar = (C1958cx) obj;
            String b = cxVar.mo13601b();
            if (cxVar.mo13602c()) {
                this.f7775c.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = C2010ek.m9565b(bArr);
        if (C2010ek.m9564a(bArr)) {
            this.f7775c.set(i, b2);
        }
        return b2;
    }

    static {
        C2024ey eyVar = new C2024ey();
        f7773a = eyVar;
        eyVar.mo13578b();
    }
}
