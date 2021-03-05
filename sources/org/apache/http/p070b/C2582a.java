package org.apache.http.p070b;

import org.apache.http.C2581b;
import org.apache.http.C2594e;
import org.apache.http.p071c.C2589a;

/* renamed from: org.apache.http.b.a */
/* compiled from: AbstractHttpMessage */
public abstract class C2582a implements C2594e {

    /* renamed from: a */
    protected C2587f f9121a;
    @Deprecated

    /* renamed from: b */
    protected C2589a f9122b;

    @Deprecated
    protected C2582a(C2589a aVar) {
        this.f9121a = new C2587f();
        this.f9122b = aVar;
    }

    protected C2582a() {
        this((C2589a) null);
    }

    /* renamed from: a */
    public C2581b[] mo15804a() {
        return this.f9121a.mo15828b();
    }

    /* renamed from: a */
    public void mo15803a(C2581b[] bVarArr) {
        this.f9121a.mo15827a(bVarArr);
    }
}
