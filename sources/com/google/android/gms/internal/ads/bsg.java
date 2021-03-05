package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bsg extends azc implements bse {
    bsg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public final void mo12315a(String str, String str2) {
        Parcel z = mo11432z();
        z.writeString(str);
        z.writeString(str2);
        mo11430b(1, z);
    }
}
