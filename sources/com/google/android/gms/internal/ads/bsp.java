package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

public abstract class bsp extends azd implements bso {
    public bsp() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zza();
                parcel2.writeNoException();
                return true;
            case 2:
                setAppVolume(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                zzat(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                setAppMuted(aze.m4505a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                zzb(C0719a.C0720a.m768a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zza(parcel.readString(), C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float zzkj = zzkj();
                parcel2.writeNoException();
                parcel2.writeFloat(zzkj);
                return true;
            case 8:
                boolean zzkk = zzkk();
                parcel2.writeNoException();
                aze.m4504a(parcel2, zzkk);
                return true;
            case 9:
                String zzkl = zzkl();
                parcel2.writeNoException();
                parcel2.writeString(zzkl);
                return true;
            case 10:
                zzau(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zza(C1438kp.m7213a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
