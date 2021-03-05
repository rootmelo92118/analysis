package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

public final class bsq extends azc implements bso {
    bsq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void zza() {
        mo11430b(1, mo11432z());
    }

    public final void setAppVolume(float f) {
        Parcel z = mo11432z();
        z.writeFloat(f);
        mo11430b(2, z);
    }

    public final void zzat(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(3, z);
    }

    public final void setAppMuted(boolean z) {
        Parcel z2 = mo11432z();
        aze.m4504a(z2, z);
        mo11430b(4, z2);
    }

    public final void zzb(C0719a aVar, String str) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeString(str);
        mo11430b(5, z);
    }

    public final void zza(String str, C0719a aVar) {
        Parcel z = mo11432z();
        z.writeString(str);
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(6, z);
    }

    public final float zzkj() {
        Parcel a = mo11428a(7, mo11432z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean zzkk() {
        Parcel a = mo11428a(8, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    public final String zzkl() {
        Parcel a = mo11428a(9, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zzau(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(10, z);
    }

    public final void zza(C1437ko koVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) koVar);
        mo11430b(11, z);
    }
}
