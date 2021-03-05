package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.cg */
final class C2204cg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AppMeasurement.ConditionalUserProperty f8267a;

    /* renamed from: b */
    private final /* synthetic */ C2200cc f8268b;

    C2204cg(C2200cc ccVar, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f8268b = ccVar;
        this.f8267a = conditionalUserProperty;
    }

    public final void run() {
        this.f8268b.m10651d(this.f8267a);
    }
}
