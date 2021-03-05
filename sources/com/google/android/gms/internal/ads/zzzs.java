package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

@C1598qn
public final class zzzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzs> CREATOR = new bud();

    /* renamed from: a */
    public final String f7303a;

    public zzzs(SearchAdRequest searchAdRequest) {
        this.f7303a = searchAdRequest.getQuery();
    }

    zzzs(String str) {
        this.f7303a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 15, this.f7303a, false);
        C0932b.m1365a(parcel, a);
    }
}
