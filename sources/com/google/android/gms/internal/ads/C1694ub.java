package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.ub */
public final class C1694ub extends azc implements C1691tz {
    C1694ub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    /* renamed from: a */
    public final IBinder mo13002a(C0719a aVar, C1437ko koVar, int i) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) koVar);
        z.writeInt(14300000);
        Parcel a = mo11428a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
