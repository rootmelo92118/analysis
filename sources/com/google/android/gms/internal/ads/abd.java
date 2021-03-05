package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C1598qn
final class abd<T> implements abg<T> {

    /* renamed from: a */
    private final Throwable f1303a;

    /* renamed from: b */
    private final abh f1304b = new abh();

    abd(Throwable th) {
        this.f1303a = th;
        this.f1304b.mo10073a();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final T get() {
        throw new ExecutionException(this.f1303a);
    }

    public final T get(long j, TimeUnit timeUnit) {
        throw new ExecutionException(this.f1303a);
    }

    /* renamed from: a */
    public final void mo10059a(Runnable runnable, Executor executor) {
        this.f1304b.mo10074a(runnable, executor);
    }
}
