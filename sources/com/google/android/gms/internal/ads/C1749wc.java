package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wc */
public final class C1749wc implements C1751we {
    /* renamed from: a */
    public final abg<String> mo13094a(String str, PackageInfo packageInfo) {
        return aau.m1646a(str);
    }

    /* renamed from: a */
    public final abg<AdvertisingIdClient.Info> mo13093a(Context context) {
        abq abq = new abq();
        bre.m6317a();
        if (C1851zx.m8598c(context)) {
            C1780xg.m8353a((Runnable) new C1750wd(this, context, abq));
        }
        return abq;
    }
}
