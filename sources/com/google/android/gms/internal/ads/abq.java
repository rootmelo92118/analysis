package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
@ParametersAreNonnullByDefault
public class abq<T> implements abg<T> {

    /* renamed from: a */
    private final Object f1320a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private T f1321b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private Throwable f1322c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private boolean f1323d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private boolean f1324e;

    /* renamed from: f */
    private final abh f1325f = new abh();

    /* renamed from: a */
    public final void mo10059a(Runnable runnable, Executor executor) {
        this.f1325f.mo10074a(runnable, executor);
    }

    /* renamed from: b */
    public final void mo10087b(@Nullable T t) {
        synchronized (this.f1320a) {
            if (!this.f1324e) {
                if (mo10085a()) {
                    zzbv.zzlj().mo13122b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f1323d = true;
                this.f1321b = t;
                this.f1320a.notifyAll();
                this.f1325f.mo10073a();
            }
        }
    }

    /* renamed from: a */
    public final void mo10086a(Throwable th) {
        synchronized (this.f1320a) {
            if (!this.f1324e) {
                if (mo10085a()) {
                    zzbv.zzlj().mo13122b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f1322c = th;
                this.f1320a.notifyAll();
                this.f1325f.mo10073a();
            }
        }
    }

    public T get() {
        T t;
        synchronized (this.f1320a) {
            if (!mo10085a()) {
                try {
                    this.f1320a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f1322c != null) {
                throw new ExecutionException(this.f1322c);
            } else if (!this.f1324e) {
                t = this.f1321b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f1320a) {
            if (!mo10085a()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f1320a.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f1322c != null) {
                throw new ExecutionException(this.f1322c);
            } else if (!this.f1323d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (!this.f1324e) {
                t = this.f1321b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f1320a) {
            if (mo10085a()) {
                return false;
            }
            this.f1324e = true;
            this.f1323d = true;
            this.f1320a.notifyAll();
            this.f1325f.mo10073a();
            return true;
        }
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f1320a) {
            z = this.f1324e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f1320a) {
            a = mo10085a();
        }
        return a;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final boolean mo10085a() {
        return this.f1322c != null || this.f1323d;
    }
}
