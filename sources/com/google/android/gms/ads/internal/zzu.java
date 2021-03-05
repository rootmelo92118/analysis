package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1233da;
import com.google.android.gms.internal.ads.C1772wz;

final class zzu implements Runnable {
    private final /* synthetic */ zzp zzbmo;
    private final /* synthetic */ C1233da zzbmr;

    zzu(zzp zzp, C1233da daVar) {
        this.zzbmo = zzp;
        this.zzbmr = daVar;
    }

    public final void run() {
        try {
            this.zzbmo.zzbls.zzbth.get(this.zzbmr.mo11093b()).mo12503a(this.zzbmr);
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
