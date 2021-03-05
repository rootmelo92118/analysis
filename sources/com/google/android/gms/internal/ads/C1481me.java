package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.me */
public final class C1481me extends azc implements C1480md {
    C1481me(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* renamed from: a */
    public final void mo12784a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(2, z);
    }
}
