package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzfv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfv> CREATOR = new C2262ej();

    /* renamed from: a */
    public final String f8653a;

    /* renamed from: b */
    public final long f8654b;

    /* renamed from: c */
    public final Long f8655c;

    /* renamed from: d */
    public final String f8656d;

    /* renamed from: e */
    public final String f8657e;

    /* renamed from: f */
    public final Double f8658f;

    /* renamed from: g */
    private final int f8659g;

    /* renamed from: h */
    private final Float f8660h;

    zzfv(C2263ek ekVar) {
        this(ekVar.f8444c, ekVar.f8445d, ekVar.f8446e, ekVar.f8443b);
    }

    zzfv(String str, long j, Object obj, String str2) {
        C0926p.m1308a(str);
        this.f8659g = 2;
        this.f8653a = str;
        this.f8654b = j;
        this.f8657e = str2;
        if (obj == null) {
            this.f8655c = null;
            this.f8660h = null;
            this.f8658f = null;
            this.f8656d = null;
        } else if (obj instanceof Long) {
            this.f8655c = (Long) obj;
            this.f8660h = null;
            this.f8658f = null;
            this.f8656d = null;
        } else if (obj instanceof String) {
            this.f8655c = null;
            this.f8660h = null;
            this.f8658f = null;
            this.f8656d = (String) obj;
        } else if (obj instanceof Double) {
            this.f8655c = null;
            this.f8660h = null;
            this.f8658f = (Double) obj;
            this.f8656d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzfv(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f8659g = i;
        this.f8653a = str;
        this.f8654b = j;
        this.f8655c = l;
        Double d2 = null;
        this.f8660h = null;
        if (i == 1) {
            this.f8658f = f != null ? Double.valueOf(f.doubleValue()) : d2;
        } else {
            this.f8658f = d;
        }
        this.f8656d = str2;
        this.f8657e = str3;
    }

    /* renamed from: a */
    public final Object mo14860a() {
        if (this.f8655c != null) {
            return this.f8655c;
        }
        if (this.f8658f != null) {
            return this.f8658f;
        }
        if (this.f8656d != null) {
            return this.f8656d;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f8659g);
        C0932b.m1377a(parcel, 2, this.f8653a, false);
        C0932b.m1368a(parcel, 3, this.f8654b);
        C0932b.m1376a(parcel, 4, this.f8655c, false);
        C0932b.m1374a(parcel, 5, (Float) null, false);
        C0932b.m1377a(parcel, 6, this.f8656d, false);
        C0932b.m1377a(parcel, 7, this.f8657e, false);
        C0932b.m1373a(parcel, 8, this.f8658f, false);
        C0932b.m1365a(parcel, a);
    }
}
