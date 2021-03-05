package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.internal.ads.ui */
public final class C1701ui implements Parcelable.Creator<zzavh> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzavh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        zzwb zzwb = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    zzwb = (zzwb) C0930a.m1333a(parcel, a, zzwb.CREATOR);
                    break;
                case 3:
                    str = C0930a.m1351n(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzavh(zzwb, str);
    }
}
