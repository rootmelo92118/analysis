package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class brq extends azc implements bro {
    brq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final void zzd(zzwb zzwb) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzwb);
        mo11430b(1, z);
    }

    public final String getMediationAdapterClassName() {
        Parcel a = mo11428a(2, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoading() {
        Parcel a = mo11428a(3, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    public final String zzje() {
        Parcel a = mo11428a(4, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zza(zzwb zzwb, int i) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeInt(i);
        mo11430b(5, z);
    }
}
