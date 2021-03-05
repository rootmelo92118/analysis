package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0846l();

    /* renamed from: a */
    private final int f781a;

    /* renamed from: b */
    private final String f782b;

    Scope(int i, String str) {
        C0926p.m1309a(str, (Object) "scopeUri must not be null or empty");
        this.f781a = i;
        this.f782b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public final String mo9546a() {
        return this.f782b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f782b.equals(((Scope) obj).f782b);
    }

    public final int hashCode() {
        return this.f782b.hashCode();
    }

    public final String toString() {
        return this.f782b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f781a);
        C0932b.m1377a(parcel, 2, mo9546a(), false);
        C0932b.m1365a(parcel, a);
    }
}
