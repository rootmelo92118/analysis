package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cv */
final class C2219cv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f8309a;

    /* renamed from: b */
    private final /* synthetic */ zzk f8310b;

    /* renamed from: c */
    private final /* synthetic */ C2217ct f8311c;

    C2219cv(C2217ct ctVar, AtomicReference atomicReference, zzk zzk) {
        this.f8311c = ctVar;
        this.f8309a = atomicReference;
        this.f8310b = zzk;
    }

    public final void run() {
        synchronized (this.f8309a) {
            try {
                C2286i d = this.f8311c.f8302b;
                if (d == null) {
                    this.f8311c.mo14235r().mo14830d_().mo14841a("Failed to get app instance id");
                    this.f8309a.notify();
                    return;
                }
                this.f8309a.set(d.mo14353c(this.f8310b));
                String str = (String) this.f8309a.get();
                if (str != null) {
                    this.f8311c.mo14223f().mo14393a(str);
                    this.f8311c.mo14236s().f8051j.mo14270a(str);
                }
                this.f8311c.m10753I();
                this.f8309a.notify();
            } catch (RemoteException e) {
                try {
                    this.f8311c.mo14235r().mo14830d_().mo14842a("Failed to get app instance id", e);
                    this.f8309a.notify();
                } catch (Throwable th) {
                    this.f8309a.notify();
                    throw th;
                }
            }
        }
    }
}
