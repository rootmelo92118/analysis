package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class bjp implements bju {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f4498a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public bjr<? extends bjs> f4499b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f4500c;

    public bjp(String str) {
        this.f4498a = bkp.m5816a(str);
    }

    /* renamed from: a */
    public final <T extends bjs> long mo12021a(T t, bjq<T> bjq, int i) {
        Looper myLooper = Looper.myLooper();
        bjy.m5691b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new bjr(this, myLooper, t, bjq, i, elapsedRealtime).mo12028a(0);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public final boolean mo12024a() {
        return this.f4499b != null;
    }

    /* renamed from: b */
    public final void mo12025b() {
        this.f4499b.mo12029a(false);
    }

    /* renamed from: a */
    public final void mo12023a(Runnable runnable) {
        if (this.f4499b != null) {
            this.f4499b.mo12029a(true);
        }
        if (runnable != null) {
            this.f4498a.execute(runnable);
        }
        this.f4498a.shutdown();
    }

    /* renamed from: c */
    public final void mo12026c() {
        if (this.f4500c != null) {
            throw this.f4500c;
        } else if (this.f4499b != null) {
            this.f4499b.mo12027a(this.f4499b.f4501a);
        }
    }

    /* renamed from: a */
    public final void mo12022a(int i) {
        if (this.f4500c != null) {
            throw this.f4500c;
        } else if (this.f4499b != null) {
            this.f4499b.mo12027a(this.f4499b.f4501a);
        }
    }
}
