package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.n */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final class C2355n {

    /* renamed from: a */
    private final C2340a<?> f8784a;

    /* renamed from: b */
    private final Set<C2355n> f8785b = new HashSet();

    /* renamed from: c */
    private final Set<C2355n> f8786c = new HashSet();

    C2355n(C2340a<?> aVar) {
        this.f8784a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14944a(C2355n nVar) {
        this.f8785b.add(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14946b(C2355n nVar) {
        this.f8786c.add(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<C2355n> mo14943a() {
        return this.f8785b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14947c(C2355n nVar) {
        this.f8786c.remove(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2340a<?> mo14945b() {
        return this.f8784a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo14948c() {
        return this.f8786c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo14949d() {
        return this.f8785b.isEmpty();
    }
}
