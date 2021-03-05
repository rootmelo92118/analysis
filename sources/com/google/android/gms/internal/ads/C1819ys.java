package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C0924o;

/* renamed from: com.google.android.gms.internal.ads.ys */
public final class C1819ys {

    /* renamed from: a */
    public final String f6905a;

    /* renamed from: b */
    public final double f6906b;

    /* renamed from: c */
    public final int f6907c;

    /* renamed from: d */
    private final double f6908d;

    /* renamed from: e */
    private final double f6909e;

    public C1819ys(String str, double d, double d2, double d3, int i) {
        this.f6905a = str;
        this.f6909e = d;
        this.f6908d = d2;
        this.f6906b = d3;
        this.f6907c = i;
    }

    public final String toString() {
        return C0924o.m1302a((Object) this).mo9911a("name", this.f6905a).mo9911a("minBound", Double.valueOf(this.f6909e)).mo9911a("maxBound", Double.valueOf(this.f6908d)).mo9911a("percent", Double.valueOf(this.f6906b)).mo9911a("count", Integer.valueOf(this.f6907c)).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1819ys)) {
            return false;
        }
        C1819ys ysVar = (C1819ys) obj;
        if (C0924o.m1303a(this.f6905a, ysVar.f6905a) && this.f6908d == ysVar.f6908d && this.f6909e == ysVar.f6909e && this.f6907c == ysVar.f6907c && Double.compare(this.f6906b, ysVar.f6906b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C0924o.m1301a(this.f6905a, Double.valueOf(this.f6908d), Double.valueOf(this.f6909e), Double.valueOf(this.f6906b), Integer.valueOf(this.f6907c));
    }
}
