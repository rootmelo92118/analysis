package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

public final class buf implements Parcelable.Creator<zzzw> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    z3 = C0930a.m1340c(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzzw(z, z2, z3);
    }
}
