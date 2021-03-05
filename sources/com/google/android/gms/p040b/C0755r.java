package com.google.android.gms.p040b;

/* renamed from: com.google.android.gms.b.r */
final class C0755r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0741g f738a;

    /* renamed from: b */
    private final /* synthetic */ C0754q f739b;

    C0755r(C0754q qVar, C0741g gVar) {
        this.f739b = qVar;
        this.f738a = gVar;
    }

    public final void run() {
        synchronized (this.f739b.f736b) {
            if (this.f739b.f737c != null) {
                this.f739b.f737c.mo9470a(this.f738a);
            }
        }
    }
}
