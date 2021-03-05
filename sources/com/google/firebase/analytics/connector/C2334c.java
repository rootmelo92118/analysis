package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.analytics.connector.c */
final /* synthetic */ class C2334c implements Executor {

    /* renamed from: a */
    static final Executor f8754a = new C2334c();

    private C2334c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
