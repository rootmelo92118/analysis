package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.internal.measurement.q */
public final class C2127q implements Parcelable.Creator<zzdy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C0930a.m1336b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    j = C0930a.m1343f(parcel2, a);
                    break;
                case 2:
                    j2 = C0930a.m1343f(parcel2, a);
                    break;
                case 3:
                    z = C0930a.m1340c(parcel2, a);
                    break;
                case 4:
                    str = C0930a.m1351n(parcel2, a);
                    break;
                case 5:
                    str2 = C0930a.m1351n(parcel2, a);
                    break;
                case 6:
                    str3 = C0930a.m1351n(parcel2, a);
                    break;
                case 7:
                    bundle = C0930a.m1353p(parcel2, a);
                    break;
                default:
                    C0930a.m1337b(parcel2, a);
                    break;
            }
        }
        C0930a.m1329D(parcel2, b);
        return new zzdy(j, j2, z, str, str2, str3, bundle);
    }
}
