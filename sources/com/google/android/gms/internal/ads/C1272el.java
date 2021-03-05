package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;

/* renamed from: com.google.android.gms.internal.ads.el */
public final class C1272el extends C1251ds {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final OnPublisherAdViewLoadedListener f5346a;

    public C1272el(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f5346a = onPublisherAdViewLoadedListener;
    }

    /* renamed from: a */
    public final void mo12504a(brw brw, C0719a aVar) {
        if (brw != null && aVar != null) {
            PublisherAdView publisherAdView = new PublisherAdView((Context) C0722b.m770a(aVar));
            AppEventListener appEventListener = null;
            try {
                if (brw.zzis() instanceof bqi) {
                    bqi bqi = (bqi) brw.zzis();
                    publisherAdView.setAdListener(bqi != null ? bqi.mo12303g() : null);
                }
            } catch (RemoteException e) {
                aai.m1625b("", e);
            }
            try {
                if (brw.zzir() instanceof bqr) {
                    bqr bqr = (bqr) brw.zzir();
                    if (bqr != null) {
                        appEventListener = bqr.mo12314a();
                    }
                    publisherAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                aai.m1625b("", e2);
            }
            C1851zx.f6962a.post(new C1273em(this, publisherAdView, brw));
        }
    }
}
