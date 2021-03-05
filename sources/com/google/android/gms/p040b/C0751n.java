package com.google.android.gms.p040b;

/* renamed from: com.google.android.gms.b.n */
final class C0751n implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0741g f729a;

    /* renamed from: b */
    private final /* synthetic */ C0750m f730b;

    C0751n(C0750m mVar, C0741g gVar) {
        this.f730b = mVar;
        this.f729a = gVar;
    }

    public final void run() {
        try {
            C0741g gVar = (C0741g) this.f730b.f727b.mo9467a(this.f729a);
            if (gVar == null) {
                this.f730b.mo9471a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            gVar.mo9477a(C0743i.f718b, this.f730b);
            gVar.mo9476a(C0743i.f718b, (C0738d) this.f730b);
            gVar.mo9474a(C0743i.f718b, (C0736b) this.f730b);
        } catch (C0740f e) {
            if (e.getCause() instanceof Exception) {
                this.f730b.f728c.mo9503a((Exception) e.getCause());
            } else {
                this.f730b.f728c.mo9503a((Exception) e);
            }
        } catch (Exception e2) {
            this.f730b.f728c.mo9503a(e2);
        }
    }
}
