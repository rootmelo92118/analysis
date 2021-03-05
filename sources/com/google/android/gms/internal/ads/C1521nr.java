package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.nr */
public final class C1521nr extends azc implements C1519np {
    C1521nr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onCreate(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        mo11430b(1, z);
    }

    public final void onRestart() {
        mo11430b(2, mo11432z());
    }

    public final void onStart() {
        mo11430b(3, mo11432z());
    }

    public final void onResume() {
        mo11430b(4, mo11432z());
    }

    public final void onPause() {
        mo11430b(5, mo11432z());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        Parcel a = mo11428a(6, z);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    public final void onStop() {
        mo11430b(7, mo11432z());
    }

    public final void onDestroy() {
        mo11430b(8, mo11432z());
    }

    public final void zzay() {
        mo11430b(9, mo11432z());
    }

    public final void onBackPressed() {
        mo11430b(10, mo11432z());
    }

    public final boolean zzvq() {
        Parcel a = mo11428a(11, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel z = mo11432z();
        z.writeInt(i);
        z.writeInt(i2);
        aze.m4503a(z, (Parcelable) intent);
        mo11430b(12, z);
    }

    public final void zzq(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(13, z);
    }
}
