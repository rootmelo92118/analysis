package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C0798i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zaa extends AbstractSafeParcelable implements C0798i {
    public static final Parcelable.Creator<zaa> CREATOR = new C2311b();

    /* renamed from: a */
    private final int f8711a;

    /* renamed from: b */
    private int f8712b;

    /* renamed from: c */
    private Intent f8713c;

    zaa(int i, int i2, Intent intent) {
        this.f8711a = i;
        this.f8712b = i2;
        this.f8713c = intent;
    }

    public zaa() {
        this(0, (Intent) null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }

    /* renamed from: a */
    public final Status mo9551a() {
        if (this.f8712b == 0) {
            return Status.f783a;
        }
        return Status.f787e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f8711a);
        C0932b.m1367a(parcel, 2, this.f8712b);
        C0932b.m1372a(parcel, 3, (Parcelable) this.f8713c, i, false);
        C0932b.m1365a(parcel, a);
    }
}
