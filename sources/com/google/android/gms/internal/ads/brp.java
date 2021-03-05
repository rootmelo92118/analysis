package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class brp extends azd implements bro {
    public brp() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zzd((zzwb) aze.m4501a(parcel, zzwb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 3:
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                aze.m4504a(parcel2, isLoading);
                return true;
            case 4:
                String zzje = zzje();
                parcel2.writeNoException();
                parcel2.writeString(zzje);
                return true;
            case 5:
                zza((zzwb) aze.m4501a(parcel, zzwb.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
