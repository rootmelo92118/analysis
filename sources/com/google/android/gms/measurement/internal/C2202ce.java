package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.ce */
final class C2202ce implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f8253a;

    /* renamed from: b */
    private final /* synthetic */ String f8254b;

    /* renamed from: c */
    private final /* synthetic */ long f8255c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f8256d;

    /* renamed from: e */
    private final /* synthetic */ boolean f8257e;

    /* renamed from: f */
    private final /* synthetic */ boolean f8258f;

    /* renamed from: g */
    private final /* synthetic */ boolean f8259g;

    /* renamed from: h */
    private final /* synthetic */ String f8260h;

    /* renamed from: i */
    private final /* synthetic */ C2200cc f8261i;

    C2202ce(C2200cc ccVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f8261i = ccVar;
        this.f8253a = str;
        this.f8254b = str2;
        this.f8255c = j;
        this.f8256d = bundle;
        this.f8257e = z;
        this.f8258f = z2;
        this.f8259g = z3;
        this.f8260h = str3;
    }

    public final void run() {
        this.f8261i.m10643a(this.f8253a, this.f8254b, this.f8255c, this.f8256d, this.f8257e, this.f8258f, this.f8259g, this.f8260h);
    }
}
