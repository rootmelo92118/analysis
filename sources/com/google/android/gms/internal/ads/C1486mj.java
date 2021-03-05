package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.mj */
public final class C1486mj extends azc implements C1484mh {
    C1486mj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public final void mo12788a(C0719a aVar, String str, Bundle bundle, Bundle bundle2, zzwf zzwf, C1487mk mkVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeString(str);
        aze.m4503a(z, (Parcelable) bundle);
        aze.m4503a(z, (Parcelable) bundle2);
        aze.m4503a(z, (Parcelable) zzwf);
        aze.m4502a(z, (IInterface) mkVar);
        mo11430b(1, z);
    }

    /* renamed from: a */
    public final zzans mo12786a() {
        Parcel a = mo11428a(2, mo11432z());
        zzans zzans = (zzans) aze.m4501a(a, zzans.CREATOR);
        a.recycle();
        return zzans;
    }

    /* renamed from: b */
    public final zzans mo12794b() {
        Parcel a = mo11428a(3, mo11432z());
        zzans zzans = (zzans) aze.m4501a(a, zzans.CREATOR);
        a.recycle();
        return zzans;
    }

    /* renamed from: a */
    public final void mo12789a(String str, String str2, Bundle bundle, C0719a aVar, C1474ly lyVar, C1443ku kuVar, zzwf zzwf) {
        Parcel z = mo11432z();
        z.writeString(str);
        z.writeString(str2);
        aze.m4503a(z, (Parcelable) bundle);
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) lyVar);
        aze.m4502a(z, (IInterface) kuVar);
        aze.m4503a(z, (Parcelable) zzwf);
        mo11430b(4, z);
    }

    /* renamed from: c */
    public final btb mo12795c() {
        Parcel a = mo11428a(5, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12790a(String str, String str2, Bundle bundle, C0719a aVar, C1478mb mbVar, C1443ku kuVar) {
        Parcel z = mo11432z();
        z.writeString(str);
        z.writeString(str2);
        aze.m4503a(z, (Parcelable) bundle);
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) mbVar);
        aze.m4502a(z, (IInterface) kuVar);
        mo11430b(6, z);
    }

    /* renamed from: d */
    public final void mo12796d() {
        mo11430b(7, mo11432z());
    }

    /* renamed from: a */
    public final void mo12792a(String str, String str2, Bundle bundle, C0719a aVar, C1482mf mfVar, C1443ku kuVar) {
        Parcel z = mo11432z();
        z.writeString(str);
        z.writeString(str2);
        aze.m4503a(z, (Parcelable) bundle);
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) mfVar);
        aze.m4502a(z, (IInterface) kuVar);
        mo11430b(8, z);
    }

    /* renamed from: e */
    public final void mo12797e() {
        mo11430b(9, mo11432z());
    }

    /* renamed from: a */
    public final void mo12787a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(10, z);
    }

    /* renamed from: a */
    public final void mo12793a(String[] strArr, Bundle[] bundleArr) {
        Parcel z = mo11432z();
        z.writeStringArray(strArr);
        z.writeTypedArray(bundleArr, 0);
        mo11430b(11, z);
    }

    /* renamed from: a */
    public final void mo12791a(String str, String str2, Bundle bundle, C0719a aVar, C1480md mdVar, C1443ku kuVar) {
        Parcel z = mo11432z();
        z.writeString(str);
        z.writeString(str2);
        aze.m4503a(z, (Parcelable) bundle);
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) mdVar);
        aze.m4502a(z, (IInterface) kuVar);
        mo11430b(12, z);
    }
}
