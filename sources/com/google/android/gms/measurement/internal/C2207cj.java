package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cj */
final class C2207cj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f8276a;

    /* renamed from: b */
    private final /* synthetic */ String f8277b;

    /* renamed from: c */
    private final /* synthetic */ String f8278c;

    /* renamed from: d */
    private final /* synthetic */ String f8279d;

    /* renamed from: e */
    private final /* synthetic */ boolean f8280e;

    /* renamed from: f */
    private final /* synthetic */ C2200cc f8281f;

    C2207cj(C2200cc ccVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f8281f = ccVar;
        this.f8276a = atomicReference;
        this.f8277b = str;
        this.f8278c = str2;
        this.f8279d = str3;
        this.f8280e = z;
    }

    public final void run() {
        this.f8281f.f8222q.mo14334x().mo14448a(this.f8276a, this.f8277b, this.f8278c, this.f8279d, this.f8280e);
    }
}
