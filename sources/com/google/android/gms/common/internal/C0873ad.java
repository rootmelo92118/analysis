package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C0930a;

/* renamed from: com.google.android.gms.common.internal.ad */
public final class C0873ad implements Parcelable.Creator<SignInButtonConfig> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C0930a.m1336b(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
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
                    i3 = C0930a.m1341d(parcel, a);
                    break;
                case 4:
                    scopeArr = (Scope[]) C0930a.m1338b(parcel, a, Scope.CREATOR);
                    break;
                default:
                    C0930a.m1337b(parcel, a);
                    break;
            }
        }
        C0930a.m1329D(parcel, b);
        return new SignInButtonConfig(i, i2, i3, scopeArr);
    }
}
