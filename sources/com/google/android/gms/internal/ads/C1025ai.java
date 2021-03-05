package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.ai */
public final class C1025ai extends azc implements C1023ag {
    C1025ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* renamed from: a */
    public final String mo10260a() {
        Parcel a = mo11428a(1, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final String mo10262b() {
        Parcel a = mo11428a(2, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo10261a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(3, z);
    }

    /* renamed from: c */
    public final void mo10263c() {
        mo11430b(4, mo11432z());
    }

    /* renamed from: d */
    public final void mo10264d() {
        mo11430b(5, mo11432z());
    }
}
