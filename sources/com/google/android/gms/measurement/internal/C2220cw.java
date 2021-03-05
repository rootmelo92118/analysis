package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.cw */
final class C2220cw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f8312a;

    /* renamed from: b */
    private final /* synthetic */ C2217ct f8313b;

    C2220cw(C2217ct ctVar, zzk zzk) {
        this.f8313b = ctVar;
        this.f8312a = zzk;
    }

    public final void run() {
        C2286i d = this.f8313b.f8302b;
        if (d == null) {
            this.f8313b.mo14235r().mo14830d_().mo14841a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo14347a(this.f8312a);
            this.f8313b.mo14442a(d, (AbstractSafeParcelable) null, this.f8312a);
            this.f8313b.m10753I();
        } catch (RemoteException e) {
            this.f8313b.mo14235r().mo14830d_().mo14842a("Failed to send app launch to the service", e);
        }
    }
}
