package com.google.android.gms.p040b;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.i */
public final class C0743i {

    /* renamed from: a */
    public static final Executor f717a = new C0744a();

    /* renamed from: b */
    static final Executor f718b = new C0762y();

    /* renamed from: com.google.android.gms.b.i$a */
    private static final class C0744a implements Executor {

        /* renamed from: a */
        private final Handler f719a = new Handler(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.f719a.post(runnable);
        }
    }
}
