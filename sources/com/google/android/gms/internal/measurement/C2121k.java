package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final class C2121k extends C1923bp implements C2111i {
    C2121k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: a */
    public final void mo14090a(Bundle bundle) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) bundle);
        mo13541b(1, b);
    }
}
