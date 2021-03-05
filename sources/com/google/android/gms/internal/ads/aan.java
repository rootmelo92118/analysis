package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

public final class aan implements Parcelable.Creator<zzbbi> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbbi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    str = C0930a.m1351n(parcel, a);
                    break;
                case 3:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 4:
                    i2 = C0930a.m1341d(parcel, a);
                    break;
                case 5:
                    z = C0930a.m1340c(parcel, a);
                    break;
                case 6:
                    z2 = C0930a.m1340c(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzbbi(str, i, i2, z, z2);
    }
}
