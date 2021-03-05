package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.di */
final class C2233di implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2286i f8365a;

    /* renamed from: b */
    private final /* synthetic */ C2230df f8366b;

    C2233di(C2230df dfVar, C2286i iVar) {
        this.f8366b = dfVar;
        this.f8365a = iVar;
    }

    public final void run() {
        synchronized (this.f8366b) {
            boolean unused = this.f8366b.f8359b = false;
            if (!this.f8366b.f8358a.mo14449x()) {
                this.f8366b.f8358a.mo14235r().mo14837w().mo14841a("Connected to remote service");
                this.f8366b.f8358a.mo14441a(this.f8365a);
            }
        }
    }
}
