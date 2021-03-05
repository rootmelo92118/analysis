package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fc */
final class C2282fc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2191bu f8506a;

    /* renamed from: b */
    private final /* synthetic */ C2281fb f8507b;

    C2282fc(C2281fb fbVar, C2191bu buVar) {
        this.f8507b = fbVar;
        this.f8506a = buVar;
    }

    public final void run() {
        this.f8506a.mo14238u();
        if (C2270er.m11151a()) {
            this.f8506a.mo14234q().mo14296a((Runnable) this);
            return;
        }
        boolean b = this.f8507b.mo14797b();
        long unused = this.f8507b.f8505d = 0;
        if (b) {
            this.f8507b.mo14452a();
        }
    }
}
