package com.google.android.gms.internal.ads;

@C1598qn
public final class agy {

    /* renamed from: a */
    public final int f1729a;

    /* renamed from: b */
    public final int f1730b;

    /* renamed from: c */
    private final int f1731c;

    /* renamed from: a */
    public static agy m2170a(zzwf zzwf) {
        if (zzwf.f7295d) {
            return new agy(3, 0, 0);
        }
        if (zzwf.f7300i) {
            return new agy(2, 0, 0);
        }
        if (zzwf.f7299h) {
            return m2168a();
        }
        return m2169a(zzwf.f7297f, zzwf.f7294c);
    }

    /* renamed from: a */
    public static agy m2168a() {
        return new agy(0, 0, 0);
    }

    /* renamed from: a */
    public static agy m2169a(int i, int i2) {
        return new agy(1, i, i2);
    }

    /* renamed from: b */
    public static agy m2171b() {
        return new agy(4, 0, 0);
    }

    /* renamed from: c */
    public static agy m2172c() {
        return new agy(5, 0, 0);
    }

    private agy(int i, int i2, int i3) {
        this.f1731c = i;
        this.f1730b = i2;
        this.f1729a = i3;
    }

    /* renamed from: d */
    public final boolean mo10493d() {
        return this.f1731c == 2;
    }

    /* renamed from: e */
    public final boolean mo10494e() {
        return this.f1731c == 3;
    }

    /* renamed from: f */
    public final boolean mo10495f() {
        return this.f1731c == 0;
    }

    /* renamed from: g */
    public final boolean mo10496g() {
        return this.f1731c == 4;
    }

    /* renamed from: h */
    public final boolean mo10497h() {
        return this.f1731c == 5;
    }
}
