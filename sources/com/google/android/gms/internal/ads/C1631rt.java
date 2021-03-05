package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.rt */
public final class C1631rt extends azc implements C1629rr {
    C1631rt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final zzasm mo12927a(zzasi zzasi) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzasi);
        Parcel a = mo11428a(1, z);
        zzasm zzasm = (zzasm) aze.m4501a(a, zzasm.CREATOR);
        a.recycle();
        return zzasm;
    }

    /* renamed from: a */
    public final void mo12928a(zzasi zzasi, C1632ru ruVar) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzasi);
        aze.m4502a(z, (IInterface) ruVar);
        mo11430b(2, z);
    }

    /* renamed from: a */
    public final void mo12929a(zzatb zzatb, C1635rx rxVar) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzatb);
        aze.m4502a(z, (IInterface) rxVar);
        mo11430b(4, z);
    }

    /* renamed from: b */
    public final void mo12930b(zzatb zzatb, C1635rx rxVar) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzatb);
        aze.m4502a(z, (IInterface) rxVar);
        mo11430b(5, z);
    }
}
