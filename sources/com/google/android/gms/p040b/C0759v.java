package com.google.android.gms.p040b;

/* renamed from: com.google.android.gms.b.v */
final class C0759v implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0741g f748a;

    /* renamed from: b */
    private final /* synthetic */ C0758u f749b;

    C0759v(C0758u uVar, C0741g gVar) {
        this.f749b = uVar;
        this.f748a = gVar;
    }

    public final void run() {
        synchronized (this.f749b.f746b) {
            if (this.f749b.f747c != null) {
                this.f749b.f747c.mo9472a(this.f748a.mo9483d());
            }
        }
    }
}
