package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class axe extends Thread {

    /* renamed from: a */
    private static final boolean f3024a = C1264ee.f5336a;

    /* renamed from: b */
    private final BlockingQueue<blj<?>> f3025b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<blj<?>> f3026c;

    /* renamed from: d */
    private final C1830zc f3027d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1125b f3028e;

    /* renamed from: f */
    private volatile boolean f3029f = false;

    /* renamed from: g */
    private final azg f3030g;

    public axe(BlockingQueue<blj<?>> blockingQueue, BlockingQueue<blj<?>> blockingQueue2, C1830zc zcVar, C1125b bVar) {
        this.f3025b = blockingQueue;
        this.f3026c = blockingQueue2;
        this.f3027d = zcVar;
        this.f3028e = bVar;
        this.f3030g = new azg(this);
    }

    /* renamed from: a */
    public final void mo11367a() {
        this.f3029f = true;
        interrupt();
    }

    public final void run() {
        if (f3024a) {
            C1264ee.m6815a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f3027d.mo12770a();
        while (true) {
            try {
                m4383b();
            } catch (InterruptedException unused) {
                if (this.f3029f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1264ee.m6818c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private final void m4383b() {
        blj take = this.f3025b.take();
        take.mo12117b("cache-queue-take");
        take.mo12125h();
        awd a = this.f3027d.mo12769a(take.mo12123f());
        if (a == null) {
            take.mo12117b("cache-miss");
            if (!this.f3030g.m4509b(take)) {
                this.f3026c.put(take);
            }
        } else if (a.mo11341a()) {
            take.mo12117b("cache-hit-expired");
            take.mo12108a(a);
            if (!this.f3030g.m4509b(take)) {
                this.f3026c.put(take);
            }
        } else {
            take.mo12117b("cache-hit");
            brk a2 = take.mo12110a(new bjj(a.f2953a, a.f2959g));
            take.mo12117b("cache-hit-parsed");
            if (a.f2958f < System.currentTimeMillis()) {
                take.mo12117b("cache-hit-refresh-needed");
                take.mo12108a(a);
                a2.f5188d = true;
                if (!this.f3030g.m4509b(take)) {
                    this.f3028e.mo11512a(take, a2, new ayf(this, take));
                    return;
                }
            }
            this.f3028e.mo11511a((blj<?>) take, (brk<?>) a2);
        }
    }
}
