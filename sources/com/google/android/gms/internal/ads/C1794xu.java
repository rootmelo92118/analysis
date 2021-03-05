package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xu */
final class C1794xu implements Callable<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ Context f6858a;

    /* renamed from: b */
    private final /* synthetic */ WebSettings f6859b;

    C1794xu(C1793xt xtVar, Context context, WebSettings webSettings) {
        this.f6858a = context;
        this.f6859b = webSettings;
    }

    public final /* synthetic */ Object call() {
        if (this.f6858a.getCacheDir() != null) {
            this.f6859b.setAppCachePath(this.f6858a.getCacheDir().getAbsolutePath());
            this.f6859b.setAppCacheMaxSize(0);
            this.f6859b.setAppCacheEnabled(true);
        }
        this.f6859b.setDatabasePath(this.f6858a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f6859b.setDatabaseEnabled(true);
        this.f6859b.setDomStorageEnabled(true);
        this.f6859b.setDisplayZoomControls(false);
        this.f6859b.setBuiltInZoomControls(true);
        this.f6859b.setSupportZoom(true);
        this.f6859b.setAllowContentAccess(false);
        return true;
    }
}
