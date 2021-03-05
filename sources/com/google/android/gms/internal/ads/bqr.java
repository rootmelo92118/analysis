package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@C1598qn
public final class bqr extends bsf {

    /* renamed from: a */
    private final AppEventListener f5124a;

    public bqr(AppEventListener appEventListener) {
        this.f5124a = appEventListener;
    }

    /* renamed from: a */
    public final void mo12315a(String str, String str2) {
        this.f5124a.onAppEvent(str, str2);
    }

    /* renamed from: a */
    public final AppEventListener mo12314a() {
        return this.f5124a;
    }
}
