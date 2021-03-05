package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* renamed from: com.google.ads.mediation.h */
final class C0718h extends AdMetadataListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f654a;

    C0718h(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f654a = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (this.f654a.zzhw != null && this.f654a.zzhx != null) {
            this.f654a.zzhx.zzc(this.f654a.zzhw.getAdMetadata());
        }
    }
}
