package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzafn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafn> CREATOR = new C1278er();

    /* renamed from: a */
    public final boolean f6982a;

    /* renamed from: b */
    public final String f6983b;

    /* renamed from: c */
    public final int f6984c;

    /* renamed from: d */
    public final byte[] f6985d;

    /* renamed from: e */
    public final String[] f6986e;

    /* renamed from: f */
    public final String[] f6987f;

    /* renamed from: g */
    public final boolean f6988g;

    /* renamed from: h */
    public final long f6989h;

    zzafn(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f6982a = z;
        this.f6983b = str;
        this.f6984c = i;
        this.f6985d = bArr;
        this.f6986e = strArr;
        this.f6987f = strArr2;
        this.f6988g = z2;
        this.f6989h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1379a(parcel, 1, this.f6982a);
        C0932b.m1377a(parcel, 2, this.f6983b, false);
        C0932b.m1367a(parcel, 3, this.f6984c);
        C0932b.m1380a(parcel, 4, this.f6985d, false);
        C0932b.m1382a(parcel, 5, this.f6986e, false);
        C0932b.m1382a(parcel, 6, this.f6987f, false);
        C0932b.m1379a(parcel, 7, this.f6988g);
        C0932b.m1368a(parcel, 8, this.f6989h);
        C0932b.m1365a(parcel, a);
    }
}
