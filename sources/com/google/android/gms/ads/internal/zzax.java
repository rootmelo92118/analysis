package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.internal.ads.C1450la;
import com.google.android.gms.internal.ads.C1453ld;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.p039a.C0722b;
import java.util.Map;

final class zzax implements zzu<afl> {
    private final /* synthetic */ C1450la zzbpo;
    private final /* synthetic */ zzab zzbpp;
    private final /* synthetic */ C1453ld zzbpq;

    zzax(C1450la laVar, zzab zzab, C1453ld ldVar) {
        this.zzbpo = laVar;
        this.zzbpp = zzab;
        this.zzbpq = ldVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        View view = afl.getView();
        if (view != null) {
            try {
                if (this.zzbpo != null) {
                    if (!this.zzbpo.mo12722k()) {
                        this.zzbpo.mo12709a(C0722b.m769a(view));
                        this.zzbpp.zzbng.onAdClicked();
                        return;
                    }
                    zzas.zzd(afl);
                } else if (this.zzbpq == null) {
                } else {
                    if (!this.zzbpq.mo12741i()) {
                        this.zzbpq.mo12730a(C0722b.m769a(view));
                        this.zzbpp.zzbng.onAdClicked();
                        return;
                    }
                    zzas.zzd(afl);
                }
            } catch (RemoteException e) {
                C1772wz.m1627c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
