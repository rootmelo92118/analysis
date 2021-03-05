package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.List;

@C1598qn
public final class zzty extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzty> CREATOR = new boj();
    @Nullable

    /* renamed from: a */
    public final String f7261a;

    /* renamed from: b */
    public final boolean f7262b;

    /* renamed from: c */
    public long f7263c;

    /* renamed from: d */
    private final long f7264d;

    /* renamed from: e */
    private final String f7265e;

    /* renamed from: f */
    private final String f7266f;

    /* renamed from: g */
    private final String f7267g;

    /* renamed from: h */
    private final Bundle f7268h;

    @Nullable
    /* renamed from: a */
    public static zzty m8826a(String str) {
        return m8825a(Uri.parse(str));
    }

    @Nullable
    /* renamed from: a */
    public static zzty m8825a(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                C1772wz.m1630e(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String next : zzbv.zzlh().mo13228a(uri)) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new zzty(queryParameter, j, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e) {
            C1772wz.m1627c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    zzty(@Nullable String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f7261a = str;
        this.f7264d = j;
        this.f7265e = str2 == null ? "" : str2;
        this.f7266f = str3 == null ? "" : str3;
        this.f7267g = str4 == null ? "" : str4;
        this.f7268h = bundle == null ? new Bundle() : bundle;
        this.f7262b = z;
        this.f7263c = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f7261a, false);
        C0932b.m1368a(parcel, 3, this.f7264d);
        C0932b.m1377a(parcel, 4, this.f7265e, false);
        C0932b.m1377a(parcel, 5, this.f7266f, false);
        C0932b.m1377a(parcel, 6, this.f7267g, false);
        C0932b.m1369a(parcel, 7, this.f7268h, false);
        C0932b.m1379a(parcel, 8, this.f7262b);
        C0932b.m1368a(parcel, 9, this.f7263c);
        C0932b.m1365a(parcel, a);
    }
}
