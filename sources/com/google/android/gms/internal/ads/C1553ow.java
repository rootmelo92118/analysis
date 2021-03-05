package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ow */
public final class C1553ow implements C1564pg<C1084as> {
    /* renamed from: a */
    public final /* synthetic */ C1135bi mo12857a(C1554ox oxVar, JSONObject jSONObject) {
        abg<afl> abg;
        JSONObject a = C1834zg.m8554a(jSONObject, "html_containers", "instream");
        if (a == null) {
            abg = oxVar.mo12861a(jSONObject, "video");
        } else {
            abg = oxVar.mo12859a(a.optString("base_url"), a.optString("html"), true);
        }
        afl a2 = C1554ox.m7720a(abg);
        if (a2 != null) {
            return new C1084as(a2);
        }
        C1772wz.m1630e("Can not get video view for instream ad.");
        return null;
    }
}
