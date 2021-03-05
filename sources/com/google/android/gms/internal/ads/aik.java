package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

public final class aik implements Parcelable.Creator<zzbjg> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbjg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    str = C0930a.m1351n(parcel, a);
                    break;
                case 3:
                    str2 = C0930a.m1351n(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzbjg(i, str, str2);
    }
}
