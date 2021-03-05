package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

public final class bud implements Parcelable.Creator<zzzs> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            if (C0930a.m1330a(a) != 15) {
                C0930a.m1337b(parcel, a);
            } else {
                str = C0930a.m1351n(parcel, a);
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzzs(str);
    }
}
