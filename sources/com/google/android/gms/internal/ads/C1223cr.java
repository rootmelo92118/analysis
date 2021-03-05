package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.cr */
public final class C1223cr extends azc implements C1222cq {
    C1223cr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    /* renamed from: a */
    public final IBinder mo12497a(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) aVar2);
        aze.m4502a(z, (IInterface) aVar3);
        Parcel a = mo11428a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
