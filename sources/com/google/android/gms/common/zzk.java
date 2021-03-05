package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C0882am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import javax.annotation.Nullable;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C0962u();

    /* renamed from: a */
    private final String f1236a;
    @Nullable

    /* renamed from: b */
    private final C0944n f1237b;

    /* renamed from: c */
    private final boolean f1238c;

    zzk(String str, @Nullable IBinder iBinder, boolean z) {
        this.f1236a = str;
        this.f1237b = m1529a(iBinder);
        this.f1238c = z;
    }

    zzk(String str, @Nullable C0944n nVar, boolean z) {
        this.f1236a = str;
        this.f1237b = nVar;
        this.f1238c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 1, this.f1236a, false);
        if (this.f1237b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = this.f1237b.asBinder();
        }
        C0932b.m1370a(parcel, 2, iBinder, false);
        C0932b.m1379a(parcel, 3, this.f1238c);
        C0932b.m1365a(parcel, a);
    }

    @Nullable
    /* renamed from: a */
    private static C0944n m1529a(@Nullable IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            C0719a a = C0882am.m1209a(iBinder).mo9820a();
            if (a == null) {
                bArr = null;
            } else {
                bArr = (byte[]) C0722b.m770a(a);
            }
            if (bArr != null) {
                return new C0945o(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
