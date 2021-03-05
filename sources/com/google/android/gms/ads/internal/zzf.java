package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

final class zzf implements Callable<String> {
    private final /* synthetic */ zzc zzbmd;

    zzf(zzc zzc) {
        this.zzbmd = zzc;
    }

    public final /* synthetic */ Object call() {
        CookieManager c = zzbv.zzlh().mo13239c(this.zzbmd.zzbls.zzsp);
        if (c != null) {
            return c.getCookie("googleads.g.doubleclick.net");
        }
        return "";
    }
}
