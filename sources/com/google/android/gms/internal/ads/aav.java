package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class aav implements Runnable {

    /* renamed from: a */
    private final aar f1282a;

    /* renamed from: b */
    private final abg f1283b;

    aav(aar aar, abg abg) {
        this.f1282a = aar;
        this.f1283b = abg;
    }

    public final void run() {
        Throwable e;
        aar aar = this.f1282a;
        try {
            aar.mo10046a(this.f1283b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            aar.mo10047a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            aar.mo10047a(e);
        } catch (Exception e4) {
            e = e4;
            aar.mo10047a(e);
        }
    }
}
