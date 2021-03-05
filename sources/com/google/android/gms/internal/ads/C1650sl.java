package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sl */
public final class C1650sl implements zzu<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String valueOf = String.valueOf(map.get("errors"));
        C1772wz.m1630e(valueOf.length() != 0 ? "Invalid request: ".concat(valueOf) : new String("Invalid request: "));
        C1642sd.f6374f.zzbv(str);
    }
}
