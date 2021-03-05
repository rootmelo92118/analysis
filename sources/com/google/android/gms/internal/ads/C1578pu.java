package com.google.android.gms.internal.ads;

import android.support.p034v4.util.SimpleArrayMap;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.pu */
public final class C1578pu implements C1564pg<C1123ay> {

    /* renamed from: a */
    private final boolean f6217a;

    public C1578pu(boolean z) {
        this.f6217a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C1135bi mo12857a(C1554ox oxVar, JSONObject jSONObject) {
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        SimpleArrayMap simpleArrayMap2 = new SimpleArrayMap();
        abg<C1068ap> a = oxVar.mo12860a(jSONObject);
        abg<afl> a2 = oxVar.mo12861a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                simpleArrayMap2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                simpleArrayMap.put(jSONObject2.getString("name"), oxVar.mo12864a(jSONObject2, "image_value", this.f6217a));
            } else {
                String valueOf = String.valueOf(string);
                C1772wz.m1630e(valueOf.length() != 0 ? "Unknown custom asset type: ".concat(valueOf) : new String("Unknown custom asset type: "));
            }
        }
        afl a3 = C1554ox.m7720a(a2);
        String string2 = jSONObject.getString("custom_template_id");
        SimpleArrayMap simpleArrayMap3 = new SimpleArrayMap();
        for (int i2 = 0; i2 < simpleArrayMap.size(); i2++) {
            simpleArrayMap3.put(simpleArrayMap.keyAt(i2), ((Future) simpleArrayMap.valueAt(i2)).get());
        }
        return new C1123ay(string2, simpleArrayMap3, simpleArrayMap2, (C1068ap) a.get(), a3 != null ? a3.mo10172b() : null, a3 != null ? a3.getView() : null);
    }
}
