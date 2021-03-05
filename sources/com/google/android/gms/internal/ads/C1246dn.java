package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dn */
public final class C1246dn extends azc implements C1244dl {
    C1246dn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: a */
    public final void mo12502a(C1233da daVar, String str) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) daVar);
        z.writeString(str);
        mo11430b(1, z);
    }
}
