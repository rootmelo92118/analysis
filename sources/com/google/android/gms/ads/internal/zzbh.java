package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1127bb;
import com.google.android.gms.internal.ads.C1772wz;

final class zzbh implements Runnable {
    private final /* synthetic */ C1127bb zzbmn;
    private final /* synthetic */ zzbb zzbqi;

    zzbh(zzbb zzbb, C1127bb bbVar) {
        this.zzbqi = zzbb;
        this.zzbmn = bbVar;
    }

    public final void run() {
        try {
            if (this.zzbqi.zzbls.zzbte != null) {
                this.zzbqi.zzbls.zzbte.mo12505a(this.zzbmn);
                this.zzbqi.zzb(this.zzbmn.mo11601q());
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
