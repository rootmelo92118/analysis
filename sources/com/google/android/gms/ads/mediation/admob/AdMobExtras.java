package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.C0716f;

@Deprecated
public final class AdMobExtras implements C0716f {
    private final Bundle mExtras;

    public AdMobExtras(Bundle bundle) {
        this.mExtras = bundle != null ? new Bundle(bundle) : null;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }
}
