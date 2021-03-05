package com.google.android.gms.internal.ads;

final class bdh {

    /* renamed from: a */
    public final int f3752a;

    /* renamed from: b */
    public int f3753b;

    /* renamed from: c */
    public int f3754c;

    /* renamed from: d */
    public long f3755d;

    /* renamed from: e */
    private final boolean f3756e;

    /* renamed from: f */
    private final bkh f3757f;

    /* renamed from: g */
    private final bkh f3758g;

    /* renamed from: h */
    private int f3759h;

    /* renamed from: i */
    private int f3760i;

    public bdh(bkh bkh, bkh bkh2, boolean z) {
        this.f3758g = bkh;
        this.f3757f = bkh2;
        this.f3756e = z;
        bkh2.mo12054c(12);
        this.f3752a = bkh2.mo12068o();
        bkh.mo12054c(12);
        this.f3760i = bkh.mo12068o();
        bjy.m5692b(bkh.mo12065l() != 1 ? false : true, "first_chunk must be 1");
        this.f3753b = -1;
    }

    /* renamed from: a */
    public final boolean mo11723a() {
        long j;
        int i = this.f3753b + 1;
        this.f3753b = i;
        if (i == this.f3752a) {
            return false;
        }
        if (this.f3756e) {
            j = this.f3757f.mo12069p();
        } else {
            j = this.f3757f.mo12063j();
        }
        this.f3755d = j;
        if (this.f3753b == this.f3759h) {
            this.f3754c = this.f3758g.mo12068o();
            this.f3758g.mo12056d(4);
            int i2 = this.f3760i - 1;
            this.f3760i = i2;
            this.f3759h = i2 > 0 ? this.f3758g.mo12068o() - 1 : -1;
        }
        return true;
    }
}
