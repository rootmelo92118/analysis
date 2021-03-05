package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzvv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvv> CREATOR = new bqh();

    /* renamed from: a */
    private final String f7269a;

    /* renamed from: b */
    private final String f7270b;

    public zzvv(String str, String str2) {
        this.f7269a = str;
        this.f7270b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 1, this.f7269a, false);
        C0932b.m1377a(parcel, 2, this.f7270b, false);
        C0932b.m1365a(parcel, a);
    }
}
