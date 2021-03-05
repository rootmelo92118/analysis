package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C2128r;
import com.google.android.gms.p039a.C0722b;

/* renamed from: com.google.android.gms.internal.measurement.v */
final class C2136v extends C2128r.C2130b {

    /* renamed from: c */
    private final /* synthetic */ Activity f8002c;

    /* renamed from: d */
    private final /* synthetic */ String f8003d;

    /* renamed from: e */
    private final /* synthetic */ String f8004e;

    /* renamed from: f */
    private final /* synthetic */ C2128r f8005f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2136v(C2128r rVar, Activity activity, String str, String str2) {
        super(rVar);
        this.f8005f = rVar;
        this.f8002c = activity;
        this.f8003d = str;
        this.f8004e = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13491b() {
        this.f8005f.f7979j.mo13864a(C0722b.m769a(this.f8002c), this.f8003d, this.f8004e, this.f7983a);
    }
}
