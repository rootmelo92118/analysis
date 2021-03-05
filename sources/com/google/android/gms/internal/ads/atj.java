package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class atj extends AbstractList<String> implements are, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final are f2474a;

    public atj(are are) {
        this.f2474a = are;
    }

    /* renamed from: e */
    public final are mo11056e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo11054b(int i) {
        return this.f2474a.mo11054b(i);
    }

    public final int size() {
        return this.f2474a.size();
    }

    /* renamed from: a */
    public final void mo11053a(apc apc) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new atk(this, i);
    }

    public final Iterator<String> iterator() {
        return new atl(this);
    }

    /* renamed from: d */
    public final List<?> mo11055d() {
        return this.f2474a.mo11055d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f2474a.get(i);
    }
}
