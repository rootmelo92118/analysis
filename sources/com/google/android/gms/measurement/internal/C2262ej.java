package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.measurement.internal.ej */
public final class C2262ej implements Parcelable.Creator<zzfv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C0930a.m1336b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel2, a);
                    break;
                case 2:
                    str = C0930a.m1351n(parcel2, a);
                    break;
                case 3:
                    j = C0930a.m1343f(parcel2, a);
                    break;
                case 4:
                    l = C0930a.m1344g(parcel2, a);
                    break;
                case 5:
                    f = C0930a.m1347j(parcel2, a);
                    break;
                case 6:
                    str2 = C0930a.m1351n(parcel2, a);
                    break;
                case 7:
                    str3 = C0930a.m1351n(parcel2, a);
                    break;
                case 8:
                    d = C0930a.m1349l(parcel2, a);
                    break;
                default:
                    C0930a.m1337b(parcel2, a);
                    break;
            }
        }
        C0930a.m1329D(parcel2, b);
        return new zzfv(i, str, j, l, f, str2, str3, d);
    }
}
