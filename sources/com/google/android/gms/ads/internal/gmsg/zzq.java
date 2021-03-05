package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.afl;
import java.util.Map;

final class zzq implements zzu<afl> {
    zzq() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            afl.zzjf();
        } else if ("resume".equals(str)) {
            afl.zzjg();
        }
    }
}
