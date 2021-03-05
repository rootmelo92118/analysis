package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.al */
public final class C1039al extends azc implements C1026aj {
    C1039al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo10603a(C1023ag agVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) agVar);
        mo11430b(1, z);
    }
}
