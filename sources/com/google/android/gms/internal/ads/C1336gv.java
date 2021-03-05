package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.p039a.C0719a;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.gv */
public final class C1336gv extends brx {

    /* renamed from: a */
    private final String f5412a;

    /* renamed from: b */
    private boolean f5413b;

    /* renamed from: c */
    private final C1299fl f5414c;
    @Nullable

    /* renamed from: d */
    private zzal f5415d;

    /* renamed from: e */
    private final C1328gn f5416e;

    private C1336gv(String str, C1299fl flVar) {
        this.f5412a = str;
        this.f5414c = flVar;
        this.f5416e = new C1328gn();
        zzbv.zzlt().mo12554a(flVar);
    }

    public final void setUserId(String str) {
    }

    public final void zzap(String str) {
    }

    public C1336gv(Context context, String str, C1437ko koVar, zzbbi zzbbi, zzv zzv) {
        this(str, new C1299fl(context, koVar, zzbbi, zzv));
    }

    @Nullable
    public final C0719a zzie() {
        if (this.f5415d != null) {
            return this.f5415d.zzie();
        }
        return null;
    }

    public final void destroy() {
        if (this.f5415d != null) {
            this.f5415d.destroy();
        }
    }

    public final boolean isReady() {
        return this.f5415d != null && this.f5415d.isReady();
    }

    public final boolean zzb(zzwb zzwb) {
        if (!C1331gq.m6917a(zzwb).contains("gw")) {
            m6956a();
        }
        if (C1331gq.m6917a(zzwb).contains("_skipMediation")) {
            m6956a();
        }
        if (zzwb.f7280j != null) {
            m6956a();
        }
        if (this.f5415d != null) {
            return this.f5415d.zzb(zzwb);
        }
        C1331gq zzlt = zzbv.zzlt();
        if (C1331gq.m6917a(zzwb).contains("_ad")) {
            zzlt.mo12555b(zzwb, this.f5412a);
        }
        C1334gt a = zzlt.mo12552a(zzwb, this.f5412a);
        if (a != null) {
            if (!a.f5403e) {
                a.mo12570a();
                C1335gu.m6945a().mo12575e();
            } else {
                C1335gu.m6945a().mo12574d();
            }
            this.f5415d = a.f5399a;
            a.f5401c.mo12538a(this.f5416e);
            this.f5416e.mo12550a(this.f5415d);
            return a.f5404f;
        }
        m6956a();
        C1335gu.m6945a().mo12575e();
        return this.f5415d.zzb(zzwb);
    }

    public final void pause() {
        if (this.f5415d != null) {
            this.f5415d.pause();
        }
    }

    public final void resume() {
        if (this.f5415d != null) {
            this.f5415d.resume();
        }
    }

    public final void zza(brl brl) {
        this.f5416e.f5382a = brl;
        if (this.f5415d != null) {
            this.f5416e.mo12550a(this.f5415d);
        }
    }

    public final void zza(C1695uc ucVar) {
        this.f5416e.f5387f = ucVar;
        if (this.f5415d != null) {
            this.f5416e.mo12550a(this.f5415d);
        }
    }

    public final void zza(bse bse) {
        this.f5416e.f5384c = bse;
        if (this.f5415d != null) {
            this.f5416e.mo12550a(this.f5415d);
        }
    }

    public final void zza(bsb bsb) {
        this.f5416e.f5383b = bsb;
        if (this.f5415d != null) {
            this.f5416e.mo12550a(this.f5415d);
        }
    }

    public final Bundle getAdMetadata() {
        if (this.f5415d != null) {
            return this.f5415d.getAdMetadata();
        }
        return new Bundle();
    }

    public final void showInterstitial() {
        if (this.f5415d != null) {
            this.f5415d.setImmersiveMode(this.f5413b);
            this.f5415d.showInterstitial();
            return;
        }
        C1772wz.m1630e("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() {
        if (this.f5415d != null) {
            this.f5415d.stopLoading();
        }
    }

    public final void zzih() {
        if (this.f5415d != null) {
            this.f5415d.zzih();
        } else {
            C1772wz.m1630e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Nullable
    public final zzwf zzif() {
        if (this.f5415d != null) {
            return this.f5415d.zzif();
        }
        return null;
    }

    public final void zza(zzwf zzwf) {
        if (this.f5415d != null) {
            this.f5415d.zza(zzwf);
        }
    }

    public final void zza(C1526nw nwVar) {
        C1772wz.m1630e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(C1534od odVar, String str) {
        C1772wz.m1630e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        if (this.f5415d != null) {
            return this.f5415d.getMediationAdapterClassName();
        }
        return null;
    }

    @Nullable
    public final String zzje() {
        if (this.f5415d != null) {
            return this.f5415d.zzje();
        }
        return null;
    }

    public final void zza(C1026aj ajVar) {
        this.f5416e.f5385d = ajVar;
        if (this.f5415d != null) {
            this.f5416e.mo12550a(this.f5415d);
        }
    }

    public final void zza(brh brh) {
        this.f5416e.f5386e = brh;
        if (this.f5415d != null) {
            this.f5416e.mo12550a(this.f5415d);
        }
    }

    public final void zza(bsk bsk) {
        m6956a();
        if (this.f5415d != null) {
            this.f5415d.zza(bsk);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        m6956a();
        if (this.f5415d != null) {
            this.f5415d.setManualImpressionsEnabled(z);
        }
    }

    public final boolean isLoading() {
        return this.f5415d != null && this.f5415d.isLoading();
    }

    public final btb getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final bse zzir() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final brl zzis() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void zza(zzzw zzzw) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void zza(zzyv zzyv) {
        throw new IllegalStateException("Unused method");
    }

    public final void setImmersiveMode(boolean z) {
        this.f5413b = z;
    }

    /* renamed from: a */
    private final void m6956a() {
        if (this.f5415d == null) {
            this.f5415d = this.f5414c.mo12535a(this.f5412a);
            this.f5416e.mo12550a(this.f5415d);
        }
    }
}
