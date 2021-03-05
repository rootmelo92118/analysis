package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dn */
abstract class C2238dn extends C2215cr {

    /* renamed from: a */
    private boolean f8374a;

    C2238dn(C2166aw awVar) {
        super(awVar);
        this.f8222q.mo14315a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract boolean mo14406v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo14489w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo14485D() {
        return this.f8374a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo14486E() {
        if (!mo14485D()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: F */
    public final void mo14487F() {
        if (this.f8374a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14406v()) {
            this.f8222q.mo14311G();
            this.f8374a = true;
        }
    }

    /* renamed from: G */
    public final void mo14488G() {
        if (!this.f8374a) {
            mo14489w();
            this.f8222q.mo14311G();
            this.f8374a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
