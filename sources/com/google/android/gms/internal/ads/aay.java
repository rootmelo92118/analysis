package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class aay implements Runnable {

    /* renamed from: a */
    private final abq f1290a;

    aay(abq abq) {
        this.f1290a = abq;
    }

    public final void run() {
        this.f1290a.mo10086a(new TimeoutException());
    }
}
