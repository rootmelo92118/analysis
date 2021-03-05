package p000a.p013b.p020e.p028g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p017b.C0166c;
import p000a.p013b.p020e.p021a.C0185c;
import p000a.p013b.p020e.p022b.C0187a;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.e.g.i */
/* compiled from: TrampolineScheduler */
public final class C0219i extends C0240h {

    /* renamed from: b */
    private static final C0219i f453b = new C0219i();

    /* renamed from: c */
    public static C0219i m606c() {
        return f453b;
    }

    /* renamed from: a */
    public C0240h.C0242a mo346a() {
        return new C0222c();
    }

    C0219i() {
    }

    /* renamed from: a */
    public C0165b mo416a(Runnable runnable) {
        runnable.run();
        return C0185c.INSTANCE;
    }

    /* renamed from: a */
    public C0165b mo345a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C0229a.m632a((Throwable) e);
        }
        return C0185c.INSTANCE;
    }

    /* renamed from: a.b.e.g.i$c */
    /* compiled from: TrampolineScheduler */
    static final class C0222c extends C0240h.C0242a implements C0165b {

        /* renamed from: a */
        final PriorityBlockingQueue<C0221b> f461a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        final AtomicInteger f462b = new AtomicInteger();

        /* renamed from: c */
        volatile boolean f463c;

        /* renamed from: d */
        private final AtomicInteger f464d = new AtomicInteger();

        C0222c() {
        }

        /* renamed from: a */
        public C0165b mo397a(Runnable runnable) {
            return mo420a(runnable, mo437a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: a */
        public C0165b mo347a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo437a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo420a(new C0220a(runnable, this, a), a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0165b mo420a(Runnable runnable, long j) {
            if (this.f463c) {
                return C0185c.INSTANCE;
            }
            final C0221b bVar = new C0221b(runnable, Long.valueOf(j), this.f462b.incrementAndGet());
            this.f461a.add(bVar);
            if (this.f464d.getAndIncrement() != 0) {
                return C0166c.m471a((Runnable) new Runnable() {
                    public void run() {
                        bVar.f460d = true;
                        C0222c.this.f461a.remove(bVar);
                    }
                });
            }
            int i = 1;
            while (true) {
                C0221b poll = this.f461a.poll();
                if (poll == null) {
                    i = this.f464d.addAndGet(-i);
                    if (i == 0) {
                        return C0185c.INSTANCE;
                    }
                } else if (!poll.f460d) {
                    poll.f457a.run();
                }
            }
        }

        /* renamed from: a */
        public void mo348a() {
            this.f463c = true;
        }
    }

    /* renamed from: a.b.e.g.i$b */
    /* compiled from: TrampolineScheduler */
    static final class C0221b implements Comparable<C0221b> {

        /* renamed from: a */
        final Runnable f457a;

        /* renamed from: b */
        final long f458b;

        /* renamed from: c */
        final int f459c;

        /* renamed from: d */
        volatile boolean f460d;

        C0221b(Runnable runnable, Long l, int i) {
            this.f457a = runnable;
            this.f458b = l.longValue();
            this.f459c = i;
        }

        /* renamed from: a */
        public int compareTo(C0221b bVar) {
            int a = C0187a.m523a(this.f458b, bVar.f458b);
            return a == 0 ? C0187a.m521a(this.f459c, bVar.f459c) : a;
        }
    }

    /* renamed from: a.b.e.g.i$a */
    /* compiled from: TrampolineScheduler */
    static final class C0220a implements Runnable {

        /* renamed from: a */
        private final Runnable f454a;

        /* renamed from: b */
        private final C0222c f455b;

        /* renamed from: c */
        private final long f456c;

        C0220a(Runnable runnable, C0222c cVar, long j) {
            this.f454a = runnable;
            this.f455b = cVar;
            this.f456c = j;
        }

        public void run() {
            if (!this.f455b.f463c) {
                long a = this.f455b.mo437a(TimeUnit.MILLISECONDS);
                if (this.f456c > a) {
                    long j = this.f456c - a;
                    if (j > 0) {
                        try {
                            Thread.sleep(j);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            C0229a.m632a((Throwable) e);
                            return;
                        }
                    }
                }
                if (!this.f455b.f463c) {
                    this.f454a.run();
                }
            }
        }
    }
}
