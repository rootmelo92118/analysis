package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.si */
final class C1647si implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1642sd f6389a;

    C1647si(C1642sd sdVar) {
        this.f6389a = sdVar;
    }

    public final void run() {
        if (this.f6389a.f6380l != null) {
            this.f6389a.f6380l.mo12624a();
            C1383io unused = this.f6389a.f6380l = null;
        }
    }
}
