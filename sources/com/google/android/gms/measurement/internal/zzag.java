package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C2283g();

    /* renamed from: a */
    public final String f8649a;

    /* renamed from: b */
    public final zzad f8650b;

    /* renamed from: c */
    public final String f8651c;

    /* renamed from: d */
    public final long f8652d;

    public zzag(String str, zzad zzad, String str2, long j) {
        this.f8649a = str;
        this.f8650b = zzad;
        this.f8651c = str2;
        this.f8652d = j;
    }

    zzag(zzag zzag, long j) {
        C0926p.m1306a(zzag);
        this.f8649a = zzag.f8649a;
        this.f8650b = zzag.f8650b;
        this.f8651c = zzag.f8651c;
        this.f8652d = j;
    }

    public final String toString() {
        String str = this.f8651c;
        String str2 = this.f8649a;
        String valueOf = String.valueOf(this.f8650b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f8649a, false);
        C0932b.m1372a(parcel, 3, (Parcelable) this.f8650b, i, false);
        C0932b.m1377a(parcel, 4, this.f8651c, false);
        C0932b.m1368a(parcel, 5, this.f8652d);
        C0932b.m1365a(parcel, a);
    }
}
