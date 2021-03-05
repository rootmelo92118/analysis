package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.j */
public final class C0940j implements Parcelable.Creator<ConnectionResult> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
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
                    pendingIntent = (PendingIntent) C0930a.m1333a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 4:
                    str = C0930a.m1351n(parcel, a);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }
}
