package p000a.p013b;

import java.util.concurrent.TimeUnit;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.h */
/* compiled from: Scheduler */
public abstract class C0240h {

    /* renamed from: a */
    static final long f491a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: a */
    public abstract C0242a mo346a();

    /* renamed from: b */
    public void mo396b() {
    }

    /* renamed from: a */
    public C0165b mo416a(Runnable runnable) {
        return mo345a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C0165b mo345a(Runnable runnable, long j, TimeUnit timeUnit) {
        final C0242a a = mo346a();
        final Runnable a2 = C0229a.m631a(runnable);
        a.mo347a(new Runnable() {
            public void run() {
                try {
                    a2.run();
                } finally {
                    a.mo348a();
                }
            }
        }, j, timeUnit);
        return a;
    }

    /* renamed from: a.b.h$a */
    /* compiled from: Scheduler */
    public static abstract class C0242a implements C0165b {
        /* renamed from: a */
        public abstract C0165b mo347a(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public C0165b mo397a(Runnable runnable) {
            return mo347a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public long mo437a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
