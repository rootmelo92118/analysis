package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class brm extends azd implements brl {
    public brm() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12296a();
                break;
            case 2:
                mo12297a(parcel.readInt());
                break;
            case 3:
                mo12298b();
                break;
            case 4:
                mo12299c();
                break;
            case 5:
                mo12300d();
                break;
            case 6:
                mo12302f();
                break;
            case 7:
                mo12301e();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
