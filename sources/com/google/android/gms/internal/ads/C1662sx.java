package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.sx */
public final class C1662sx {

    /* renamed from: a */
    private final List<String> f6463a;

    /* renamed from: b */
    private final String f6464b;

    /* renamed from: c */
    private final String f6465c;

    /* renamed from: d */
    private final String f6466d;

    /* renamed from: e */
    private final boolean f6467e;

    /* renamed from: f */
    private final String f6468f;

    /* renamed from: g */
    private final String f6469g;

    /* renamed from: h */
    private String f6470h;

    /* renamed from: i */
    private final int f6471i;

    /* renamed from: j */
    private final boolean f6472j;

    /* renamed from: k */
    private final JSONObject f6473k;

    /* renamed from: l */
    private final String f6474l;

    /* renamed from: m */
    private final boolean f6475m;

    public C1662sx(JSONObject jSONObject) {
        List<String> list;
        this.f6470h = jSONObject.optString("url");
        this.f6464b = jSONObject.optString("base_uri");
        this.f6465c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.f6467e = optString != null && (optString.equals("1") || optString.equals("true"));
        this.f6468f = jSONObject.optString("request_id");
        this.f6466d = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        if (optString2 == null) {
            list = null;
        } else {
            list = Arrays.asList(optString2.split(","));
        }
        this.f6463a = list;
        this.f6471i = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
        this.f6469g = jSONObject.optString("fetched_ad");
        this.f6472j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f6473k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f6474l = jSONObject.optString("analytics_query_ad_event_id");
        this.f6475m = jSONObject.optBoolean("is_analytics_logging_enabled");
    }

    /* renamed from: a */
    public final int mo12954a() {
        return this.f6471i;
    }

    /* renamed from: b */
    public final String mo12955b() {
        return this.f6464b;
    }

    /* renamed from: c */
    public final String mo12956c() {
        return this.f6465c;
    }

    /* renamed from: d */
    public final String mo12957d() {
        return this.f6470h;
    }

    /* renamed from: e */
    public final boolean mo12958e() {
        return this.f6467e;
    }

    /* renamed from: f */
    public final String mo12959f() {
        return this.f6469g;
    }

    /* renamed from: g */
    public final boolean mo12960g() {
        return this.f6472j;
    }

    /* renamed from: h */
    public final String mo12961h() {
        return this.f6474l;
    }

    /* renamed from: i */
    public final boolean mo12962i() {
        return this.f6475m;
    }
}
