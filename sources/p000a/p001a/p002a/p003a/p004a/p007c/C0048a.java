package p000a.p001a.p002a.p003a.p004a.p007c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.a.a.a.a.c.a */
/* compiled from: AsyncTask */
public abstract class C0048a<Params, Progress, Result> {

    /* renamed from: a */
    private static final int f100a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    public static final Executor f101b = new ThreadPoolExecutor(f103d, f104e, 1, TimeUnit.SECONDS, f106g, f105f);

    /* renamed from: c */
    public static final Executor f102c = new C0055c();

    /* renamed from: d */
    private static final int f103d = (f100a + 1);

    /* renamed from: e */
    private static final int f104e = ((f100a * 2) + 1);

    /* renamed from: f */
    private static final ThreadFactory f105f = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f114a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.f114a.getAndIncrement());
        }
    };

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f106g = new LinkedBlockingQueue(128);

    /* renamed from: h */
    private static final C0054b f107h = new C0054b();

    /* renamed from: i */
    private static volatile Executor f108i = f102c;

    /* renamed from: j */
    private final C0058e<Params, Result> f109j = new C0058e<Params, Result>() {
        public Result call() {
            C0048a.this.f113n.set(true);
            Process.setThreadPriority(10);
            return C0048a.this.m165d(C0048a.this.mo94a((Params[]) this.f128b));
        }
    };

    /* renamed from: k */
    private final FutureTask<Result> f110k = new FutureTask<Result>(this.f109j) {
        /* access modifiers changed from: protected */
        public void done() {
            try {
                C0048a.this.m164c(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C0048a.this.m164c(null);
            }
        }
    };

    /* renamed from: l */
    private volatile C0057d f111l = C0057d.PENDING;

    /* renamed from: m */
    private final AtomicBoolean f112m = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final AtomicBoolean f113n = new AtomicBoolean();

    /* renamed from: a.a.a.a.a.c.a$d */
    /* compiled from: AsyncTask */
    public enum C0057d {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo94a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo100b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo101c() {
    }

    /* renamed from: a.a.a.a.a.c.a$c */
    /* compiled from: AsyncTask */
    private static class C0055c implements Executor {

        /* renamed from: a */
        final LinkedList<Runnable> f120a;

        /* renamed from: b */
        Runnable f121b;

        private C0055c() {
            this.f120a = new LinkedList<>();
        }

        public synchronized void execute(final Runnable runnable) {
            this.f120a.offer(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        C0055c.this.mo107a();
                    }
                }
            });
            if (this.f121b == null) {
                mo107a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo107a() {
            Runnable poll = this.f120a.poll();
            this.f121b = poll;
            if (poll != null) {
                C0048a.f101b.execute(this.f121b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m164c(Result result) {
        if (!this.f113n.get()) {
            m165d(result);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Result m165d(Result result) {
        f107h.obtainMessage(1, new C0053a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: b */
    public final C0057d mo98b() {
        return this.f111l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo99b(Result result) {
        mo101c();
    }

    /* renamed from: d */
    public final boolean mo102d() {
        return this.f112m.get();
    }

    /* renamed from: a */
    public final boolean mo97a(boolean z) {
        this.f112m.set(true);
        return this.f110k.cancel(z);
    }

    /* renamed from: a */
    public final C0048a<Params, Progress, Result> mo93a(Executor executor, Params... paramsArr) {
        if (this.f111l != C0057d.PENDING) {
            switch (this.f111l) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f111l = C0057d.RUNNING;
        mo95a();
        this.f109j.f128b = paramsArr;
        executor.execute(this.f110k);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m166e(Result result) {
        if (mo102d()) {
            mo99b(result);
        } else {
            mo96a(result);
        }
        this.f111l = C0057d.FINISHED;
    }

    /* renamed from: a.a.a.a.a.c.a$b */
    /* compiled from: AsyncTask */
    private static class C0054b extends Handler {
        public C0054b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C0053a aVar = (C0053a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f118a.m166e(aVar.f119b[0]);
                    return;
                case 2:
                    aVar.f118a.mo100b((Progress[]) aVar.f119b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a.a.a.a.a.c.a$e */
    /* compiled from: AsyncTask */
    private static abstract class C0058e<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f128b;

        private C0058e() {
        }
    }

    /* renamed from: a.a.a.a.a.c.a$a */
    /* compiled from: AsyncTask */
    private static class C0053a<Data> {

        /* renamed from: a */
        final C0048a f118a;

        /* renamed from: b */
        final Data[] f119b;

        C0053a(C0048a aVar, Data... dataArr) {
            this.f118a = aVar;
            this.f119b = dataArr;
        }
    }
}
