package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class btv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ btu f5280a;

    btv(btu btu) {
        this.f5280a = btu;
    }

    public final void run() {
        if (this.f5280a.f5279a.f5278a != null) {
            try {
                this.f5280a.f5279a.f5278a.mo12297a(1);
            } catch (RemoteException e) {
                aai.m1627c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
