package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1084as;
import com.google.android.gms.internal.ads.C1292fe;
import com.google.android.gms.internal.ads.C1772wz;

final /* synthetic */ class zzbd implements Runnable {
    private final zzbb zzbqc;
    private final C1084as zzbqe;

    zzbd(zzbb zzbb, C1084as asVar) {
        this.zzbqc = zzbb;
        this.zzbqe = asVar;
    }

    public final void run() {
        zzbb zzbb = this.zzbqc;
        C1084as asVar = this.zzbqe;
        try {
            if (zzbb.zzbls.zzbtf != null) {
                zzbb.zzbls.zzbtf.mo12533a((C1292fe) asVar);
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
