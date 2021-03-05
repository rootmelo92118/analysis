package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.List;
import javax.annotation.Nullable;

@C1598qn
public final class zzwb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwb> CREATOR = new bqo();

    /* renamed from: a */
    public final int f7271a;
    @Deprecated

    /* renamed from: b */
    public final long f7272b;

    /* renamed from: c */
    public final Bundle f7273c;
    @Deprecated

    /* renamed from: d */
    public final int f7274d;

    /* renamed from: e */
    public final List<String> f7275e;

    /* renamed from: f */
    public final boolean f7276f;

    /* renamed from: g */
    public final int f7277g;

    /* renamed from: h */
    public final boolean f7278h;

    /* renamed from: i */
    public final String f7279i;

    /* renamed from: j */
    public final zzzs f7280j;

    /* renamed from: k */
    public final Location f7281k;

    /* renamed from: l */
    public final String f7282l;

    /* renamed from: m */
    public final Bundle f7283m;

    /* renamed from: n */
    public final Bundle f7284n;

    /* renamed from: o */
    public final List<String> f7285o;

    /* renamed from: p */
    public final String f7286p;

    /* renamed from: q */
    public final String f7287q;
    @Deprecated

    /* renamed from: r */
    public final boolean f7288r;
    @Nullable

    /* renamed from: s */
    public final zzvv f7289s;

    /* renamed from: t */
    public final int f7290t;
    @Nullable

    /* renamed from: u */
    public final String f7291u;

    public zzwb(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzzs zzzs, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzvv zzvv, int i4, @Nullable String str5) {
        this.f7271a = i;
        this.f7272b = j;
        this.f7273c = bundle == null ? new Bundle() : bundle;
        this.f7274d = i2;
        this.f7275e = list;
        this.f7276f = z;
        this.f7277g = i3;
        this.f7278h = z2;
        this.f7279i = str;
        this.f7280j = zzzs;
        this.f7281k = location;
        this.f7282l = str2;
        this.f7283m = bundle2 == null ? new Bundle() : bundle2;
        this.f7284n = bundle3;
        this.f7285o = list2;
        this.f7286p = str3;
        this.f7287q = str4;
        this.f7288r = z3;
        this.f7289s = zzvv;
        this.f7290t = i4;
        this.f7291u = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f7271a);
        C0932b.m1368a(parcel, 2, this.f7272b);
        C0932b.m1369a(parcel, 3, this.f7273c, false);
        C0932b.m1367a(parcel, 4, this.f7274d);
        C0932b.m1386b(parcel, 5, this.f7275e, false);
        C0932b.m1379a(parcel, 6, this.f7276f);
        C0932b.m1367a(parcel, 7, this.f7277g);
        C0932b.m1379a(parcel, 8, this.f7278h);
        C0932b.m1377a(parcel, 9, this.f7279i, false);
        C0932b.m1372a(parcel, 10, (Parcelable) this.f7280j, i, false);
        C0932b.m1372a(parcel, 11, (Parcelable) this.f7281k, i, false);
        C0932b.m1377a(parcel, 12, this.f7282l, false);
        C0932b.m1369a(parcel, 13, this.f7283m, false);
        C0932b.m1369a(parcel, 14, this.f7284n, false);
        C0932b.m1386b(parcel, 15, this.f7285o, false);
        C0932b.m1377a(parcel, 16, this.f7286p, false);
        C0932b.m1377a(parcel, 17, this.f7287q, false);
        C0932b.m1379a(parcel, 18, this.f7288r);
        C0932b.m1372a(parcel, 19, (Parcelable) this.f7289s, i, false);
        C0932b.m1367a(parcel, 20, this.f7290t);
        C0932b.m1377a(parcel, 21, this.f7291u, false);
        C0932b.m1365a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzwb)) {
            return false;
        }
        zzwb zzwb = (zzwb) obj;
        if (this.f7271a != zzwb.f7271a || this.f7272b != zzwb.f7272b || !C0924o.m1303a(this.f7273c, zzwb.f7273c) || this.f7274d != zzwb.f7274d || !C0924o.m1303a(this.f7275e, zzwb.f7275e) || this.f7276f != zzwb.f7276f || this.f7277g != zzwb.f7277g || this.f7278h != zzwb.f7278h || !C0924o.m1303a(this.f7279i, zzwb.f7279i) || !C0924o.m1303a(this.f7280j, zzwb.f7280j) || !C0924o.m1303a(this.f7281k, zzwb.f7281k) || !C0924o.m1303a(this.f7282l, zzwb.f7282l) || !C0924o.m1303a(this.f7283m, zzwb.f7283m) || !C0924o.m1303a(this.f7284n, zzwb.f7284n) || !C0924o.m1303a(this.f7285o, zzwb.f7285o) || !C0924o.m1303a(this.f7286p, zzwb.f7286p) || !C0924o.m1303a(this.f7287q, zzwb.f7287q) || this.f7288r != zzwb.f7288r || this.f7290t != zzwb.f7290t || !C0924o.m1303a(this.f7291u, zzwb.f7291u)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0924o.m1301a(Integer.valueOf(this.f7271a), Long.valueOf(this.f7272b), this.f7273c, Integer.valueOf(this.f7274d), this.f7275e, Boolean.valueOf(this.f7276f), Integer.valueOf(this.f7277g), Boolean.valueOf(this.f7278h), this.f7279i, this.f7280j, this.f7281k, this.f7282l, this.f7283m, this.f7284n, this.f7285o, this.f7286p, this.f7287q, Boolean.valueOf(this.f7288r), Integer.valueOf(this.f7290t), this.f7291u);
    }

    /* renamed from: a */
    public final zzwb mo13454a() {
        Bundle bundle = this.f7283m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.f7273c;
            this.f7283m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", this.f7273c);
        }
        return new zzwb(this.f7271a, this.f7272b, bundle, this.f7274d, this.f7275e, this.f7276f, this.f7277g, this.f7278h, this.f7279i, this.f7280j, this.f7281k, this.f7282l, this.f7283m, this.f7284n, this.f7285o, this.f7286p, this.f7287q, this.f7288r, this.f7289s, this.f7290t, this.f7291u);
    }
}
