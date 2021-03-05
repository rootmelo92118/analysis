package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

public final class zzar implements Parcelable.Creator<zzaq> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    z = C0930a.m1340c(parcel, a);
                    break;
                case 3:
                    z2 = C0930a.m1340c(parcel, a);
                    break;
                case 4:
                    str = C0930a.m1351n(parcel, a);
                    break;
                case 5:
                    z3 = C0930a.m1340c(parcel, a);
                    break;
                case 6:
                    f = C0930a.m1346i(parcel, a);
                    break;
                case 7:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 8:
                    z4 = C0930a.m1340c(parcel, a);
                    break;
                case 9:
                    z5 = C0930a.m1340c(parcel, a);
                    break;
                case 10:
                    z6 = C0930a.m1340c(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzaq(z, z2, str, z3, f, i, z4, z5, z6);
    }
}
