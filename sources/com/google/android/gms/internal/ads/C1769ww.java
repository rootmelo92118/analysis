package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ww */
final class C1769ww implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1768wv f6805a;

    C1769ww(C1768wv wvVar) {
        this.f6805a = wvVar;
    }

    public final void run() {
        Thread unused = this.f6805a.zzeke = Thread.currentThread();
        this.f6805a.zzki();
    }
}
