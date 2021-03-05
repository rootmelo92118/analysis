package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.lm */
public final class C1462lm extends C1441ks {

    /* renamed from: a */
    private final MediationAdapter f5673a;

    /* renamed from: b */
    private C1463ln f5674b;

    public C1462lm(@NonNull MediationAdapter mediationAdapter) {
        this.f5673a = mediationAdapter;
    }

    /* renamed from: a */
    public final C0719a mo12681a() {
        if (!(this.f5673a instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return C0722b.m769a(((MediationBannerAdapter) this.f5673a).getBannerView());
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12688a(C0719a aVar, zzwf zzwf, zzwb zzwb, String str, C1443ku kuVar) {
        mo12689a(aVar, zzwf, zzwb, str, (String) null, kuVar);
    }

    /* renamed from: a */
    public final void mo12689a(C0719a aVar, zzwf zzwf, zzwb zzwb, String str, String str2, C1443ku kuVar) {
        Date date;
        zzwf zzwf2 = zzwf;
        zzwb zzwb2 = zzwb;
        if (!(this.f5673a instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5673a;
            Bundle bundle = null;
            HashSet hashSet = zzwb2.f7275e != null ? new HashSet(zzwb2.f7275e) : null;
            if (zzwb2.f7272b == -1) {
                date = null;
            } else {
                date = new Date(zzwb2.f7272b);
            }
            C1461ll llVar = new C1461ll(date, zzwb2.f7274d, hashSet, zzwb2.f7281k, m7457a(zzwb), zzwb2.f7277g, zzwb2.f7288r);
            if (zzwb2.f7283m != null) {
                bundle = zzwb2.f7283m.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) C0722b.m770a(aVar), new C1463ln(kuVar), m7456a(str, zzwb2, str2), zzc.zza(zzwf2.f7296e, zzwf2.f7293b, zzwf2.f7292a), llVar, bundle);
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo12701j() {
        if (this.f5673a instanceof zzbix) {
            return ((zzbix) this.f5673a).zzuw();
        }
        String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
        aai.m1630e(valueOf.length() != 0 ? "Not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("Not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo12684a(C0719a aVar, zzwb zzwb, String str, C1443ku kuVar) {
        mo12686a(aVar, zzwb, str, (String) null, kuVar);
    }

    /* renamed from: a */
    public final void mo12686a(C0719a aVar, zzwb zzwb, String str, String str2, C1443ku kuVar) {
        Date date;
        zzwb zzwb2 = zzwb;
        if (!(this.f5673a instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f5673a;
            Bundle bundle = null;
            HashSet hashSet = zzwb2.f7275e != null ? new HashSet(zzwb2.f7275e) : null;
            if (zzwb2.f7272b == -1) {
                date = null;
            } else {
                date = new Date(zzwb2.f7272b);
            }
            C1461ll llVar = new C1461ll(date, zzwb2.f7274d, hashSet, zzwb2.f7281k, m7457a(zzwb), zzwb2.f7277g, zzwb2.f7288r);
            if (zzwb2.f7283m != null) {
                bundle = zzwb2.f7283m.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) C0722b.m770a(aVar), new C1463ln(kuVar), m7456a(str, zzwb2, str2), llVar, bundle);
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo12702k() {
        if (this.f5673a instanceof zzbiy) {
            return ((zzbiy) this.f5673a).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
        aai.m1630e(valueOf.length() != 0 ? "Not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo12687a(C0719a aVar, zzwb zzwb, String str, String str2, C1443ku kuVar, zzacp zzacp, List<String> list) {
        Date date;
        zzwb zzwb2 = zzwb;
        if (!(this.f5673a instanceof MediationNativeAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationNativeAdapter: ".concat(valueOf) : new String("Not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f5673a;
            Bundle bundle = null;
            HashSet hashSet = zzwb2.f7275e != null ? new HashSet(zzwb2.f7275e) : null;
            if (zzwb2.f7272b == -1) {
                date = null;
            } else {
                date = new Date(zzwb2.f7272b);
            }
            C1466lq lqVar = new C1466lq(date, zzwb2.f7274d, hashSet, zzwb2.f7281k, m7457a(zzwb), zzwb2.f7277g, zzacp, list, zzwb2.f7288r);
            if (zzwb2.f7283m != null) {
                bundle = zzwb2.f7283m.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.f5674b = new C1463ln(kuVar);
            mediationNativeAdapter.requestNativeAd((Context) C0722b.m770a(aVar), this.f5674b, m7456a(str, zzwb2, str2), lqVar, bundle);
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo12703l() {
        return new Bundle();
    }

    /* renamed from: h */
    public final C1450la mo12699h() {
        NativeAdMapper a = this.f5674b.mo12772a();
        if (a instanceof NativeAppInstallAdMapper) {
            return new C1464lo((NativeAppInstallAdMapper) a);
        }
        return null;
    }

    /* renamed from: p */
    public final C1456lg mo12707p() {
        UnifiedNativeAdMapper b = this.f5674b.mo12773b();
        if (b != null) {
            return new C1473lx(b);
        }
        return null;
    }

    /* renamed from: i */
    public final C1453ld mo12700i() {
        NativeAdMapper a = this.f5674b.mo12772a();
        if (a instanceof NativeContentAdMapper) {
            return new C1465lp((NativeContentAdMapper) a);
        }
        return null;
    }

    /* renamed from: n */
    public final C1233da mo12705n() {
        NativeCustomTemplateAd c = this.f5674b.mo12774c();
        if (c instanceof C1237de) {
            return ((C1237de) c).mo12499a();
        }
        return null;
    }

    /* renamed from: m */
    public final boolean mo12704m() {
        return this.f5673a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: a */
    public final void mo12685a(C0719a aVar, zzwb zzwb, String str, C1718uz uzVar, String str2) {
        Bundle bundle;
        C1461ll llVar;
        Date date;
        zzwb zzwb2 = zzwb;
        if (!(this.f5673a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5673a;
            Bundle a = m7456a(str2, zzwb2, (String) null);
            if (zzwb2 != null) {
                HashSet hashSet = zzwb2.f7275e != null ? new HashSet(zzwb2.f7275e) : null;
                if (zzwb2.f7272b == -1) {
                    date = null;
                } else {
                    date = new Date(zzwb2.f7272b);
                }
                C1461ll llVar2 = new C1461ll(date, zzwb2.f7274d, hashSet, zzwb2.f7281k, m7457a(zzwb), zzwb2.f7277g, zzwb2.f7288r);
                bundle = zzwb2.f7283m != null ? zzwb2.f7283m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                llVar = llVar2;
            } else {
                llVar = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) C0722b.m770a(aVar), llVar, str, new C1723vd(uzVar), a, bundle);
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12683a(C0719a aVar, C1718uz uzVar, List<String> list) {
        if (!(this.f5673a instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not an InitializableMediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f5673a;
            ArrayList arrayList = new ArrayList();
            for (String a : list) {
                arrayList.add(m7456a(a, (zzwb) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) C0722b.m770a(aVar), new C1723vd(uzVar), arrayList);
        } catch (Throwable th) {
            aai.m1627c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12690a(zzwb zzwb, String str) {
        mo12691a(zzwb, str, (String) null);
    }

    /* renamed from: a */
    public final void mo12691a(zzwb zzwb, String str, String str2) {
        Date date;
        if (!(this.f5673a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5673a;
            Bundle bundle = null;
            HashSet hashSet = zzwb.f7275e != null ? new HashSet(zzwb.f7275e) : null;
            if (zzwb.f7272b == -1) {
                date = null;
            } else {
                date = new Date(zzwb.f7272b);
            }
            C1461ll llVar = new C1461ll(date, zzwb.f7274d, hashSet, zzwb.f7281k, m7457a(zzwb), zzwb.f7277g, zzwb.f7288r);
            if (zzwb.f7283m != null) {
                bundle = zzwb.f7283m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            mediationRewardedVideoAdAdapter.loadAd(llVar, m7456a(str, zzwb, str2), bundle);
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo12697f() {
        if (!(this.f5673a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.f5673a).showVideo();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public final boolean mo12698g() {
        if (!(this.f5673a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.f5673a).isInitialized();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12692a(boolean z) {
        if (!(this.f5673a instanceof OnImmersiveModeUpdatedListener)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1628d(valueOf.length() != 0 ? "Not an OnImmersiveModeUpdatedListener: ".concat(valueOf) : new String("Not an OnImmersiveModeUpdatedListener: "));
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) this.f5673a).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            aai.m1625b("", th);
        }
    }

    /* renamed from: o */
    public final btb mo12706o() {
        if (!(this.f5673a instanceof zzb)) {
            return null;
        }
        try {
            return ((zzb) this.f5673a).getVideoController();
        } catch (Throwable th) {
            aai.m1625b("", th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo12693b() {
        if (!(this.f5673a instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.f5673a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5673a).showInterstitial();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo12694c() {
        try {
            this.f5673a.onDestroy();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo12695d() {
        try {
            this.f5673a.onPause();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: e */
    public final void mo12696e() {
        try {
            this.f5673a.onResume();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12682a(C0719a aVar) {
        Context context = (Context) C0722b.m770a(aVar);
        if (this.f5673a instanceof OnContextChangedListener) {
            ((OnContextChangedListener) this.f5673a).onContextChanged(context);
        }
    }

    /* renamed from: a */
    private final Bundle m7456a(String str, zzwb zzwb, String str2) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        aai.m1630e(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f5673a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzwb != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzwb.f7277g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m7457a(zzwb zzwb) {
        if (zzwb.f7276f) {
            return true;
        }
        bre.m6317a();
        return C1851zx.m8591a();
    }
}
