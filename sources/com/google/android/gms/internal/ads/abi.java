package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final /* synthetic */ class abi implements Runnable {

    /* renamed from: a */
    private final Executor f1310a;

    /* renamed from: b */
    private final Runnable f1311b;

    abi(Executor executor, Runnable runnable) {
        this.f1310a = executor;
        this.f1311b = runnable;
    }

    public final void run() {
        this.f1310a.execute(this.f1311b);
    }
}
