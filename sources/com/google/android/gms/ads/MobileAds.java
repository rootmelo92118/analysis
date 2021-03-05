package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.ahy;
import com.google.android.gms.internal.ads.bto;
import com.google.android.gms.internal.ads.btq;

public class MobileAds {
    @RequiresPermission("android.permission.INTERNET")
    public static void initialize(Context context, String str) {
        initialize(context, str, (Settings) null);
    }

    @RequiresPermission("android.permission.INTERNET")
    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        btq btq;
        bto a = bto.m6521a();
        if (settings == null) {
            btq = null;
        } else {
            btq = settings.zzbb();
        }
        a.mo12448a(context, str, btq);
    }

    public static final class Settings {
        private final btq zzvz = new btq();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        /* access modifiers changed from: package-private */
        public final btq zzbb() {
            return this.zzvz;
        }
    }

    public static void initialize(Context context) {
        initialize(context, (String) null, (Settings) null);
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return bto.m6521a().mo12445a(context);
    }

    public static void setAppVolume(float f) {
        bto.m6521a().mo12446a(f);
    }

    public static void setAppMuted(boolean z) {
        bto.m6521a().mo12450a(z);
    }

    public static void openDebugMenu(Context context, String str) {
        bto.m6521a().mo12447a(context, str);
    }

    public static void getVersionString() {
        bto.m6521a().mo12453d();
    }

    public static void registerRtbAdapter(Class<? extends ahy> cls) {
        bto.m6521a().mo12449a(cls);
    }

    private MobileAds() {
    }
}
