package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.dt */
public final class C1252dt extends azc implements C1250dr {
    C1252dt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: a */
    public final void mo12504a(brw brw, C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) brw);
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(1, z);
    }
}
