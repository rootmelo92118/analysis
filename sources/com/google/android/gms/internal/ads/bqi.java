package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@C1598qn
public final class bqi extends brm {

    /* renamed from: a */
    private final AdListener f5101a;

    public bqi(AdListener adListener) {
        this.f5101a = adListener;
    }

    /* renamed from: a */
    public final void mo12296a() {
        this.f5101a.onAdClosed();
    }

    /* renamed from: a */
    public final void mo12297a(int i) {
        this.f5101a.onAdFailedToLoad(i);
    }

    /* renamed from: b */
    public final void mo12298b() {
        this.f5101a.onAdLeftApplication();
    }

    /* renamed from: c */
    public final void mo12299c() {
        this.f5101a.onAdLoaded();
    }

    /* renamed from: d */
    public final void mo12300d() {
        this.f5101a.onAdOpened();
    }

    /* renamed from: f */
    public final void mo12302f() {
        this.f5101a.onAdClicked();
    }

    /* renamed from: e */
    public final void mo12301e() {
        this.f5101a.onAdImpression();
    }

    /* renamed from: g */
    public final AdListener mo12303g() {
        return this.f5101a;
    }
}
