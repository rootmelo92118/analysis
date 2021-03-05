package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzas;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.ot */
final class C1550ot implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f5838a;

    /* renamed from: b */
    private final /* synthetic */ C1549os f5839b;

    C1550ot(C1549os osVar, CountDownLatch countDownLatch) {
        this.f5839b = osVar;
        this.f5838a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f5839b.f5816d) {
            boolean unused = this.f5839b.f5837m = zzas.zza(this.f5839b.f5836l, this.f5839b.f5831g, this.f5838a);
        }
    }
}
