package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

public final class aif extends azc implements aic {
    aif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: a */
    public final boolean mo10578a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        Parcel a = mo11428a(2, z);
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final void mo10579b(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(4, z);
    }

    /* renamed from: a */
    public final void mo10577a(C0719a aVar, C0719a aVar2) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4502a(z, (IInterface) aVar2);
        mo11430b(5, z);
    }

    /* renamed from: a */
    public final String mo10576a() {
        Parcel a = mo11428a(6, mo11432z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo10580c(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(7, z);
    }

    /* renamed from: a */
    public final C0719a mo10575a(String str, C0719a aVar, String str2, String str3, String str4, String str5) {
        Parcel z = mo11432z();
        z.writeString(str);
        aze.m4502a(z, (IInterface) aVar);
        z.writeString(str2);
        z.writeString(str3);
        z.writeString(str4);
        z.writeString(str5);
        Parcel a = mo11428a(9, z);
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
