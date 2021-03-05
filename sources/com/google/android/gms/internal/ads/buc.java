package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class buc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bub f5286a;

    buc(bub bub) {
        this.f5286a = bub;
    }

    public final void run() {
        if (this.f5286a.f5285a != null) {
            try {
                this.f5286a.f5285a.mo12541a(1);
            } catch (RemoteException e) {
                aai.m1627c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
