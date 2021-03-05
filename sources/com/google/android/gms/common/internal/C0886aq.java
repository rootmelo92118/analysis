package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p044b.C1855b;

/* renamed from: com.google.android.gms.common.internal.aq */
public abstract class C0886aq extends C1855b implements C0885ap {
    /* renamed from: a */
    public static C0885ap m1217a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C0885ap) {
            return (C0885ap) queryLocalInterface;
        }
        return new C0887ar(iBinder);
    }
}
