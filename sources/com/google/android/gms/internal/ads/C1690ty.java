package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.ty */
public final class C1690ty extends azc implements C1688tw {
    C1690ty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public final void mo12466a(zzavh zzavh) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzavh);
        mo11430b(1, z);
    }

    /* renamed from: a */
    public final void mo12461a() {
        mo11430b(2, mo11432z());
    }

    /* renamed from: a */
    public final void mo12465a(C1695uc ucVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) ucVar);
        mo11430b(3, z);
    }

    /* renamed from: c */
    public final boolean mo12474c() {
        Parcel a = mo11428a(5, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo12475d() {
        mo11430b(6, mo11432z());
    }

    /* renamed from: e */
    public final void mo12477e() {
        mo11430b(7, mo11432z());
    }

    /* renamed from: f */
    public final void mo12478f() {
        mo11430b(8, mo11432z());
    }

    /* renamed from: b */
    public final void mo12470b(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(9, z);
    }

    /* renamed from: c */
    public final void mo12472c(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(10, z);
    }

    /* renamed from: d */
    public final void mo12476d(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(11, z);
    }

    /* renamed from: g */
    public final String mo12479g() {
        Parcel a = mo11428a(12, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo12471b(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(13, z);
    }

    /* renamed from: a */
    public final void mo12463a(bsb bsb) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bsb);
        mo11430b(14, z);
    }

    /* renamed from: b */
    public final Bundle mo12469b() {
        Parcel a = mo11428a(15, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo12464a(C1686tu tuVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) tuVar);
        mo11430b(16, z);
    }

    /* renamed from: a */
    public final void mo12467a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(17, z);
    }

    /* renamed from: a */
    public final void mo12462a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(18, z);
    }

    /* renamed from: c */
    public final void mo12473c(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(19, z);
    }

    /* renamed from: a */
    public final void mo12468a(boolean z) {
        Parcel z2 = mo11432z();
        aze.m4504a(z2, z);
        mo11430b(34, z2);
    }
}
