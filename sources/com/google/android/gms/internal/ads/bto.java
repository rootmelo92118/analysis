package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0722b;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
public final class bto {
    @GuardedBy("lock")

    /* renamed from: a */
    private static bto f5272a;

    /* renamed from: b */
    private static final Object f5273b = new Object();

    /* renamed from: c */
    private bso f5274c;

    /* renamed from: d */
    private RewardedVideoAd f5275d;

    /* renamed from: a */
    public static bto m6521a() {
        bto bto;
        synchronized (f5273b) {
            if (f5272a == null) {
                f5272a = new bto();
            }
            bto = f5272a;
        }
        return bto;
    }

    /* renamed from: a */
    public final void mo12448a(Context context, String str, btq btq) {
        synchronized (f5273b) {
            if (this.f5274c == null) {
                if (context != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("measurementEnabled", false);
                        C1415jt.m7109a(context, str, bundle);
                        this.f5274c = (bso) new bqz(bre.m6318b(), context).mo12325a(context, false);
                        this.f5274c.zza();
                        this.f5274c.zza(new C1436kn());
                        if (str != null) {
                            this.f5274c.zza(str, C0722b.m769a(new btp(this, context)));
                        }
                    } catch (RemoteException e) {
                        aai.m1627c("MobileAdsSettingManager initialization failed", e);
                    }
                } else {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            }
        }
    }

    /* renamed from: a */
    public final RewardedVideoAd mo12445a(Context context) {
        synchronized (f5273b) {
            if (this.f5275d != null) {
                RewardedVideoAd rewardedVideoAd = this.f5275d;
                return rewardedVideoAd;
            }
            this.f5275d = new C1702uj(context, (C1688tw) new brc(bre.m6318b(), context, new C1436kn()).mo12325a(context, false));
            RewardedVideoAd rewardedVideoAd2 = this.f5275d;
            return rewardedVideoAd2;
        }
    }

    /* renamed from: a */
    public final void mo12446a(float f) {
        boolean z = true;
        C0926p.m1317b(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.f5274c == null) {
            z = false;
        }
        C0926p.m1313a(z, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f5274c.setAppVolume(f);
        } catch (RemoteException e) {
            aai.m1625b("Unable to set app volume.", e);
        }
    }

    /* renamed from: b */
    public final float mo12451b() {
        if (this.f5274c == null) {
            return 1.0f;
        }
        try {
            return this.f5274c.zzkj();
        } catch (RemoteException e) {
            aai.m1625b("Unable to get app volume.", e);
            return 1.0f;
        }
    }

    /* renamed from: a */
    public final void mo12450a(boolean z) {
        C0926p.m1313a(this.f5274c != null, (Object) "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.f5274c.setAppMuted(z);
        } catch (RemoteException e) {
            aai.m1625b("Unable to set app mute state.", e);
        }
    }

    /* renamed from: c */
    public final boolean mo12452c() {
        if (this.f5274c == null) {
            return false;
        }
        try {
            return this.f5274c.zzkk();
        } catch (RemoteException e) {
            aai.m1625b("Unable to get app mute state.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo12447a(Context context, String str) {
        C0926p.m1313a(this.f5274c != null, (Object) "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.f5274c.zzb(C0722b.m769a(context), str);
        } catch (RemoteException e) {
            aai.m1625b("Unable to open debug menu.", e);
        }
    }

    /* renamed from: d */
    public final String mo12453d() {
        try {
            this.f5274c.zzkl();
            return "";
        } catch (RemoteException e) {
            aai.m1625b("Unable to get version string.", e);
            return "";
        }
    }

    /* renamed from: a */
    public final void mo12449a(Class<? extends ahy> cls) {
        try {
            this.f5274c.zzau(cls.getCanonicalName());
        } catch (RemoteException e) {
            aai.m1625b("Unable to register RtbAdapter", e);
        }
    }

    private bto() {
    }
}
