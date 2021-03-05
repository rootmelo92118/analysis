package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class btf extends azd implements bte {
    public btf() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12350a();
                break;
            case 2:
                mo12352b();
                break;
            case 3:
                mo12353c();
                break;
            case 4:
                mo12354d();
                break;
            case 5:
                mo12351a(aze.m4505a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
