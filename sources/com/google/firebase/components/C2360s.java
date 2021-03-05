package com.google.firebase.components;

import com.google.firebase.p047a.C2330c;
import com.google.firebase.p048b.C2338a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.s */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final class C2360s extends C2350i {

    /* renamed from: a */
    private final Set<Class<?>> f8797a;

    /* renamed from: b */
    private final Set<Class<?>> f8798b;

    /* renamed from: c */
    private final Set<Class<?>> f8799c;

    /* renamed from: d */
    private final C2343b f8800d;

    C2360s(C2340a<?> aVar, C2343b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C2346e next : aVar.mo14921b()) {
            if (next.mo14937c()) {
                hashSet.add(next.mo14935a());
            } else {
                hashSet2.add(next.mo14935a());
            }
        }
        if (!aVar.mo14923d().isEmpty()) {
            hashSet.add(C2330c.class);
        }
        this.f8797a = Collections.unmodifiableSet(hashSet);
        this.f8798b = Collections.unmodifiableSet(hashSet2);
        this.f8799c = aVar.mo14923d();
        this.f8800d = bVar;
    }

    /* renamed from: a */
    public final <T> T mo14933a(Class<T> cls) {
        if (this.f8797a.contains(cls)) {
            T a = this.f8800d.mo14933a(cls);
            if (!cls.equals(C2330c.class)) {
                return a;
            }
            return new C2361a(this.f8799c, (C2330c) a);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
    }

    /* renamed from: b */
    public final <T> C2338a<T> mo14934b(Class<T> cls) {
        if (this.f8798b.contains(cls)) {
            return this.f8800d.mo14934b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }

    /* renamed from: com.google.firebase.components.s$a */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C2361a implements C2330c {

        /* renamed from: a */
        private final Set<Class<?>> f8801a;

        /* renamed from: b */
        private final C2330c f8802b;

        public C2361a(Set<Class<?>> set, C2330c cVar) {
            this.f8801a = set;
            this.f8802b = cVar;
        }
    }
}
