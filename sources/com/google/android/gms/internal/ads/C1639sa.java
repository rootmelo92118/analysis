package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.sa */
final class C1639sa extends FilterInputStream {

    /* renamed from: a */
    private final HttpURLConnection f6368a;

    C1639sa(HttpURLConnection httpURLConnection) {
        super(C1615rd.m7827b(httpURLConnection));
        this.f6368a = httpURLConnection;
    }

    public final void close() {
        super.close();
        this.f6368a.disconnect();
    }
}
