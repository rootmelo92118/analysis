package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p044b.C1854a;
import com.google.android.gms.internal.p044b.C1856c;

/* renamed from: com.google.android.gms.common.internal.ao */
public final class C0884ao extends C1854a implements C0918l {
    C0884ao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo9824a(int i, IBinder iBinder, Bundle bundle) {
        Parcel c = mo13473c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C1856c.m8841a(c, (Parcelable) bundle);
        mo13472b(1, c);
    }

    /* renamed from: a */
    public final void mo9823a(int i, Bundle bundle) {
        Parcel c = mo13473c();
        c.writeInt(i);
        C1856c.m8841a(c, (Parcelable) bundle);
        mo13472b(2, c);
    }

    /* renamed from: a */
    public final void mo9825a(int i, IBinder iBinder, zzb zzb) {
        Parcel c = mo13473c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C1856c.m8841a(c, (Parcelable) zzb);
        mo13472b(3, c);
    }
}
