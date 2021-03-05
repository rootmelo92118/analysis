package com.google.android.gms.internal.ads;

final class bdm implements bdj {

    /* renamed from: a */
    private final bkh f3769a;

    /* renamed from: b */
    private final int f3770b = this.f3769a.mo12068o();

    /* renamed from: c */
    private final int f3771c = (this.f3769a.mo12068o() & 255);

    /* renamed from: d */
    private int f3772d;

    /* renamed from: e */
    private int f3773e;

    public bdm(bdf bdf) {
        this.f3769a = bdf.f3743aP;
        this.f3769a.mo12054c(12);
    }

    /* renamed from: c */
    public final boolean mo11727c() {
        return false;
    }

    /* renamed from: a */
    public final int mo11725a() {
        return this.f3770b;
    }

    /* renamed from: b */
    public final int mo11726b() {
        if (this.f3771c == 8) {
            return this.f3769a.mo12059f();
        }
        if (this.f3771c == 16) {
            return this.f3769a.mo12060g();
        }
        int i = this.f3772d;
        this.f3772d = i + 1;
        if (i % 2 != 0) {
            return this.f3773e & 15;
        }
        this.f3773e = this.f3769a.mo12059f();
        return (this.f3773e & 240) >> 4;
    }
}
