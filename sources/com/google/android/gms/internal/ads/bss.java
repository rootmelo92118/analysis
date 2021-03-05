package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

public final class bss extends azc implements bsr {
    bss(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo12334a(C0719a aVar, int i) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeInt(14300000);
        Parcel a = mo11428a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
