package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.ah */
public abstract class C1024ah extends azd implements C1023ag {
    public C1024ah() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String a = mo10260a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                String b = mo10262b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                mo10261a(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                mo10263c();
                parcel2.writeNoException();
                return true;
            case 5:
                mo10264d();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
