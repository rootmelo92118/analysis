package com.google.firebase.components;

import com.google.firebase.p048b.C2338a;

/* renamed from: com.google.firebase.components.q */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final class C2358q<T> implements C2338a<T> {

    /* renamed from: a */
    private static final Object f8792a = new Object();

    /* renamed from: b */
    private volatile Object f8793b = f8792a;

    /* renamed from: c */
    private volatile C2338a<T> f8794c;

    C2358q(C2344c<T> cVar, C2343b bVar) {
        this.f8794c = C2359r.m11602a(cVar, bVar);
    }

    /* renamed from: a */
    public final T mo14918a() {
        T t = this.f8793b;
        if (t == f8792a) {
            synchronized (this) {
                t = this.f8793b;
                if (t == f8792a) {
                    t = this.f8794c.mo14918a();
                    this.f8793b = t;
                    this.f8794c = null;
                }
            }
        }
        return t;
    }
}
