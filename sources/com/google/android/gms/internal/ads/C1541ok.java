package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ok */
final class C1541ok implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1752wf f5820a;

    /* renamed from: b */
    private final /* synthetic */ C1539oi f5821b;

    C1541ok(C1539oi oiVar, C1752wf wfVar) {
        this.f5821b = oiVar;
        this.f5820a = wfVar;
    }

    public final void run() {
        synchronized (this.f5821b.f5815c) {
            C1539oi oiVar = this.f5821b;
            oiVar.f5813a.zzb(this.f5820a);
        }
    }
}
