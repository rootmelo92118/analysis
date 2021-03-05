package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import javax.annotation.Nullable;

@C1598qn
public abstract class aao extends AbstractExecutorService implements abk {
    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new abj(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new abj(callable);
    }

    /* renamed from: a */
    public final abg<?> submit(Runnable runnable) {
        return (abg) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> abg<T> submit(Callable<T> callable) {
        return (abg) super.submit(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @Nullable Object obj) {
        return (abg) super.submit(runnable, obj);
    }
}
