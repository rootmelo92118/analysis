package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bo */
final /* synthetic */ class C1141bo implements agt {

    /* renamed from: a */
    private final C1140bn f4890a;

    /* renamed from: b */
    private final Map f4891b;

    /* renamed from: c */
    private final C1575pr f4892c;

    C1141bo(C1140bn bnVar, Map map, C1575pr prVar) {
        this.f4890a = bnVar;
        this.f4891b = map;
        this.f4892c = prVar;
    }

    public final void zzp(boolean z) {
        C1140bn bnVar = this.f4890a;
        Map map = this.f4891b;
        C1575pr prVar = this.f4892c;
        String unused = bnVar.f4803a.f4737b = (String) map.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", bnVar.f4803a.f4737b);
            prVar.mo12886a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C1772wz.m1625b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
