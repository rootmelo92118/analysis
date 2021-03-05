package p000a.p001a.p002a.p003a.p004a.p007c;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: a.a.a.a.a.c.k */
/* compiled from: PriorityThreadPoolExecutor */
public class C0075k extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final int f147a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f148b = (f147a + 1);

    /* renamed from: c */
    private static final int f149c = ((f147a * 2) + 1);

    <T extends Runnable & C0064b & C0077l & C0073i> C0075k(int i, int i2, long j, TimeUnit timeUnit, C0065c<T> cVar, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, cVar, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static <T extends Runnable & C0064b & C0077l & C0073i> C0075k m202a(int i, int i2) {
        return new C0075k(i, i2, 1, TimeUnit.SECONDS, new C0065c(), new C0076a(10));
    }

    /* renamed from: a */
    public static C0075k m201a() {
        return m202a(f148b, f149c);
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C0072h(runnable, t);
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C0072h(callable);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (C0074j.isProperDelegate(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, (Object) null));
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        C0077l lVar = (C0077l) runnable;
        lVar.setFinished(true);
        lVar.setError(th);
        getQueue().mo128d();
        super.afterExecute(runnable, th);
    }

    /* renamed from: b */
    public C0065c getQueue() {
        return (C0065c) super.getQueue();
    }

    /* renamed from: a.a.a.a.a.c.k$a */
    /* compiled from: PriorityThreadPoolExecutor */
    protected static final class C0076a implements ThreadFactory {

        /* renamed from: a */
        private final int f150a;

        public C0076a(int i) {
            this.f150a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f150a);
            thread.setName("Queue");
            return thread;
        }
    }
}
