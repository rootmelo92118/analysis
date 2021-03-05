package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.C0979o;

@C1598qn
public final class zzanu implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f6994a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MediationInterstitialListener f6995b;

    /* renamed from: c */
    private Uri f6996c;

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f6995b = mediationInterstitialListener;
        if (this.f6995b == null) {
            aai.m1630e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            aai.m1630e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f6995b.onAdFailedToLoad(this, 0);
        } else {
            if (!(C0979o.m1501b() && C1065an.m2853a(context))) {
                aai.m1630e("Default browser does not support custom tabs. Bailing out.");
                this.f6995b.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                aai.m1630e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f6995b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f6994a = (Activity) context;
            this.f6996c = Uri.parse(string);
            this.f6995b.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setData(this.f6996c);
        C1782xi.f6838a.post(new C1498mv(this, new AdOverlayInfoParcel(new zzc(build.intent), (bqf) null, new C1497mu(this), (zzt) null, new zzbbi(0, 0, false))));
        zzbv.zzlj().mo13125e();
    }

    public final void onDestroy() {
        aai.m1624b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        aai.m1624b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        aai.m1624b("Resuming AdMobCustomTabsAdapter adapter.");
    }
}
