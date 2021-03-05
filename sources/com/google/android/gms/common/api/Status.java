package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class Status extends AbstractSafeParcelable implements C0798i, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C0847m();

    /* renamed from: a */
    public static final Status f783a = new Status(0);

    /* renamed from: b */
    public static final Status f784b = new Status(14);

    /* renamed from: c */
    public static final Status f785c = new Status(8);

    /* renamed from: d */
    public static final Status f786d = new Status(15);

    /* renamed from: e */
    public static final Status f787e = new Status(16);

    /* renamed from: f */
    public static final Status f788f = new Status(18);

    /* renamed from: g */
    private static final Status f789g = new Status(17);

    /* renamed from: h */
    private final int f790h;

    /* renamed from: i */
    private final int f791i;
    @Nullable

    /* renamed from: j */
    private final String f792j;
    @Nullable

    /* renamed from: k */
    private final PendingIntent f793k;

    Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this.f790h = i;
        this.f791i = i2;
        this.f792j = str;
        this.f793k = pendingIntent;
    }

    /* renamed from: a */
    public final Status mo9551a() {
        return this;
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null);
    }

    @Nullable
    /* renamed from: b */
    public final String mo9552b() {
        return this.f792j;
    }

    /* renamed from: c */
    public final boolean mo9553c() {
        return this.f791i <= 0;
    }

    /* renamed from: d */
    public final int mo9554d() {
        return this.f791i;
    }

    public final int hashCode() {
        return C0924o.m1301a(Integer.valueOf(this.f790h), Integer.valueOf(this.f791i), this.f792j, this.f793k);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f790h != status.f790h || this.f791i != status.f791i || !C0924o.m1303a(this.f792j, status.f792j) || !C0924o.m1303a(this.f793k, status.f793k)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final String mo9555e() {
        if (this.f792j != null) {
            return this.f792j;
        }
        return C0790d.m923a(this.f791i);
    }

    public final String toString() {
        return C0924o.m1302a((Object) this).mo9911a("statusCode", mo9555e()).mo9911a("resolution", this.f793k).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, mo9554d());
        C0932b.m1377a(parcel, 2, mo9552b(), false);
        C0932b.m1372a(parcel, 3, (Parcelable) this.f793k, i, false);
        C0932b.m1367a(parcel, 1000, this.f790h);
        C0932b.m1365a(parcel, a);
    }
}
