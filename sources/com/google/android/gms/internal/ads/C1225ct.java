package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ct */
public abstract class C1225ct extends azd implements C1224cs {
    public C1225ct() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                C0719a n = mo11244n();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) n);
                return true;
            case 3:
                String e = mo11235e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 4:
                List f = mo11236f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 5:
                String g = mo11237g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 6:
                C1210ce h = mo11238h();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) h);
                return true;
            case 7:
                String i3 = mo11239i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 8:
                double j = mo11240j();
                parcel2.writeNoException();
                parcel2.writeDouble(j);
                return true;
            case 9:
                String k = mo11241k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 10:
                String l = mo11242l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            case 11:
                Bundle o = mo11245o();
                parcel2.writeNoException();
                aze.m4507b(parcel2, o);
                return true;
            case 12:
                mo11249s();
                parcel2.writeNoException();
                return true;
            case 13:
                btb m = mo11243m();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) m);
                return true;
            case 14:
                mo11232a((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean b = mo11233b((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                aze.m4504a(parcel2, b);
                return true;
            case 16:
                mo11234c((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                C1204bz r = mo11248r();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) r);
                return true;
            case 18:
                C0719a p = mo11246p();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) p);
                return true;
            case 19:
                String q = mo11247q();
                parcel2.writeNoException();
                parcel2.writeString(q);
                return true;
            default:
                return false;
        }
    }
}
