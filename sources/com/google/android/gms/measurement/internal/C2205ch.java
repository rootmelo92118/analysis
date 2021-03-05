package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.ch */
final class C2205ch implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AppMeasurement.ConditionalUserProperty f8269a;

    /* renamed from: b */
    private final /* synthetic */ C2200cc f8270b;

    C2205ch(C2200cc ccVar, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f8270b = ccVar;
        this.f8269a = conditionalUserProperty;
    }

    public final void run() {
        this.f8270b.m10652e(this.f8269a);
    }
}
