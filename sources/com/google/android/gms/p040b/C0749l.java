package com.google.android.gms.p040b;

/* renamed from: com.google.android.gms.b.l */
final class C0749l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0741g f724a;

    /* renamed from: b */
    private final /* synthetic */ C0748k f725b;

    C0749l(C0748k kVar, C0741g gVar) {
        this.f725b = kVar;
        this.f724a = gVar;
    }

    public final void run() {
        if (this.f724a.mo9482c()) {
            this.f725b.f723c.mo9507f();
            return;
        }
        try {
            this.f725b.f723c.mo9504a(this.f725b.f722b.mo9467a(this.f724a));
        } catch (C0740f e) {
            if (e.getCause() instanceof Exception) {
                this.f725b.f723c.mo9503a((Exception) e.getCause());
            } else {
                this.f725b.f723c.mo9503a((Exception) e);
            }
        } catch (Exception e2) {
            this.f725b.f723c.mo9503a(e2);
        }
    }
}
