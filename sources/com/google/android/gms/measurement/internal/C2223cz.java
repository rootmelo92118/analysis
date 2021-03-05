package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cz */
final class C2223cz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f8317a;

    /* renamed from: b */
    private final /* synthetic */ C2217ct f8318b;

    C2223cz(C2217ct ctVar, zzk zzk) {
        this.f8318b = ctVar;
        this.f8317a = zzk;
    }

    public final void run() {
        C2286i d = this.f8318b.f8302b;
        if (d == null) {
            this.f8318b.mo14235r().mo14830d_().mo14841a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo14352b(this.f8317a);
            this.f8318b.m10753I();
        } catch (RemoteException e) {
            this.f8318b.mo14235r().mo14830d_().mo14842a("Failed to send measurementEnabled to the service", e);
        }
    }
}
