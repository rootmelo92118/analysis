package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kt */
public final class C1442kt extends azc implements C1440kr {
    C1442kt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: a */
    public final void mo12688a(C0719a aVar, zzwf zzwf, zzwb zzwb, String str, C1443ku kuVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzwf);
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        aze.m4502a(z, (IInterface) kuVar);
        mo11430b(1, z);
    }

    /* renamed from: a */
    public final C0719a mo12681a() {
        Parcel a = mo11428a(2, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12684a(C0719a aVar, zzwb zzwb, String str, C1443ku kuVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        aze.m4502a(z, (IInterface) kuVar);
        mo11430b(3, z);
    }

    /* renamed from: b */
    public final void mo12693b() {
        mo11430b(4, mo11432z());
    }

    /* renamed from: c */
    public final void mo12694c() {
        mo11430b(5, mo11432z());
    }

    /* renamed from: a */
    public final void mo12689a(C0719a aVar, zzwf zzwf, zzwb zzwb, String str, String str2, C1443ku kuVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzwf);
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        z.writeString(str2);
        aze.m4502a(z, (IInterface) kuVar);
        mo11430b(6, z);
    }

    /* renamed from: a */
    public final void mo12686a(C0719a aVar, zzwb zzwb, String str, String str2, C1443ku kuVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        z.writeString(str2);
        aze.m4502a(z, (IInterface) kuVar);
        mo11430b(7, z);
    }

    /* renamed from: d */
    public final void mo12695d() {
        mo11430b(8, mo11432z());
    }

    /* renamed from: e */
    public final void mo12696e() {
        mo11430b(9, mo11432z());
    }

    /* renamed from: a */
    public final void mo12685a(C0719a aVar, zzwb zzwb, String str, C1718uz uzVar, String str2) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        aze.m4502a(z, (IInterface) uzVar);
        z.writeString(str2);
        mo11430b(10, z);
    }

    /* renamed from: a */
    public final void mo12690a(zzwb zzwb, String str) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        mo11430b(11, z);
    }

    /* renamed from: f */
    public final void mo12697f() {
        mo11430b(12, mo11432z());
    }

    /* renamed from: g */
    public final boolean mo12698g() {
        Parcel a = mo11428a(13, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12687a(C0719a aVar, zzwb zzwb, String str, String str2, C1443ku kuVar, zzacp zzacp, List<String> list) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        z.writeString(str2);
        aze.m4502a(z, (IInterface) kuVar);
        aze.m4503a(z, (Parcelable) zzacp);
        z.writeStringList(list);
        mo11430b(14, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1450la mo12699h() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 15
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1450la
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.la r1 = (com.google.android.gms.internal.ads.C1450la) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.lc r2 = new com.google.android.gms.internal.ads.lc
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1442kt.mo12699h():com.google.android.gms.internal.ads.la");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1453ld mo12700i() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 16
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1453ld
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.ld r1 = (com.google.android.gms.internal.ads.C1453ld) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.lf r2 = new com.google.android.gms.internal.ads.lf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1442kt.mo12700i():com.google.android.gms.internal.ads.ld");
    }

    /* renamed from: j */
    public final Bundle mo12701j() {
        Parcel a = mo11428a(17, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final Bundle mo12702k() {
        Parcel a = mo11428a(18, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: l */
    public final Bundle mo12703l() {
        Parcel a = mo11428a(19, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo12691a(zzwb zzwb, String str, String str2) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzwb);
        z.writeString(str);
        z.writeString(str2);
        mo11430b(20, z);
    }

    /* renamed from: a */
    public final void mo12682a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(21, z);
    }

    /* renamed from: m */
    public final boolean mo12704m() {
        Parcel a = mo11428a(22, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12683a(C0719a aVar, C1718uz uzVar, List<String> list) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) uzVar);
        z.writeStringList(list);
        mo11430b(23, z);
    }

    /* renamed from: n */
    public final C1233da mo12705n() {
        Parcel a = mo11428a(24, mo11432z());
        C1233da a2 = C1234db.m6710a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12692a(boolean z) {
        Parcel z2 = mo11432z();
        aze.m4504a(z2, z);
        mo11430b(25, z2);
    }

    /* renamed from: o */
    public final btb mo12706o() {
        Parcel a = mo11428a(26, mo11432z());
        btb a2 = btc.m6391a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1456lg mo12707p() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 27
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1456lg
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.lg r1 = (com.google.android.gms.internal.ads.C1456lg) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.lj r2 = new com.google.android.gms.internal.ads.lj
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1442kt.mo12707p():com.google.android.gms.internal.ads.lg");
    }
}
