package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.b */
public final class C0960b implements Parcelable.Creator<WakeLockEvent> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C0930a.m1336b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            switch (C0930a.m1330a(a)) {
                case 1:
                    i = C0930a.m1341d(parcel2, a);
                    break;
                case 2:
                    j = C0930a.m1343f(parcel2, a);
                    break;
                case 4:
                    str = C0930a.m1351n(parcel2, a);
                    break;
                case 5:
                    i3 = C0930a.m1341d(parcel2, a);
                    break;
                case 6:
                    arrayList = C0930a.m1326A(parcel2, a);
                    break;
                case 8:
                    j2 = C0930a.m1343f(parcel2, a);
                    break;
                case 10:
                    str3 = C0930a.m1351n(parcel2, a);
                    break;
                case 11:
                    i2 = C0930a.m1341d(parcel2, a);
                    break;
                case 12:
                    str2 = C0930a.m1351n(parcel2, a);
                    break;
                case 13:
                    str4 = C0930a.m1351n(parcel2, a);
                    break;
                case 14:
                    i4 = C0930a.m1341d(parcel2, a);
                    break;
                case 15:
                    f = C0930a.m1346i(parcel2, a);
                    break;
                case 16:
                    j3 = C0930a.m1343f(parcel2, a);
                    break;
                case 17:
                    str5 = C0930a.m1351n(parcel2, a);
                    break;
                default:
                    C0930a.m1337b(parcel2, a);
                    break;
            }
        }
        C0930a.m1329D(parcel2, b);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5);
    }
}
