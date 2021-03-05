package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.x */
final class C0841x implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0840w f929a;

    C0841x(C0840w wVar) {
        this.f929a = wVar;
    }

    public final void run() {
        this.f929a.f928h.mo9673b(new ConnectionResult(4));
    }
}
