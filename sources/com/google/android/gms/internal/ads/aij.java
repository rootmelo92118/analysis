package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzac;
import com.google.android.gms.common.internal.C0892c;

public final class aij extends zzac<aim> {
    public aij(Context context, Looper looper, C0892c.C0893a aVar, C0892c.C0894b bVar) {
        super(context, looper, 116, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: a */
    public final aim mo10582a() {
        return (aim) super.getService();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof aim) {
            return (aim) queryLocalInterface;
        }
        return new ain(iBinder);
    }
}
