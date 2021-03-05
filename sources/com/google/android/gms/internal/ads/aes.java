package com.google.android.gms.internal.ads;

import android.support.p034v4.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

final class aes implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f1545a;

    /* renamed from: b */
    private final /* synthetic */ String f1546b;

    /* renamed from: c */
    private final /* synthetic */ long f1547c;

    /* renamed from: d */
    private final /* synthetic */ aeo f1548d;

    aes(aeo aeo, String str, String str2, long j) {
        this.f1548d = aeo;
        this.f1545a = str;
        this.f1546b = str2;
        this.f1547c = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.f1545a);
        hashMap.put("cachedSrc", this.f1546b);
        hashMap.put("totalDuration", Long.toString(this.f1547c));
        this.f1548d.m1877a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
