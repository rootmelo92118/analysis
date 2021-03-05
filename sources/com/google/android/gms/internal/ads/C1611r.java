package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.r */
public final class C1611r {

    /* renamed from: a */
    private String f6281a;

    /* renamed from: b */
    private Map<String, String> f6282b;

    /* renamed from: c */
    private Context f6283c = null;

    /* renamed from: d */
    private String f6284d = null;

    public C1611r(Context context, String str) {
        String str2;
        this.f6283c = context;
        this.f6284d = str;
        this.f6281a = (String) bre.m6321e().mo12778a(C1557p.f5877L);
        this.f6282b = new LinkedHashMap();
        this.f6282b.put("s", "gmob_sdk");
        this.f6282b.put("v", "3");
        this.f6282b.put("os", Build.VERSION.RELEASE);
        this.f6282b.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.f6282b;
        zzbv.zzlf();
        map.put("device", C1782xi.m8386b());
        Map<String, String> map2 = this.f6282b;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map<String, String> map3 = this.f6282b;
        zzbv.zzlf();
        map3.put("is_lite_sdk", C1782xi.m8408l(context) ? "1" : "0");
        Future<C1663sy> a = zzbv.zzlq().mo12966a(this.f6283c);
        try {
            a.get();
            this.f6282b.put("network_coarse", Integer.toString(a.get().f6493o));
            this.f6282b.put("network_fine", Integer.toString(a.get().f6494p));
        } catch (Exception e) {
            zzbv.zzlj().mo13119a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo12910a() {
        return this.f6281a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Context mo12911b() {
        return this.f6283c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo12912c() {
        return this.f6284d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, String> mo12913d() {
        return this.f6282b;
    }
}
