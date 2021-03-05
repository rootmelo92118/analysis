package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.lz */
public final class C1475lz extends azc implements C1474ly {
    C1475lz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* renamed from: a */
    public final void mo12777a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(2, z);
    }
}
