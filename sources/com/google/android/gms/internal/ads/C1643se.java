package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.se */
final class C1643se implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1753wg f6382a;

    /* renamed from: b */
    private final /* synthetic */ C1642sd f6383b;

    C1643se(C1642sd sdVar, C1753wg wgVar) {
        this.f6383b = sdVar;
        this.f6382a = wgVar;
    }

    public final void run() {
        this.f6383b.f6376h.zza(this.f6382a);
        if (this.f6383b.f6380l != null) {
            this.f6383b.f6380l.mo12624a();
            C1383io unused = this.f6383b.f6380l = null;
        }
    }
}
