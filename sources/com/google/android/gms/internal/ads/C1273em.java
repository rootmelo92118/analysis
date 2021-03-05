package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

/* renamed from: com.google.android.gms.internal.ads.em */
final class C1273em implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ PublisherAdView f5347a;

    /* renamed from: b */
    private final /* synthetic */ brw f5348b;

    /* renamed from: c */
    private final /* synthetic */ C1272el f5349c;

    C1273em(C1272el elVar, PublisherAdView publisherAdView, brw brw) {
        this.f5349c = elVar;
        this.f5347a = publisherAdView;
        this.f5348b = brw;
    }

    public final void run() {
        if (this.f5347a.zza(this.f5348b)) {
            this.f5349c.f5346a.onPublisherAdViewLoaded(this.f5347a);
        } else {
            aai.m1630e("Could not bind.");
        }
    }
}
