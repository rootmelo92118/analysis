package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.afl;
import java.util.Map;

final class zzr implements zzu<afl> {
    zzr() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        if (map.keySet().contains("start")) {
            afl.mo10388u().mo10419h();
        } else if (map.keySet().contains("stop")) {
            afl.mo10388u().mo10420i();
        } else if (map.keySet().contains("cancel")) {
            afl.mo10388u().mo10421j();
        }
    }
}
