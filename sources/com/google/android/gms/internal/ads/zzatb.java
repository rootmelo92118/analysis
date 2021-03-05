package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzatb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatb> CREATOR = new C1641sc();

    /* renamed from: a */
    private final Bundle f7113a;

    /* renamed from: b */
    private final zzbbi f7114b;

    /* renamed from: c */
    private final ApplicationInfo f7115c;

    /* renamed from: d */
    private final String f7116d;

    /* renamed from: e */
    private final List<String> f7117e;
    @Nullable

    /* renamed from: f */
    private final PackageInfo f7118f;

    /* renamed from: g */
    private final String f7119g;

    /* renamed from: h */
    private final boolean f7120h;

    /* renamed from: i */
    private final String f7121i;

    public zzatb(Bundle bundle, zzbbi zzbbi, ApplicationInfo applicationInfo, String str, List<String> list, @Nullable PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f7113a = bundle;
        this.f7114b = zzbbi;
        this.f7116d = str;
        this.f7115c = applicationInfo;
        this.f7117e = list;
        this.f7118f = packageInfo;
        this.f7119g = str2;
        this.f7120h = z;
        this.f7121i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1369a(parcel, 1, this.f7113a, false);
        C0932b.m1372a(parcel, 2, (Parcelable) this.f7114b, i, false);
        C0932b.m1372a(parcel, 3, (Parcelable) this.f7115c, i, false);
        C0932b.m1377a(parcel, 4, this.f7116d, false);
        C0932b.m1386b(parcel, 5, this.f7117e, false);
        C0932b.m1372a(parcel, 6, (Parcelable) this.f7118f, i, false);
        C0932b.m1377a(parcel, 7, this.f7119g, false);
        C0932b.m1379a(parcel, 8, this.f7120h);
        C0932b.m1377a(parcel, 9, this.f7121i, false);
        C0932b.m1365a(parcel, a);
    }
}
