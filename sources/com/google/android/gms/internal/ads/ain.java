package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class ain extends azc implements aim {
    ain(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzbji mo10587a(zzbjg zzbjg) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzbjg);
        Parcel a = mo11428a(1, z);
        zzbji zzbji = (zzbji) aze.m4501a(a, zzbji.CREATOR);
        a.recycle();
        return zzbji;
    }
}
