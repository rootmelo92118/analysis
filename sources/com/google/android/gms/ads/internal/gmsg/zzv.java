package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C1339gy;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import java.util.Map;
import org.json.JSONObject;

final class zzv implements Runnable {
    private final /* synthetic */ Map zzdfm;
    final /* synthetic */ C1339gy zzdfn;
    private final /* synthetic */ HttpClient zzdfo;

    zzv(HttpClient httpClient, Map map, C1339gy gyVar) {
        this.zzdfo = httpClient;
        this.zzdfm = map;
        this.zzdfn = gyVar;
    }

    public final void run() {
        C1772wz.m1624b("Received Http request.");
        try {
            JSONObject send = this.zzdfo.send(new JSONObject((String) this.zzdfm.get("http_request")));
            if (send == null) {
                C1772wz.m1626c("Response should not be null.");
            } else {
                C1782xi.f6838a.post(new zzw(this, send));
            }
        } catch (Exception e) {
            C1772wz.m1625b("Error converting request to json.", e);
        }
    }
}
