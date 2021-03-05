package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.eu */
public abstract class C2020eu extends C1924bq implements C1986dt {
    /* renamed from: a */
    public static C1986dt m9583a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C1986dt) {
            return (C1986dt) queryLocalInterface;
        }
        return new C2048fv(iBinder);
    }
}
