package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C0960b();

    /* renamed from: a */
    private final int f1184a;

    /* renamed from: b */
    private final long f1185b;

    /* renamed from: c */
    private int f1186c;

    /* renamed from: d */
    private final String f1187d;

    /* renamed from: e */
    private final String f1188e;

    /* renamed from: f */
    private final String f1189f;

    /* renamed from: g */
    private final int f1190g;

    /* renamed from: h */
    private final List<String> f1191h;

    /* renamed from: i */
    private final String f1192i;

    /* renamed from: j */
    private final long f1193j;

    /* renamed from: k */
    private int f1194k;

    /* renamed from: l */
    private final String f1195l;

    /* renamed from: m */
    private final float f1196m;

    /* renamed from: n */
    private final long f1197n;

    /* renamed from: o */
    private long f1198o = -1;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f1184a = i;
        this.f1185b = j;
        this.f1186c = i2;
        this.f1187d = str;
        this.f1188e = str3;
        this.f1189f = str5;
        this.f1190g = i3;
        this.f1191h = list;
        this.f1192i = str2;
        this.f1193j = j2;
        this.f1194k = i4;
        this.f1195l = str4;
        this.f1196m = f;
        this.f1197n = j3;
    }

    /* renamed from: a */
    public final long mo9981a() {
        return this.f1185b;
    }

    /* renamed from: b */
    public final int mo9982b() {
        return this.f1186c;
    }

    /* renamed from: c */
    public final long mo9983c() {
        return this.f1198o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1184a);
        C0932b.m1368a(parcel, 2, mo9981a());
        C0932b.m1377a(parcel, 4, this.f1187d, false);
        C0932b.m1367a(parcel, 5, this.f1190g);
        C0932b.m1386b(parcel, 6, this.f1191h, false);
        C0932b.m1368a(parcel, 8, this.f1193j);
        C0932b.m1377a(parcel, 10, this.f1188e, false);
        C0932b.m1367a(parcel, 11, mo9982b());
        C0932b.m1377a(parcel, 12, this.f1192i, false);
        C0932b.m1377a(parcel, 13, this.f1195l, false);
        C0932b.m1367a(parcel, 14, this.f1194k);
        C0932b.m1366a(parcel, 15, this.f1196m);
        C0932b.m1368a(parcel, 16, this.f1197n);
        C0932b.m1377a(parcel, 17, this.f1189f, false);
        C0932b.m1365a(parcel, a);
    }

    /* renamed from: d */
    public final String mo9984d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.f1187d;
        int i = this.f1190g;
        if (this.f1191h == null) {
            str = "";
        } else {
            str = TextUtils.join(",", this.f1191h);
        }
        int i2 = this.f1194k;
        if (this.f1188e == null) {
            str2 = "";
        } else {
            str2 = this.f1188e;
        }
        if (this.f1195l == null) {
            str3 = "";
        } else {
            str3 = this.f1195l;
        }
        float f = this.f1196m;
        if (this.f1189f == null) {
            str4 = "";
        } else {
            str4 = this.f1189f;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 45 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str4);
        return sb.toString();
    }
}
