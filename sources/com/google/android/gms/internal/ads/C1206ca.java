package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ca */
public abstract class C1206ca extends azd implements C1204bz {
    public C1206ca() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public static C1204bz m6594a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof C1204bz) {
            return (C1204bz) queryLocalInterface;
        }
        return new C1207cb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                String a = mo10776a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List<C1210ce> b = mo10777b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            default:
                return false;
        }
    }
}
