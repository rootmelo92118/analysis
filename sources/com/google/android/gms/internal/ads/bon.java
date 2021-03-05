package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class bon extends azc implements bom {
    bon(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zztv mo12279a(zzty zzty) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzty);
        Parcel a = mo11428a(1, z);
        zztv zztv = (zztv) aze.m4501a(a, zztv.CREATOR);
        a.recycle();
        return zztv;
    }
}
