package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.te */
public final class C1670te extends C1672tg {

    /* renamed from: a */
    private final Object f6540a = new Object();

    /* renamed from: b */
    private final Context f6541b;
    @Nullable

    /* renamed from: c */
    private SharedPreferences f6542c;

    /* renamed from: d */
    private final C1397jb<JSONObject, JSONObject> f6543d;

    public C1670te(Context context, C1397jb<JSONObject, JSONObject> jbVar) {
        this.f6541b = context.getApplicationContext();
        this.f6543d = jbVar;
    }

    /* renamed from: a */
    public final abg<Void> mo12968a() {
        synchronized (this.f6540a) {
            if (this.f6542c == null) {
                this.f6542c = this.f6541b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzbv.zzlm().mo9996a() - this.f6542c.getLong("js_last_update", 0) < ((Long) bre.m6321e().mo12778a(C1557p.f5992bu)).longValue()) {
            return aau.m1646a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbbi.m8618a().f7135a);
            jSONObject.put("mf", bre.m6321e().mo12778a(C1557p.f5993bv));
            jSONObject.put("cl", "221522000");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", DynamiteModule.m1537b(this.f6541b, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
            return aau.m1649a(this.f6543d.mo12630a(jSONObject), new C1671tf(this), abl.f1314b);
        } catch (JSONException e) {
            C1772wz.m1625b("Unable to populate SDK Core Constants parameters.", e);
            return aau.m1646a(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo12969a(JSONObject jSONObject) {
        C1557p.m7742a(this.f6541b, 1, jSONObject);
        this.f6542c.edit().putLong("js_last_update", zzbv.zzlm().mo9996a()).apply();
        return null;
    }
}
