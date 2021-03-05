package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1397jb;
import com.google.android.gms.internal.ads.C1403jh;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1756wj;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.aas;
import com.google.android.gms.internal.ads.aau;
import com.google.android.gms.internal.ads.abg;
import com.google.android.gms.internal.ads.abl;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.zzbbi;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzad {
    private Context mContext;
    private final Object mLock = new Object();
    private long zzbnh = 0;

    public final void zza(Context context, zzbbi zzbbi, String str, @Nullable Runnable runnable) {
        zza(context, zzbbi, true, (C1756wj) null, str, (String) null, runnable);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Context context, zzbbi zzbbi, boolean z, @Nullable C1756wj wjVar, String str, @Nullable String str2, @Nullable Runnable runnable) {
        if (zzbv.zzlm().mo9997b() - this.zzbnh < 5000) {
            C1772wz.m1630e("Not retrying to fetch app settings");
            return;
        }
        this.zzbnh = zzbv.zzlm().mo9997b();
        boolean z2 = true;
        if (wjVar != null) {
            if (!(zzbv.zzlm().mo9996a() - wjVar.mo13111a() > ((Long) bre.m6321e().mo12778a(C1557p.f5958bM)).longValue()) && wjVar.mo13112b()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                C1772wz.m1630e("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.mContext = applicationContext;
                C1397jb<I, O> a = zzbv.zzlu().mo12631a(this.mContext, zzbbi).mo12636a("google.afma.config.fetchAppSettings", C1403jh.f5519a, C1403jh.f5519a);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    abg<O> a2 = a.mo12630a(jSONObject);
                    abg<B> a3 = aau.m1648a(a2, zzae.zzbni, abl.f1314b);
                    if (runnable != null) {
                        a2.mo10059a(runnable, abl.f1314b);
                    }
                    aas.m1642a(a3, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    C1772wz.m1625b("Error requesting application settings", e);
                }
            } else {
                C1772wz.m1630e("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
