package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzw> CREATOR = new buf();

    /* renamed from: a */
    public final boolean f7304a;

    /* renamed from: b */
    public final boolean f7305b;

    /* renamed from: c */
    public final boolean f7306c;

    public zzzw(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public zzzw(boolean z, boolean z2, boolean z3) {
        this.f7304a = z;
        this.f7305b = z2;
        this.f7306c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1379a(parcel, 2, this.f7304a);
        C0932b.m1379a(parcel, 3, this.f7305b);
        C0932b.m1379a(parcel, 4, this.f7306c);
        C0932b.m1365a(parcel, a);
    }
}
