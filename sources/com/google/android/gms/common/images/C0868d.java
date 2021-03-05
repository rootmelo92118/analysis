package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.images.d */
public final class C0868d implements Parcelable.Creator<WebImage> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel, a);
                    break;
                case 2:
                    uri = (Uri) C0930a.m1333a(parcel, a, Uri.CREATOR);
                    break;
                case 3:
                    i2 = C0930a.m1341d(parcel, a);
                    break;
                case 4:
                    i3 = C0930a.m1341d(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new WebImage(i, uri, i2, i3);
    }
}
