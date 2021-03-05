package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dy */
public abstract class C1257dy extends azd implements C1256dx {
    public C1257dy() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12507a(parcel.readString());
                break;
            case 2:
                mo12506a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
