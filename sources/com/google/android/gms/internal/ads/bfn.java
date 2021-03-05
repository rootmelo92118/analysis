package com.google.android.gms.internal.ads;

import android.net.Uri;

final class bfn implements bjs {

    /* renamed from: a */
    private final Uri f4102a;

    /* renamed from: b */
    private final bje f4103b;

    /* renamed from: c */
    private final bfo f4104c;

    /* renamed from: d */
    private final bka f4105d;

    /* renamed from: e */
    private final bcn f4106e = new bcn();

    /* renamed from: f */
    private volatile boolean f4107f;

    /* renamed from: g */
    private boolean f4108g = true;

    /* renamed from: h */
    private long f4109h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f4110i = -1;

    /* renamed from: j */
    private final /* synthetic */ bfi f4111j;

    public bfn(bfi bfi, Uri uri, bje bje, bfo bfo, bka bka) {
        this.f4111j = bfi;
        this.f4102a = (Uri) bjy.m5688a(uri);
        this.f4103b = (bje) bjy.m5688a(bje);
        this.f4104c = (bfo) bjy.m5688a(bfo);
        this.f4105d = bka;
    }

    /* renamed from: a */
    public final void mo11840a(long j, long j2) {
        this.f4106e.f3528a = j;
        this.f4109h = j2;
        this.f4108g = true;
    }

    /* renamed from: a */
    public final void mo11839a() {
        this.f4107f = true;
    }

    /* renamed from: b */
    public final boolean mo11841b() {
        return this.f4107f;
    }

    /* renamed from: c */
    public final void mo11842c() {
        bce bce;
        int i = 0;
        while (i == 0 && !this.f4107f) {
            try {
                long j = this.f4106e.f3528a;
                this.f4110i = this.f4103b.mo10212a(new bji(this.f4102a, j, -1, this.f4111j.f4077h));
                if (this.f4110i != -1) {
                    this.f4110i += j;
                }
                bce = new bce(this.f4103b, j, this.f4110i);
                try {
                    bcg a = this.f4104c.mo11843a(bce, this.f4103b.mo10214b());
                    if (this.f4108g) {
                        a.mo11684a(j, this.f4109h);
                        this.f4108g = false;
                    }
                    while (i == 0 && !this.f4107f) {
                        this.f4105d.mo12042c();
                        int a2 = a.mo11683a((bci) bce, this.f4106e);
                        try {
                            if (bce.mo11673b() > this.f4111j.f4078i + j) {
                                j = bce.mo11673b();
                                this.f4105d.mo12041b();
                                this.f4111j.f4084o.post(this.f4111j.f4083n);
                            }
                            i = a2;
                        } catch (Throwable th) {
                            th = th;
                            i = a2;
                            if (!(i == 1 || bce == null)) {
                                this.f4106e.f3528a = bce.mo11673b();
                            }
                            bkp.m5817a(this.f4103b);
                            throw th;
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f4106e.f3528a = bce.mo11673b();
                    }
                    bkp.m5817a(this.f4103b);
                } catch (Throwable th2) {
                    th = th2;
                    this.f4106e.f3528a = bce.mo11673b();
                    bkp.m5817a(this.f4103b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bce = null;
                this.f4106e.f3528a = bce.mo11673b();
                bkp.m5817a(this.f4103b);
                throw th;
            }
        }
    }
}
