package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C0941k();

    /* renamed from: a */
    private final String f764a;
    @Deprecated

    /* renamed from: b */
    private final int f765b;

    /* renamed from: c */
    private final long f766c;

    public Feature(String str, int i, long j) {
        this.f764a = str;
        this.f765b = i;
        this.f766c = j;
    }

    /* renamed from: a */
    public String mo9517a() {
        return this.f764a;
    }

    /* renamed from: b */
    public long mo9518b() {
        return this.f766c == -1 ? (long) this.f765b : this.f766c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 1, mo9517a(), false);
        C0932b.m1367a(parcel, 2, this.f765b);
        C0932b.m1368a(parcel, 3, mo9518b());
        C0932b.m1365a(parcel, a);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (((mo9517a() == null || !mo9517a().equals(feature.mo9517a())) && (mo9517a() != null || feature.mo9517a() != null)) || mo9518b() != feature.mo9518b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0924o.m1301a(mo9517a(), Long.valueOf(mo9518b()));
    }

    public String toString() {
        return C0924o.m1302a((Object) this).mo9911a("name", mo9517a()).mo9911a("version", Long.valueOf(mo9518b())).toString();
    }
}
