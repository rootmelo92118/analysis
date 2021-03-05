package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.mg */
public final class C1483mg extends azc implements C1482mf {
    C1483mg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* renamed from: a */
    public final void mo12785a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(3, z);
    }
}
