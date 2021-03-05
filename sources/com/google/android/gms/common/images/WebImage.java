package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C0868d();

    /* renamed from: a */
    private final int f998a;

    /* renamed from: b */
    private final Uri f999b;

    /* renamed from: c */
    private final int f1000c;

    /* renamed from: d */
    private final int f1001d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f998a = i;
        this.f999b = uri;
        this.f1000c = i2;
        this.f1001d = i3;
    }

    /* renamed from: a */
    public final Uri mo9748a() {
        return this.f999b;
    }

    /* renamed from: b */
    public final int mo9749b() {
        return this.f1000c;
    }

    /* renamed from: c */
    public final int mo9750c() {
        return this.f1001d;
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f1000c), Integer.valueOf(this.f1001d), this.f999b.toString()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return C0924o.m1303a(this.f999b, webImage.f999b) && this.f1000c == webImage.f1000c && this.f1001d == webImage.f1001d;
    }

    public final int hashCode() {
        return C0924o.m1301a(this.f999b, Integer.valueOf(this.f1000c), Integer.valueOf(this.f1001d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f998a);
        C0932b.m1372a(parcel, 2, (Parcelable) mo9748a(), i, false);
        C0932b.m1367a(parcel, 3, mo9749b());
        C0932b.m1367a(parcel, 4, mo9750c());
        C0932b.m1365a(parcel, a);
    }
}
