package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2128r;

/* renamed from: com.google.android.gms.internal.measurement.aj */
final class C1885aj extends C2128r.C2130b {

    /* renamed from: c */
    private final /* synthetic */ Long f7356c;

    /* renamed from: d */
    private final /* synthetic */ String f7357d;

    /* renamed from: e */
    private final /* synthetic */ String f7358e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f7359f;

    /* renamed from: g */
    private final /* synthetic */ boolean f7360g = true;

    /* renamed from: h */
    private final /* synthetic */ boolean f7361h;

    /* renamed from: i */
    private final /* synthetic */ C2128r f7362i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1885aj(C2128r rVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(rVar);
        this.f7362i = rVar;
        this.f7356c = l;
        this.f7357d = str;
        this.f7358e = str2;
        this.f7359f = bundle;
        this.f7361h = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13491b() {
        this.f7362i.f7979j.mo13873a(this.f7357d, this.f7358e, this.f7359f, this.f7360g, this.f7361h, this.f7356c == null ? this.f7983a : this.f7356c.longValue());
    }
}
