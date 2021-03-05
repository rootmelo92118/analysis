package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.p039a.C0722b;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.af */
public final class C1022af implements CustomRenderedAd {

    /* renamed from: a */
    private final C1023ag f1569a;

    public C1022af(C1023ag agVar) {
        this.f1569a = agVar;
    }

    public final String getBaseUrl() {
        try {
            return this.f1569a.mo10260a();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.f1569a.mo10262b();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.f1569a.mo10261a(view != null ? C0722b.m769a(view) : null);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void recordClick() {
        try {
            this.f1569a.mo10263c();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f1569a.mo10264d();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
