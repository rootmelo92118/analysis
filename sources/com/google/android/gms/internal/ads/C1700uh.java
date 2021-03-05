package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.uh */
public final class C1700uh extends C1696ud {
    @Nullable

    /* renamed from: a */
    private RewardedVideoAdListener f6570a;

    public C1700uh(@Nullable RewardedVideoAdListener rewardedVideoAdListener) {
        this.f6570a = rewardedVideoAdListener;
    }

    /* renamed from: a */
    public final void mo12540a() {
        if (this.f6570a != null) {
            this.f6570a.onRewardedVideoAdLoaded();
        }
    }

    /* renamed from: b */
    public final void mo12543b() {
        if (this.f6570a != null) {
            this.f6570a.onRewardedVideoAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo12544c() {
        if (this.f6570a != null) {
            this.f6570a.onRewardedVideoStarted();
        }
    }

    /* renamed from: d */
    public final void mo12545d() {
        if (this.f6570a != null) {
            this.f6570a.onRewardedVideoAdClosed();
        }
    }

    /* renamed from: a */
    public final void mo12542a(C1683tr trVar) {
        if (this.f6570a != null) {
            this.f6570a.onRewarded(new C1698uf(trVar));
        }
    }

    /* renamed from: e */
    public final void mo12546e() {
        if (this.f6570a != null) {
            this.f6570a.onRewardedVideoAdLeftApplication();
        }
    }

    /* renamed from: a */
    public final void mo12541a(int i) {
        if (this.f6570a != null) {
            this.f6570a.onRewardedVideoAdFailedToLoad(i);
        }
    }

    /* renamed from: f */
    public final void mo12547f() {
        if (this.f6570a != null) {
            this.f6570a.onRewardedVideoCompleted();
        }
    }

    @Nullable
    /* renamed from: g */
    public final RewardedVideoAdListener mo13009g() {
        return this.f6570a;
    }

    /* renamed from: a */
    public final void mo13008a(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f6570a = rewardedVideoAdListener;
    }
}
