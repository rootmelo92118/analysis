package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.et */
public abstract class C1280et extends azd implements C1279es {
    public C1280et() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12525a((ParcelFileDescriptor) aze.m4501a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
