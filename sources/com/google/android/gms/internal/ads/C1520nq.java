package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.nq */
public abstract class C1520nq extends azd implements C1519np {
    public C1520nq() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static C1519np zzx(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof C1519np) {
            return (C1519np) queryLocalInterface;
        }
        return new C1521nr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                onCreate((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                onRestart();
                parcel2.writeNoException();
                return true;
            case 3:
                onStart();
                parcel2.writeNoException();
                return true;
            case 4:
                onResume();
                parcel2.writeNoException();
                return true;
            case 5:
                onPause();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) aze.m4501a(parcel, Bundle.CREATOR);
                onSaveInstanceState(bundle);
                parcel2.writeNoException();
                aze.m4507b(parcel2, bundle);
                return true;
            case 7:
                onStop();
                parcel2.writeNoException();
                return true;
            case 8:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 9:
                zzay();
                parcel2.writeNoException();
                return true;
            case 10:
                onBackPressed();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzvq = zzvq();
                parcel2.writeNoException();
                aze.m4504a(parcel2, zzvq);
                return true;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) aze.m4501a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzq(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
