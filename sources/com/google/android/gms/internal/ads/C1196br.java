package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.br */
final class C1196br implements zzu<Object> {

    /* renamed from: a */
    private final /* synthetic */ C1575pr f5157a;

    /* renamed from: b */
    private final /* synthetic */ C1139bm f5158b;

    C1196br(C1139bm bmVar, C1575pr prVar) {
        this.f5158b = bmVar;
        this.f5157a = prVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String next : map.keySet()) {
                jSONObject.put(next, map.get(next));
            }
            jSONObject.put("id", this.f5158b.f4737b);
            this.f5157a.mo12886a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C1772wz.m1625b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
