package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C1019ad;
import com.google.android.gms.internal.ads.C1135bi;
import com.google.android.gms.internal.ads.C1624rm;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.aau;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzvv;
import com.google.android.gms.internal.ads.zzwb;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

final class zzbe implements Callable<C1135bi> {
    private final /* synthetic */ C1753wg zzblz;
    private final /* synthetic */ int zzbqf;
    private final /* synthetic */ JSONArray zzbqg;
    private final /* synthetic */ int zzbqh;
    private final /* synthetic */ zzbb zzbqi;

    zzbe(zzbb zzbb, int i, JSONArray jSONArray, int i2, C1753wg wgVar) {
        this.zzbqi = zzbb;
        this.zzbqf = i;
        this.zzbqg = jSONArray;
        this.zzbqh = i2;
        this.zzblz = wgVar;
    }

    public final /* synthetic */ Object call() {
        Bundle bundle;
        if (this.zzbqf >= this.zzbqg.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.zzbqg.get(this.zzbqf));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        zzbb zzbb = new zzbb(this.zzbqi.zzbls.zzsp, this.zzbqi.zzbly, this.zzbqi.zzbls.zzbst, this.zzbqi.zzbls.zzbsn, this.zzbqi.zzbma, this.zzbqi.zzbls.zzbsp, true);
        zzbb.zza(this.zzbqi.zzbls, zzbb.zzbls);
        zzbb.zzkm();
        zzbb.zza(this.zzbqi.zzblo);
        C1019ad adVar = zzbb.zzbln;
        int i = this.zzbqf;
        adVar.mo10153a("num_ads_requested", String.valueOf(this.zzbqh));
        adVar.mo10153a("ad_index", String.valueOf(i));
        zzasi zzasi = this.zzblz.f6724a;
        String jSONObject2 = jSONObject.toString();
        if (zzasi.f7032c.f7273c != null) {
            bundle = new Bundle(zzasi.f7032c.f7273c);
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("_ad", jSONObject2);
        zzwb zzwb = r5;
        zzwb zzwb2 = new zzwb(zzasi.f7032c.f7271a, zzasi.f7032c.f7272b, bundle2, zzasi.f7032c.f7274d, zzasi.f7032c.f7275e, zzasi.f7032c.f7276f, zzasi.f7032c.f7277g, zzasi.f7032c.f7278h, zzasi.f7032c.f7279i, zzasi.f7032c.f7280j, zzasi.f7032c.f7281k, zzasi.f7032c.f7282l, zzasi.f7032c.f7283m, zzasi.f7032c.f7284n, zzasi.f7032c.f7285o, zzasi.f7032c.f7286p, zzasi.f7032c.f7287q, zzasi.f7032c.f7288r, (zzvv) null, zzasi.f7032c.f7290t, zzasi.f7032c.f7291u);
        zzbb.zza(new C1624rm(zzasi.f7031b, zzwb, zzasi.f7033d, zzasi.f7034e, zzasi.f7035f, zzasi.f7036g, zzasi.f7038i, zzasi.f7039j, zzasi.f7040k, zzasi.f7041l, zzasi.f7043n, zzasi.f7055z, zzasi.f7044o, zzasi.f7045p, zzasi.f7046q, zzasi.f7047r, zzasi.f7048s, zzasi.f7049t, zzasi.f7050u, zzasi.f7051v, zzasi.f7052w, zzasi.f7053x, zzasi.f7054y, zzasi.f6998B, zzasi.f6999C, zzasi.f7005I, zzasi.f7000D, zzasi.f7001E, zzasi.f7002F, zzasi.f7003G, aau.m1646a(zzasi.f7004H), zzasi.f7006J, zzasi.f7007K, zzasi.f7008L, zzasi.f7009M, zzasi.f7010N, zzasi.f7011O, zzasi.f7012P, zzasi.f7013Q, zzasi.f7017U, aau.m1646a(zzasi.f7037h), zzasi.f7018V, zzasi.f7019W, zzasi.f7020X, 1, zzasi.f7022Z, zzasi.f7024aa, zzasi.f7025ab, zzasi.f7026ac, zzasi.f7027ad, zzasi.f7028ae, zzasi.f7030ag), zzbb.zzbln);
        return zzbb.zzko().get();
    }
}
