package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C1598qn
final class abf<T> implements abg<T> {

    /* renamed from: a */
    private final T f1305a;

    /* renamed from: b */
    private final abh f1306b = new abh();

    abf(T t) {
        this.f1305a = t;
        this.f1306b.mo10073a();
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
        return this.f1305a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f1305a;
    }

    /* renamed from: a */
    public final void mo10059a(Runnable runnable, Executor executor) {
        this.f1306b.mo10074a(runnable, executor);
    }
}
