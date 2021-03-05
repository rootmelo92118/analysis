package com.google.android.gms.internal.ads;

public final class bgt extends bgj {

    /* renamed from: j */
    private final int f4233j;

    /* renamed from: k */
    private final long f4234k;

    /* renamed from: l */
    private final bgm f4235l;

    /* renamed from: m */
    private volatile int f4236m;

    /* renamed from: n */
    private volatile boolean f4237n;

    /* renamed from: o */
    private volatile boolean f4238o;

    public bgt(bje bje, bji bji, zzfs zzfs, int i, Object obj, long j, long j2, int i2, int i3, long j3, bgm bgm) {
        super(bje, bji, zzfs, i, obj, j, j2, i2);
        this.f4233j = i3;
        this.f4234k = j3;
        this.f4235l = bgm;
    }

    /* renamed from: f */
    public final int mo11920f() {
        return this.f4242i + this.f4233j;
    }

    /* renamed from: g */
    public final boolean mo11921g() {
        return this.f4238o;
    }

    /* renamed from: e */
    public final long mo11903e() {
        return (long) this.f4236m;
    }

    /* renamed from: a */
    public final void mo11839a() {
        this.f4237n = true;
    }

    /* renamed from: b */
    public final boolean mo11841b() {
        return this.f4237n;
    }

    /* renamed from: c */
    public final void mo11842c() {
        bce bce;
        bji a = bkp.m5814a(this.f4189a, this.f4236m);
        try {
            bce = new bce(this.f4196h, a.f4455c, this.f4196h.mo10212a(a));
            if (this.f4236m == 0) {
                bgk d = mo11899d();
                d.mo11901a(this.f4234k);
                this.f4235l.mo11904a((bgo) d);
            }
            bcg bcg = this.f4235l.f4197a;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.f4237n) {
                i = bcg.mo11683a((bci) bce, (bcn) null);
            }
            if (i != 1) {
                z = true;
            }
            bjy.m5691b(z);
            this.f4236m = (int) (bce.mo11673b() - this.f4189a.f4455c);
            bkp.m5817a(this.f4196h);
            this.f4238o = true;
        } catch (Throwable th) {
            bkp.m5817a(this.f4196h);
            throw th;
        }
    }
}
