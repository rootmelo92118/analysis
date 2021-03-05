package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.kz */
public final class C1448kz extends azc implements C1446kx {
    C1448kz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* renamed from: a */
    public final int mo12672a() {
        Parcel a = mo11428a(1, mo11432z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
