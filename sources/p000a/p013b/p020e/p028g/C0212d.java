package p000a.p013b.p020e.p028g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p017b.C0166c;
import p000a.p013b.p020e.p021a.C0183a;
import p000a.p013b.p020e.p021a.C0185c;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.e.g.d */
/* compiled from: NewThreadWorker */
public class C0212d extends C0240h.C0242a implements C0165b {

    /* renamed from: a */
    volatile boolean f436a;

    /* renamed from: b */
    private final ScheduledExecutorService f437b;

    public C0212d(ThreadFactory threadFactory) {
        this.f437b = C0215g.m598a(threadFactory);
    }

    /* renamed from: a */
    public C0165b mo397a(Runnable runnable) {
        return mo347a(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: a */
    public C0165b mo347a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f436a) {
            return C0185c.INSTANCE;
        }
        return mo408a(runnable, j, timeUnit, (C0183a) null);
    }

    /* renamed from: b */
    public C0165b mo409b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        Runnable a = C0229a.m631a(runnable);
        if (j <= 0) {
            try {
                future = this.f437b.submit(a);
            } catch (RejectedExecutionException e) {
                C0229a.m632a((Throwable) e);
                return C0185c.INSTANCE;
            }
        } else {
            future = this.f437b.schedule(a, j, timeUnit);
        }
        return C0166c.m472a((Future<?>) future);
    }

    /* renamed from: a */
    public C0214f mo408a(Runnable runnable, long j, TimeUnit timeUnit, C0183a aVar) {
        Future future;
        C0214f fVar = new C0214f(C0229a.m631a(runnable), aVar);
        if (aVar != null && !aVar.mo351a(fVar)) {
            return fVar;
        }
        if (j <= 0) {
            try {
                future = this.f437b.submit(fVar);
            } catch (RejectedExecutionException e) {
                aVar.mo353b(fVar);
                C0229a.m632a((Throwable) e);
            }
        } else {
            future = this.f437b.schedule(fVar, j, timeUnit);
        }
        fVar.mo412a(future);
        return fVar;
    }

    /* renamed from: a */
    public void mo348a() {
        if (!this.f436a) {
            this.f436a = true;
            this.f437b.shutdownNow();
        }
    }
}
