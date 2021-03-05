package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.ds */
public abstract class C1251ds extends azd implements C1250dr {
    public C1251ds() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: a */
    public static C1250dr m6738a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof C1250dr) {
            return (C1250dr) queryLocalInterface;
        }
        return new C1252dt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12504a(brx.zzb(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
