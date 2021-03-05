package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lc */
public final class C1452lc extends azc implements C1450la {
    C1452lc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: a */
    public final String mo12708a() {
        Parcel a = mo11428a(2, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo12711b() {
        Parcel a = mo11428a(3, mo11432z());
        ArrayList b = aze.m4506b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo12713c() {
        Parcel a = mo11428a(4, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final C1210ce mo12715d() {
        Parcel a = mo11428a(5, mo11432z());
        C1210ce a2 = C1211cf.m6600a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo12716e() {
        Parcel a = mo11428a(6, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final double mo12717f() {
        Parcel a = mo11428a(7, mo11432z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: g */
    public final String mo12718g() {
        Parcel a = mo11428a(8, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final String mo12719h() {
        Parcel a = mo11428a(9, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final void mo12720i() {
        mo11430b(10, mo11432z());
    }

    /* renamed from: a */
    public final void mo12709a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(11, z);
    }

    /* renamed from: b */
    public final void mo12712b(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(12, z);
    }

    /* renamed from: j */
    public final boolean mo12721j() {
        Parcel a = mo11428a(13, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final boolean mo12722k() {
        Parcel a = mo11428a(14, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final Bundle mo12723l() {
        Parcel a = mo11428a(15, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final void mo12714c(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(16, z);
    }

    /* renamed from: m */
    public final btb mo12724m() {
        Parcel a = mo11428a(17, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C0719a mo12725n() {
        Parcel a = mo11428a(18, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final C1204bz mo12726o() {
        Parcel a = mo11428a(19, mo11432z());
        C1204bz a2 = C1206ca.m6594a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final C0719a mo12727p() {
        Parcel a = mo11428a(20, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final C0719a mo12728q() {
        Parcel a = mo11428a(21, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12710a(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) aVar2);
        aze.m4502a(z, (IInterface) aVar3);
        mo11430b(22, z);
    }
}
