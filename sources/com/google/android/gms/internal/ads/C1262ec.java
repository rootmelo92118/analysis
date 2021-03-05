package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ec */
public final class C1262ec extends azc implements C1260ea {
    C1262ec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: e */
    public final String mo11590e() {
        Parcel a = mo11428a(2, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo11236f() {
        Parcel a = mo11428a(3, mo11432z());
        ArrayList b = aze.m4506b(a);
        a.recycle();
        return b;
    }

    /* renamed from: i */
    public final String mo11593i() {
        Parcel a = mo11428a(4, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1210ce mo11594j() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 5
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1210ce
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.ce r1 = (com.google.android.gms.internal.ads.C1210ce) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.cg r2 = new com.google.android.gms.internal.ads.cg
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1262ec.mo11594j():com.google.android.gms.internal.ads.ce");
    }

    /* renamed from: k */
    public final String mo11595k() {
        Parcel a = mo11428a(6, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo11596l() {
        Parcel a = mo11428a(7, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: m */
    public final double mo11597m() {
        Parcel a = mo11428a(8, mo11432z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: n */
    public final String mo11598n() {
        Parcel a = mo11428a(9, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo11599o() {
        Parcel a = mo11428a(10, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: p */
    public final btb mo11600p() {
        Parcel a = mo11428a(11, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: s */
    public final String mo11603s() {
        Parcel a = mo11428a(12, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: v */
    public final void mo11606v() {
        mo11430b(13, mo11432z());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1204bz mo11605u() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 14
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1204bz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.bz r1 = (com.google.android.gms.internal.ads.C1204bz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.cb r2 = new com.google.android.gms.internal.ads.cb
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1262ec.mo11605u():com.google.android.gms.internal.ads.bz");
    }

    /* renamed from: a */
    public final void mo11584a(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        mo11430b(15, z);
    }

    /* renamed from: b */
    public final boolean mo11588b(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        Parcel a = mo11428a(16, z);
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo11589c(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        mo11430b(17, z);
    }

    /* renamed from: q */
    public final C0719a mo11601q() {
        Parcel a = mo11428a(18, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final C0719a mo11602r() {
        Parcel a = mo11428a(19, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: t */
    public final Bundle mo11604t() {
        Parcel a = mo11428a(20, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo11587a(C1256dx dxVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) dxVar);
        mo11430b(21, z);
    }

    /* renamed from: y */
    public final void mo11609y() {
        mo11430b(22, mo11432z());
    }

    /* renamed from: g */
    public final List mo11591g() {
        Parcel a = mo11428a(23, mo11432z());
        ArrayList b = aze.m4506b(a);
        a.recycle();
        return b;
    }

    /* renamed from: h */
    public final boolean mo11592h() {
        Parcel a = mo11428a(24, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo11586a(bsx bsx) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bsx);
        mo11430b(25, z);
    }

    /* renamed from: a */
    public final void mo11585a(bst bst) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bst);
        mo11430b(26, z);
    }

    /* renamed from: w */
    public final void mo11607w() {
        mo11430b(27, mo11432z());
    }

    /* renamed from: x */
    public final void mo11608x() {
        mo11430b(28, mo11432z());
    }
}
