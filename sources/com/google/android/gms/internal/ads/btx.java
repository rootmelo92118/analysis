package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class btx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ btw f5282a;

    btx(btw btw) {
        this.f5282a = btw;
    }

    public final void run() {
        if (this.f5282a.f5281a != null) {
            try {
                this.f5282a.f5281a.mo12297a(1);
            } catch (RemoteException e) {
                aai.m1627c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
