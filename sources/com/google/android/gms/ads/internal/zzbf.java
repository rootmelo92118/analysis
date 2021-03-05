package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1090au;
import com.google.android.gms.internal.ads.C1120aw;
import com.google.android.gms.internal.ads.C1127bb;
import com.google.android.gms.internal.ads.C1135bi;
import com.google.android.gms.internal.ads.C1772wz;
import java.util.List;

final class zzbf implements Runnable {
    private final /* synthetic */ int zzbqf;
    private final /* synthetic */ zzbb zzbqi;
    private final /* synthetic */ C1135bi zzbqj;
    private final /* synthetic */ List zzbqk;

    zzbf(zzbb zzbb, C1135bi biVar, int i, List list) {
        this.zzbqi = zzbb;
        this.zzbqj = biVar;
        this.zzbqf = i;
        this.zzbqk = list;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.zzbqj instanceof C1120aw) && this.zzbqi.zzbls.zzbte != null) {
                zzbb zzbb = this.zzbqi;
                if (this.zzbqf != this.zzbqk.size() - 1) {
                    z = true;
                }
                zzbb.zzblq = z;
                C1127bb zzb = zzbb.zza(this.zzbqj);
                this.zzbqi.zzbls.zzbte.mo12505a(zzb);
                this.zzbqi.zzb(zzb.mo11601q());
            } else if ((this.zzbqj instanceof C1120aw) && this.zzbqi.zzbls.zzbtd != null) {
                zzbb zzbb2 = this.zzbqi;
                if (this.zzbqf != this.zzbqk.size() - 1) {
                    z = true;
                }
                zzbb2.zzblq = z;
                C1120aw awVar = (C1120aw) this.zzbqj;
                this.zzbqi.zzbls.zzbtd.mo12501a(awVar);
                this.zzbqi.zzb(awVar.mo11336n());
            } else if ((this.zzbqj instanceof C1090au) && this.zzbqi.zzbls.zzbte != null) {
                zzbb zzbb3 = this.zzbqi;
                if (this.zzbqf != this.zzbqk.size() - 1) {
                    z = true;
                }
                zzbb3.zzblq = z;
                C1127bb zzb2 = zzbb.zza(this.zzbqj);
                this.zzbqi.zzbls.zzbte.mo12505a(zzb2);
                this.zzbqi.zzb(zzb2.mo11601q());
            } else if (!(this.zzbqj instanceof C1090au) || this.zzbqi.zzbls.zzbtc == null) {
                zzbb zzbb4 = this.zzbqi;
                if (this.zzbqf != this.zzbqk.size() - 1) {
                    z = true;
                }
                zzbb4.zzg(3, z);
            } else {
                zzbb zzbb5 = this.zzbqi;
                if (this.zzbqf != this.zzbqk.size() - 1) {
                    z = true;
                }
                zzbb5.zzblq = z;
                C1090au auVar = (C1090au) this.zzbqj;
                this.zzbqi.zzbls.zzbtc.mo12500a(auVar);
                this.zzbqi.zzb(auVar.mo11244n());
            }
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
