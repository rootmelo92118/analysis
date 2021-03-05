package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dq */
public final class C1249dq extends azc implements C1247do {
    C1249dq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12503a(C1233da daVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) daVar);
        mo11430b(1, z);
    }
}
