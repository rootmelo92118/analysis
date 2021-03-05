package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.internal.ads.C1598qn;

@C1598qn
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    public final boolean zzbpa;
    public final boolean zzbpb;
    private final String zzbpc;
    public final boolean zzbpd;
    public final float zzbpe;
    public final int zzbpf;
    public final boolean zzbpg;
    public final boolean zzbph;
    public final boolean zzbpi;

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, z3, f, i, z4, z5, z6);
    }

    zzaq(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zzbpa = z;
        this.zzbpb = z2;
        this.zzbpc = str;
        this.zzbpd = z3;
        this.zzbpe = f;
        this.zzbpf = i;
        this.zzbpg = z4;
        this.zzbph = z5;
        this.zzbpi = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1379a(parcel, 2, this.zzbpa);
        C0932b.m1379a(parcel, 3, this.zzbpb);
        C0932b.m1377a(parcel, 4, this.zzbpc, false);
        C0932b.m1379a(parcel, 5, this.zzbpd);
        C0932b.m1366a(parcel, 6, this.zzbpe);
        C0932b.m1367a(parcel, 7, this.zzbpf);
        C0932b.m1379a(parcel, 8, this.zzbpg);
        C0932b.m1379a(parcel, 9, this.zzbph);
        C0932b.m1379a(parcel, 10, this.zzbpi);
        C0932b.m1365a(parcel, a);
    }
}
