package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dg */
final class C2231dg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2286i f8361a;

    /* renamed from: b */
    private final /* synthetic */ C2230df f8362b;

    C2231dg(C2230df dfVar, C2286i iVar) {
        this.f8362b = dfVar;
        this.f8361a = iVar;
    }

    public final void run() {
        synchronized (this.f8362b) {
            boolean unused = this.f8362b.f8359b = false;
            if (!this.f8362b.f8358a.mo14449x()) {
                this.f8362b.f8358a.mo14235r().mo14838x().mo14841a("Connected to service");
                this.f8362b.f8358a.mo14441a(this.f8361a);
            }
        }
    }
}
