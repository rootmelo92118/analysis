package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1233da;
import com.google.android.gms.internal.ads.C1772wz;

final class zzbk implements Runnable {
    private final /* synthetic */ C1233da zzbmr;
    private final /* synthetic */ zzbb zzbqi;

    zzbk(zzbb zzbb, C1233da daVar) {
        this.zzbqi = zzbb;
        this.zzbmr = daVar;
    }

    public final void run() {
        try {
            this.zzbqi.zzbls.zzbth.get(this.zzbmr.mo11093b()).mo12503a(this.zzbmr);
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
