package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import java.util.Map;

@C1598qn
public final class zzc implements zzu<Object> {
    private final zzd zzdes;

    public zzc(zzd zzd) {
        this.zzdes = zzd;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            C1772wz.m1630e("App event with no name parameter.");
        } else {
            this.zzdes.onAppEvent(str, map.get("info"));
        }
    }
}
