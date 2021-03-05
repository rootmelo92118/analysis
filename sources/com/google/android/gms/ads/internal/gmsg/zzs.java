package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.afl;
import java.util.Map;

final class zzs implements zzu<afl> {
    zzs() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        if (map.keySet().contains("start")) {
            afl.mo10357e(true);
        }
        if (map.keySet().contains("stop")) {
            afl.mo10357e(false);
        }
    }
}
