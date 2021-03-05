package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzzu extends zzwf {
    public zzzu(zzwf zzwf) {
        super(zzwf.f7292a, zzwf.f7293b, zzwf.f7294c, zzwf.f7295d, zzwf.f7296e, zzwf.f7297f, zzwf.f7298g, zzwf.f7299h, zzwf.f7300i, zzwf.f7301j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f7292a, false);
        C0932b.m1367a(parcel, 3, this.f7293b);
        C0932b.m1367a(parcel, 6, this.f7296e);
        C0932b.m1365a(parcel, a);
    }
}
