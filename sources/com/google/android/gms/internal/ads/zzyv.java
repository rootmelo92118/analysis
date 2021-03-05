package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzyv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyv> CREATOR = new bth();

    /* renamed from: a */
    public final int f7302a;

    public zzyv(int i) {
        this.f7302a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 2, this.f7302a);
        C0932b.m1365a(parcel, a);
    }
}
