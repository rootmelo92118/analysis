package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* renamed from: com.google.android.gms.internal.ads.mr */
final class C1494mr implements ahu<UnifiedNativeAdMapper, Object> {

    /* renamed from: a */
    private final /* synthetic */ C1480md f5725a;

    /* renamed from: b */
    private final /* synthetic */ C1443ku f5726b;

    C1494mr(C1490mn mnVar, C1480md mdVar, C1443ku kuVar) {
        this.f5725a = mdVar;
        this.f5726b = kuVar;
    }

    /* renamed from: a */
    public final void mo10568a(String str) {
        try {
            this.f5725a.mo12784a(str);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }
}
