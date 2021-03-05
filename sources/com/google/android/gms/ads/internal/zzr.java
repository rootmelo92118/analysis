package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1127bb;
import com.google.android.gms.internal.ads.C1772wz;

final class zzr implements Runnable {
    private final /* synthetic */ C1127bb zzbmn;
    private final /* synthetic */ zzp zzbmo;

    zzr(zzp zzp, C1127bb bbVar) {
        this.zzbmo = zzp;
        this.zzbmn = bbVar;
    }

    public final void run() {
        try {
            if (this.zzbmo.zzbls.zzbte != null) {
                this.zzbmo.zzbls.zzbte.mo12505a(this.zzbmn);
                this.zzbmo.zzb(this.zzbmn.mo11601q());
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
