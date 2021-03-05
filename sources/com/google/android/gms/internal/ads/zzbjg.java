package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzbjg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjg> CREATOR = new aik();

    /* renamed from: a */
    private final int f7198a;

    /* renamed from: b */
    private final String f7199b;

    /* renamed from: c */
    private final String f7200c;

    zzbjg(int i, String str, String str2) {
        this.f7198a = i;
        this.f7199b = str;
        this.f7200c = str2;
    }

    public zzbjg(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f7198a);
        C0932b.m1377a(parcel, 2, this.f7199b, false);
        C0932b.m1377a(parcel, 3, this.f7200c, false);
        C0932b.m1365a(parcel, a);
    }
}
