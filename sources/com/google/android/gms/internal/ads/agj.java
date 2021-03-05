package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
@C1598qn
public final class agj extends agk {
    public agj(afl afl, box box, boolean z) {
        super(afl, box, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo10485a(webView, str, (Map<String, String>) null);
    }
}
