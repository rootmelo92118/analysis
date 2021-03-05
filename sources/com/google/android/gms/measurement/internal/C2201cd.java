package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cd */
final class C2201cd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f8251a;

    /* renamed from: b */
    private final /* synthetic */ C2200cc f8252b;

    public final void run() {
        synchronized (this.f8251a) {
            try {
                this.f8251a.set(Boolean.valueOf(this.f8252b.mo14237t().mo14730h(this.f8252b.mo14224g().mo14808x())));
                this.f8251a.notify();
            } catch (Throwable th) {
                this.f8251a.notify();
                throw th;
            }
        }
    }
}
