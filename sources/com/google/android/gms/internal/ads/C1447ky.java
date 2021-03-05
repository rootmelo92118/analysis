package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ky */
public abstract class C1447ky extends azd implements C1446kx {
    public C1447ky() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int a = mo12672a();
        parcel2.writeNoException();
        parcel2.writeInt(a);
        return true;
    }
}
