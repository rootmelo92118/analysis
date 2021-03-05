package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2128r;
import com.google.android.gms.p039a.C0722b;

/* renamed from: com.google.android.gms.internal.measurement.am */
final class C1888am extends C2128r.C2130b {

    /* renamed from: c */
    private final /* synthetic */ Activity f7370c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f7371d;

    /* renamed from: e */
    private final /* synthetic */ C2128r.C2132d f7372e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1888am(C2128r.C2132d dVar, Activity activity, Bundle bundle) {
        super(C2128r.this);
        this.f7372e = dVar;
        this.f7370c = activity;
        this.f7371d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13491b() {
        C2128r.this.f7979j.mo13861a(C0722b.m769a(this.f7370c), this.f7371d, this.f7984b);
    }
}
