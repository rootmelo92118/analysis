package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class bri extends azd implements brh {
    public bri() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12293a();
        parcel2.writeNoException();
        return true;
    }
}
