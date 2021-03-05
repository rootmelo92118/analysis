package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;

/* renamed from: com.google.android.gms.measurement.internal.dx */
final class C2248dx {

    /* renamed from: a */
    private final C0969e f8393a;

    /* renamed from: b */
    private long f8394b;

    public C2248dx(C0969e eVar) {
        C0926p.m1306a(eVar);
        this.f8393a = eVar;
    }

    /* renamed from: a */
    public final void mo14499a() {
        this.f8394b = this.f8393a.mo9997b();
    }

    /* renamed from: b */
    public final void mo14501b() {
        this.f8394b = 0;
    }

    /* renamed from: a */
    public final boolean mo14500a(long j) {
        if (this.f8394b != 0 && this.f8393a.mo9997b() - this.f8394b < 3600000) {
            return false;
        }
        return true;
    }
}
