package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qb */
final class C1586qb implements zzu<afl> {

    /* renamed from: a */
    private final /* synthetic */ afl f6236a;

    /* renamed from: b */
    private final /* synthetic */ abq f6237b;

    /* renamed from: c */
    private final /* synthetic */ C1579pv f6238c;

    C1586qb(C1579pv pvVar, afl afl, abq abq) {
        this.f6238c = pvVar;
        this.f6236a = afl;
        this.f6237b = abq;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        JSONObject jSONObject;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
                z = false;
            } else {
                jSONObject = new JSONObject(str);
                z = true;
            }
            if (this.f6238c.f6225h.equals(jSONObject.optString("ads_id", ""))) {
                this.f6236a.mo10352b("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                this.f6237b.mo10087b(jSONObject2);
            }
        } catch (Throwable th) {
            C1772wz.m1625b("Error while preprocessing json.", th);
            this.f6237b.mo10086a(th);
        }
    }
}
