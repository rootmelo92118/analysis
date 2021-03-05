package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.C1924bq;
import com.google.android.gms.internal.measurement.C1931bx;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.j */
public abstract class C2287j extends C1924bq implements C2286i {
    public C2287j() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13542a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo14344a((zzag) C1931bx.m9000a(parcel, zzag.CREATOR), (zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo14346a((zzfv) C1931bx.m9000a(parcel, zzfv.CREATOR), (zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo14347a((zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo14345a((zzag) C1931bx.m9000a(parcel, zzag.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo14352b((zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzfv> a = mo14338a((zzk) C1931bx.m9000a(parcel, zzk.CREATOR), C1931bx.m9004a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 9:
                byte[] a2 = mo14350a((zzag) C1931bx.m9000a(parcel, zzag.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                return true;
            case 10:
                mo14343a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String c = mo14353c((zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 12:
                mo14349a((zzo) C1931bx.m9000a(parcel, zzo.CREATOR), (zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo14348a((zzo) C1931bx.m9000a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzfv> a3 = mo14342a(parcel.readString(), parcel.readString(), C1931bx.m9004a(parcel), (zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                return true;
            case 15:
                List<zzfv> a4 = mo14341a(parcel.readString(), parcel.readString(), parcel.readString(), C1931bx.m9004a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                return true;
            case 16:
                List<zzo> a5 = mo14339a(parcel.readString(), parcel.readString(), (zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                return true;
            case 17:
                List<zzo> a6 = mo14340a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                return true;
            case 18:
                mo14354d((zzk) C1931bx.m9000a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
