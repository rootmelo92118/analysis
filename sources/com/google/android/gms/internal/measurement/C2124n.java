package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.n */
public final class C2124n extends C1923bp implements C2122l {
    C2124n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final void mo14111a(String str, String str2, Bundle bundle, long j) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9002a(b, (Parcelable) bundle);
        b.writeLong(j);
        mo13541b(1, b);
    }

    /* renamed from: a */
    public final int mo14110a() {
        Parcel a = mo13538a(2, mo13540b());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
