package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.base.C1860a;
import com.google.android.gms.internal.base.C1862c;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C2316g extends C1860a implements C2315f {
    C2316g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo14880a(zah zah, C2313d dVar) {
        Parcel a = mo13476a();
        C1862c.m8851a(a, (Parcelable) zah);
        C1862c.m8850a(a, (IInterface) dVar);
        mo13479b(12, a);
    }
}
