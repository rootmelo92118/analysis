package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class btg extends azc implements bte {
    btg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: a */
    public final void mo12350a() {
        mo11430b(1, mo11432z());
    }

    /* renamed from: b */
    public final void mo12352b() {
        mo11430b(2, mo11432z());
    }

    /* renamed from: c */
    public final void mo12353c() {
        mo11430b(3, mo11432z());
    }

    /* renamed from: d */
    public final void mo12354d() {
        mo11430b(4, mo11432z());
    }

    /* renamed from: a */
    public final void mo12351a(boolean z) {
        Parcel z2 = mo11432z();
        aze.m4504a(z2, z);
        mo11430b(5, z2);
    }
}
