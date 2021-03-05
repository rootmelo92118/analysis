package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p044b.C1855b;
import com.google.android.gms.internal.p044b.C1856c;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.common.internal.am */
public abstract class C0882am extends C1855b implements C0881al {
    public C0882am() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static C0881al m1209a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C0881al) {
            return (C0881al) queryLocalInterface;
        }
        return new C0883an(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo9822a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C0719a a = mo9820a();
                parcel2.writeNoException();
                C1856c.m8840a(parcel2, (IInterface) a);
                return true;
            case 2:
                int b = mo9821b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            default:
                return false;
        }
    }
}
