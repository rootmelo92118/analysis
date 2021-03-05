package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.aap;
import com.google.android.gms.internal.ads.aau;
import com.google.android.gms.internal.ads.abg;
import org.json.JSONObject;

final /* synthetic */ class zzae implements aap {
    static final aap zzbni = new zzae();

    private zzae() {
    }

    public final abg zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzbv.zzlj().mo13131k().mo13184f(jSONObject.getString("appSettingsJson"));
        }
        return aau.m1646a(null);
    }
}
