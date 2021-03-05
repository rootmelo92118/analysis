package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.signin.internal.b */
public final class C2311b implements Parcelable.Creator<zaa> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    i2 = C0930a.m1341d(parcel, a);
                    break;
                case 3:
                    intent = (Intent) C0930a.m1333a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new zaa(i, i2, intent);
    }
}
