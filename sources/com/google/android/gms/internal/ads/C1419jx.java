package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.jx */
public final class C1419jx {

    /* renamed from: a */
    public final String f5545a;

    /* renamed from: b */
    public final String f5546b;

    /* renamed from: c */
    public final List<String> f5547c;

    /* renamed from: d */
    public final String f5548d;

    /* renamed from: e */
    public final String f5549e;

    /* renamed from: f */
    public final List<String> f5550f;

    /* renamed from: g */
    public final List<String> f5551g;

    /* renamed from: h */
    public final List<String> f5552h;

    /* renamed from: i */
    public final List<String> f5553i;

    /* renamed from: j */
    public final List<String> f5554j;

    /* renamed from: k */
    public final String f5555k;

    /* renamed from: l */
    public final List<String> f5556l;

    /* renamed from: m */
    public final List<String> f5557m;

    /* renamed from: n */
    public final List<String> f5558n;
    @Nullable

    /* renamed from: o */
    public final String f5559o;
    @Nullable

    /* renamed from: p */
    public final String f5560p;

    /* renamed from: q */
    public final String f5561q;
    @Nullable

    /* renamed from: r */
    public final List<String> f5562r;

    /* renamed from: s */
    public final String f5563s;

    /* renamed from: t */
    public final long f5564t;
    @Nullable

    /* renamed from: u */
    private final String f5565u;

    public C1419jx(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, List<String> list9, String str10, List<String> list10, String str11, long j) {
        this.f5545a = str;
        this.f5546b = null;
        this.f5547c = list;
        this.f5548d = null;
        this.f5549e = null;
        this.f5550f = list2;
        this.f5551g = list3;
        this.f5552h = list4;
        this.f5553i = list5;
        this.f5555k = str5;
        this.f5556l = list6;
        this.f5557m = list7;
        this.f5558n = list8;
        this.f5559o = null;
        this.f5560p = null;
        this.f5561q = null;
        this.f5562r = null;
        this.f5563s = null;
        this.f5554j = list10;
        this.f5565u = null;
        this.f5564t = -1;
    }

    public C1419jx(JSONObject jSONObject) {
        List<String> list;
        this.f5546b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f5547c = Collections.unmodifiableList(arrayList);
        this.f5548d = jSONObject.optString("allocation_id", (String) null);
        zzbv.zzlz();
        this.f5550f = C1429kg.m7185a(jSONObject, "clickurl");
        zzbv.zzlz();
        this.f5551g = C1429kg.m7185a(jSONObject, "imp_urls");
        zzbv.zzlz();
        this.f5552h = C1429kg.m7185a(jSONObject, "downloaded_imp_urls");
        zzbv.zzlz();
        this.f5554j = C1429kg.m7185a(jSONObject, "fill_urls");
        zzbv.zzlz();
        this.f5556l = C1429kg.m7185a(jSONObject, "video_start_urls");
        zzbv.zzlz();
        this.f5558n = C1429kg.m7185a(jSONObject, "video_complete_urls");
        zzbv.zzlz();
        this.f5557m = C1429kg.m7185a(jSONObject, "video_reward_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzbv.zzlz();
            list = C1429kg.m7185a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f5553i = list;
        this.f5545a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f5555k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f5549e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f5559o = jSONObject.optString("html_template", (String) null);
        this.f5560p = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f5561q = optJSONObject3 != null ? optJSONObject3.toString() : null;
        zzbv.zzlz();
        this.f5562r = C1429kg.m7185a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f5563s = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f5565u = jSONObject.optString("response_type", (String) null);
        this.f5564t = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean mo12642a() {
        return "banner".equalsIgnoreCase(this.f5565u);
    }

    /* renamed from: b */
    public final boolean mo12643b() {
        return "native".equalsIgnoreCase(this.f5565u);
    }
}
