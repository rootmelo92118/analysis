package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.b */
public final class C0951b implements Parcelable.Creator<StringToIntConverter> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        ArrayList<StringToIntConverter.zaa> arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    arrayList = C0930a.m1339c(parcel, a, StringToIntConverter.zaa.CREATOR);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new StringToIntConverter(i, arrayList);
    }
}
