package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.db */
final class C2226db implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f8335a;

    /* renamed from: b */
    private final /* synthetic */ boolean f8336b;

    /* renamed from: c */
    private final /* synthetic */ zzo f8337c;

    /* renamed from: d */
    private final /* synthetic */ zzk f8338d;

    /* renamed from: e */
    private final /* synthetic */ zzo f8339e;

    /* renamed from: f */
    private final /* synthetic */ C2217ct f8340f;

    C2226db(C2217ct ctVar, boolean z, boolean z2, zzo zzo, zzk zzk, zzo zzo2) {
        this.f8340f = ctVar;
        this.f8335a = z;
        this.f8336b = z2;
        this.f8337c = zzo;
        this.f8338d = zzk;
        this.f8339e = zzo2;
    }

    public final void run() {
        C2286i d = this.f8340f.f8302b;
        if (d == null) {
            this.f8340f.mo14235r().mo14830d_().mo14841a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f8335a) {
            this.f8340f.mo14442a(d, this.f8336b ? null : this.f8337c, this.f8338d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f8339e.f8679a)) {
                    d.mo14349a(this.f8337c, this.f8338d);
                } else {
                    d.mo14348a(this.f8337c);
                }
            } catch (RemoteException e) {
                this.f8340f.mo14235r().mo14830d_().mo14842a("Failed to send conditional user property to the service", e);
            }
        }
        this.f8340f.m10753I();
    }
}
