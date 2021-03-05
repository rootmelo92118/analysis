package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1120aw;
import com.google.android.gms.internal.ads.C1772wz;

final class zzt implements Runnable {
    private final /* synthetic */ zzp zzbmo;
    private final /* synthetic */ C1120aw zzbmq;

    zzt(zzp zzp, C1120aw awVar) {
        this.zzbmo = zzp;
        this.zzbmq = awVar;
    }

    public final void run() {
        try {
            if (this.zzbmo.zzbls.zzbtd != null) {
                this.zzbmo.zzbls.zzbtd.mo12501a(this.zzbmq);
                this.zzbmo.zzb(this.zzbmq.mo11336n());
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
