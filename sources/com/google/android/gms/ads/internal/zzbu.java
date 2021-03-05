package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import java.util.Map;
import java.util.TreeMap;

final class zzbu {
    private final String zzbrb;
    private final Map<String, String> zzbrc = new TreeMap();
    private String zzbrd;
    private String zzbre;

    public zzbu(String str) {
        this.zzbrb = str;
    }

    public final String zzky() {
        return this.zzbre;
    }

    public final String getQuery() {
        return this.zzbrd;
    }

    public final String zzkz() {
        return this.zzbrb;
    }

    public final Map<String, String> zzla() {
        return this.zzbrc;
    }

    public final void zza(zzwb zzwb, zzbbi zzbbi) {
        this.zzbrd = zzwb.f7280j.f7303a;
        Bundle bundle = zzwb.f7283m != null ? zzwb.f7283m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) bre.m6321e().mo12778a(C1557p.f5963bR);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.zzbre = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.zzbrc.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.zzbrc.put("SDKVersion", zzbbi.f7135a);
        }
    }
}
