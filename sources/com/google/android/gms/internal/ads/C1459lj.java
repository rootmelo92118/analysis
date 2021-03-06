package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lj */
public final class C1459lj extends azc implements C1456lg {
    C1459lj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: a */
    public final String mo12748a() {
        Parcel a = mo11428a(2, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo12751b() {
        Parcel a = mo11428a(3, mo11432z());
        ArrayList b = aze.m4506b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo12753c() {
        Parcel a = mo11428a(4, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final C1210ce mo12754d() {
        Parcel a = mo11428a(5, mo11432z());
        C1210ce a2 = C1211cf.m6600a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo12755e() {
        Parcel a = mo11428a(6, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo12756f() {
        Parcel a = mo11428a(7, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final double mo12757g() {
        Parcel a = mo11428a(8, mo11432z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: h */
    public final String mo12758h() {
        Parcel a = mo11428a(9, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final String mo12759i() {
        Parcel a = mo11428a(10, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final btb mo12760j() {
        Parcel a = mo11428a(11, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final C1204bz mo12761k() {
        Parcel a = mo11428a(12, mo11432z());
        C1204bz a2 = C1206ca.m6594a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final C0719a mo12762l() {
        Parcel a = mo11428a(13, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final C0719a mo12763m() {
        Parcel a = mo11428a(14, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C0719a mo12764n() {
        Parcel a = mo11428a(15, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final Bundle mo12765o() {
        Parcel a = mo11428a(16, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: p */
    public final boolean mo12766p() {
        Parcel a = mo11428a(17, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final boolean mo12767q() {
        Parcel a = mo11428a(18, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final void mo12768r() {
        mo11430b(19, mo11432z());
    }

    /* renamed from: a */
    public final void mo12749a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(20, z);
    }

    /* renamed from: a */
    public final void mo12750a(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) aVar2);
        aze.m4502a(z, (IInterface) aVar3);
        mo11430b(21, z);
    }

    /* renamed from: b */
    public final void mo12752b(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(22, z);
    }
}
