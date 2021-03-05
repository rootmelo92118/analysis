package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bsz extends azc implements bsx {
    bsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: a */
    public final String mo12336a() {
        Parcel a = mo11428a(1, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
