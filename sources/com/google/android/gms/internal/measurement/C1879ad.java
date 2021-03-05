package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2128r;

/* renamed from: com.google.android.gms.internal.measurement.ad */
final class C1879ad extends C2128r.C2130b {

    /* renamed from: c */
    private final /* synthetic */ String f7335c;

    /* renamed from: d */
    private final /* synthetic */ String f7336d;

    /* renamed from: e */
    private final /* synthetic */ boolean f7337e;

    /* renamed from: f */
    private final /* synthetic */ C2128r.C2129a f7338f;

    /* renamed from: g */
    private final /* synthetic */ C2128r f7339g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1879ad(C2128r rVar, String str, String str2, boolean z, C2128r.C2129a aVar) {
        super(rVar);
        this.f7339g = rVar;
        this.f7335c = str;
        this.f7336d = str2;
        this.f7337e = z;
        this.f7338f = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13491b() {
        this.f7339g.f7979j.mo13876a(this.f7335c, this.f7336d, this.f7337e, (C2111i) this.f7338f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13490a() {
        this.f7338f.mo14090a((Bundle) null);
    }
}
