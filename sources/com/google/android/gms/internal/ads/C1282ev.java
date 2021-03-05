package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.ev */
public final class C1282ev extends azc implements C1281eu {
    C1282ev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final void mo12526a(zzafl zzafl, C1279es esVar) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzafl);
        aze.m4502a(z, (IInterface) esVar);
        mo11431c(2, z);
    }
}
