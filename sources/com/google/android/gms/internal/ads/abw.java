package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@C1598qn
public class abw<T> implements abs<T> {

    /* renamed from: a */
    private final Object f1326a = new Object();

    /* renamed from: b */
    private int f1327b = 0;

    /* renamed from: c */
    private final BlockingQueue<abx> f1328c = new LinkedBlockingQueue();

    /* renamed from: d */
    private T f1329d;

    /* renamed from: a */
    public final void mo10093a(abv<T> abv, abt abt) {
        synchronized (this.f1326a) {
            if (this.f1327b == 1) {
                abv.mo10096a(this.f1329d);
            } else if (this.f1327b == -1) {
                abt.mo10095a();
            } else if (this.f1327b == 0) {
                this.f1328c.add(new abx(this, abv, abt));
            }
        }
    }

    /* renamed from: a */
    public final void mo10094a(T t) {
        synchronized (this.f1326a) {
            if (this.f1327b == 0) {
                this.f1329d = t;
                this.f1327b = 1;
                for (abx abx : this.f1328c) {
                    abx.f1330a.mo10096a(t);
                }
                this.f1328c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: d */
    public final void mo10097d() {
        synchronized (this.f1326a) {
            if (this.f1327b == 0) {
                this.f1327b = -1;
                for (abx abx : this.f1328c) {
                    abx.f1331b.mo10095a();
                }
                this.f1328c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: e */
    public final int mo10098e() {
        return this.f1327b;
    }
}
