package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class abc implements Runnable {

    /* renamed from: a */
    private final abg f1301a;

    /* renamed from: b */
    private final Future f1302b;

    abc(abg abg, Future future) {
        this.f1301a = abg;
        this.f1302b = future;
    }

    public final void run() {
        abg abg = this.f1301a;
        Future future = this.f1302b;
        if (abg.isCancelled()) {
            future.cancel(true);
        }
    }
}
