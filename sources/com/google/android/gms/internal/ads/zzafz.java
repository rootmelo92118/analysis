package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzafz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafz> CREATOR = new C1291fd();

    /* renamed from: a */
    public final int f6990a;

    public zzafz(int i) {
        this.f6990a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f6990a);
        C0932b.m1365a(parcel, a);
    }
}
