package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class bot implements Runnable {

    /* renamed from: a */
    private final abq f4921a;

    /* renamed from: b */
    private final Future f4922b;

    bot(abq abq, Future future) {
        this.f4921a = abq;
        this.f4922b = future;
    }

    public final void run() {
        abq abq = this.f4921a;
        Future future = this.f4922b;
        if (abq.isCancelled()) {
            future.cancel(true);
        }
    }
}
