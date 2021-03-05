package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bt */
abstract class C2190bt extends C2189bs {

    /* renamed from: a */
    private boolean f8223a;

    C2190bt(C2166aw awVar) {
        super(awVar);
        this.f8222q.mo14314a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo14253e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo14254f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo14380z() {
        return this.f8223a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo14377A() {
        if (!mo14380z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: B */
    public final void mo14378B() {
        if (this.f8223a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14253e()) {
            this.f8222q.mo14311G();
            this.f8223a = true;
        }
    }

    /* renamed from: C */
    public final void mo14379C() {
        if (!this.f8223a) {
            mo14254f();
            this.f8222q.mo14311G();
            this.f8223a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
