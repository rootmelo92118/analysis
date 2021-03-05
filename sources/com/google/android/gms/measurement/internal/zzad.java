package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.Iterator;

public final class zzad extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzad> CREATOR = new C2279f();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f8648a;

    zzad(Bundle bundle) {
        this.f8648a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1369a(parcel, 2, mo14851b(), false);
        C0932b.m1365a(parcel, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo14850a(String str) {
        return this.f8648a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Long mo14852b(String str) {
        return Long.valueOf(this.f8648a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Double mo14853c(String str) {
        return Double.valueOf(this.f8648a.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo14854d(String str) {
        return this.f8648a.getString(str);
    }

    /* renamed from: a */
    public final int mo14849a() {
        return this.f8648a.size();
    }

    public final String toString() {
        return this.f8648a.toString();
    }

    /* renamed from: b */
    public final Bundle mo14851b() {
        return new Bundle(this.f8648a);
    }

    public final Iterator<String> iterator() {
        return new C2251e(this);
    }
}
