package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lh */
public abstract class C1457lh extends azd implements C1456lg {
    public C1457lh() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                String a = mo12748a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List b = mo12751b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 4:
                String c = mo12753c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 5:
                C1210ce d = mo12754d();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) d);
                return true;
            case 6:
                String e = mo12755e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 7:
                String f = mo12756f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 8:
                double g = mo12757g();
                parcel2.writeNoException();
                parcel2.writeDouble(g);
                return true;
            case 9:
                String h = mo12758h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 10:
                String i3 = mo12759i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 11:
                btb j = mo12760j();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) j);
                return true;
            case 12:
                C1204bz k = mo12761k();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) k);
                return true;
            case 13:
                C0719a l = mo12762l();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) l);
                return true;
            case 14:
                C0719a m = mo12763m();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) m);
                return true;
            case 15:
                C0719a n = mo12764n();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) n);
                return true;
            case 16:
                Bundle o = mo12765o();
                parcel2.writeNoException();
                aze.m4507b(parcel2, o);
                return true;
            case 17:
                boolean p = mo12766p();
                parcel2.writeNoException();
                aze.m4504a(parcel2, p);
                return true;
            case 18:
                boolean q = mo12767q();
                parcel2.writeNoException();
                aze.m4504a(parcel2, q);
                return true;
            case 19:
                mo12768r();
                parcel2.writeNoException();
                return true;
            case 20:
                mo12749a(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                mo12750a(C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                mo12752b(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
