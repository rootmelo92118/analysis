package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1090au;
import com.google.android.gms.internal.ads.C1772wz;

final class zzbg implements Runnable {
    private final /* synthetic */ C1090au zzbmp;
    private final /* synthetic */ zzbb zzbqi;

    zzbg(zzbb zzbb, C1090au auVar) {
        this.zzbqi = zzbb;
        this.zzbmp = auVar;
    }

    public final void run() {
        try {
            if (this.zzbqi.zzbls.zzbtc != null) {
                this.zzbqi.zzbls.zzbtc.mo12500a(this.zzbmp);
                this.zzbqi.zzb(this.zzbmp.mo11244n());
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
