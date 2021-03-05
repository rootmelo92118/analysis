package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sf */
final class C1644sf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f6384a;

    /* renamed from: b */
    final /* synthetic */ String f6385b;

    /* renamed from: c */
    private final /* synthetic */ C1642sd f6386c;

    C1644sf(C1642sd sdVar, JSONObject jSONObject, String str) {
        this.f6386c = sdVar;
        this.f6384a = jSONObject;
        this.f6385b = str;
    }

    public final void run() {
        C1383io unused = this.f6386c.f6380l = C1642sd.f6372d.mo12617b((awy) null);
        this.f6386c.f6380l.mo10093a(new C1645sg(this), new C1646sh(this));
    }
}
