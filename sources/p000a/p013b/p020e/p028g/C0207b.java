package p000a.p013b.p020e.p028g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0164a;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p020e.p021a.C0185c;

/* renamed from: a.b.e.g.b */
/* compiled from: IoScheduler */
public final class C0207b extends C0240h {

    /* renamed from: b */
    static final C0213e f418b;

    /* renamed from: c */
    static final C0213e f419c;

    /* renamed from: d */
    static final C0210c f420d = new C0210c(new C0213e("RxCachedThreadSchedulerShutdown"));

    /* renamed from: f */
    static final C0208a f421f = new C0208a(0, (TimeUnit) null);

    /* renamed from: g */
    private static final TimeUnit f422g = TimeUnit.SECONDS;

    /* renamed from: e */
    final AtomicReference<C0208a> f423e = new AtomicReference<>(f421f);

    static {
        f421f.mo404d();
        f420d.mo348a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f418b = new C0213e("RxCachedThreadScheduler", max);
        f419c = new C0213e("RxCachedWorkerPoolEvictor", max);
    }

    /* renamed from: a.b.e.g.b$a */
    /* compiled from: IoScheduler */
    static final class C0208a implements Runnable {

        /* renamed from: a */
        final C0164a f424a;

        /* renamed from: b */
        private final long f425b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C0210c> f426c;

        /* renamed from: d */
        private final ScheduledExecutorService f427d;

        /* renamed from: e */
        private final Future<?> f428e;

        C0208a(long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.f425b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f426c = new ConcurrentLinkedQueue<>();
            this.f424a = new C0164a();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C0207b.f419c);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, this.f425b, this.f425b, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f427d = scheduledExecutorService;
            this.f428e = scheduledFuture;
        }

        public void run() {
            mo402b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0210c mo400a() {
            if (this.f424a.mo352b()) {
                return C0207b.f420d;
            }
            while (!this.f426c.isEmpty()) {
                C0210c poll = this.f426c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C0210c cVar = new C0210c(C0207b.f418b);
            this.f424a.mo351a((C0165b) cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo401a(C0210c cVar) {
            cVar.mo406a(mo403c() + this.f425b);
            this.f426c.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo402b() {
            if (!this.f426c.isEmpty()) {
                long c = mo403c();
                Iterator<C0210c> it = this.f426c.iterator();
                while (it.hasNext()) {
                    C0210c next = it.next();
                    if (next.mo407b() > c) {
                        return;
                    }
                    if (this.f426c.remove(next)) {
                        this.f424a.mo353b(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo403c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo404d() {
            this.f424a.mo348a();
            if (this.f428e != null) {
                this.f428e.cancel(true);
            }
            if (this.f427d != null) {
                this.f427d.shutdownNow();
            }
        }
    }

    public C0207b() {
        mo396b();
    }

    /* renamed from: b */
    public void mo396b() {
        C0208a aVar = new C0208a(60, f422g);
        if (!this.f423e.compareAndSet(f421f, aVar)) {
            aVar.mo404d();
        }
    }

    /* renamed from: a */
    public C0240h.C0242a mo346a() {
        return new C0209b(this.f423e.get());
    }

    /* renamed from: a.b.e.g.b$b */
    /* compiled from: IoScheduler */
    static final class C0209b extends C0240h.C0242a {

        /* renamed from: a */
        final AtomicBoolean f429a = new AtomicBoolean();

        /* renamed from: b */
        private final C0164a f430b;

        /* renamed from: c */
        private final C0208a f431c;

        /* renamed from: d */
        private final C0210c f432d;

        C0209b(C0208a aVar) {
            this.f431c = aVar;
            this.f430b = new C0164a();
            this.f432d = aVar.mo400a();
        }

        /* renamed from: a */
        public void mo348a() {
            if (this.f429a.compareAndSet(false, true)) {
                this.f430b.mo348a();
                this.f431c.mo401a(this.f432d);
            }
        }

        /* renamed from: a */
        public C0165b mo347a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f430b.mo352b()) {
                return C0185c.INSTANCE;
            }
            return this.f432d.mo408a(runnable, j, timeUnit, this.f430b);
        }
    }

    /* renamed from: a.b.e.g.b$c */
    /* compiled from: IoScheduler */
    static final class C0210c extends C0212d {

        /* renamed from: b */
        private long f433b = 0;

        C0210c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: b */
        public long mo407b() {
            return this.f433b;
        }

        /* renamed from: a */
        public void mo406a(long j) {
            this.f433b = j;
        }
    }
}
