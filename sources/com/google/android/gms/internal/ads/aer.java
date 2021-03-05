package com.google.android.gms.internal.ads;

import android.support.p034v4.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

final class aer implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f1541a;

    /* renamed from: b */
    private final /* synthetic */ String f1542b;

    /* renamed from: c */
    private final /* synthetic */ int f1543c;

    /* renamed from: d */
    private final /* synthetic */ aeo f1544d;

    aer(aeo aeo, String str, String str2, int i) {
        this.f1544d = aeo;
        this.f1541a = str;
        this.f1542b = str2;
        this.f1543c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.f1541a);
        hashMap.put("cachedSrc", this.f1542b);
        hashMap.put("totalBytes", Integer.toString(this.f1543c));
        this.f1544d.m1877a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
