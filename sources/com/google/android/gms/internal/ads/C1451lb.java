package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lb */
public abstract class C1451lb extends azd implements C1450la {
    public C1451lb() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                String a = mo12708a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List b = mo12711b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 4:
                String c = mo12713c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 5:
                C1210ce d = mo12715d();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) d);
                return true;
            case 6:
                String e = mo12716e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 7:
                double f = mo12717f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                return true;
            case 8:
                String g = mo12718g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 9:
                String h = mo12719h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 10:
                mo12720i();
                parcel2.writeNoException();
                return true;
            case 11:
                mo12709a(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                mo12712b(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean j = mo12721j();
                parcel2.writeNoException();
                aze.m4504a(parcel2, j);
                return true;
            case 14:
                boolean k = mo12722k();
                parcel2.writeNoException();
                aze.m4504a(parcel2, k);
                return true;
            case 15:
                Bundle l = mo12723l();
                parcel2.writeNoException();
                aze.m4507b(parcel2, l);
                return true;
            case 16:
                mo12714c(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                btb m = mo12724m();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) m);
                return true;
            case 18:
                C0719a n = mo12725n();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) n);
                return true;
            case 19:
                C1204bz o = mo12726o();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) o);
                return true;
            case 20:
                C0719a p = mo12727p();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) p);
                return true;
            case 21:
                C0719a q = mo12728q();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) q);
                return true;
            case 22:
                mo12710a(C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
