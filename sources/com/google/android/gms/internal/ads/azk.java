package com.google.android.gms.internal.ads;

public abstract class azk implements baf, bah {

    /* renamed from: a */
    private final int f3161a;

    /* renamed from: b */
    private bai f3162b;

    /* renamed from: c */
    private int f3163c;

    /* renamed from: d */
    private int f3164d;

    /* renamed from: e */
    private bgb f3165e;

    /* renamed from: f */
    private long f3166f;

    /* renamed from: g */
    private boolean f3167g = true;

    /* renamed from: h */
    private boolean f3168h;

    public azk(int i) {
        this.f3161a = i;
    }

    /* renamed from: a */
    public void mo11447a(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11449a(long j, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11451a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11452a(zzfs[] zzfsArr, long j) {
    }

    /* renamed from: b */
    public final bah mo11454b() {
        return this;
    }

    /* renamed from: c */
    public bkc mo11456c() {
        return null;
    }

    /* renamed from: m */
    public int mo11466m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo11467n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo11468o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo11469p() {
    }

    /* renamed from: a */
    public final int mo11444a() {
        return this.f3161a;
    }

    /* renamed from: a */
    public final void mo11446a(int i) {
        this.f3163c = i;
    }

    /* renamed from: d */
    public final int mo11457d() {
        return this.f3164d;
    }

    /* renamed from: a */
    public final void mo11450a(bai bai, zzfs[] zzfsArr, bgb bgb, long j, boolean z, long j2) {
        bjy.m5691b(this.f3164d == 0);
        this.f3162b = bai;
        this.f3164d = 1;
        mo11451a(z);
        mo11453a(zzfsArr, bgb, j2);
        mo11449a(j, z);
    }

    /* renamed from: e */
    public final void mo11458e() {
        boolean z = true;
        if (this.f3164d != 1) {
            z = false;
        }
        bjy.m5691b(z);
        this.f3164d = 2;
        mo11467n();
    }

    /* renamed from: a */
    public final void mo11453a(zzfs[] zzfsArr, bgb bgb, long j) {
        bjy.m5691b(!this.f3168h);
        this.f3165e = bgb;
        this.f3167g = false;
        this.f3166f = j;
        mo11452a(zzfsArr, j);
    }

    /* renamed from: f */
    public final bgb mo11459f() {
        return this.f3165e;
    }

    /* renamed from: g */
    public final boolean mo11460g() {
        return this.f3167g;
    }

    /* renamed from: h */
    public final void mo11461h() {
        this.f3168h = true;
    }

    /* renamed from: i */
    public final boolean mo11462i() {
        return this.f3168h;
    }

    /* renamed from: j */
    public final void mo11463j() {
        this.f3165e.mo11817b();
    }

    /* renamed from: a */
    public final void mo11448a(long j) {
        this.f3168h = false;
        this.f3167g = false;
        mo11449a(j, false);
    }

    /* renamed from: k */
    public final void mo11464k() {
        bjy.m5691b(this.f3164d == 2);
        this.f3164d = 1;
        mo11468o();
    }

    /* renamed from: l */
    public final void mo11465l() {
        boolean z = true;
        if (this.f3164d != 1) {
            z = false;
        }
        bjy.m5691b(z);
        this.f3164d = 0;
        this.f3165e = null;
        this.f3168h = false;
        mo11469p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final bai mo11470q() {
        return this.f3162b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo11471r() {
        return this.f3163c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11445a(baa baa, bbw bbw, boolean z) {
        int a = this.f3165e.mo11814a(baa, bbw, z);
        if (a == -4) {
            if (bbw.mo11648c()) {
                this.f3167g = true;
                if (this.f3168h) {
                    return -4;
                }
                return -3;
            }
            bbw.f3508c += this.f3166f;
        } else if (a == -5) {
            zzfs zzfs = baa.f3268a;
            if (zzfs.f7221q != Long.MAX_VALUE) {
                baa.f3268a = zzfs.mo13407a(zzfs.f7221q + this.f3166f);
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11455b(long j) {
        this.f3165e.mo11816a_(j - this.f3166f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo11472s() {
        return this.f3167g ? this.f3168h : this.f3165e.mo11815a();
    }
}
