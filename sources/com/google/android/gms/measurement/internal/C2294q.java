package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.common.internal.C0892c;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C2294q extends C0892c<C2286i> {
    public C2294q(Context context, Looper looper, C0892c.C0893a aVar, C0892c.C0894b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    public final int getMinApkVersion() {
        return C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C2286i) {
            return (C2286i) queryLocalInterface;
        }
        return new C2288k(iBinder);
    }
}
