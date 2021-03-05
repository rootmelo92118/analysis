package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.zp */
public final class C1843zp {
    /* renamed from: a */
    public static boolean m8565a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
        if (bundle2 == null || !bundle2.getBoolean("render_test_ad_label", false)) {
            return false;
        }
        return true;
    }
}
