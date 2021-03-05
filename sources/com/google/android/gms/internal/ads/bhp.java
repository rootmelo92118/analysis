package com.google.android.gms.internal.ads;

public final class bhp {

    /* renamed from: a */
    public final bgm f4326a;

    /* renamed from: b */
    public bhx f4327b;

    /* renamed from: c */
    public bhl f4328c;

    /* renamed from: d */
    private long f4329d;

    /* renamed from: e */
    private int f4330e;

    public bhp(long j, bhx bhx, boolean z, boolean z2) {
        bcg bcg;
        this.f4329d = j;
        this.f4327b = bhx;
        String str = bhx.f4366a.f7208d;
        int i = 0;
        if (bkd.m5755c(str) || "application/ttml+xml".equals(str)) {
            this.f4326a = null;
        } else {
            if ("application/x-rawcc".equals(str)) {
                bcg = new bef(bhx.f4366a);
            } else {
                if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm")) {
                    bcg = new bcx(1);
                } else {
                    i = z ? 4 : i;
                    bcg = new bdr(z2 ? i | 8 : i);
                }
            }
            this.f4326a = new bgm(bcg, bhx.f4366a);
        }
        this.f4328c = bhx.mo11966e();
    }

    /* renamed from: a */
    public final void mo11951a(long j, bhx bhx) {
        int a;
        bhl e = this.f4327b.mo11966e();
        bhl e2 = bhx.mo11966e();
        this.f4329d = j;
        this.f4327b = bhx;
        if (e != null) {
            this.f4328c = e2;
            if (e.mo11947b() && (a = e.mo11942a(this.f4329d)) != 0) {
                int a2 = (e.mo11941a() + a) - 1;
                long a3 = e.mo11944a(a2) + e.mo11945a(a2, this.f4329d);
                int a4 = e2.mo11941a();
                long a5 = e2.mo11944a(a4);
                if (a3 == a5) {
                    this.f4330e += (a2 + 1) - a4;
                } else if (a3 >= a5) {
                    this.f4330e += e.mo11943a(a5, this.f4329d) - a4;
                } else {
                    throw new bfe();
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo11948a() {
        return this.f4328c.mo11941a() + this.f4330e;
    }

    /* renamed from: b */
    public final int mo11952b() {
        return this.f4328c.mo11942a(this.f4329d);
    }

    /* renamed from: a */
    public final long mo11950a(int i) {
        return this.f4328c.mo11944a(i - this.f4330e);
    }

    /* renamed from: b */
    public final long mo11953b(int i) {
        return mo11950a(i) + this.f4328c.mo11945a(i - this.f4330e, this.f4329d);
    }

    /* renamed from: a */
    public final int mo11949a(long j) {
        return this.f4328c.mo11943a(j, this.f4329d) + this.f4330e;
    }

    /* renamed from: c */
    public final bhw mo11954c(int i) {
        return this.f4328c.mo11946b(i - this.f4330e);
    }
}
