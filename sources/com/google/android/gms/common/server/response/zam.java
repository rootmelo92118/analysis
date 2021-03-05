package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C0955b();

    /* renamed from: a */
    final String f1181a;

    /* renamed from: b */
    final FastJsonResponse.Field<?, ?> f1182b;

    /* renamed from: c */
    private final int f1183c;

    zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.f1183c = i;
        this.f1181a = str;
        this.f1182b = field;
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f1183c = 1;
        this.f1181a = str;
        this.f1182b = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1183c);
        C0932b.m1377a(parcel, 2, this.f1181a, false);
        C0932b.m1372a(parcel, 3, (Parcelable) this.f1182b, i, false);
        C0932b.m1365a(parcel, a);
    }
}
