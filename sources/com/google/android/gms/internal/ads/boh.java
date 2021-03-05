package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

public final class boh implements Parcelable.Creator<zztv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zztv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            if (C0930a.m1330a(a) != 2) {
                C0930a.m1337b(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C0930a.m1333a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        C0930a.m1329D(parcel, b);
        return new zztv(parcelFileDescriptor);
    }
}
