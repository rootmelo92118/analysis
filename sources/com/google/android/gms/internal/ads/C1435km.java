package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.km */
final class C1435km implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1427ke f5657a;

    C1435km(C1434kl klVar, C1427ke keVar) {
        this.f5657a = keVar;
    }

    public final void run() {
        try {
            this.f5657a.f5618c.mo12694c();
        } catch (RemoteException e) {
            C1772wz.m1627c("Could not destroy mediation adapter.", e);
        }
    }
}
