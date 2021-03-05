package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cb */
public final class C1207cb extends azc implements C1204bz {
    C1207cb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public final String mo10776a() {
        Parcel a = mo11428a(2, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List<C1210ce> mo10777b() {
        Parcel a = mo11428a(3, mo11432z());
        ArrayList b = aze.m4506b(a);
        a.recycle();
        return b;
    }
}
