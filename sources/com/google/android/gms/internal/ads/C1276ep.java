package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzac;
import com.google.android.gms.common.internal.C0892c;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ep */
public final class C1276ep extends zzac<C1281eu> {
    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    C1276ep(Context context, Looper looper, C0892c.C0893a aVar, C0892c.C0894b bVar) {
        super(C1678tm.m7946a(context), looper, 166, aVar, bVar, (String) null);
    }

    /* renamed from: a */
    public final C1281eu mo12520a() {
        return (C1281eu) super.getService();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof C1281eu) {
            return (C1281eu) queryLocalInterface;
        }
        return new C1282ev(iBinder);
    }
}
