package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import com.google.android.gms.common.server.converter.StringToIntConverter;

/* renamed from: com.google.android.gms.common.server.converter.c */
public final class C0952c implements Parcelable.Creator<StringToIntConverter.zaa> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter.zaa[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
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
                    i2 = C0930a.m1341d(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new StringToIntConverter.zaa(i, str, i2);
    }
}
