package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.api.m */
public final class C0847m implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            int a2 = C0930a.m1330a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        i2 = C0930a.m1341d(parcel, a);
                        break;
                    case 2:
                        str = C0930a.m1351n(parcel, a);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) C0930a.m1333a(parcel, a, PendingIntent.CREATOR);
                        break;
                    default:
                        C0930a.m1337b(parcel, a);
                        break;
                }
            } else {
                i = C0930a.m1341d(parcel, a);
            }
        }
        C0930a.m1329D(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }
}
