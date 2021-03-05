package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C0950a();

    /* renamed from: a */
    private final int f1154a;

    /* renamed from: b */
    private final StringToIntConverter f1155b;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f1154a = i;
        this.f1155b = stringToIntConverter;
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f1154a = 1;
        this.f1155b = stringToIntConverter;
    }

    /* renamed from: a */
    public static zaa m1409a(FastJsonResponse.C0953a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: a */
    public final FastJsonResponse.C0953a<?, ?> mo9945a() {
        if (this.f1155b != null) {
            return this.f1155b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1154a);
        C0932b.m1372a(parcel, 2, (Parcelable) this.f1155b, i, false);
        C0932b.m1365a(parcel, a);
    }
}
