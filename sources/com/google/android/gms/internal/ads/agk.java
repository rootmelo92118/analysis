package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.support.annotation.Nullable;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
@C1598qn
public class agk extends afm {
    public agk(afl afl, box box, boolean z) {
        super(afl, box, z);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final WebResourceResponse mo10485a(WebView webView, String str, @Nullable Map<String, String> map) {
        String str2;
        if (!(webView instanceof afl)) {
            C1772wz.m1630e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        afl afl = (afl) webView;
        if (this.f1594a != null) {
            this.f1594a.mo13056a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo10394a(str, map);
        }
        if (afl.mo10388u() != null) {
            afl.mo10388u().mo10425n();
        }
        if (afl.mo10380s().mo10494e()) {
            str2 = (String) bre.m6321e().mo12778a(C1557p.f5873H);
        } else if (afl.mo10393z()) {
            str2 = (String) bre.m6321e().mo12778a(C1557p.f5872G);
        } else {
            str2 = (String) bre.m6321e().mo12778a(C1557p.f5871F);
        }
        zzbv.zzlf();
        return C1782xi.m8390c(afl.getContext(), afl.mo10180i().f7135a, str2);
    }
}
