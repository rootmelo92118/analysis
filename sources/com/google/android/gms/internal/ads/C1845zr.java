package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.C0982r;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zr */
final class C1845zr implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f6943a;

    C1845zr(C1844zq zqVar, Context context) {
        this.f6943a = context;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.f6943a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C1772wz.m8287a("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f6943a);
            C0982r.m1515a(this.f6943a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        C1772wz.m8287a("User agent is already initialized on Google Play Services.");
        return string;
    }
}
