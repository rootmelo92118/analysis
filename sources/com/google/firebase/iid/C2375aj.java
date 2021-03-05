package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.aj */
final class C2375aj {

    /* renamed from: a */
    private static final Executor f8850a = C2377al.f8852a;

    /* renamed from: a */
    static Executor m11663a() {
        return f8850a;
    }

    /* renamed from: b */
    static Executor m11664b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C2376ak.f8851a);
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m11662a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
