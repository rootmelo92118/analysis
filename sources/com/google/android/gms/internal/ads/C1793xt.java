package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.xt */
public class C1793xt extends C1792xs {
    /* renamed from: a */
    public boolean mo13232a(Context context, WebSettings webSettings) {
        super.mo13232a(context, webSettings);
        return ((Boolean) C1842zo.m8563a(context, new C1794xu(this, context, webSettings))).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo13240c(View view) {
        view.setLayerType(1, (Paint) null);
        return true;
    }

    /* renamed from: b */
    public final boolean mo13237b(View view) {
        view.setLayerType(0, (Paint) null);
        return true;
    }

    /* renamed from: a */
    public final boolean mo13234a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    /* renamed from: a */
    public afm mo13225a(afl afl, box box, boolean z) {
        return new agj(afl, box, z);
    }

    /* renamed from: a */
    public final Set<String> mo13228a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    /* renamed from: a */
    public final boolean mo13231a(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }
}
