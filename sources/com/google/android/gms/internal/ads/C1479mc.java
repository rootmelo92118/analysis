package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.mc */
public final class C1479mc extends azc implements C1478mb {
    C1479mc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: a */
    public final void mo12783a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(3, z);
    }
}
