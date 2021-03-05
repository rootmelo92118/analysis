package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tv */
public final class C1687tv extends azc implements C1686tu {
    C1687tv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: a */
    public final void mo13001a(C1683tr trVar, String str) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) trVar);
        z.writeString(str);
        mo11430b(1, z);
    }
}
