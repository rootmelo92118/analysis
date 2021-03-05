package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.qi */
final class C1593qi implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f6253a;

    /* renamed from: b */
    private final /* synthetic */ C1592qh f6254b;

    C1593qi(C1592qh qhVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6254b = qhVar;
        this.f6253a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f6254b.mo12897a(thread, th);
            if (this.f6253a != null) {
                this.f6253a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.f6253a != null) {
                this.f6253a.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
