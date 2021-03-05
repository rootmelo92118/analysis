package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.db */
public abstract class C1234db extends azd implements C1233da {
    public C1234db() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public static C1233da m6710a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof C1233da) {
            return (C1233da) queryLocalInterface;
        }
        return new C1235dc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String a = mo11406a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                C1210ce b = mo11408b(parcel.readString());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) b);
                return true;
            case 3:
                List<String> e = mo11410e();
                parcel2.writeNoException();
                parcel2.writeStringList(e);
                return true;
            case 4:
                String b2 = mo11093b();
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            case 5:
                mo11409c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo11413h();
                parcel2.writeNoException();
                return true;
            case 7:
                btb g = mo11412g();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) g);
                return true;
            case 8:
                mo11415j();
                parcel2.writeNoException();
                return true;
            case 9:
                C0719a i3 = mo11414i();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) i3);
                return true;
            case 10:
                boolean a2 = mo11407a(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                aze.m4504a(parcel2, a2);
                return true;
            case 11:
                C0719a f = mo11411f();
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) f);
                return true;
            default:
                return false;
        }
    }
}
