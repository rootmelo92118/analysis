package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.measurement.internal.d */
final class C2224d {

    /* renamed from: a */
    final String f8319a;

    /* renamed from: b */
    final String f8320b;

    /* renamed from: c */
    final long f8321c;

    /* renamed from: d */
    final long f8322d;

    /* renamed from: e */
    final long f8323e;

    /* renamed from: f */
    final long f8324f;

    /* renamed from: g */
    final Long f8325g;

    /* renamed from: h */
    final Long f8326h;

    /* renamed from: i */
    final Long f8327i;

    /* renamed from: j */
    final Boolean f8328j;

    C2224d(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        C0926p.m1308a(str);
        C0926p.m1308a(str2);
        boolean z = false;
        C0926p.m1316b(j5 >= 0);
        C0926p.m1316b(j6 >= 0);
        C0926p.m1316b(j7 >= 0 ? true : z);
        this.f8319a = str;
        this.f8320b = str2;
        this.f8321c = j5;
        this.f8322d = j6;
        this.f8323e = j3;
        this.f8324f = j7;
        this.f8325g = l;
        this.f8326h = l2;
        this.f8327i = l3;
        this.f8328j = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2224d mo14457a(long j) {
        return new C2224d(this.f8319a, this.f8320b, this.f8321c, this.f8322d, j, this.f8324f, this.f8325g, this.f8326h, this.f8327i, this.f8328j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2224d mo14458a(long j, long j2) {
        return new C2224d(this.f8319a, this.f8320b, this.f8321c, this.f8322d, this.f8323e, j, Long.valueOf(j2), this.f8326h, this.f8327i, this.f8328j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2224d mo14459a(Long l, Long l2, Boolean bool) {
        return new C2224d(this.f8319a, this.f8320b, this.f8321c, this.f8322d, this.f8323e, this.f8324f, this.f8325g, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
