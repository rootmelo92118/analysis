package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
class ahj extends WebView {
    public ahj(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzbv.zzlh().mo13232a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C1772wz.m1625b("Unable to enable Javascript.", e);
        }
        setLayerType(1, (Paint) null);
    }

    /* renamed from: d */
    public void mo10449d(String str) {
        ahn.m2309a(this, str);
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            zzbv.zzlj().mo13119a(e, "CoreWebView.loadUrl");
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            C1772wz.m8287a("Ignore addJavascriptInterface due to low Android version.");
        }
    }
}
