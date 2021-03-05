package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sg */
final class C1645sg implements abv<C1392ix> {

    /* renamed from: a */
    private final /* synthetic */ C1644sf f6387a;

    C1645sg(C1644sf sfVar) {
        this.f6387a = sfVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10096a(Object obj) {
        try {
            ((C1392ix) obj).mo10448b("AFMA_getAdapterLessMediationAd", this.f6387a.f6384a);
        } catch (Exception e) {
            C1772wz.m1625b("Error requesting an ad url", e);
            C1642sd.f6374f.zzbv(this.f6387a.f6385b);
        }
    }
}
