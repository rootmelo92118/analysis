package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class ahl {

    /* renamed from: a */
    public final String f1819a;

    /* renamed from: b */
    public final Uri f1820b;

    /* renamed from: c */
    public final Map<String, String> f1821c;

    /* renamed from: d */
    private final String f1822d;

    @TargetApi(21)
    public ahl(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public ahl(String str) {
        this(str, Uri.parse(str), (String) null, (Map<String, String>) null);
    }

    private ahl(String str, Uri uri, @Nullable String str2, @Nullable Map<String, String> map) {
        this.f1819a = str;
        this.f1820b = uri;
        this.f1822d = str2 == null ? "GET" : str2;
        this.f1821c = map == null ? Collections.emptyMap() : map;
    }
}
