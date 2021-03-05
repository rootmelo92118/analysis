package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j */
public abstract class C2120j extends C1924bq implements C2111i {
    public C2120j() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13542a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo14090a((Bundle) C1931bx.m9000a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
