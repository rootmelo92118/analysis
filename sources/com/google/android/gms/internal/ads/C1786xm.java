package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.xm */
final class C1786xm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f6853a;

    /* renamed from: b */
    private final /* synthetic */ C1782xi f6854b;

    C1786xm(C1782xi xiVar, Context context) {
        this.f6854b = xiVar;
        this.f6853a = context;
    }

    public final void run() {
        synchronized (this.f6854b.f6839b) {
            String unused = this.f6854b.f6841d = C1782xi.m8396d(this.f6853a);
            this.f6854b.f6839b.notifyAll();
        }
    }
}
