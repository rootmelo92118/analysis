package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ci */
final class C2206ci implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f8271a;

    /* renamed from: b */
    private final /* synthetic */ String f8272b;

    /* renamed from: c */
    private final /* synthetic */ String f8273c;

    /* renamed from: d */
    private final /* synthetic */ String f8274d;

    /* renamed from: e */
    private final /* synthetic */ C2200cc f8275e;

    C2206ci(C2200cc ccVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f8275e = ccVar;
        this.f8271a = atomicReference;
        this.f8272b = str;
        this.f8273c = str2;
        this.f8274d = str3;
    }

    public final void run() {
        this.f8275e.f8222q.mo14334x().mo14447a(this.f8271a, this.f8272b, this.f8273c, this.f8274d);
    }
}
