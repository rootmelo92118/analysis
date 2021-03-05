package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;

public final class bry extends azc implements brw {
    bry(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final C0719a zzie() {
        Parcel a = mo11428a(1, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void destroy() {
        mo11430b(2, mo11432z());
    }

    public final boolean isReady() {
        Parcel a = mo11428a(3, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    public final boolean zzb(zzwb zzwb) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzwb);
        Parcel a = mo11428a(4, z);
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    public final void pause() {
        mo11430b(5, mo11432z());
    }

    public final void resume() {
        mo11430b(6, mo11432z());
    }

    public final void zza(brl brl) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) brl);
        mo11430b(7, z);
    }

    public final void zza(bse bse) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bse);
        mo11430b(8, z);
    }

    public final void showInterstitial() {
        mo11430b(9, mo11432z());
    }

    public final void stopLoading() {
        mo11430b(10, mo11432z());
    }

    public final void zzih() {
        mo11430b(11, mo11432z());
    }

    public final zzwf zzif() {
        Parcel a = mo11428a(12, mo11432z());
        zzwf zzwf = (zzwf) aze.m4501a(a, zzwf.CREATOR);
        a.recycle();
        return zzwf;
    }

    public final void zza(zzwf zzwf) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzwf);
        mo11430b(13, z);
    }

    public final void zza(C1526nw nwVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) nwVar);
        mo11430b(14, z);
    }

    public final void zza(C1534od odVar, String str) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) odVar);
        z.writeString(str);
        mo11430b(15, z);
    }

    public final String getMediationAdapterClassName() {
        Parcel a = mo11428a(18, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zza(C1026aj ajVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) ajVar);
        mo11430b(19, z);
    }

    public final void zza(brh brh) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) brh);
        mo11430b(20, z);
    }

    public final void zza(bsk bsk) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bsk);
        mo11430b(21, z);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Parcel z2 = mo11432z();
        aze.m4504a(z2, z);
        mo11430b(22, z2);
    }

    public final boolean isLoading() {
        Parcel a = mo11428a(23, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    public final void zza(C1695uc ucVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) ucVar);
        mo11430b(24, z);
    }

    public final void setUserId(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(25, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.btb getVideoController() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 26
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.btb
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.btb r1 = (com.google.android.gms.internal.ads.btb) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.btd r2 = new com.google.android.gms.internal.ads.btd
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bry.getVideoController():com.google.android.gms.internal.ads.btb");
    }

    public final void zza(zzzw zzzw) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzzw);
        mo11430b(29, z);
    }

    public final void zza(zzyv zzyv) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzyv);
        mo11430b(30, z);
    }

    public final String getAdUnitId() {
        Parcel a = mo11428a(31, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.bse zzir() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 32
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.bse
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.bse r1 = (com.google.android.gms.internal.ads.bse) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.bsg r2 = new com.google.android.gms.internal.ads.bsg
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bry.zzir():com.google.android.gms.internal.ads.bse");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.brl zzis() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 33
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.brl
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.brl r1 = (com.google.android.gms.internal.ads.brl) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.brn r2 = new com.google.android.gms.internal.ads.brn
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bry.zzis():com.google.android.gms.internal.ads.brl");
    }

    public final void setImmersiveMode(boolean z) {
        Parcel z2 = mo11432z();
        aze.m4504a(z2, z);
        mo11430b(34, z2);
    }

    public final String zzje() {
        Parcel a = mo11428a(35, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zza(bsb bsb) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bsb);
        mo11430b(36, z);
    }

    public final Bundle getAdMetadata() {
        Parcel a = mo11428a(37, mo11432z());
        Bundle bundle = (Bundle) aze.m4501a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void zzap(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(38, z);
    }
}
