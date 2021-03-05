package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pi */
final /* synthetic */ class C1566pi implements Runnable {

    /* renamed from: a */
    private final C1565ph f6188a;

    /* renamed from: b */
    private final boolean f6189b;

    /* renamed from: c */
    private final JSONObject f6190c;

    /* renamed from: d */
    private final abq f6191d;

    C1566pi(C1565ph phVar, boolean z, JSONObject jSONObject, abq abq) {
        this.f6188a = phVar;
        this.f6189b = z;
        this.f6190c = jSONObject;
        this.f6191d = abq;
    }

    public final void run() {
        this.f6188a.mo12877a(this.f6189b, this.f6190c, this.f6191d);
    }
}
