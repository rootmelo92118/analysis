package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class azi extends azd implements azh {
    /* renamed from: a */
    public static azh m4519a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof azh) {
            return (azh) queryLocalInterface;
        }
        return new azj(iBinder);
    }
}
