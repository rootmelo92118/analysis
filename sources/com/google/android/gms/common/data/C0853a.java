package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.data.a */
public final class C0853a implements Parcelable.Creator<BitmapTeleporter> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C0930a.m1333a(parcel, a, ParcelFileDescriptor.CREATOR);
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
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }
}
