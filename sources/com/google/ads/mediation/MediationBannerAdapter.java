package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.C0696b;
import com.google.ads.mediation.C0713e;
import com.google.ads.mediation.C0716f;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C0716f, SERVER_PARAMETERS extends C0713e> extends C0704b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(C0705c cVar, Activity activity, SERVER_PARAMETERS server_parameters, C0696b bVar, C0703a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
