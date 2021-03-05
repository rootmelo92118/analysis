package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class bsu extends azd implements bst {
    public bsu() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    /* renamed from: a */
    public static bst m6362a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        if (queryLocalInterface instanceof bst) {
            return (bst) queryLocalInterface;
        }
        return new bsv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12335a();
        parcel2.writeNoException();
        return true;
    }
}
