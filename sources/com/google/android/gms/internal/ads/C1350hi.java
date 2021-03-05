package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hi */
public final /* synthetic */ class C1350hi {
    /* renamed from: a */
    public static void m6992a(C1349hh hhVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        hhVar.mo10524a(str, jSONObject.toString());
    }

    /* renamed from: a */
    public static void m6990a(C1349hh hhVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        hhVar.mo10449d(sb.toString());
    }

    /* renamed from: b */
    public static void m6993b(C1349hh hhVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C1772wz.m1624b(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        hhVar.mo10449d(sb.toString());
    }

    /* renamed from: a */
    public static void m6991a(C1349hh hhVar, String str, Map map) {
        try {
            hhVar.mo10444a(str, zzbv.zzlf().mo13200a((Map<String, ?>) map));
        } catch (JSONException unused) {
            C1772wz.m1630e("Could not convert parameters to JSON.");
        }
    }
}
