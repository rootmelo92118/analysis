package com.google.android.gms.internal.p043a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.a.f */
public abstract class C1013f extends C1009b implements C1012e {
    /* renamed from: a */
    public static C1012e m1580a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C1012e ? (C1012e) queryLocalInterface : new C1014g(iBinder);
    }
}
