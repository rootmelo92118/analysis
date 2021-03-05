package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.ss */
final class C1657ss implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Future f6422a;

    C1657ss(C1654sp spVar, Future future) {
        this.f6422a = future;
    }

    public final void run() {
        if (!this.f6422a.isDone()) {
            this.f6422a.cancel(true);
        }
    }
}
