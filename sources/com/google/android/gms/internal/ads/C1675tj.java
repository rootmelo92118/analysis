package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.tj */
public final class C1675tj implements C1658st {

    /* renamed from: a */
    private C1397jb<JSONObject, JSONObject> f6545a;

    /* renamed from: b */
    private C1397jb<JSONObject, JSONObject> f6546b;

    public C1675tj(Context context) {
        this.f6545a = zzbv.zzlu().mo12631a(context, zzbbi.m8618a()).mo12636a("google.afma.request.getAdDictionary", C1403jh.f5519a, C1403jh.f5519a);
        this.f6546b = zzbv.zzlu().mo12631a(context, zzbbi.m8618a()).mo12636a("google.afma.sdkConstants.getSdkConstants", C1403jh.f5519a, C1403jh.f5519a);
    }

    /* renamed from: a */
    public final C1397jb<JSONObject, JSONObject> mo12949a() {
        return this.f6545a;
    }

    /* renamed from: b */
    public final C1397jb<JSONObject, JSONObject> mo12950b() {
        return this.f6546b;
    }
}
