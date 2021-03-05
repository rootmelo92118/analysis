package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.jy */
public final class C1420jy {

    /* renamed from: a */
    public final List<C1419jx> f5566a;

    /* renamed from: b */
    public final long f5567b;

    /* renamed from: c */
    public final List<String> f5568c;

    /* renamed from: d */
    public final List<String> f5569d;

    /* renamed from: e */
    public final List<String> f5570e;

    /* renamed from: f */
    public final List<String> f5571f;

    /* renamed from: g */
    public final List<String> f5572g;

    /* renamed from: h */
    public final boolean f5573h;

    /* renamed from: i */
    public final String f5574i;

    /* renamed from: j */
    public final long f5575j;

    /* renamed from: k */
    public final String f5576k;

    /* renamed from: l */
    public final int f5577l;

    /* renamed from: m */
    public final int f5578m;

    /* renamed from: n */
    public final long f5579n;

    /* renamed from: o */
    public final boolean f5580o;

    /* renamed from: p */
    public final boolean f5581p;

    /* renamed from: q */
    public final boolean f5582q;

    /* renamed from: r */
    public final boolean f5583r;

    /* renamed from: s */
    public int f5584s;

    /* renamed from: t */
    public int f5585t;

    /* renamed from: u */
    public boolean f5586u;

    public C1420jy(List<C1419jx> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f5566a = list;
        this.f5567b = j;
        this.f5568c = list2;
        this.f5569d = list3;
        this.f5570e = list4;
        this.f5571f = list5;
        this.f5572g = list6;
        this.f5573h = z;
        this.f5574i = str;
        this.f5575j = -1;
        this.f5584s = 0;
        this.f5585t = 1;
        this.f5576k = null;
        this.f5577l = 0;
        this.f5578m = -1;
        this.f5579n = -1;
        this.f5580o = false;
        this.f5581p = false;
        this.f5582q = false;
        this.f5583r = false;
        this.f5586u = false;
    }

    public C1420jy(String str) {
        this(new JSONObject(str));
    }

    public C1420jy(JSONObject jSONObject) {
        if (C1772wz.m1623a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            C1772wz.m8287a(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                C1419jx jxVar = new C1419jx(jSONArray.getJSONObject(i2));
                boolean z = true;
                if (jxVar.mo12642a()) {
                    this.f5586u = true;
                }
                arrayList.add(jxVar);
                if (i < 0) {
                    Iterator<String> it = jxVar.f5547c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.f5584s = i;
        this.f5585t = jSONArray.length();
        this.f5566a = Collections.unmodifiableList(arrayList);
        this.f5574i = jSONObject.optString("qdata");
        this.f5578m = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.f5579n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f5567b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzbv.zzlz();
            this.f5568c = C1429kg.m7185a(optJSONObject, "click_urls");
            zzbv.zzlz();
            this.f5569d = C1429kg.m7185a(optJSONObject, "imp_urls");
            zzbv.zzlz();
            this.f5570e = C1429kg.m7185a(optJSONObject, "downloaded_imp_urls");
            zzbv.zzlz();
            this.f5571f = C1429kg.m7185a(optJSONObject, "nofill_urls");
            zzbv.zzlz();
            this.f5572g = C1429kg.m7185a(optJSONObject, "remote_ping_urls");
            this.f5573h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f5575j = optLong > 0 ? 1000 * optLong : j;
            zzawd a = zzawd.m8616a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f5576k = null;
                this.f5577l = 0;
            } else {
                this.f5576k = a.f7125a;
                this.f5577l = a.f7126b;
            }
            this.f5580o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f5581p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.f5582q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.f5583r = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f5567b = -1;
        this.f5568c = null;
        this.f5569d = null;
        this.f5570e = null;
        this.f5571f = null;
        this.f5572g = null;
        this.f5575j = -1;
        this.f5576k = null;
        this.f5577l = 0;
        this.f5580o = false;
        this.f5573h = false;
        this.f5581p = false;
        this.f5582q = false;
        this.f5583r = false;
    }
}
