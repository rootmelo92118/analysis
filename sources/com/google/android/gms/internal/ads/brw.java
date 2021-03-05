package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.p039a.C0719a;

public interface brw extends IInterface {
    void destroy();

    Bundle getAdMetadata();

    String getAdUnitId();

    String getMediationAdapterClassName();

    btb getVideoController();

    boolean isLoading();

    boolean isReady();

    void pause();

    void resume();

    void setImmersiveMode(boolean z);

    void setManualImpressionsEnabled(boolean z);

    void setUserId(String str);

    void showInterstitial();

    void stopLoading();

    void zza(C1026aj ajVar);

    void zza(brh brh);

    void zza(brl brl);

    void zza(bsb bsb);

    void zza(bse bse);

    void zza(bsk bsk);

    void zza(C1526nw nwVar);

    void zza(C1534od odVar, String str);

    void zza(C1695uc ucVar);

    void zza(zzwf zzwf);

    void zza(zzyv zzyv);

    void zza(zzzw zzzw);

    void zzap(String str);

    boolean zzb(zzwb zzwb);

    C0719a zzie();

    zzwf zzif();

    void zzih();

    bse zzir();

    brl zzis();

    String zzje();
}
