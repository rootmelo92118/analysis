package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class bch implements C1125b {

    /* renamed from: a */
    private final Executor f3523a;

    public bch(Handler handler) {
        this.f3523a = new bdi(this, handler);
    }

    /* renamed from: a */
    public final void mo11511a(blj<?> blj, brk<?> brk) {
        mo11512a(blj, brk, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo11512a(blj<?> blj, brk<?> brk, Runnable runnable) {
        blj.mo12129l();
        blj.mo12117b("post-response");
        this.f3523a.execute(new bej(blj, brk, runnable));
    }

    /* renamed from: a */
    public final void mo11513a(blj<?> blj, C1236dd ddVar) {
        blj.mo12117b("post-error");
        this.f3523a.execute(new bej(blj, brk.m6330a(ddVar), (Runnable) null));
    }
}
