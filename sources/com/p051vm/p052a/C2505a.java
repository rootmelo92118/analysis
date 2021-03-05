package com.p051vm.p052a;

import android.content.Context;
import android.util.Log;
import com.google.gson.JsonObject;
import com.p051vm.p053b.p054a.C2513a;

/* renamed from: com.vm.a.a */
/* compiled from: ConfigCache */
public class C2505a {

    /* renamed from: f */
    private static C2505a f8946f;

    /* renamed from: a */
    private final String f8947a = "KEEP_TIME_MIN";

    /* renamed from: b */
    private final String f8948b = "GLOBAL_AD_SWITCH";

    /* renamed from: c */
    private final String f8949c = "POP_RATE_WIN_THRESHOLD";

    /* renamed from: d */
    private final String f8950d = "RECONNECT_TIME_MIN";

    /* renamed from: e */
    private Context f8951e;

    private C2505a(Context context) {
        this.f8951e = context;
    }

    /* renamed from: a */
    public static C2505a m11786a(Context context) {
        if (f8946f == null) {
            f8946f = new C2505a(context);
        }
        return f8946f;
    }

    /* renamed from: a */
    public void mo15455a(JsonObject jsonObject) {
        if (jsonObject.get("KEEP_TIME_MIN") != null) {
            C2513a.m11818a(this.f8951e).mo15483b("KEEP_TIME_MIN", jsonObject.get("KEEP_TIME_MIN").getAsString());
        }
        if (jsonObject.get("GLOBAL_AD_SWITCH") != null) {
            C2513a.m11818a(this.f8951e).mo15483b("GLOBAL_AD_SWITCH", jsonObject.get("GLOBAL_AD_SWITCH").getAsString());
        }
        if (jsonObject.get("POP_RATE_WIN_THRESHOLD") != null) {
            C2513a.m11818a(this.f8951e).mo15483b("POP_RATE_WIN_THRESHOLD", jsonObject.get("POP_RATE_WIN_THRESHOLD").getAsString());
        }
        if (jsonObject.get("RECONNECT_TIME_MIN") != null) {
            C2513a.m11818a(this.f8951e).mo15483b("RECONNECT_TIME_MIN", jsonObject.get("RECONNECT_TIME_MIN").getAsString());
        }
        Log.v("--reconnect time--", jsonObject.get("RECONNECT_TIME_MIN").getAsString());
    }

    /* renamed from: a */
    public Integer mo15454a() {
        String a = C2513a.m11818a(this.f8951e).mo15481a("KEEP_TIME_MIN");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    /* renamed from: b */
    public boolean mo15456b() {
        String a = C2513a.m11818a(this.f8951e).mo15481a("GLOBAL_AD_SWITCH");
        return a != null && "1".equals(a);
    }

    /* renamed from: c */
    public int mo15457c() {
        String a = C2513a.m11818a(this.f8951e).mo15481a("POP_RATE_WIN_THRESHOLD");
        if (a == null) {
            return 2;
        }
        return Integer.parseInt(a);
    }

    /* renamed from: d */
    public int mo15458d() {
        String a = C2513a.m11818a(this.f8951e).mo15481a("RECONNECT_TIME_MIN");
        if (a == null) {
            return 20;
        }
        return Integer.parseInt(a);
    }
}
