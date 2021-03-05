package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.rw */
public final class C1634rw extends azc implements C1632ru {
    C1634rw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* renamed from: a */
    public final void mo12922a(zzasm zzasm) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzasm);
        mo11430b(1, z);
    }
}
