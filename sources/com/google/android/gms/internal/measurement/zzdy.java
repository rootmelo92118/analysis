package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new C2127q();

    /* renamed from: a */
    public final long f8014a;

    /* renamed from: b */
    public final long f8015b;

    /* renamed from: c */
    public final boolean f8016c;

    /* renamed from: d */
    public final String f8017d;

    /* renamed from: e */
    public final String f8018e;

    /* renamed from: f */
    public final String f8019f;

    /* renamed from: g */
    public final Bundle f8020g;

    zzdy(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f8014a = j;
        this.f8015b = j2;
        this.f8016c = z;
        this.f8017d = str;
        this.f8018e = str2;
        this.f8019f = str3;
        this.f8020g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1368a(parcel, 1, this.f8014a);
        C0932b.m1368a(parcel, 2, this.f8015b);
        C0932b.m1379a(parcel, 3, this.f8016c);
        C0932b.m1377a(parcel, 4, this.f8017d, false);
        C0932b.m1377a(parcel, 5, this.f8018e, false);
        C0932b.m1377a(parcel, 6, this.f8019f, false);
        C0932b.m1369a(parcel, 7, this.f8020g, false);
        C0932b.m1365a(parcel, a);
    }
}
