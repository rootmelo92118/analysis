package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0722b;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.vd */
public final class C1723vd implements MediationRewardedVideoAdListener {

    /* renamed from: a */
    private final C1718uz f6626a;

    public C1723vd(C1718uz uzVar) {
        this.f6626a = uzVar;
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onInitializationSucceeded.");
        try {
            this.f6626a.mo13029a(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onInitializationFailed.");
        try {
            this.f6626a.mo13030a(C0722b.m769a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLoaded.");
        try {
            this.f6626a.mo13035b(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdOpened.");
        try {
            this.f6626a.mo13037c(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onVideoStarted.");
        try {
            this.f6626a.mo13038d(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdClosed.");
        try {
            this.f6626a.mo13039e(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.f6626a.mo13031a(C0722b.m769a(mediationRewardedVideoAdAdapter), new zzawd(rewardItem));
            } catch (RemoteException e) {
                aai.m1629d("#007 Could not call remote method.", e);
            }
        } else {
            this.f6626a.mo13031a(C0722b.m769a(mediationRewardedVideoAdAdapter), new zzawd("", 1));
        }
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdClicked.");
        try {
            this.f6626a.mo13040f(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdFailedToLoad.");
        try {
            this.f6626a.mo13036b(C0722b.m769a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLeftApplication.");
        try {
            this.f6626a.mo13041g(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onVideoCompleted.");
        try {
            this.f6626a.mo13042h(C0722b.m769a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(Bundle bundle) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdMetadataChanged.");
        try {
            this.f6626a.mo13028a(bundle);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
