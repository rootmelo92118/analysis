package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.afl;
import java.util.Map;

final class zzl implements zzu<afl> {
    zzl() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        zzd q = afl.mo10378q();
        if (q != null) {
            q.close();
            return;
        }
        zzd r = afl.mo10379r();
        if (r != null) {
            r.close();
        } else {
            C1772wz.m1630e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
