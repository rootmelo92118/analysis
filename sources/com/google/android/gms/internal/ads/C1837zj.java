package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C0926p;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zj */
public final class C1837zj {

    /* renamed from: a */
    private HandlerThread f6929a = null;

    /* renamed from: b */
    private Handler f6930b = null;

    /* renamed from: c */
    private int f6931c = 0;

    /* renamed from: d */
    private final Object f6932d = new Object();

    /* renamed from: a */
    public final Looper mo13282a() {
        Looper looper;
        synchronized (this.f6932d) {
            if (this.f6931c != 0) {
                C0926p.m1307a(this.f6929a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f6929a == null) {
                C1772wz.m8287a("Starting the looper thread.");
                this.f6929a = new HandlerThread("LooperProvider");
                this.f6929a.start();
                this.f6930b = new Handler(this.f6929a.getLooper());
                C1772wz.m8287a("Looper thread started.");
            } else {
                C1772wz.m8287a("Resuming the looper thread");
                this.f6932d.notifyAll();
            }
            this.f6931c++;
            looper = this.f6929a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public final Handler mo13283b() {
        return this.f6930b;
    }
}
