package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ob */
public final class C1532ob extends azd implements C1529nz {
    /* renamed from: a */
    public static C1529nz m7697a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        if (queryLocalInterface instanceof C1529nz) {
            return (C1529nz) queryLocalInterface;
        }
        return new C1533oc(iBinder);
    }
}
