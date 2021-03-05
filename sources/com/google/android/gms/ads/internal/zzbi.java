package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1120aw;
import com.google.android.gms.internal.ads.C1772wz;

final class zzbi implements Runnable {
    private final /* synthetic */ C1120aw zzbmq;
    private final /* synthetic */ zzbb zzbqi;

    zzbi(zzbb zzbb, C1120aw awVar) {
        this.zzbqi = zzbb;
        this.zzbmq = awVar;
    }

    public final void run() {
        try {
            if (this.zzbqi.zzbls.zzbtd != null) {
                this.zzbqi.zzbls.zzbtd.mo12501a(this.zzbmq);
                this.zzbqi.zzb(this.zzbmq.mo11336n());
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
