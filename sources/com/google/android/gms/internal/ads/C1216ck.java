package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.ck */
public final class C1216ck extends azc implements C1214ci {
    C1216ck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public final void mo12341a(String str, C0719a aVar) {
        Parcel z = mo11432z();
        z.writeString(str);
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(1, z);
    }

    /* renamed from: a */
    public final C0719a mo12337a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        Parcel a = mo11428a(2, z);
        C0719a a2 = C0719a.C0720a.m768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12339a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(3, z);
    }

    /* renamed from: a */
    public final void mo12338a() {
        mo11430b(4, mo11432z());
    }

    /* renamed from: a */
    public final void mo12340a(C0719a aVar, int i) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeInt(i);
        mo11430b(5, z);
    }

    /* renamed from: b */
    public final void mo12343b(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(6, z);
    }
}
