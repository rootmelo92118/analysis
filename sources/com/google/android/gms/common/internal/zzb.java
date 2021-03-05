package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new C0875af();

    /* renamed from: a */
    Bundle f1130a;

    /* renamed from: b */
    Feature[] f1131b;

    zzb(Bundle bundle, Feature[] featureArr) {
        this.f1130a = bundle;
        this.f1131b = featureArr;
    }

    public zzb() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1369a(parcel, 1, this.f1130a, false);
        C0932b.m1381a(parcel, 2, (T[]) this.f1131b, i, false);
        C0932b.m1365a(parcel, a);
    }
}
