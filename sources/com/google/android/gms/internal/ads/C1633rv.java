package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.rv */
public abstract class C1633rv extends azd implements C1632ru {
    public C1633rv() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12922a((zzasm) aze.m4501a(parcel, zzasm.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
