package com.google.android.gms.internal.ads;

import android.support.p034v4.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

final class aep implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f1527a;

    /* renamed from: b */
    private final /* synthetic */ String f1528b;

    /* renamed from: c */
    private final /* synthetic */ int f1529c;

    /* renamed from: d */
    private final /* synthetic */ int f1530d;

    /* renamed from: e */
    private final /* synthetic */ boolean f1531e = false;

    /* renamed from: f */
    private final /* synthetic */ aeo f1532f;

    aep(aeo aeo, String str, String str2, int i, int i2, boolean z) {
        this.f1532f = aeo;
        this.f1527a = str;
        this.f1528b = str2;
        this.f1529c = i;
        this.f1530d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.f1527a);
        hashMap.put("cachedSrc", this.f1528b);
        hashMap.put("bytesLoaded", Integer.toString(this.f1529c));
        hashMap.put("totalBytes", Integer.toString(this.f1530d));
        hashMap.put("cacheReady", this.f1531e ? "1" : "0");
        this.f1532f.m1877a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
