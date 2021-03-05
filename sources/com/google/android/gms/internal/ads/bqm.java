package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

@C1598qn
public final class bqm extends bsc {

    /* renamed from: a */
    private final AdMetadataListener f5102a;

    public bqm(AdMetadataListener adMetadataListener) {
        this.f5102a = adMetadataListener;
    }

    /* renamed from: a */
    public final void mo12307a() {
        if (this.f5102a != null) {
            this.f5102a.onAdMetadataChanged();
        }
    }
}
