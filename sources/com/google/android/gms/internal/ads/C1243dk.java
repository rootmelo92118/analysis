package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dk */
public final class C1243dk extends azc implements C1241di {
    C1243dk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12501a(C1228cw cwVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) cwVar);
        mo11430b(1, z);
    }
}
