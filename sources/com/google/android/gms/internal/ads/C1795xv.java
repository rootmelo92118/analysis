package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.xv */
public class C1795xv extends C1793xt {
    /* renamed from: f */
    public int mo13242f() {
        return 1;
    }

    /* renamed from: a */
    public final String mo13227a(SslError sslError) {
        return sslError.getUrl();
    }
}
