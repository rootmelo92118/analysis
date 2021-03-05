package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class bsm extends azd implements bsk {
    public bsm() {
        super("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        long b = mo12327b();
        parcel2.writeNoException();
        parcel2.writeLong(b);
        return true;
    }
}
