package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.C0713e;
import com.google.ads.mediation.C0716f;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C0716f, SERVER_PARAMETERS extends C0713e> extends C0704b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(C0712d dVar, Activity activity, SERVER_PARAMETERS server_parameters, C0703a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
