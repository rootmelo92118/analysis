package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dw */
public final class C1255dw extends azc implements C1253du {
    C1255dw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12505a(C1260ea eaVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) eaVar);
        mo11430b(1, z);
    }
}
