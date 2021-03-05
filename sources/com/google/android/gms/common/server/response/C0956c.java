package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.c */
public final class C0956c implements Parcelable.Creator<zak> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        ArrayList<zal> arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    arrayList = C0930a.m1339c(parcel, a, zal.CREATOR);
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
        return new zak(i, arrayList, str);
    }
}
