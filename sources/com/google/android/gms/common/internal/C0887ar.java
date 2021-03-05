package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzk;
import com.google.android.gms.internal.p044b.C1854a;
import com.google.android.gms.internal.p044b.C1856c;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.common.internal.ar */
public final class C0887ar extends C1854a implements C0885ap {
    C0887ar(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo9826a(zzk zzk, C0719a aVar) {
        Parcel c = mo13473c();
        C1856c.m8841a(c, (Parcelable) zzk);
        C1856c.m8840a(c, (IInterface) aVar);
        Parcel a = mo13470a(5, c);
        boolean a2 = C1856c.m8843a(a);
        a.recycle();
        return a2;
    }
}
