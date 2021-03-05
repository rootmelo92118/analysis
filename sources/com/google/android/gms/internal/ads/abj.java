package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

@C1598qn
final class abj<V> extends FutureTask<V> implements abg<V> {

    /* renamed from: a */
    private final abh f1312a = new abh();

    abj(Callable<V> callable) {
        super(callable);
    }

    abj(Runnable runnable, @Nullable V v) {
        super(runnable, v);
    }

    /* renamed from: a */
    public final void mo10059a(Runnable runnable, Executor executor) {
        this.f1312a.mo10074a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f1312a.mo10073a();
    }
}
