package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.d */
public final class C0957d implements Parcelable.Creator<zal> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        String str = null;
        int i = 0;
        ArrayList<zam> arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    str = C0930a.m1351n(parcel, a);
                    break;
                case 3:
                    arrayList = C0930a.m1339c(parcel, a, zam.CREATOR);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zal(i, str, arrayList);
    }
}
