package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.oe */
public final class C1535oe extends azd implements C1534od {
    /* renamed from: a */
    public static C1534od m7698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof C1534od) {
            return (C1534od) queryLocalInterface;
        }
        return new C1536of(iBinder);
    }
}
