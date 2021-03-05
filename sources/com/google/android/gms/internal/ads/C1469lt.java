package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.C0693a;

/* renamed from: com.google.android.gms.internal.ads.lt */
final class C1469lt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0693a.C0694a f5694a;

    /* renamed from: b */
    private final /* synthetic */ C1468ls f5695b;

    C1469lt(C1468ls lsVar, C0693a.C0694a aVar) {
        this.f5695b = lsVar;
        this.f5694a = aVar;
    }

    public final void run() {
        try {
            this.f5695b.f5693a.mo12651a(C1471lv.m7561a(this.f5694a));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
