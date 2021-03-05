package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dv */
final class C2246dv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f8389a;

    /* renamed from: b */
    private final /* synthetic */ C2242dr f8390b;

    C2246dv(C2242dr drVar, long j) {
        this.f8390b = drVar;
        this.f8389a = j;
    }

    public final void run() {
        this.f8390b.m10838b(this.f8389a);
    }
}
