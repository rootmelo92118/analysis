package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.vo */
public final class C1734vo implements Parcelable.Creator<zzawo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzawo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    str = C0930a.m1351n(parcel, a);
                    break;
                case 3:
                    str2 = C0930a.m1351n(parcel, a);
                    break;
                case 4:
                    z = C0930a.m1340c(parcel, a);
                    break;
                case 5:
                    z2 = C0930a.m1340c(parcel, a);
                    break;
                case 6:
                    arrayList = C0930a.m1326A(parcel, a);
                    break;
                case 7:
                    z3 = C0930a.m1340c(parcel, a);
                    break;
                case 8:
                    z4 = C0930a.m1340c(parcel, a);
                    break;
                case 9:
                    arrayList2 = C0930a.m1326A(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzawo(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }
}
