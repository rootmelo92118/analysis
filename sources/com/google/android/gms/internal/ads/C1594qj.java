package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.qj */
final class C1594qj implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f6255a;

    /* renamed from: b */
    private final /* synthetic */ C1592qh f6256b;

    C1594qj(C1592qh qhVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6256b = qhVar;
        this.f6255a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f6256b.mo12897a(thread, th);
            if (this.f6255a != null) {
                this.f6255a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.f6255a != null) {
                this.f6255a.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
