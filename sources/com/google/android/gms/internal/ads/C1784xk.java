package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xk */
final /* synthetic */ class C1784xk implements Callable {

    /* renamed from: a */
    private final C1782xi f6848a;

    /* renamed from: b */
    private final Context f6849b;

    C1784xk(C1782xi xiVar, Context context) {
        this.f6848a = xiVar;
        this.f6849b = context;
    }

    public final Object call() {
        Context context = this.f6849b;
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6014cP)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, (String) null));
            }
        }
        return bundle;
    }
}
