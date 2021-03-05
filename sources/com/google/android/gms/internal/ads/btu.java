package com.google.android.gms.internal.ads;

final class btu extends brp {

    /* renamed from: a */
    final /* synthetic */ bts f5279a;

    private btu(bts bts) {
        this.f5279a = bts;
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final String zzje() {
        return null;
    }

    public final void zzd(zzwb zzwb) {
        zza(zzwb, 1);
    }

    public final void zza(zzwb zzwb, int i) {
        aai.m1626c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C1851zx.f6962a.post(new btv(this));
    }
}
