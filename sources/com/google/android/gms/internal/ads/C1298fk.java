package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fk */
public final class C1298fk extends azc implements C1296fi {
    C1298fk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: a */
    public final void mo12533a(C1292fe feVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) feVar);
        mo11430b(1, z);
    }

    /* renamed from: a */
    public final void mo12532a(int i) {
        Parcel z = mo11432z();
        z.writeInt(i);
        mo11430b(2, z);
    }
}
