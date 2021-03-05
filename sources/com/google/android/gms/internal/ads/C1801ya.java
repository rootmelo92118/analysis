package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.ya */
public final class C1801ya extends C1799xz {
    /* renamed from: f */
    public final int mo13242f() {
        return 16974374;
    }

    /* renamed from: c */
    public final CookieManager mo13239c(Context context) {
        if (m8436e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C1772wz.m1625b("Failed to obtain CookieManager.", th);
            zzbv.zzlj().mo13119a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public final afm mo13225a(afl afl, box box, boolean z) {
        return new agl(afl, box, z);
    }

    /* renamed from: a */
    public final WebResourceResponse mo13224a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
