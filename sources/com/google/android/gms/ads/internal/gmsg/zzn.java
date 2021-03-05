package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C1772wz;
import java.util.Map;

final class zzn implements zzu<Object> {
    zzn() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        C1772wz.m1628d(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
