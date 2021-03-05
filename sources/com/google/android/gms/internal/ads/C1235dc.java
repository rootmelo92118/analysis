package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dc */
public final class C1235dc extends azc implements C1233da {
    C1235dc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public final String mo11406a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        Parcel a = mo11428a(1, z);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1210ce mo11408b(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo11432z()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo11428a(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.C1210ce
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.ce r0 = (com.google.android.gms.internal.ads.C1210ce) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.cg r1 = new com.google.android.gms.internal.ads.cg
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1235dc.mo11408b(java.lang.String):com.google.android.gms.internal.ads.ce");
    }

    /* renamed from: e */
    public final List<String> mo11410e() {
        Parcel a = mo11428a(3, mo11432z());
        ArrayList<String> createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    /* renamed from: b */
    public final String mo11093b() {
        Parcel a = mo11428a(4, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo11409c(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(5, z);
    }

    /* renamed from: h */
    public final void mo11413h() {
        mo11430b(6, mo11432z());
    }

    /* renamed from: g */
    public final btb mo11412g() {
        Parcel a = mo11428a(7, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final void mo11415j() {
        mo11430b(8, mo11432z());
    }

    /* renamed from: i */
    public final C0719a mo11414i() {
        Parcel a = mo11428a(9, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo11407a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        Parcel a = mo11428a(10, z);
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final C0719a mo11411f() {
        Parcel a = mo11428a(11, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
