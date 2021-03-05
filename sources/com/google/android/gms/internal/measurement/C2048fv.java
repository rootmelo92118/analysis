package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.fv */
public final class C2048fv extends C1923bp implements C1986dt {
    C2048fv(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo13772a(Bundle bundle) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) bundle);
        Parcel a = mo13538a(1, b);
        Bundle bundle2 = (Bundle) C1931bx.m9000a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
