package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class aaz implements Runnable {

    /* renamed from: a */
    private final Future f1291a;

    aaz(Future future) {
        this.f1291a = future;
    }

    public final void run() {
        Future future = this.f1291a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
