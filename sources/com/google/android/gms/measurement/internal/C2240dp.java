package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dp */
final class C2240dp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2254ec f8378a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f8379b;

    C2240dp(C2236dl dlVar, C2254ec ecVar, Runnable runnable) {
        this.f8378a = ecVar;
        this.f8379b = runnable;
    }

    public final void run() {
        this.f8378a.mo14538l();
        this.f8378a.mo14519a(this.f8379b);
        this.f8378a.mo14537k();
    }
}
