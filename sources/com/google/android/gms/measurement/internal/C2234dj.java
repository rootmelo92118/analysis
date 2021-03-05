package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.dj */
final class C2234dj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2230df f8367a;

    C2234dj(C2230df dfVar) {
        this.f8367a = dfVar;
    }

    public final void run() {
        C2217ct ctVar = this.f8367a.f8358a;
        Context n = this.f8367a.f8358a.mo14231n();
        this.f8367a.f8358a.mo14238u();
        ctVar.m10759a(new ComponentName(n, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
