package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

final class bnm implements ValueCallback<String> {

    /* renamed from: a */
    private final /* synthetic */ bnk f4860a;

    bnm(bnk bnk) {
        this.f4860a = bnk;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.f4860a.f4858d.mo12243a(this.f4860a.f4855a, this.f4860a.f4856b, (String) obj, this.f4860a.f4857c);
    }
}
