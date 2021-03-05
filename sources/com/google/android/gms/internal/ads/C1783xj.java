package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xj */
final /* synthetic */ class C1783xj implements Callable {

    /* renamed from: a */
    private final C1782xi f6846a;

    /* renamed from: b */
    private final Context f6847b;

    C1783xj(C1782xi xiVar, Context context) {
        this.f6846a = xiVar;
        this.f6847b = context;
    }

    public final Object call() {
        Context context = this.f6847b;
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6013cO)).booleanValue()) {
            return "";
        }
        return context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
    }
}
