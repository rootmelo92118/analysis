package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.internal.af */
public final class C0875af implements Parcelable.Creator<zzb> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    bundle = C0930a.m1353p(parcel, a);
                    break;
                case 2:
                    featureArr = (Feature[]) C0930a.m1338b(parcel, a, Feature.CREATOR);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzb(bundle, featureArr);
    }
}
