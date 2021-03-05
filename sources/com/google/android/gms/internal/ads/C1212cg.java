package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.cg */
public final class C1212cg extends azc implements C1210ce {
    C1212cg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final C0719a mo11155a() {
        Parcel a = mo11428a(1, mo11432z());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final Uri mo11156b() {
        Parcel a = mo11428a(2, mo11432z());
        Uri uri = (Uri) aze.m4501a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    /* renamed from: c */
    public final double mo11157c() {
        Parcel a = mo11428a(3, mo11432z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
