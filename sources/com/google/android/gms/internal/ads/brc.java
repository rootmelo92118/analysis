package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.p039a.C0722b;

final class brc extends brd<C1688tw> {

    /* renamed from: a */
    private final /* synthetic */ Context f5167a;

    /* renamed from: b */
    private final /* synthetic */ C1437ko f5168b;

    /* renamed from: c */
    private final /* synthetic */ bqt f5169c;

    brc(bqt bqt, Context context, C1437ko koVar) {
        this.f5169c = bqt;
        this.f5167a = context;
        this.f5168b = koVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5167a, "rewarded_video");
        return new bub();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5169c.f5131e.mo13007a(this.f5167a, this.f5168b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createRewardedVideoAd(C0722b.m769a(this.f5167a), this.f5168b, 14300000);
    }
}
