package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.eb */
abstract class C2253eb extends C2252ea {

    /* renamed from: b */
    private boolean f8403b;

    C2253eb(C2254ec ecVar) {
        super(ecVar);
        this.f8402a.mo14512a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo14289e();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo14507j() {
        return this.f8403b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo14508k() {
        if (!mo14507j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: v */
    public final void mo14509v() {
        if (!this.f8403b) {
            mo14289e();
            this.f8402a.mo14539o();
            this.f8403b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
