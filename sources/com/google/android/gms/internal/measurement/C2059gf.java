package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2003ei;

/* renamed from: com.google.android.gms.internal.measurement.gf */
final class C2059gf implements C2041fo {

    /* renamed from: a */
    private final C2043fq f7823a;

    /* renamed from: b */
    private final String f7824b;

    /* renamed from: c */
    private final Object[] f7825c;

    /* renamed from: d */
    private final int f7826d;

    C2059gf(C2043fq fqVar, String str, Object[] objArr) {
        this.f7823a = fqVar;
        this.f7824b = str;
        this.f7825c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7826d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f7826d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo13940d() {
        return this.f7824b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Object[] mo13941e() {
        return this.f7825c;
    }

    /* renamed from: c */
    public final C2043fq mo13924c() {
        return this.f7823a;
    }

    /* renamed from: a */
    public final int mo13922a() {
        return (this.f7826d & 1) == 1 ? C2003ei.C2008e.f7737h : C2003ei.C2008e.f7738i;
    }

    /* renamed from: b */
    public final boolean mo13923b() {
        return (this.f7826d & 2) == 2;
    }
}
