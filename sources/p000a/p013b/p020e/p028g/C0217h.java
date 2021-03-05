package p000a.p013b.p020e.p028g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0164a;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p017b.C0166c;
import p000a.p013b.p020e.p021a.C0185c;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.e.g.h */
/* compiled from: SingleScheduler */
public final class C0217h extends C0240h {

    /* renamed from: c */
    static final C0213e f447c = new C0213e("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())));

    /* renamed from: d */
    static final ScheduledExecutorService f448d = Executors.newScheduledThreadPool(0);

    /* renamed from: b */
    final AtomicReference<ScheduledExecutorService> f449b = new AtomicReference<>();

    static {
        f448d.shutdown();
    }

    public C0217h() {
        this.f449b.lazySet(m600c());
    }

    /* renamed from: c */
    static ScheduledExecutorService m600c() {
        return C0215g.m598a(f447c);
    }

    /* renamed from: b */
    public void mo396b() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f449b.get();
            if (scheduledExecutorService != f448d) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m600c();
            }
        } while (!this.f449b.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    /* renamed from: a */
    public C0240h.C0242a mo346a() {
        return new C0218a(this.f449b.get());
    }

    /* renamed from: a */
    public C0165b mo345a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        Runnable a = C0229a.m631a(runnable);
        if (j <= 0) {
            try {
                future = this.f449b.get().submit(a);
            } catch (RejectedExecutionException e) {
                C0229a.m632a((Throwable) e);
                return C0185c.INSTANCE;
            }
        } else {
            future = this.f449b.get().schedule(a, j, timeUnit);
        }
        return C0166c.m472a((Future<?>) future);
    }

    /* renamed from: a.b.e.g.h$a */
    /* compiled from: SingleScheduler */
    static final class C0218a extends C0240h.C0242a {

        /* renamed from: a */
        final ScheduledExecutorService f450a;

        /* renamed from: b */
        final C0164a f451b = new C0164a();

        /* renamed from: c */
        volatile boolean f452c;

        C0218a(ScheduledExecutorService scheduledExecutorService) {
            this.f450a = scheduledExecutorService;
        }

        /* renamed from: a */
        public C0165b mo347a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f452c) {
                return C0185c.INSTANCE;
            }
            C0214f fVar = new C0214f(C0229a.m631a(runnable), this.f451b);
            this.f451b.mo351a((C0165b) fVar);
            if (j <= 0) {
                try {
                    future = this.f450a.submit(fVar);
                } catch (RejectedExecutionException e) {
                    mo348a();
                    C0229a.m632a((Throwable) e);
                    return C0185c.INSTANCE;
                }
            } else {
                future = this.f450a.schedule(fVar, j, timeUnit);
            }
            fVar.mo412a(future);
            return fVar;
        }

        /* renamed from: a */
        public void mo348a() {
            if (!this.f452c) {
                this.f452c = true;
                this.f451b.mo348a();
            }
        }
    }
}
