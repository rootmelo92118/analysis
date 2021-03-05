package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class ahs extends azd implements ahr {
    /* renamed from: a */
    public static ahr m2331a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof ahr) {
            return (ahr) queryLocalInterface;
        }
        return new aht(iBinder);
    }
}
