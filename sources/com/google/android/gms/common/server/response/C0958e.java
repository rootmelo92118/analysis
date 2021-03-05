package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.server.response.e */
public final class C0958e implements Parcelable.Creator<SafeParcelResponse> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zak zak = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    parcel2 = C0930a.m1327B(parcel, a);
                    break;
                case 3:
                    zak = (zak) C0930a.m1333a(parcel, a, zak.CREATOR);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new SafeParcelResponse(i, parcel2, zak);
    }
}
