package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.internal.au */
public final class C0890au implements Parcelable.Creator<zzr> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            if (C0930a.m1330a(a) != 1) {
                C0930a.m1337b(parcel, a);
            } else {
                i = C0930a.m1341d(parcel, a);
            }
        }
        C0930a.m1329D(parcel, b);
        return new zzr(i);
    }
}
