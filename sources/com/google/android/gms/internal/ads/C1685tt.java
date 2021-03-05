package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tt */
public final class C1685tt extends azc implements C1683tr {
    C1685tt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* renamed from: a */
    public final String mo12984a() {
        Parcel a = mo11428a(1, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final int mo12985b() {
        Parcel a = mo11428a(2, mo11432z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
