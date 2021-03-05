package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ng */
public final class C1510ng {

    /* renamed from: a */
    private final boolean f5772a;

    /* renamed from: b */
    private final boolean f5773b;

    /* renamed from: c */
    private final boolean f5774c;

    /* renamed from: d */
    private final boolean f5775d;

    /* renamed from: e */
    private final boolean f5776e;

    private C1510ng(C1512ni niVar) {
        this.f5772a = niVar.f5777a;
        this.f5773b = niVar.f5778b;
        this.f5774c = niVar.f5779c;
        this.f5775d = niVar.f5780d;
        this.f5776e = niVar.f5781e;
    }

    /* renamed from: a */
    public final JSONObject mo12819a() {
        try {
            return new JSONObject().put("sms", this.f5772a).put("tel", this.f5773b).put("calendar", this.f5774c).put("storePicture", this.f5775d).put("inlineVideo", this.f5776e);
        } catch (JSONException e) {
            C1772wz.m1625b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
