package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

public abstract class bsi extends azd implements bsh {
    public bsi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static bsh asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        if (queryLocalInterface instanceof bsh) {
            return (bsh) queryLocalInterface;
        }
        return new bsj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                brw createBannerAdManager = createBannerAdManager(C0719a.C0720a.m768a(parcel.readStrongBinder()), (zzwf) aze.m4501a(parcel, zzwf.CREATOR), parcel.readString(), C1438kp.m7213a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createBannerAdManager);
                return true;
            case 2:
                brw createInterstitialAdManager = createInterstitialAdManager(C0719a.C0720a.m768a(parcel.readStrongBinder()), (zzwf) aze.m4501a(parcel, zzwf.CREATOR), parcel.readString(), C1438kp.m7213a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createInterstitialAdManager);
                return true;
            case 3:
                brr createAdLoaderBuilder = createAdLoaderBuilder(C0719a.C0720a.m768a(parcel.readStrongBinder()), parcel.readString(), C1438kp.m7213a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createAdLoaderBuilder);
                return true;
            case 4:
                bso mobileAdsSettingsManager = getMobileAdsSettingsManager(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) mobileAdsSettingsManager);
                return true;
            case 5:
                C1214ci createNativeAdViewDelegate = createNativeAdViewDelegate(C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createNativeAdViewDelegate);
                return true;
            case 6:
                C1688tw createRewardedVideoAd = createRewardedVideoAd(C0719a.C0720a.m768a(parcel.readStrongBinder()), C1438kp.m7213a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createRewardedVideoAd);
                return true;
            case 7:
                C1529nz createInAppPurchaseManager = createInAppPurchaseManager(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createInAppPurchaseManager);
                return true;
            case 8:
                C1519np createAdOverlay = createAdOverlay(C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createAdOverlay);
                return true;
            case 9:
                bso mobileAdsSettingsManagerWithClientJarVersion = getMobileAdsSettingsManagerWithClientJarVersion(C0719a.C0720a.m768a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) mobileAdsSettingsManagerWithClientJarVersion);
                return true;
            case 10:
                brw createSearchAdManager = createSearchAdManager(C0719a.C0720a.m768a(parcel.readStrongBinder()), (zzwf) aze.m4501a(parcel, zzwf.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createSearchAdManager);
                return true;
            case 11:
                C1219cn createNativeAdViewHolderDelegate = createNativeAdViewHolderDelegate(C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()), C0719a.C0720a.m768a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createNativeAdViewHolderDelegate);
                return true;
            case 12:
                C1688tw createRewardedVideoAdSku = createRewardedVideoAdSku(C0719a.C0720a.m768a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                aze.m4502a(parcel2, (IInterface) createRewardedVideoAdSku);
                return true;
            default:
                return false;
        }
    }
}
