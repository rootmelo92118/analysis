package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.C0693a;
import com.google.ads.C0696b;
import com.google.ads.mediation.C0703a;
import com.google.ads.mediation.C0705c;
import com.google.ads.mediation.C0712d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.aai;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, C0711d>, MediationInterstitialAdapter<CustomEventExtras, C0711d> {

    /* renamed from: a */
    private View f642a;

    /* renamed from: b */
    private CustomEventBanner f643b;

    /* renamed from: c */
    private CustomEventInterstitial f644c;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C0706a implements C0709b {

        /* renamed from: a */
        private final CustomEventAdapter f645a;

        /* renamed from: b */
        private final C0705c f646b;

        public C0706a(CustomEventAdapter customEventAdapter, C0705c cVar) {
            this.f645a = customEventAdapter;
            this.f646b = cVar;
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C0707b implements C0710c {

        /* renamed from: a */
        private final CustomEventAdapter f647a;

        /* renamed from: b */
        private final C0712d f648b;

        public C0707b(CustomEventAdapter customEventAdapter, C0712d dVar) {
            this.f647a = customEventAdapter;
            this.f648b = dVar;
        }
    }

    /* renamed from: a */
    private static <T> T m762a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            aai.m1630e(sb.toString());
            return null;
        }
    }

    public final void destroy() {
        if (this.f643b != null) {
            this.f643b.mo8392a();
        }
        if (this.f644c != null) {
            this.f644c.mo8392a();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.f642a;
    }

    public final Class<C0711d> getServerParametersType() {
        return C0711d.class;
    }

    public final void requestBannerAd(C0705c cVar, Activity activity, C0711d dVar, C0696b bVar, C0703a aVar, CustomEventExtras customEventExtras) {
        Object extra;
        this.f643b = (CustomEventBanner) m762a(dVar.f651b);
        if (this.f643b == null) {
            cVar.mo8386a(this, C0693a.C0694a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            extra = null;
        } else {
            extra = customEventExtras.getExtra(dVar.f650a);
        }
        this.f643b.requestBannerAd(new C0706a(this, cVar), activity, dVar.f650a, dVar.f652c, bVar, aVar, extra);
    }

    public final void requestInterstitialAd(C0712d dVar, Activity activity, C0711d dVar2, C0703a aVar, CustomEventExtras customEventExtras) {
        Object extra;
        this.f644c = (CustomEventInterstitial) m762a(dVar2.f651b);
        if (this.f644c == null) {
            dVar.mo8393a(this, C0693a.C0694a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            extra = null;
        } else {
            extra = customEventExtras.getExtra(dVar2.f650a);
        }
        this.f644c.requestInterstitialAd(new C0707b(this, dVar), activity, dVar2.f650a, dVar2.f652c, aVar, extra);
    }

    public final void showInterstitial() {
        this.f644c.showInterstitial();
    }
}
