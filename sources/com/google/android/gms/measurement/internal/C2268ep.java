package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.measurement.internal.ep */
public final class C2268ep implements Parcelable.Creator<zzk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C0930a.m1336b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j5 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    str = C0930a.m1351n(parcel2, a);
                    break;
                case 3:
                    str2 = C0930a.m1351n(parcel2, a);
                    break;
                case 4:
                    str3 = C0930a.m1351n(parcel2, a);
                    break;
                case 5:
                    str4 = C0930a.m1351n(parcel2, a);
                    break;
                case 6:
                    j = C0930a.m1343f(parcel2, a);
                    break;
                case 7:
                    j2 = C0930a.m1343f(parcel2, a);
                    break;
                case 8:
                    str5 = C0930a.m1351n(parcel2, a);
                    break;
                case 9:
                    z = C0930a.m1340c(parcel2, a);
                    break;
                case 10:
                    z2 = C0930a.m1340c(parcel2, a);
                    break;
                case 11:
                    j5 = C0930a.m1343f(parcel2, a);
                    break;
                case 12:
                    str6 = C0930a.m1351n(parcel2, a);
                    break;
                case 13:
                    j3 = C0930a.m1343f(parcel2, a);
                    break;
                case 14:
                    j4 = C0930a.m1343f(parcel2, a);
                    break;
                case 15:
                    i = C0930a.m1341d(parcel2, a);
                    break;
                case 16:
                    z3 = C0930a.m1340c(parcel2, a);
                    break;
                case 17:
                    z4 = C0930a.m1340c(parcel2, a);
                    break;
                case 18:
                    z5 = C0930a.m1340c(parcel2, a);
                    break;
                case 19:
                    str7 = C0930a.m1351n(parcel2, a);
                    break;
                default:
                    C0930a.m1337b(parcel2, a);
                    break;
            }
        }
        C0930a.m1329D(parcel2, b);
        return new zzk(str, str2, str3, str4, j, j2, str5, z, z2, j5, str6, j3, j4, i, z3, z4, z5, str7);
    }
}
