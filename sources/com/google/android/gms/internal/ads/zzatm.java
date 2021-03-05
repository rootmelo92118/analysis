package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzatm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatm> CREATOR = new C1651sm();

    /* renamed from: a */
    String f7122a;

    public zzatm(String str) {
        this.f7122a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f7122a, false);
        C0932b.m1365a(parcel, a);
    }
}
