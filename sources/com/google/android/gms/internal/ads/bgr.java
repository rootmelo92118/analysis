package com.google.android.gms.internal.ads;

public final class bgr implements bgb {

    /* renamed from: a */
    public final bgq<T> f4229a;

    /* renamed from: b */
    private final bfy f4230b;

    /* renamed from: c */
    private final int f4231c;

    /* renamed from: d */
    private final /* synthetic */ bgq f4232d;

    public bgr(bgq bgq, bgq<T> bgq2, bfy bfy, int i) {
        this.f4232d = bgq;
        this.f4229a = bgq2;
        this.f4230b = bfy;
        this.f4231c = i;
    }

    /* renamed from: b */
    public final void mo11817b() {
    }

    /* renamed from: a */
    public final boolean mo11815a() {
        if (!this.f4232d.f4212b) {
            return !this.f4232d.mo11914f() && this.f4230b.mo11872c();
        }
        return true;
    }

    /* renamed from: a_ */
    public final void mo11816a_(long j) {
        if (!this.f4232d.f4212b || j <= this.f4230b.mo11875f()) {
            this.f4230b.mo11870a(j, true);
        } else {
            this.f4230b.mo11876g();
        }
    }

    /* renamed from: a */
    public final int mo11814a(baa baa, bbw bbw, boolean z) {
        if (this.f4232d.mo11914f()) {
            return -3;
        }
        return this.f4230b.mo11865a(baa, bbw, z, this.f4232d.f4212b, this.f4232d.f4211a);
    }

    /* renamed from: c */
    public final void mo11915c() {
        bjy.m5691b(this.f4232d.f4215e[this.f4231c]);
        this.f4232d.f4215e[this.f4231c] = false;
    }
}
