package com.google.android.gms.internal.ads;

import android.os.Bundle;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wi */
final class C1755wi {

    /* renamed from: a */
    private long f6747a = -1;

    /* renamed from: b */
    private long f6748b = -1;

    /* renamed from: c */
    private final /* synthetic */ C1754wh f6749c;

    public C1755wi(C1754wh whVar) {
        this.f6749c = whVar;
    }

    /* renamed from: a */
    public final long mo13107a() {
        return this.f6748b;
    }

    /* renamed from: b */
    public final void mo13108b() {
        this.f6748b = this.f6749c.f6734a.mo9997b();
    }

    /* renamed from: c */
    public final void mo13109c() {
        this.f6747a = this.f6749c.f6734a.mo9997b();
    }

    /* renamed from: d */
    public final Bundle mo13110d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f6747a);
        bundle.putLong("tclose", this.f6748b);
        return bundle;
    }
}
