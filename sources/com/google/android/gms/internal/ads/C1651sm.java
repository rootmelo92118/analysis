package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.internal.ads.sm */
public final class C1651sm implements Parcelable.Creator<zzatm> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzatm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            if (C0930a.m1330a(a) != 2) {
                C0930a.m1337b(parcel, a);
            } else {
                str = C0930a.m1351n(parcel, a);
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzatm(str);
    }
}
