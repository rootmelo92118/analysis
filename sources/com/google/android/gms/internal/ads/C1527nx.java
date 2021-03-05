package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.nx */
public final class C1527nx extends azd implements C1526nw {
    /* renamed from: a */
    public static C1526nw m7692a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof C1526nw) {
            return (C1526nw) queryLocalInterface;
        }
        return new C1528ny(iBinder);
    }
}
