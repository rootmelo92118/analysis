package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dh */
public final class C1240dh extends azc implements C1238df {
    C1240dh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12500a(C1224cs csVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) csVar);
        mo11430b(1, z);
    }
}
