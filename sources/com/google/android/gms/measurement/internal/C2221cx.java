package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cx */
final class C2221cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2212co f8314a;

    /* renamed from: b */
    private final /* synthetic */ C2217ct f8315b;

    C2221cx(C2217ct ctVar, C2212co coVar) {
        this.f8315b = ctVar;
        this.f8314a = coVar;
    }

    public final void run() {
        C2286i d = this.f8315b.f8302b;
        if (d == null) {
            this.f8315b.mo14235r().mo14830d_().mo14841a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f8314a == null) {
                d.mo14343a(0, (String) null, (String) null, this.f8315b.mo14231n().getPackageName());
            } else {
                d.mo14343a(this.f8314a.f8287c, this.f8314a.f8285a, this.f8314a.f8286b, this.f8315b.mo14231n().getPackageName());
            }
            this.f8315b.m10753I();
        } catch (RemoteException e) {
            this.f8315b.mo14235r().mo14830d_().mo14842a("Failed to send current screen to the service", e);
        }
    }
}
