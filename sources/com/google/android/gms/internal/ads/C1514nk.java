package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.nk */
public class C1514nk {

    /* renamed from: a */
    private final afl f5795a;

    /* renamed from: b */
    private final String f5796b;

    public C1514nk(afl afl) {
        this(afl, "");
    }

    public C1514nk(afl afl, String str) {
        this.f5795a = afl;
        this.f5796b = str;
    }

    /* renamed from: a */
    public final void mo12828a(String str) {
        try {
            this.f5795a.mo10444a("onError", new JSONObject().put("message", str).put("action", this.f5796b));
        } catch (JSONException e) {
            C1772wz.m1625b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: b */
    public final void mo12830b(String str) {
        try {
            this.f5795a.mo10444a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            C1772wz.m1625b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: a */
    public final void mo12826a(int i, int i2, int i3, int i4) {
        try {
            this.f5795a.mo10444a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C1772wz.m1625b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: b */
    public final void mo12829b(int i, int i2, int i3, int i4) {
        try {
            this.f5795a.mo10444a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C1772wz.m1625b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void mo12831c(String str) {
        try {
            this.f5795a.mo10444a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C1772wz.m1625b("Error occured while dispatching state change.", e);
        }
    }

    /* renamed from: a */
    public final void mo12827a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f5795a.mo10444a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            C1772wz.m1625b("Error occured while obtaining screen information.", e);
        }
    }
}
