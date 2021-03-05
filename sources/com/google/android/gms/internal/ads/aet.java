package com.google.android.gms.internal.ads;

import android.support.p034v4.app.NotificationCompat;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class aet implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f1549a;

    /* renamed from: b */
    private final /* synthetic */ String f1550b;

    /* renamed from: c */
    private final /* synthetic */ String f1551c;

    /* renamed from: d */
    private final /* synthetic */ String f1552d;

    /* renamed from: e */
    private final /* synthetic */ aeo f1553e;

    aet(aeo aeo, String str, String str2, String str3, String str4) {
        this.f1553e = aeo;
        this.f1549a = str;
        this.f1550b = str2;
        this.f1551c = str3;
        this.f1552d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.f1549a);
        if (!TextUtils.isEmpty(this.f1550b)) {
            hashMap.put("cachedSrc", this.f1550b);
        }
        hashMap.put("type", aeo.m1878c(this.f1551c));
        hashMap.put("reason", this.f1551c);
        if (!TextUtils.isEmpty(this.f1552d)) {
            hashMap.put("message", this.f1552d);
        }
        this.f1553e.m1877a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
