package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1123ay;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1772wz;

final class zzbj implements Runnable {
    private final /* synthetic */ zzbb zzbqi;
    private final /* synthetic */ String zzbql;
    private final /* synthetic */ C1752wf zzbqm;

    zzbj(zzbb zzbb, String str, C1752wf wfVar) {
        this.zzbqi = zzbb;
        this.zzbql = str;
        this.zzbqm = wfVar;
    }

    public final void run() {
        try {
            this.zzbqi.zzbls.zzbth.get(this.zzbql).mo12503a((C1123ay) this.zzbqm.f6680C);
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
