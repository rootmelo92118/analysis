package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.m */
public abstract class C2123m extends C1924bq implements C2122l {
    public C2123m() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13542a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo14111a(parcel.readString(), parcel.readString(), (Bundle) C1931bx.m9000a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 2:
                int a = mo14110a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            default:
                return false;
        }
    }
}
