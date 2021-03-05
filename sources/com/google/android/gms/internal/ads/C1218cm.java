package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.cm */
public final class C1218cm extends azc implements C1217cl {
    C1218cm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: a */
    public final IBinder mo12496a(C0719a aVar, C0719a aVar2, C0719a aVar3, int i) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) aVar2);
        aze.m4502a(z, (IInterface) aVar3);
        z.writeInt(14300000);
        Parcel a = mo11428a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
