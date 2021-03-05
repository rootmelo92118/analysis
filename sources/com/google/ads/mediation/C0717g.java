package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* renamed from: com.google.ads.mediation.g */
final class C0717g implements RewardedVideoAdListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f653a;

    C0717g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f653a = abstractAdViewAdapter;
    }

    public final void onRewardedVideoAdLoaded() {
        this.f653a.zzhx.onAdLoaded(this.f653a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f653a.zzhx.onAdOpened(this.f653a);
    }

    public final void onRewardedVideoStarted() {
        this.f653a.zzhx.onVideoStarted(this.f653a);
    }

    public final void onRewardedVideoAdClosed() {
        this.f653a.zzhx.onAdClosed(this.f653a);
        InterstitialAd unused = this.f653a.zzhw = null;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f653a.zzhx.onRewarded(this.f653a, rewardItem);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f653a.zzhx.onAdLeftApplication(this.f653a);
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f653a.zzhx.onAdFailedToLoad(this.f653a, i);
    }

    public final void onRewardedVideoCompleted() {
        this.f653a.zzhx.onVideoCompleted(this.f653a);
    }
}
