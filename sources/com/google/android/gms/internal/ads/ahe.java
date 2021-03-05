package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class ahe {
    /* renamed from: a */
    public static afl m2221a(Context context, agy agy, String str, boolean z, boolean z2, @Nullable awy awy, zzbbi zzbbi, C1019ad adVar, zzbo zzbo, zzv zzv, box box) {
        try {
            return (afl) C1842zo.m8564a(new ahg(context, agy, str, z, z2, awy, zzbbi, adVar, zzbo, zzv));
        } catch (Throwable th) {
            zzbv.zzlj().mo13119a(th, "AdWebViewFactory.newAdWebView2");
            throw new afv("Webview initialization failed.", th);
        }
    }
}
