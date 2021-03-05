package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.le */
public abstract class C1454le extends azd implements C1453ld {
    public C1454le() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                String a = mo12729a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List b = mo12732b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 4:
                String c = mo12734c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 5:
                C1210ce d = mo12736d();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) d);
                return true;
            case 6:
                String e = mo12737e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 7:
                String f = mo12738f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 8:
                mo12739g();
                parcel2.writeNoException();
                return true;
            case 9:
                mo12730a(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                mo12733b(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean h = mo12740h();
                parcel2.writeNoException();
                aze.m4504a(parcel2, h);
                return true;
            case 12:
                boolean i3 = mo12741i();
                parcel2.writeNoException();
                aze.m4504a(parcel2, i3);
                return true;
            case 13:
                Bundle j = mo12742j();
                parcel2.writeNoException();
                aze.m4507b(parcel2, j);
                return true;
            case 14:
                mo12735c(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                C0719a k = mo12743k();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) k);
                return true;
            case 16:
                btb l = mo12744l();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) l);
                return true;
            case 19:
                C1204bz m = mo12745m();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) m);
                return true;
            case 20:
                C0719a n = mo12746n();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) n);
                return true;
            case 21:
                C0719a o = mo12747o();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) o);
                return true;
            case 22:
                mo12731a(C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
