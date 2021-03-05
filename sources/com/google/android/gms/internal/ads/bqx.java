package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.p039a.C0722b;

final class bqx extends brd<brw> {

    /* renamed from: a */
    private final /* synthetic */ Context f5146a;

    /* renamed from: b */
    private final /* synthetic */ zzwf f5147b;

    /* renamed from: c */
    private final /* synthetic */ String f5148c;

    /* renamed from: d */
    private final /* synthetic */ C1437ko f5149d;

    /* renamed from: e */
    private final /* synthetic */ bqt f5150e;

    bqx(bqt bqt, Context context, zzwf zzwf, String str, C1437ko koVar) {
        this.f5150e = bqt;
        this.f5146a = context;
        this.f5147b = zzwf;
        this.f5148c = str;
        this.f5149d = koVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5146a, "interstitial");
        return new btw();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5150e.f5127a.mo12305a(this.f5146a, this.f5147b, this.f5148c, this.f5149d, 2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createInterstitialAdManager(C0722b.m769a(this.f5146a), this.f5147b, this.f5148c, this.f5149d, 14300000);
    }
}
