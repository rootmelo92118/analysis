package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.vx */
final class C1743vx implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f6670a = new AtomicInteger(1);

    C1743vx(C1741vv vvVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f6670a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
