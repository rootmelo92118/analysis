package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzacp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzacp> CREATOR = new C1197bs();

    /* renamed from: a */
    public final int f6972a;

    /* renamed from: b */
    public final boolean f6973b;

    /* renamed from: c */
    public final int f6974c;

    /* renamed from: d */
    public final boolean f6975d;

    /* renamed from: e */
    public final int f6976e;
    @Nullable

    /* renamed from: f */
    public final zzzw f6977f;

    /* renamed from: g */
    private final boolean f6978g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzacp(NativeAdOptions nativeAdOptions) {
        this(3, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzzw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzhz());
    }

    public zzacp(int i, boolean z, int i2, boolean z2, int i3, zzzw zzzw, boolean z3) {
        this.f6972a = i;
        this.f6973b = z;
        this.f6974c = i2;
        this.f6975d = z2;
        this.f6976e = i3;
        this.f6977f = zzzw;
        this.f6978g = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f6972a);
        C0932b.m1379a(parcel, 2, this.f6973b);
        C0932b.m1367a(parcel, 3, this.f6974c);
        C0932b.m1379a(parcel, 4, this.f6975d);
        C0932b.m1367a(parcel, 5, this.f6976e);
        C0932b.m1372a(parcel, 6, (Parcelable) this.f6977f, i, false);
        C0932b.m1379a(parcel, 7, this.f6978g);
        C0932b.m1365a(parcel, a);
    }
}
