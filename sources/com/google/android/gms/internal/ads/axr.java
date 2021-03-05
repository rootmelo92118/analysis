package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class axr implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f3065a = Executors.defaultThreadFactory();

    axr() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3065a.newThread(runnable);
        newThread.setName(String.valueOf(newThread.getName()).concat(":"));
        return newThread;
    }
}
