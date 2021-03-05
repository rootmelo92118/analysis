package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzavh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavh> CREATOR = new C1701ui();

    /* renamed from: a */
    public final zzwb f7123a;

    /* renamed from: b */
    public final String f7124b;

    public zzavh(zzwb zzwb, String str) {
        this.f7123a = zzwb;
        this.f7124b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1372a(parcel, 2, (Parcelable) this.f7123a, i, false);
        C0932b.m1377a(parcel, 3, this.f7124b, false);
        C0932b.m1365a(parcel, a);
    }
}
