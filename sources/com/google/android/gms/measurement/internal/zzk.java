package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C2268ep();

    /* renamed from: a */
    public final String f8661a;

    /* renamed from: b */
    public final String f8662b;

    /* renamed from: c */
    public final String f8663c;

    /* renamed from: d */
    public final String f8664d;

    /* renamed from: e */
    public final long f8665e;

    /* renamed from: f */
    public final long f8666f;

    /* renamed from: g */
    public final String f8667g;

    /* renamed from: h */
    public final boolean f8668h;

    /* renamed from: i */
    public final boolean f8669i;

    /* renamed from: j */
    public final long f8670j;

    /* renamed from: k */
    public final String f8671k;

    /* renamed from: l */
    public final long f8672l;

    /* renamed from: m */
    public final long f8673m;

    /* renamed from: n */
    public final int f8674n;

    /* renamed from: o */
    public final boolean f8675o;

    /* renamed from: p */
    public final boolean f8676p;

    /* renamed from: q */
    public final boolean f8677q;

    /* renamed from: r */
    public final String f8678r;

    zzk(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        C0926p.m1308a(str);
        this.f8661a = str;
        this.f8662b = TextUtils.isEmpty(str2) ? null : str2;
        this.f8663c = str3;
        this.f8670j = j;
        this.f8664d = str4;
        this.f8665e = j2;
        this.f8666f = j3;
        this.f8667g = str5;
        this.f8668h = z;
        this.f8669i = z2;
        this.f8671k = str6;
        this.f8672l = j4;
        this.f8673m = j5;
        this.f8674n = i;
        this.f8675o = z3;
        this.f8676p = z4;
        this.f8677q = z5;
        this.f8678r = str7;
    }

    zzk(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        this.f8661a = str;
        this.f8662b = str2;
        this.f8663c = str3;
        this.f8670j = j3;
        this.f8664d = str4;
        this.f8665e = j;
        this.f8666f = j2;
        this.f8667g = str5;
        this.f8668h = z;
        this.f8669i = z2;
        this.f8671k = str6;
        this.f8672l = j4;
        this.f8673m = j5;
        this.f8674n = i;
        this.f8675o = z3;
        this.f8676p = z4;
        this.f8677q = z5;
        this.f8678r = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f8661a, false);
        C0932b.m1377a(parcel, 3, this.f8662b, false);
        C0932b.m1377a(parcel, 4, this.f8663c, false);
        C0932b.m1377a(parcel, 5, this.f8664d, false);
        C0932b.m1368a(parcel, 6, this.f8665e);
        C0932b.m1368a(parcel, 7, this.f8666f);
        C0932b.m1377a(parcel, 8, this.f8667g, false);
        C0932b.m1379a(parcel, 9, this.f8668h);
        C0932b.m1379a(parcel, 10, this.f8669i);
        C0932b.m1368a(parcel, 11, this.f8670j);
        C0932b.m1377a(parcel, 12, this.f8671k, false);
        C0932b.m1368a(parcel, 13, this.f8672l);
        C0932b.m1368a(parcel, 14, this.f8673m);
        C0932b.m1367a(parcel, 15, this.f8674n);
        C0932b.m1379a(parcel, 16, this.f8675o);
        C0932b.m1379a(parcel, 17, this.f8676p);
        C0932b.m1379a(parcel, 18, this.f8677q);
        C0932b.m1377a(parcel, 19, this.f8678r, false);
        C0932b.m1365a(parcel, a);
    }
}
