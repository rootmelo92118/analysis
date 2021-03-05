package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.p044b.C1854a;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.common.internal.an */
public final class C0883an extends C1854a implements C0881al {
    C0883an(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final C0719a mo9820a() {
        Parcel a = mo13470a(1, mo13473c());
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo9821b() {
        Parcel a = mo13470a(2, mo13473c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
