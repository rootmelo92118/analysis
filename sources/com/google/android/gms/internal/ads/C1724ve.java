package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.internal.ads.ve */
public final class C1724ve implements Parcelable.Creator<zzawd> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzawd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    str = C0930a.m1351n(parcel, a);
                    break;
                case 3:
                    i = C0930a.m1341d(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzawd(str, i);
    }
}
