package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzac;
import com.google.android.gms.common.internal.C0892c;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.rl */
public final class C1623rl extends zzac<C1629rr> {
    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public C1623rl(Context context, Looper looper, C0892c.C0893a aVar, C0892c.C0894b bVar) {
        super(C1678tm.m7946a(context), looper, 8, aVar, bVar, (String) null);
    }

    /* renamed from: a */
    public final C1629rr mo12919a() {
        return (C1629rr) super.getService();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof C1629rr) {
            return (C1629rr) queryLocalInterface;
        }
        return new C1631rt(iBinder);
    }
}
