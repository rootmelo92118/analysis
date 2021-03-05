package com.google.android.gms.p040b;

/* renamed from: com.google.android.gms.b.p */
final class C0753p implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0752o f734a;

    C0753p(C0752o oVar) {
        this.f734a = oVar;
    }

    public final void run() {
        synchronized (this.f734a.f732b) {
            if (this.f734a.f733c != null) {
                this.f734a.f733c.mo9469a();
            }
        }
    }
}
