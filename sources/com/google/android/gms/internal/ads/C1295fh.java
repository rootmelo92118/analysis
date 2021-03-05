package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fh */
public final class C1295fh extends azc implements C1294fg {
    C1295fh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: a */
    public final void mo12530a() {
        mo11430b(1, mo11432z());
    }

    /* renamed from: a */
    public final void mo12531a(int i) {
        Parcel z = mo11432z();
        z.writeInt(i);
        mo11430b(2, z);
    }
}
