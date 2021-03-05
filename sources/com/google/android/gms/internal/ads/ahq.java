package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.List;
import java.util.Map;

public abstract class ahq extends azd implements ahp {
    public ahq() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo10553a((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle b = mo10557b((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                aze.m4507b(parcel2, b);
                return true;
            case 3:
                mo10555a(parcel.readString(), parcel.readString(), (Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo10556a(parcel.readString(), parcel.readString(), C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map a = mo10552a(parcel.readString(), parcel.readString(), aze.m4505a(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(a);
                return true;
            case 6:
                int a2 = mo10549a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            case 7:
                mo10562c((Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo10560b(parcel.readString(), parcel.readString(), (Bundle) aze.m4501a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List a3 = mo10551a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(a3);
                return true;
            case 10:
                String a4 = mo10550a();
                parcel2.writeNoException();
                parcel2.writeString(a4);
                return true;
            case 11:
                String b2 = mo10558b();
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            case 12:
                long c = mo10561c();
                parcel2.writeNoException();
                parcel2.writeLong(c);
                return true;
            case 13:
                mo10559b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                mo10563c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo10554a(C0719a.C0720a.m768a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String d = mo10564d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 17:
                String e = mo10565e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 18:
                String f = mo10566f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            default:
                return false;
        }
    }
}
