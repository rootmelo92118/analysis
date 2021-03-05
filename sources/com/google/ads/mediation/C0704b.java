package com.google.ads.mediation;

import com.google.ads.mediation.C0713e;

@Deprecated
/* renamed from: com.google.ads.mediation.b */
public interface C0704b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends C0713e> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
