package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.C0693a;
import com.google.ads.mediation.C0705c;
import com.google.ads.mediation.C0712d;
import com.google.ads.mediation.C0713e;
import com.google.ads.mediation.C0716f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ls */
public final class C1468ls<NETWORK_EXTRAS extends C0716f, SERVER_PARAMETERS extends C0713e> implements C0705c, C0712d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1443ku f5693a;

    public C1468ls(C1443ku kuVar) {
        this.f5693a = kuVar;
    }

    /* renamed from: a */
    public final void mo8386a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C0693a.C0694a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        aai.m1624b(sb.toString());
        bre.m6317a();
        if (!C1851zx.m8595b()) {
            aai.m1629d("#008 Must be called on the main UI thread.", (Throwable) null);
            C1851zx.f6962a.post(new C1469lt(this, aVar));
            return;
        }
        try {
            this.f5693a.mo12651a(C1471lv.m7561a(aVar));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo8393a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C0693a.C0694a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        aai.m1624b(sb.toString());
        bre.m6317a();
        if (!C1851zx.m8595b()) {
            aai.m1629d("#008 Must be called on the main UI thread.", (Throwable) null);
            C1851zx.f6962a.post(new C1470lu(this, aVar));
            return;
        }
        try {
            this.f5693a.mo12651a(C1471lv.m7561a(aVar));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
