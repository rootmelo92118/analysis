package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cu */
public final class C1226cu extends azc implements C1224cs {
    C1226cu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* renamed from: n */
    public final C0719a mo11244n() {
        Parcel a = mo11428a(2, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo11235e() {
        Parcel a = mo11428a(3, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo11236f() {
        Parcel a = mo11428a(4, mo11432z());
        ArrayList b = aze.m4506b(a);
        a.recycle();
        return b;
    }

    /* renamed from: g */
    public final String mo11237g() {
        Parcel a = mo11428a(5, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1210ce mo11238h() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 6
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1226cu.mo11238h():com.google.android.gms.internal.ads.ce");
    }

    /* renamed from: i */
    public final String mo11239i() {
        Parcel a = mo11428a(7, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final double mo11240j() {
        Parcel a = mo11428a(8, mo11432z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: k */
    public final String mo11241k() {
        Parcel a = mo11428a(9, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo11242l() {
        Parcel a = mo11428a(10, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final Bundle mo11245o() {
        Parcel a = mo11428a(11, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: s */
    public final void mo11249s() {
        mo11430b(12, mo11432z());
    }

    /* renamed from: m */
    public final btb mo11243m() {
        Parcel a = mo11428a(13, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo11232a(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        mo11430b(14, z);
    }

    /* renamed from: b */
    public final boolean mo11233b(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        Parcel a = mo11428a(15, z);
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo11234c(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        mo11430b(16, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1204bz mo11248r() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 17
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1226cu.mo11248r():com.google.android.gms.internal.ads.bz");
    }

    /* renamed from: p */
    public final C0719a mo11246p() {
        Parcel a = mo11428a(18, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final String mo11247q() {
        Parcel a = mo11428a(19, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
