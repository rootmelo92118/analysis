package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bsn extends azc implements bsk {
    bsn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    /* renamed from: b */
    public final long mo12327b() {
        Parcel a = mo11428a(1, mo11432z());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
