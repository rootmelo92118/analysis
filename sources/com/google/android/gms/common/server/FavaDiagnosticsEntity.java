package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C0949a();

    /* renamed from: a */
    private final int f1144a;

    /* renamed from: b */
    private final String f1145b;

    /* renamed from: c */
    private final int f1146c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f1144a = i;
        this.f1145b = str;
        this.f1146c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1144a);
        C0932b.m1377a(parcel, 2, this.f1145b, false);
        C0932b.m1367a(parcel, 3, this.f1146c);
        C0932b.m1365a(parcel, a);
    }
}
