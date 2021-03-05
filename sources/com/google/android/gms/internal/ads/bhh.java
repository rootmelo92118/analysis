package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class bhh extends Thread {

    /* renamed from: a */
    private final BlockingQueue<blj<?>> f4302a;

    /* renamed from: b */
    private final bgg f4303b;

    /* renamed from: c */
    private final C1830zc f4304c;

    /* renamed from: d */
    private final C1125b f4305d;

    /* renamed from: e */
    private volatile boolean f4306e = false;

    public bhh(BlockingQueue<blj<?>> blockingQueue, bgg bgg, C1830zc zcVar, C1125b bVar) {
        this.f4302a = blockingQueue;
        this.f4303b = bgg;
        this.f4304c = zcVar;
        this.f4305d = bVar;
    }

    /* renamed from: a */
    public final void mo11939a() {
        this.f4306e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m5474b();
            } catch (InterruptedException unused) {
                if (this.f4306e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1264ee.m6818c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private final void m5474b() {
        blj take = this.f4302a.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            take.mo12117b("network-queue-take");
            take.mo12125h();
            TrafficStats.setThreadStatsTag(take.mo12121d());
            bjj a = this.f4303b.mo11892a(take);
            take.mo12117b("network-http-complete");
            if (!a.f4464e || !take.mo12130m()) {
                brk a2 = take.mo12110a(a);
                take.mo12117b("network-parse-complete");
                if (take.mo12126i() && a2.f5186b != null) {
                    this.f4304c.mo12771a(take.mo12123f(), a2.f5186b);
                    take.mo12117b("network-cache-written");
                }
                take.mo12129l();
                this.f4305d.mo11511a((blj<?>) take, (brk<?>) a2);
                take.mo12112a((brk<?>) a2);
                return;
            }
            take.mo12119c("not-modified");
            take.mo12131n();
        } catch (C1236dd e) {
            e.mo12498a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f4305d.mo11513a((blj<?>) take, e);
            take.mo12131n();
        } catch (Exception e2) {
            C1264ee.m6816a(e2, "Unhandled exception %s", e2.toString());
            C1236dd ddVar = new C1236dd((Throwable) e2);
            ddVar.mo12498a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f4305d.mo11513a((blj<?>) take, ddVar);
            take.mo12131n();
        }
    }
}
