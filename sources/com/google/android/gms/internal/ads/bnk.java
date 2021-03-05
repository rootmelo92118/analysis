package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class bnk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bnc f4855a;

    /* renamed from: b */
    final /* synthetic */ WebView f4856b;

    /* renamed from: c */
    final /* synthetic */ boolean f4857c;

    /* renamed from: d */
    final /* synthetic */ bni f4858d;

    /* renamed from: e */
    private ValueCallback<String> f4859e = new bnm(this);

    bnk(bni bni, bnc bnc, WebView webView, boolean z) {
        this.f4858d = bni;
        this.f4855a = bnc;
        this.f4856b = webView;
        this.f4857c = z;
    }

    public final void run() {
        if (this.f4856b.getSettings().getJavaScriptEnabled()) {
            try {
                this.f4856b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f4859e);
            } catch (Throwable unused) {
                this.f4859e.onReceiveValue("");
            }
        }
    }
}
