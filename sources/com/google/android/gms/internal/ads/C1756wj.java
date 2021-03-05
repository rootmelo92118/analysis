package com.google.android.gms.internal.ads;

import android.support.p034v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wj */
public final class C1756wj {

    /* renamed from: a */
    private final long f6750a;

    /* renamed from: b */
    private final List<String> f6751b = new ArrayList();

    /* renamed from: c */
    private final List<String> f6752c = new ArrayList();

    /* renamed from: d */
    private final Map<String, C1420jy> f6753d = new HashMap();

    /* renamed from: e */
    private String f6754e;

    /* renamed from: f */
    private String f6755f;

    /* renamed from: g */
    private JSONObject f6756g;

    /* renamed from: h */
    private boolean f6757h;

    public C1756wj(String str, long j) {
        JSONObject optJSONObject;
        this.f6757h = false;
        this.f6755f = str;
        this.f6750a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f6756g = new JSONObject(str);
                if (this.f6756g.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                    this.f6757h = false;
                    C1772wz.m1630e("App settings could not be fetched successfully.");
                    return;
                }
                this.f6757h = true;
                this.f6754e = this.f6756g.optString("app_id");
                JSONArray optJSONArray = this.f6756g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f6752c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.f6753d.put(optString2, new C1420jy(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.f6756g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f6751b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                C1772wz.m1627c("Exception occurred while processing app setting json", e);
                zzbv.zzlj().mo13119a((Throwable) e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo13111a() {
        return this.f6750a;
    }

    /* renamed from: b */
    public final boolean mo13112b() {
        return this.f6757h;
    }

    /* renamed from: c */
    public final String mo13113c() {
        return this.f6755f;
    }

    /* renamed from: d */
    public final String mo13114d() {
        return this.f6754e;
    }

    /* renamed from: e */
    public final Map<String, C1420jy> mo13115e() {
        return this.f6753d;
    }
}
