package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

public final class boj implements Parcelable.Creator<zzty> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzty[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C0930a.m1336b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    str = C0930a.m1351n(parcel2, a);
                    break;
                case 3:
                    j = C0930a.m1343f(parcel2, a);
                    break;
                case 4:
                    str2 = C0930a.m1351n(parcel2, a);
                    break;
                case 5:
                    str3 = C0930a.m1351n(parcel2, a);
                    break;
                case 6:
                    str4 = C0930a.m1351n(parcel2, a);
                    break;
                case 7:
                    bundle = C0930a.m1353p(parcel2, a);
                    break;
                case 8:
                    z = C0930a.m1340c(parcel2, a);
                    break;
                case 9:
                    j2 = C0930a.m1343f(parcel2, a);
                    break;
                default:
                    C0930a.m1337b(parcel2, a);
                    break;
            }
        }
        C0930a.m1329D(parcel2, b);
        return new zzty(str, j, str2, str3, str4, bundle, z, j2);
    }
}
