package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cx */
public abstract class C1229cx extends azd implements C1228cw {
    public C1229cx() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                C0719a n = mo11336n();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) n);
                return true;
            case 3:
                String e = mo11328e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 4:
                List f = mo11236f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 5:
                String i3 = mo11331i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 6:
                C1210ce j = mo11332j();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) j);
                return true;
            case 7:
                String k = mo11333k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 8:
                String l = mo11334l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            case 9:
                Bundle o = mo11337o();
                parcel2.writeNoException();
                aze.m4507b(parcel2, o);
                return true;
            case 10:
                mo11339q();
                parcel2.writeNoException();
                return true;
            case 11:
                btb m = mo11335m();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) m);
                return true;
            case 12:
                mo11325a((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean b = mo11326b((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                aze.m4504a(parcel2, b);
                return true;
            case 14:
                mo11327c((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                C1204bz p = mo11338p();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) p);
                return true;
            case 16:
                C0719a g = mo11329g();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) g);
                return true;
            case 17:
                String h = mo11330h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            default:
                return false;
        }
    }
}
