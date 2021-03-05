package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;

public final class bsa extends azc implements brz {
    bsa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo12330a(C0719a aVar, zzwf zzwf, String str, C1437ko koVar, int i, int i2) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzwf);
        z.writeString(str);
        aze.m4502a(z, (IInterface) koVar);
        z.writeInt(14300000);
        z.writeInt(i2);
        Parcel a = mo11428a(2, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
