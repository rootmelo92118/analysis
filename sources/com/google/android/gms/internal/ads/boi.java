package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzac;
import com.google.android.gms.common.internal.C0892c;

@C1598qn
public final class boi extends zzac<bom> {
    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    boi(Context context, Looper looper, C0892c.C0893a aVar, C0892c.C0894b bVar) {
        super(C1678tm.m7946a(context), looper, 123, aVar, bVar, (String) null);
    }

    /* renamed from: a */
    public final bom mo12275a() {
        return (bom) super.getService();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof bom) {
            return (bom) queryLocalInterface;
        }
        return new bon(iBinder);
    }
}
