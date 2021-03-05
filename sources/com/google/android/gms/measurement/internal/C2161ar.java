package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.ar */
public final class C2161ar extends C2190bt {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicLong f8105j = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2165av f8106a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2165av f8107b;

    /* renamed from: c */
    private final PriorityBlockingQueue<C2164au<?>> f8108c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final BlockingQueue<C2164au<?>> f8109d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final Thread.UncaughtExceptionHandler f8110e = new C2163at(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: f */
    private final Thread.UncaughtExceptionHandler f8111f = new C2163at(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f8112g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Semaphore f8113h = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f8114i;

    C2161ar(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14253e() {
        return false;
    }

    /* renamed from: d */
    public final void mo14221d() {
        if (Thread.currentThread() != this.f8106a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: c */
    public final void mo14220c() {
        if (Thread.currentThread() != this.f8107b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: g */
    public final boolean mo14299g() {
        return Thread.currentThread() == this.f8106a;
    }

    /* renamed from: a */
    public final <V> Future<V> mo14295a(Callable<V> callable) {
        mo14377A();
        C0926p.m1306a(callable);
        C2164au auVar = new C2164au(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8106a) {
            if (!this.f8108c.isEmpty()) {
                mo14235r().mo14833i().mo14841a("Callable skipped the worker queue.");
            }
            auVar.run();
        } else {
            m10497a((C2164au<?>) auVar);
        }
        return auVar;
    }

    /* renamed from: b */
    public final <V> Future<V> mo14297b(Callable<V> callable) {
        mo14377A();
        C0926p.m1306a(callable);
        C2164au auVar = new C2164au(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8106a) {
            auVar.run();
        } else {
            m10497a((C2164au<?>) auVar);
        }
        return auVar;
    }

    /* renamed from: a */
    public final void mo14296a(Runnable runnable) {
        mo14377A();
        C0926p.m1306a(runnable);
        m10497a((C2164au<?>) new C2164au(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: a */
    private final void m10497a(C2164au<?> auVar) {
        synchronized (this.f8112g) {
            this.f8108c.add(auVar);
            if (this.f8106a == null) {
                this.f8106a = new C2165av(this, "Measurement Worker", this.f8108c);
                this.f8106a.setUncaughtExceptionHandler(this.f8110e);
                this.f8106a.start();
            } else {
                this.f8106a.mo14303a();
            }
        }
    }

    /* renamed from: b */
    public final void mo14298b(Runnable runnable) {
        mo14377A();
        C0926p.m1306a(runnable);
        C2164au auVar = new C2164au(this, runnable, false, "Task exception on network thread");
        synchronized (this.f8112g) {
            this.f8109d.add(auVar);
            if (this.f8107b == null) {
                this.f8107b = new C2165av(this, "Measurement Network", this.f8109d);
                this.f8107b.setUncaughtExceptionHandler(this.f8111f);
                this.f8107b.start();
            } else {
                this.f8107b.mo14303a();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
