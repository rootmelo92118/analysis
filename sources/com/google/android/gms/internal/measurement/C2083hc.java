package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hc */
public final class C2083hc extends AbstractList<String> implements C2025ez, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2025ez f7860a;

    public C2083hc(C2025ez ezVar) {
        this.f7860a = ezVar;
    }

    /* renamed from: e */
    public final C2025ez mo13853e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo13851b(int i) {
        return this.f7860a.mo13851b(i);
    }

    public final int size() {
        return this.f7860a.size();
    }

    /* renamed from: a */
    public final void mo13850a(C1958cx cxVar) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C2084hd(this, i);
    }

    public final Iterator<String> iterator() {
        return new C2085he(this);
    }

    /* renamed from: d */
    public final List<?> mo13852d() {
        return this.f7860a.mo13852d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f7860a.get(i);
    }
}
