package com.google.android.gms.internal.ads;

import android.support.p034v4.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

final class aeq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f1533a;

    /* renamed from: b */
    private final /* synthetic */ String f1534b;

    /* renamed from: c */
    private final /* synthetic */ long f1535c;

    /* renamed from: d */
    private final /* synthetic */ long f1536d;

    /* renamed from: e */
    private final /* synthetic */ boolean f1537e;

    /* renamed from: f */
    private final /* synthetic */ int f1538f;

    /* renamed from: g */
    private final /* synthetic */ int f1539g;

    /* renamed from: h */
    private final /* synthetic */ aeo f1540h;

    aeq(aeo aeo, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.f1540h = aeo;
        this.f1533a = str;
        this.f1534b = str2;
        this.f1535c = j;
        this.f1536d = j2;
        this.f1537e = z;
        this.f1538f = i;
        this.f1539g = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.f1533a);
        hashMap.put("cachedSrc", this.f1534b);
        hashMap.put("bufferedDuration", Long.toString(this.f1535c));
        hashMap.put("totalDuration", Long.toString(this.f1536d));
        hashMap.put("cacheReady", this.f1537e ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f1538f));
        hashMap.put("playerPreparedCount", Integer.toString(this.f1539g));
        this.f1540h.m1877a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
