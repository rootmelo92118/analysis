package p000a.p013b.p014a.p016b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p017b.C0166c;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.a.b.b */
/* compiled from: HandlerScheduler */
final class C0160b extends C0240h {

    /* renamed from: b */
    private final Handler f350b;

    C0160b(Handler handler) {
        this.f350b = handler;
    }

    /* renamed from: a */
    public C0165b mo345a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C0162b bVar = new C0162b(this.f350b, C0229a.m631a(runnable));
            this.f350b.postDelayed(bVar, Math.max(0, timeUnit.toMillis(j)));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public C0240h.C0242a mo346a() {
        return new C0161a(this.f350b);
    }

    /* renamed from: a.b.a.b.b$a */
    /* compiled from: HandlerScheduler */
    private static final class C0161a extends C0240h.C0242a {

        /* renamed from: a */
        private final Handler f351a;

        /* renamed from: b */
        private volatile boolean f352b;

        C0161a(Handler handler) {
            this.f351a = handler;
        }

        /* renamed from: a */
        public C0165b mo347a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f352b) {
                return C0166c.m470a();
            } else {
                C0162b bVar = new C0162b(this.f351a, C0229a.m631a(runnable));
                Message obtain = Message.obtain(this.f351a, bVar);
                obtain.obj = this;
                this.f351a.sendMessageDelayed(obtain, Math.max(0, timeUnit.toMillis(j)));
                if (!this.f352b) {
                    return bVar;
                }
                this.f351a.removeCallbacks(bVar);
                return C0166c.m470a();
            }
        }

        /* renamed from: a */
        public void mo348a() {
            this.f352b = true;
            this.f351a.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: a.b.a.b.b$b */
    /* compiled from: HandlerScheduler */
    private static final class C0162b implements C0165b, Runnable {

        /* renamed from: a */
        private final Handler f353a;

        /* renamed from: b */
        private final Runnable f354b;

        /* renamed from: c */
        private volatile boolean f355c;

        C0162b(Handler handler, Runnable runnable) {
            this.f353a = handler;
            this.f354b = runnable;
        }

        public void run() {
            try {
                this.f354b.run();
            } catch (Throwable th) {
                IllegalStateException illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", th);
                C0229a.m632a((Throwable) illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        /* renamed from: a */
        public void mo348a() {
            this.f355c = true;
            this.f353a.removeCallbacks(this);
        }
    }
}
