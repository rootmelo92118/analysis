package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.C0693a;

/* renamed from: com.google.android.gms.internal.ads.lu */
final class C1470lu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0693a.C0694a f5696a;

    /* renamed from: b */
    private final /* synthetic */ C1468ls f5697b;

    C1470lu(C1468ls lsVar, C0693a.C0694a aVar) {
        this.f5697b = lsVar;
        this.f5696a = aVar;
    }

    public final void run() {
        try {
            this.f5697b.f5693a.mo12651a(C1471lv.m7561a(this.f5696a));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
