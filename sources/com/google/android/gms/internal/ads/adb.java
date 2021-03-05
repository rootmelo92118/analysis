package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
public final class adb {

    /* renamed from: a */
    public final boolean f1406a;

    /* renamed from: b */
    public final int f1407b;

    /* renamed from: c */
    public final int f1408c;

    /* renamed from: d */
    public final int f1409d;

    /* renamed from: e */
    public final String f1410e;

    /* renamed from: f */
    public final int f1411f;

    /* renamed from: g */
    public final int f1412g;

    /* renamed from: h */
    public final int f1413h;

    /* renamed from: i */
    public final boolean f1414i;

    /* renamed from: j */
    public final boolean f1415j;

    public adb(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f1406a = m1750a(jSONObject, "aggressive_media_codec_release", C1557p.f5867B);
        this.f1407b = m1752b(jSONObject, "byte_buffer_precache_limit", C1557p.f6136m);
        this.f1408c = m1752b(jSONObject, "exo_cache_buffer_size", C1557p.f6139p);
        this.f1409d = m1752b(jSONObject, "exo_connect_timeout_millis", C1557p.f6132i);
        this.f1410e = m1753c(jSONObject, "exo_player_version", C1557p.f6131h);
        this.f1411f = m1752b(jSONObject, "exo_read_timeout_millis", C1557p.f6133j);
        this.f1412g = m1752b(jSONObject, "load_check_interval_bytes", C1557p.f6134k);
        this.f1413h = m1752b(jSONObject, "player_precache_limit", C1557p.f6135l);
        this.f1414i = m1750a(jSONObject, "use_cache_data_source", C1557p.f5971bZ);
        this.f1415j = m1751a(jSONObject, "use_dash", false);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.e<java.lang.Boolean>, com.google.android.gms.internal.ads.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m1750a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.C1259e<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.m r0 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r3 = r0.mo12778a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = m1751a((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adb.m1750a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.e):boolean");
    }

    /* renamed from: a */
    private static boolean m1751a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.e<java.lang.Integer>, com.google.android.gms.internal.ads.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m1752b(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C1259e<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.m r0 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r0 = r0.mo12778a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adb.m1752b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.e):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.e<java.lang.String>, com.google.android.gms.internal.ads.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m1753c(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C1259e<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.m r0 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r0 = r0.mo12778a(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adb.m1753c(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.e):java.lang.String");
    }
}
