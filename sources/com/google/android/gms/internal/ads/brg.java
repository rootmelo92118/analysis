package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@C1598qn
public class brg extends AdListener {

    /* renamed from: a */
    private final Object f5183a = new Object();

    /* renamed from: b */
    private AdListener f5184b;

    /* renamed from: a */
    public final void mo12328a(AdListener adListener) {
        synchronized (this.f5183a) {
            this.f5184b = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.f5183a) {
            if (this.f5184b != null) {
                this.f5184b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f5183a) {
            if (this.f5184b != null) {
                this.f5184b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f5183a) {
            if (this.f5184b != null) {
                this.f5184b.onAdLeftApplication();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f5183a) {
            if (this.f5184b != null) {
                this.f5184b.onAdOpened();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f5183a) {
            if (this.f5184b != null) {
                this.f5184b.onAdLoaded();
            }
        }
    }
}
