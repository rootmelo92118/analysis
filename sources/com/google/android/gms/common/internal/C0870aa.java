package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.base.C1860a;
import com.google.android.gms.internal.base.C1862c;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.common.internal.aa */
public final class C0870aa extends C1860a implements C0923n {
    C0870aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: a */
    public final C0719a mo9789a(C0719a aVar, SignInButtonConfig signInButtonConfig) {
        Parcel a = mo13476a();
        C1862c.m8850a(a, (IInterface) aVar);
        C1862c.m8851a(a, (Parcelable) signInButtonConfig);
        Parcel a2 = mo13477a(2, a);
        C0719a a3 = C0719a.C0720a.m768a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
