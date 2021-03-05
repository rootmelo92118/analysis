package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;

final class abm implements Executor {

    /* renamed from: a */
    private final Handler f1317a = new C1775xb(Looper.getMainLooper());

    abm() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbv.zzlf();
                C1782xi.m8374a(zzbv.zzlj().mo13132l(), th);
                throw th;
            }
        } else {
            this.f1317a.post(runnable);
        }
    }
}
