package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p044b.C1855b;
import com.google.android.gms.internal.p044b.C1856c;

/* renamed from: com.google.android.gms.common.internal.l */
public interface C0918l extends IInterface {
    /* renamed from: a */
    void mo9823a(int i, Bundle bundle);

    /* renamed from: a */
    void mo9824a(int i, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo9825a(int i, IBinder iBinder, zzb zzb);

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public static abstract class C0919a extends C1855b implements C0918l {
        public C0919a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo9822a(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    mo9824a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C1856c.m8839a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    mo9823a(parcel.readInt(), (Bundle) C1856c.m8839a(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    mo9825a(parcel.readInt(), parcel.readStrongBinder(), (zzb) C1856c.m8839a(parcel, zzb.CREATOR));
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
