package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lf */
public final class C1455lf extends azc implements C1453ld {
    C1455lf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: a */
    public final String mo12729a() {
        Parcel a = mo11428a(2, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo12732b() {
        Parcel a = mo11428a(3, mo11432z());
        ArrayList b = aze.m4506b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo12734c() {
        Parcel a = mo11428a(4, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final C1210ce mo12736d() {
        Parcel a = mo11428a(5, mo11432z());
        C1210ce a2 = C1211cf.m6600a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo12737e() {
        Parcel a = mo11428a(6, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo12738f() {
        Parcel a = mo11428a(7, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo12739g() {
        mo11430b(8, mo11432z());
    }

    /* renamed from: a */
    public final void mo12730a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(9, z);
    }

    /* renamed from: b */
    public final void mo12733b(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(10, z);
    }

    /* renamed from: h */
    public final boolean mo12740h() {
        Parcel a = mo11428a(11, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final boolean mo12741i() {
        Parcel a = mo11428a(12, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final Bundle mo12742j() {
        Parcel a = mo11428a(13, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final void mo12735c(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(14, z);
    }

    /* renamed from: k */
    public final C0719a mo12743k() {
        Parcel a = mo11428a(15, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final btb mo12744l() {
        Parcel a = mo11428a(16, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final C1204bz mo12745m() {
        Parcel a = mo11428a(19, mo11432z());
        C1204bz a2 = C1206ca.m6594a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C0719a mo12746n() {
        Parcel a = mo11428a(20, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final C0719a mo12747o() {
        Parcel a = mo11428a(21, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12731a(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) aVar2);
        aze.m4502a(z, (IInterface) aVar3);
        mo11430b(22, z);
    }
}
