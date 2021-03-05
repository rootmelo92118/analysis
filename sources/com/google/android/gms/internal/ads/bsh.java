package com.google.android.gms.internal.ads;

import android.os.IInterface;
import com.google.android.gms.p039a.C0719a;

public interface bsh extends IInterface {
    brr createAdLoaderBuilder(C0719a aVar, String str, C1437ko koVar, int i);

    C1519np createAdOverlay(C0719a aVar);

    brw createBannerAdManager(C0719a aVar, zzwf zzwf, String str, C1437ko koVar, int i);

    C1529nz createInAppPurchaseManager(C0719a aVar);

    brw createInterstitialAdManager(C0719a aVar, zzwf zzwf, String str, C1437ko koVar, int i);

    C1214ci createNativeAdViewDelegate(C0719a aVar, C0719a aVar2);

    C1219cn createNativeAdViewHolderDelegate(C0719a aVar, C0719a aVar2, C0719a aVar3);

    C1688tw createRewardedVideoAd(C0719a aVar, C1437ko koVar, int i);

    C1688tw createRewardedVideoAdSku(C0719a aVar, int i);

    brw createSearchAdManager(C0719a aVar, zzwf zzwf, String str, int i);

    bso getMobileAdsSettingsManager(C0719a aVar);

    bso getMobileAdsSettingsManagerWithClientJarVersion(C0719a aVar, int i);
}
