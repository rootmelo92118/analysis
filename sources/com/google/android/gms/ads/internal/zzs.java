package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1090au;
import com.google.android.gms.internal.ads.C1772wz;

final class zzs implements Runnable {
    private final /* synthetic */ zzp zzbmo;
    private final /* synthetic */ C1090au zzbmp;

    zzs(zzp zzp, C1090au auVar) {
        this.zzbmo = zzp;
        this.zzbmp = auVar;
    }

    public final void run() {
        try {
            if (this.zzbmo.zzbls.zzbtc != null) {
                this.zzbmo.zzbls.zzbtc.mo12500a(this.zzbmp);
                this.zzbmo.zzb(this.zzbmp.mo11244n());
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
