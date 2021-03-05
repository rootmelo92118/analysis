package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.p039a.C0722b;

final class bqu extends brd<brw> {

    /* renamed from: a */
    private final /* synthetic */ Context f5135a;

    /* renamed from: b */
    private final /* synthetic */ zzwf f5136b;

    /* renamed from: c */
    private final /* synthetic */ String f5137c;

    /* renamed from: d */
    private final /* synthetic */ C1437ko f5138d;

    /* renamed from: e */
    private final /* synthetic */ bqt f5139e;

    bqu(bqt bqt, Context context, zzwf zzwf, String str, C1437ko koVar) {
        this.f5139e = bqt;
        this.f5135a = context;
        this.f5136b = zzwf;
        this.f5137c = str;
        this.f5138d = koVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5135a, "banner");
        return new btw();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5139e.f5127a.mo12305a(this.f5135a, this.f5136b, this.f5137c, this.f5138d, 1);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createBannerAdManager(C0722b.m769a(this.f5135a), this.f5136b, this.f5137c, this.f5138d, 14300000);
    }
}
