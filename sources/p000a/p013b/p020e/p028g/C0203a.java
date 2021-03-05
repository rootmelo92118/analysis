package p000a.p013b.p020e.p028g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0164a;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p020e.p021a.C0185c;
import p000a.p013b.p020e.p021a.C0186d;

/* renamed from: a.b.e.g.a */
/* compiled from: ComputationScheduler */
public final class C0203a extends C0240h {

    /* renamed from: b */
    static final C0205b f405b = new C0205b(0);

    /* renamed from: c */
    static final C0213e f406c = new C0213e("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())));

    /* renamed from: d */
    static final int f407d = m569a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: e */
    static final C0206c f408e = new C0206c(new C0213e("RxComputationShutdown"));

    /* renamed from: f */
    final AtomicReference<C0205b> f409f = new AtomicReference<>(f405b);

    /* renamed from: a */
    static int m569a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        f408e.mo348a();
    }

    /* renamed from: a.b.e.g.a$b */
    /* compiled from: ComputationScheduler */
    static final class C0205b {

        /* renamed from: a */
        final int f415a;

        /* renamed from: b */
        final C0206c[] f416b;

        /* renamed from: c */
        long f417c;

        C0205b(int i) {
            this.f415a = i;
            this.f416b = new C0206c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f416b[i2] = new C0206c(C0203a.f406c);
            }
        }

        /* renamed from: a */
        public C0206c mo398a() {
            int i = this.f415a;
            if (i == 0) {
                return C0203a.f408e;
            }
            C0206c[] cVarArr = this.f416b;
            long j = this.f417c;
            this.f417c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo399b() {
            for (C0206c a : this.f416b) {
                a.mo348a();
            }
        }
    }

    public C0203a() {
        mo396b();
    }

    /* renamed from: a */
    public C0240h.C0242a mo346a() {
        return new C0204a(this.f409f.get().mo398a());
    }

    /* renamed from: a */
    public C0165b mo345a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f409f.get().mo398a().mo409b(runnable, j, timeUnit);
    }

    /* renamed from: b */
    public void mo396b() {
        C0205b bVar = new C0205b(f407d);
        if (!this.f409f.compareAndSet(f405b, bVar)) {
            bVar.mo399b();
        }
    }

    /* renamed from: a.b.e.g.a$a */
    /* compiled from: ComputationScheduler */
    static final class C0204a extends C0240h.C0242a {

        /* renamed from: a */
        volatile boolean f410a;

        /* renamed from: b */
        private final C0186d f411b = new C0186d();

        /* renamed from: c */
        private final C0164a f412c = new C0164a();

        /* renamed from: d */
        private final C0186d f413d = new C0186d();

        /* renamed from: e */
        private final C0206c f414e;

        C0204a(C0206c cVar) {
            this.f414e = cVar;
            this.f413d.mo351a((C0165b) this.f411b);
            this.f413d.mo351a((C0165b) this.f412c);
        }

        /* renamed from: a */
        public void mo348a() {
            if (!this.f410a) {
                this.f410a = true;
                this.f413d.mo348a();
            }
        }

        /* renamed from: a */
        public C0165b mo397a(Runnable runnable) {
            if (this.f410a) {
                return C0185c.INSTANCE;
            }
            return this.f414e.mo408a(runnable, 0, (TimeUnit) null, this.f411b);
        }

        /* renamed from: a */
        public C0165b mo347a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f410a) {
                return C0185c.INSTANCE;
            }
            return this.f414e.mo408a(runnable, j, timeUnit, this.f412c);
        }
    }

    /* renamed from: a.b.e.g.a$c */
    /* compiled from: ComputationScheduler */
    static final class C0206c extends C0212d {
        C0206c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
