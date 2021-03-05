package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.C0696b;
import com.google.ads.mediation.C0704b;
import com.google.ads.mediation.C0713e;
import com.google.ads.mediation.C0716f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.lr */
public final class C1467lr<NETWORK_EXTRAS extends C0716f, SERVER_PARAMETERS extends C0713e> extends C1441ks {

    /* renamed from: a */
    private final C0704b<NETWORK_EXTRAS, SERVER_PARAMETERS> f5691a;

    /* renamed from: b */
    private final NETWORK_EXTRAS f5692b;

    public C1467lr(C0704b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f5691a = bVar;
        this.f5692b = network_extras;
    }

    /* renamed from: a */
    public final void mo12682a(C0719a aVar) {
    }

    /* renamed from: a */
    public final void mo12683a(C0719a aVar, C1718uz uzVar, List<String> list) {
    }

    /* renamed from: a */
    public final void mo12685a(C0719a aVar, zzwb zzwb, String str, C1718uz uzVar, String str2) {
    }

    /* renamed from: a */
    public final void mo12687a(C0719a aVar, zzwb zzwb, String str, String str2, C1443ku kuVar, zzacp zzacp, List<String> list) {
    }

    /* renamed from: a */
    public final void mo12690a(zzwb zzwb, String str) {
    }

    /* renamed from: a */
    public final void mo12691a(zzwb zzwb, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo12692a(boolean z) {
    }

    /* renamed from: f */
    public final void mo12697f() {
    }

    /* renamed from: g */
    public final boolean mo12698g() {
        return true;
    }

    /* renamed from: h */
    public final C1450la mo12699h() {
        return null;
    }

    /* renamed from: i */
    public final C1453ld mo12700i() {
        return null;
    }

    /* renamed from: m */
    public final boolean mo12704m() {
        return false;
    }

    /* renamed from: n */
    public final C1233da mo12705n() {
        return null;
    }

    /* renamed from: o */
    public final btb mo12706o() {
        return null;
    }

    /* renamed from: p */
    public final C1456lg mo12707p() {
        return null;
    }

    /* renamed from: a */
    public final C0719a mo12681a() {
        if (!(this.f5691a instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.f5691a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return C0722b.m769a(((MediationBannerAdapter) this.f5691a).getBannerView());
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
        C0696b bVar;
        if (!(this.f5691a instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.f5691a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5691a;
            C1468ls lsVar = new C1468ls(kuVar);
            Activity activity = (Activity) C0722b.m770a(aVar);
            C0713e a = m7529a(str, zzwb.f7277g, str2);
            int i = 0;
            C0696b[] bVarArr = {C0696b.f621a, C0696b.f622b, C0696b.f623c, C0696b.f624d, C0696b.f625e, C0696b.f626f};
            while (true) {
                if (i < 6) {
                    if (bVarArr[i].mo8342a() == zzwf.f7296e && bVarArr[i].mo8343b() == zzwf.f7293b) {
                        bVar = bVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    bVar = new C0696b(zzc.zza(zzwf.f7296e, zzwf.f7293b, zzwf.f7292a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(lsVar, activity, a, bVar, C1471lv.m7562a(zzwb, m7530a(zzwb)), this.f5692b);
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo12701j() {
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo12684a(C0719a aVar, zzwb zzwb, String str, C1443ku kuVar) {
        mo12686a(aVar, zzwb, str, (String) null, kuVar);
    }

    /* renamed from: a */
    public final void mo12686a(C0719a aVar, zzwb zzwb, String str, String str2, C1443ku kuVar) {
        if (!(this.f5691a instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.f5691a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5691a).requestInterstitialAd(new C1468ls(kuVar), (Activity) C0722b.m770a(aVar), m7529a(str, zzwb.f7277g, str2), C1471lv.m7562a(zzwb, m7530a(zzwb)), this.f5692b);
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo12702k() {
        return new Bundle();
    }

    /* renamed from: b */
    public final void mo12693b() {
        if (!(this.f5691a instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.f5691a.getClass().getCanonicalName());
            aai.m1630e(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        aai.m1624b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5691a).showInterstitial();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo12703l() {
        return new Bundle();
    }

    /* renamed from: c */
    public final void mo12694c() {
        try {
            this.f5691a.destroy();
        } catch (Throwable th) {
            aai.m1625b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo12695d() {
        throw new RemoteException();
    }

    /* renamed from: e */
    public final void mo12696e() {
        throw new RemoteException();
    }

    /* renamed from: a */
    private final SERVER_PARAMETERS m7529a(String str, int i, String str2) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                aai.m1625b("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f5691a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (C0713e) serverParametersType.newInstance();
        server_parameters.mo8394a(hashMap);
        return server_parameters;
    }

    /* renamed from: a */
    private static boolean m7530a(zzwb zzwb) {
        if (zzwb.f7276f) {
            return true;
        }
        bre.m6317a();
        return C1851zx.m8591a();
    }
}
