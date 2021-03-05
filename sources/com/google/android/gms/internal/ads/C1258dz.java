package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dz */
public final class C1258dz extends azc implements C1256dx {
    C1258dz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: a */
    public final void mo12507a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(1, z);
    }

    /* renamed from: a */
    public final void mo12506a() {
        mo11430b(2, mo11432z());
    }
}
