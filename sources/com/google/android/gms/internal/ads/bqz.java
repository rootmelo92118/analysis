package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.p039a.C0722b;

final class bqz extends brd<bso> {

    /* renamed from: a */
    private final /* synthetic */ Context f5155a;

    /* renamed from: b */
    private final /* synthetic */ bqt f5156b;

    bqz(bqt bqt, Context context) {
        this.f5156b = bqt;
        this.f5155a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5155a, "mobile_ads_settings");
        return new bty();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5156b.f5129c.mo12455b(this.f5155a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.getMobileAdsSettingsManagerWithClientJarVersion(C0722b.m769a(this.f5155a), 14300000);
    }
}
