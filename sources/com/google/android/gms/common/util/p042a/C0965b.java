package com.google.android.gms.common.util.p042a;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.a.b */
final class C0965b implements Runnable {

    /* renamed from: a */
    private final Runnable f1210a;

    /* renamed from: b */
    private final int f1211b;

    public C0965b(Runnable runnable, int i) {
        this.f1210a = runnable;
        this.f1211b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f1211b);
        this.f1210a.run();
    }
}
