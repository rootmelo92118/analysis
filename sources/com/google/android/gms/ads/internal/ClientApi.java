package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.C1198bt;
import com.google.android.gms.internal.ads.C1200bv;
import com.google.android.gms.internal.ads.C1214ci;
import com.google.android.gms.internal.ads.C1219cn;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.C1519np;
import com.google.android.gms.internal.ads.C1529nz;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1679tn;
import com.google.android.gms.internal.ads.C1688tw;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.brr;
import com.google.android.gms.internal.ads.brw;
import com.google.android.gms.internal.ads.bsi;
import com.google.android.gms.internal.ads.bso;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@Keep
@DynamiteApi
@C1598qn
@ParametersAreNonnullByDefault
public class ClientApi extends bsi {
    public C1529nz createInAppPurchaseManager(C0719a aVar) {
        return null;
    }

    @Nullable
    public C1688tw createRewardedVideoAdSku(C0719a aVar, int i) {
        return null;
    }

    @Nullable
    public bso getMobileAdsSettingsManager(C0719a aVar) {
        return null;
    }

    public brw createBannerAdManager(C0719a aVar, zzwf zzwf, String str, C1437ko koVar, int i) {
        Context context = (Context) C0722b.m770a(aVar);
        zzbv.zzlf();
        return new zzx(context, zzwf, str, koVar, new zzbbi(14300000, i, true, C1782xi.m8408l(context)), zzv.zzd(context));
    }

    public brw createSearchAdManager(C0719a aVar, zzwf zzwf, String str, int i) {
        Context context = (Context) C0722b.m770a(aVar);
        zzbv.zzlf();
        return new zzbp(context, zzwf, str, new zzbbi(14300000, i, true, C1782xi.m8408l(context)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.bre.m6321e().mo12778a(com.google.android.gms.internal.ads.C1557p.f5895aC)).booleanValue() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.bre.m6321e().mo12778a(com.google.android.gms.internal.ads.C1557p.f5896aD)).booleanValue() != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.brw createInterstitialAdManager(com.google.android.gms.p039a.C0719a r8, com.google.android.gms.internal.ads.zzwf r9, java.lang.String r10, com.google.android.gms.internal.ads.C1437ko r11, int r12) {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.p039a.C0722b.m770a((com.google.android.gms.p039a.C0719a) r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.C1557p.m7741a(r1)
            com.google.android.gms.internal.ads.zzbbi r5 = new com.google.android.gms.internal.ads.zzbbi
            com.google.android.gms.ads.internal.zzbv.zzlf()
            boolean r8 = com.google.android.gms.internal.ads.C1782xi.m8408l(r1)
            r0 = 1
            r2 = 14300000(0xda3360, float:2.0038568E-38)
            r5.<init>(r2, r12, r0, r8)
            java.lang.String r8 = "reward_mb"
            java.lang.String r12 = r9.f7292a
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0036
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.C1557p.f5895aC
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r12 = r2.mo12778a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x004c
        L_0x0036:
            if (r8 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.C1557p.f5896aD
            com.google.android.gms.internal.ads.m r12 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r8 = r12.mo12778a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.gv r8 = new com.google.android.gms.internal.ads.gv
            com.google.android.gms.ads.internal.zzv r9 = com.google.android.gms.ads.internal.zzv.zzd(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005d:
            com.google.android.gms.ads.internal.zzal r8 = new com.google.android.gms.ads.internal.zzal
            com.google.android.gms.ads.internal.zzv r6 = com.google.android.gms.ads.internal.zzv.zzd(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.a.a, com.google.android.gms.internal.ads.zzwf, java.lang.String, com.google.android.gms.internal.ads.ko, int):com.google.android.gms.internal.ads.brw");
    }

    public brr createAdLoaderBuilder(C0719a aVar, String str, C1437ko koVar, int i) {
        Context context = (Context) C0722b.m770a(aVar);
        zzbv.zzlf();
        return new zzak(context, str, koVar, new zzbbi(14300000, i, true, C1782xi.m8408l(context)), zzv.zzd(context));
    }

    public bso getMobileAdsSettingsManagerWithClientJarVersion(C0719a aVar, int i) {
        Context context = (Context) C0722b.m770a(aVar);
        zzbv.zzlf();
        return zzay.zza(context, new zzbbi(14300000, i, true, C1782xi.m8408l(context)));
    }

    public C1214ci createNativeAdViewDelegate(C0719a aVar, C0719a aVar2) {
        return new C1198bt((FrameLayout) C0722b.m770a(aVar), (FrameLayout) C0722b.m770a(aVar2));
    }

    public C1219cn createNativeAdViewHolderDelegate(C0719a aVar, C0719a aVar2, C0719a aVar3) {
        return new C1200bv((View) C0722b.m770a(aVar), (HashMap) C0722b.m770a(aVar2), (HashMap) C0722b.m770a(aVar3));
    }

    public C1688tw createRewardedVideoAd(C0719a aVar, C1437ko koVar, int i) {
        Context context = (Context) C0722b.m770a(aVar);
        zzbv.zzlf();
        return new C1679tn(context, zzv.zzd(context), koVar, new zzbbi(14300000, i, true, C1782xi.m8408l(context)));
    }

    public C1519np createAdOverlay(C0719a aVar) {
        Activity activity = (Activity) C0722b.m770a(aVar);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new zzr(activity);
        }
        switch (zzc.zzdsa) {
            case 1:
                return new zzq(activity);
            case 2:
                return new zzx(activity);
            case 3:
                return new zzy(activity);
            case 4:
                return new zzs(activity, zzc);
            default:
                return new zzr(activity);
        }
    }
}
