package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class brt extends azc implements brr {
    brt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.bro zzkd() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 1
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.bro
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.bro r1 = (com.google.android.gms.internal.ads.bro) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.brq r2 = new com.google.android.gms.internal.ads.brq
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.brt.zzkd():com.google.android.gms.internal.ads.bro");
    }

    public final void zzb(brl brl) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) brl);
        mo11430b(2, z);
    }

    public final void zza(C1238df dfVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) dfVar);
        mo11430b(3, z);
    }

    public final void zza(C1241di diVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) diVar);
        mo11430b(4, z);
    }

    public final void zza(String str, C1247do doVar, C1244dl dlVar) {
        Parcel z = mo11432z();
        z.writeString(str);
        aze.m4502a(z, (IInterface) doVar);
        aze.m4502a(z, (IInterface) dlVar);
        mo11430b(5, z);
    }

    public final void zza(zzacp zzacp) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzacp);
        mo11430b(6, z);
    }

    public final void zzb(bsk bsk) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bsk);
        mo11430b(7, z);
    }

    public final void zza(C1250dr drVar, zzwf zzwf) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) drVar);
        aze.m4503a(z, (Parcelable) zzwf);
        mo11430b(8, z);
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) publisherAdViewOptions);
        mo11430b(9, z);
    }

    public final void zza(C1253du duVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) duVar);
        mo11430b(10, z);
    }

    public final void zza(zzafz zzafz) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzafz);
        mo11430b(13, z);
    }

    public final void zza(C1296fi fiVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) fiVar);
        mo11430b(14, z);
    }
}
