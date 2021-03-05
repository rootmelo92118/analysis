package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.measurement.internal.f */
public final class C2279f implements Parcelable.Creator<zzad> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            if (C0930a.m1330a(a) != 2) {
                C0930a.m1337b(parcel, a);
            } else {
                bundle = C0930a.m1353p(parcel, a);
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzad(bundle);
    }
}
