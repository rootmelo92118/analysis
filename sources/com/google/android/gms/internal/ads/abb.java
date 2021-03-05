package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class abb implements Runnable {

    /* renamed from: a */
    private final abq f1299a;

    /* renamed from: b */
    private final abg f1300b;

    abb(abq abq, abg abg) {
        this.f1299a = abq;
        this.f1300b = abg;
    }

    public final void run() {
        abq abq = this.f1299a;
        try {
            abq.mo10087b(this.f1300b.get());
        } catch (ExecutionException e) {
            abq.mo10086a(e.getCause());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            abq.mo10086a(e2);
        } catch (Exception e3) {
            abq.mo10086a(e3);
        }
    }
}
