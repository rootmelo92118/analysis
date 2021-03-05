package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zs */
final class C1846zs implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f6944a;

    /* renamed from: b */
    private final /* synthetic */ Context f6945b;

    C1846zs(C1844zq zqVar, Context context, Context context2) {
        this.f6944a = context;
        this.f6945b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f6944a != null) {
            C1772wz.m8287a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f6944a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C1772wz.m8287a("Attempting to read user agent from local cache.");
            sharedPreferences = this.f6945b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C1772wz.m8287a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f6945b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C1772wz.m8287a("Persisting user agent.");
            }
        }
        return string;
    }
}
