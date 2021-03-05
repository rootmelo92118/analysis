package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzans extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzans> CREATOR = new C1496mt();

    /* renamed from: a */
    private final int f6991a;

    /* renamed from: b */
    private final int f6992b;

    /* renamed from: c */
    private final int f6993c;

    /* renamed from: a */
    public static zzans m8608a(aib aib) {
        throw new NoSuchMethodError();
    }

    zzans(int i, int i2, int i3) {
        this.f6991a = i;
        this.f6992b = i2;
        this.f6993c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f6991a);
        C0932b.m1367a(parcel, 2, this.f6992b);
        C0932b.m1367a(parcel, 3, this.f6993c);
        C0932b.m1365a(parcel, a);
    }

    public final String toString() {
        int i = this.f6991a;
        int i2 = this.f6992b;
        int i3 = this.f6993c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }
}
