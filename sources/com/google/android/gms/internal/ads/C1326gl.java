package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gl */
final class C1326gl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1327gm f5380a;

    /* renamed from: b */
    private final /* synthetic */ C1328gn f5381b;

    C1326gl(C1300fm fmVar, C1327gm gmVar, C1328gn gnVar) {
        this.f5380a = gmVar;
        this.f5381b = gnVar;
    }

    public final void run() {
        try {
            this.f5380a.mo12539a(this.f5381b);
        } catch (RemoteException e) {
            C1772wz.m1627c("Could not propagate interstitial ad event.", e);
        }
    }
}
