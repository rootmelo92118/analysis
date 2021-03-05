package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C1598qn;
import java.util.Map;

@C1598qn
public final class zzaa implements zzu<Object> {
    private final Context zzsp;

    public zzaa(Context context) {
        this.zzsp = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (zzbv.zzmf().mo13075a(this.zzsp)) {
            zzbv.zzmf().mo13073a(this.zzsp, map.get("eventName"), map.get("eventId"));
        }
    }
}
