package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.kp */
public abstract class C1438kp extends azd implements C1437ko {
    public C1438kp() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static C1437ko m7213a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof C1437ko) {
            return (C1437ko) queryLocalInterface;
        }
        return new C1439kq(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C1440kr a = mo12677a(parcel.readString());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) a);
                return true;
            case 2:
                boolean b = mo12679b(parcel.readString());
                parcel2.writeNoException();
                aze.m4504a(parcel2, b);
                return true;
            case 3:
                C1484mh c = mo12680c(parcel.readString());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) c);
                return true;
            default:
                return false;
        }
    }
}
