package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aie extends azd implements aic {
    /* renamed from: a */
    public static aic m2354a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        if (queryLocalInterface instanceof aic) {
            return (aic) queryLocalInterface;
        }
        return new aif(iBinder);
    }
}
