package com.google.android.gms.p040b;

/* renamed from: com.google.android.gms.b.t */
final class C0757t implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0741g f743a;

    /* renamed from: b */
    private final /* synthetic */ C0756s f744b;

    C0757t(C0756s sVar, C0741g gVar) {
        this.f744b = sVar;
        this.f743a = gVar;
    }

    public final void run() {
        synchronized (this.f744b.f741b) {
            if (this.f744b.f742c != null) {
                this.f744b.f742c.mo9471a(this.f743a.mo9484e());
            }
        }
    }
}
