package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.internal.ads.er */
public final class C1278er implements Parcelable.Creator<zzafn> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C0930a.m1336b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    z = C0930a.m1340c(parcel2, a);
                    break;
                case 2:
                    str = C0930a.m1351n(parcel2, a);
                    break;
                case 3:
                    i = C0930a.m1341d(parcel2, a);
                    break;
                case 4:
                    bArr = C0930a.m1354q(parcel2, a);
                    break;
                case 5:
                    strArr = C0930a.m1362y(parcel2, a);
                    break;
                case 6:
                    strArr2 = C0930a.m1362y(parcel2, a);
                    break;
                case 7:
                    z2 = C0930a.m1340c(parcel2, a);
                    break;
                case 8:
                    j = C0930a.m1343f(parcel2, a);
                    break;
                default:
                    C0930a.m1337b(parcel2, a);
                    break;
            }
        }
        C0930a.m1329D(parcel2, b);
        return new zzafn(z, str, i, bArr, strArr, strArr2, z2, j);
    }
}
