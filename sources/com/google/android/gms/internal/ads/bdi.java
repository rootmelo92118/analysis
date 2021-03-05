package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class bdi implements Executor {

    /* renamed from: a */
    private final /* synthetic */ Handler f3761a;

    bdi(bch bch, Handler handler) {
        this.f3761a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f3761a.post(runnable);
    }
}
