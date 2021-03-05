package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.abq;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
public final class zzz implements zzu<Object> {
    private final HashMap<String, abq<JSONObject>> zzdga = new HashMap<>();

    public final Future<JSONObject> zzbu(String str) {
        abq abq = new abq();
        this.zzdga.put(str, abq);
        return abq;
    }

    public final void zzbv(String str) {
        abq abq = this.zzdga.get(str);
        if (abq == null) {
            C1772wz.m1626c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!abq.isDone()) {
            abq.cancel(true);
        }
        this.zzdga.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        C1772wz.m1624b("Received ad from the cache.");
        abq abq = this.zzdga.get(str);
        if (abq == null) {
            C1772wz.m1626c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            abq.mo10087b(new JSONObject(str2));
        } catch (JSONException e) {
            C1772wz.m1625b("Failed constructing JSON object from value passed from javascript", e);
            abq.mo10087b(null);
        } finally {
            this.zzdga.remove(str);
        }
    }
}
