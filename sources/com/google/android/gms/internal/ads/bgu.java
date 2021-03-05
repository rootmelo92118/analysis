package com.google.android.gms.internal.ads;

public final class bgu extends bgl {

    /* renamed from: i */
    private final bgm f4239i;

    /* renamed from: j */
    private volatile int f4240j;

    /* renamed from: k */
    private volatile boolean f4241k;

    public bgu(bje bje, bji bji, zzfs zzfs, int i, Object obj, bgm bgm) {
        super(bje, bji, 2, zzfs, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f4239i = bgm;
    }

    /* renamed from: e */
    public final long mo11903e() {
        return (long) this.f4240j;
    }

    /* renamed from: a */
    public final void mo11839a() {
        this.f4241k = true;
    }

    /* renamed from: b */
    public final boolean mo11841b() {
        return this.f4241k;
    }

    /* renamed from: c */
    public final void mo11842c() {
        bce bce;
        bji a = bkp.m5814a(this.f4189a, this.f4240j);
        try {
            bce = new bce(this.f4196h, a.f4455c, this.f4196h.mo10212a(a));
            if (this.f4240j == 0) {
                this.f4239i.mo11904a((bgo) null);
            }
            bcg bcg = this.f4239i.f4197a;
            int i = 0;
            while (i == 0 && !this.f4241k) {
                i = bcg.mo11683a((bci) bce, (bcn) null);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            bjy.m5691b(z);
            this.f4240j = (int) (bce.mo11673b() - this.f4189a.f4455c);
            bkp.m5817a(this.f4196h);
        } catch (Throwable th) {
            bkp.m5817a(this.f4196h);
            throw th;
        }
    }
}
