package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.C0979o;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
final class ahn {
    @GuardedBy("InvokeJavascriptWorkaround.class")

    /* renamed from: a */
    private static Boolean f1824a;

    private ahn() {
    }

    @TargetApi(19)
    /* renamed from: a */
    private static boolean m2310a(WebView webView) {
        boolean booleanValue;
        synchronized (ahn.class) {
            if (f1824a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    f1824a = true;
                } catch (IllegalStateException unused) {
                    f1824a = false;
                }
            }
            booleanValue = f1824a.booleanValue();
        }
        return booleanValue;
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m2309a(WebView webView, String str) {
        if (!C0979o.m1505f() || !m2310a(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
