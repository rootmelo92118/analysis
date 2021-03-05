package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.ak */
final /* synthetic */ class C2376ak implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f8851a = new C2376ak();

    private C2376ak() {
    }

    public final Thread newThread(Runnable runnable) {
        return C2375aj.m11662a(runnable);
    }
}
