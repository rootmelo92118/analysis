package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.rq */
public final class C1628rq implements Parcelable.Creator<zzaso> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaso[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 2:
                    z = C0930a.m1340c(parcel, a);
                    break;
                case 3:
                    arrayList = C0930a.m1326A(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzaso(z, arrayList);
    }
}
