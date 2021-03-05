package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.da */
final class C2225da implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f8329a;

    /* renamed from: b */
    private final /* synthetic */ boolean f8330b;

    /* renamed from: c */
    private final /* synthetic */ zzag f8331c;

    /* renamed from: d */
    private final /* synthetic */ zzk f8332d;

    /* renamed from: e */
    private final /* synthetic */ String f8333e;

    /* renamed from: f */
    private final /* synthetic */ C2217ct f8334f;

    C2225da(C2217ct ctVar, boolean z, boolean z2, zzag zzag, zzk zzk, String str) {
        this.f8334f = ctVar;
        this.f8329a = z;
        this.f8330b = z2;
        this.f8331c = zzag;
        this.f8332d = zzk;
        this.f8333e = str;
    }

    public final void run() {
        C2286i d = this.f8334f.f8302b;
        if (d == null) {
            this.f8334f.mo14235r().mo14830d_().mo14841a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f8329a) {
            this.f8334f.mo14442a(d, this.f8330b ? null : this.f8331c, this.f8332d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f8333e)) {
                    d.mo14344a(this.f8331c, this.f8332d);
                } else {
                    d.mo14345a(this.f8331c, this.f8333e, this.f8334f.mo14235r().mo14839y());
                }
            } catch (RemoteException e) {
                this.f8334f.mo14235r().mo14830d_().mo14842a("Failed to send event to the service", e);
            }
        }
        this.f8334f.m10753I();
    }
}
