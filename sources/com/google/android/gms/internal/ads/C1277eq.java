package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.internal.ads.eq */
public final class C1277eq implements Parcelable.Creator<zzafl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    str = C0930a.m1351n(parcel, a);
                    break;
                case 2:
                    strArr = C0930a.m1362y(parcel, a);
                    break;
                case 3:
                    strArr2 = C0930a.m1362y(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzafl(str, strArr, strArr2);
    }
}
