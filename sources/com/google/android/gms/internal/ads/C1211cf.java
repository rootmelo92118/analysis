package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.cf */
public abstract class C1211cf extends azd implements C1210ce {
    public C1211cf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static C1210ce m6600a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof C1210ce) {
            return (C1210ce) queryLocalInterface;
        }
        return new C1212cg(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C0719a a = mo11155a();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) a);
                return true;
            case 2:
                Uri b = mo11156b();
                parcel2.writeNoException();
                aze.m4507b(parcel2, b);
                return true;
            case 3:
                double c = mo11157c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                return true;
            default:
                return false;
        }
    }
}
