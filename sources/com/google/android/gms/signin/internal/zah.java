package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zah> CREATOR = new C2317h();

    /* renamed from: a */
    private final int f8714a;

    /* renamed from: b */
    private final ResolveAccountRequest f8715b;

    zah(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f8714a = i;
        this.f8715b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f8714a);
        C0932b.m1372a(parcel, 2, (Parcelable) this.f8715b, i, false);
        C0932b.m1365a(parcel, a);
    }
}
