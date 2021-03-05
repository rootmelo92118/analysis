package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.p039a.C0722b;

final class bqy extends brd<brr> {

    /* renamed from: a */
    private final /* synthetic */ Context f5151a;

    /* renamed from: b */
    private final /* synthetic */ String f5152b;

    /* renamed from: c */
    private final /* synthetic */ C1437ko f5153c;

    /* renamed from: d */
    private final /* synthetic */ bqt f5154d;

    bqy(bqt bqt, Context context, String str, C1437ko koVar) {
        this.f5154d = bqt;
        this.f5151a = context;
        this.f5152b = str;
        this.f5153c = koVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5151a, "native_ad");
        return new bts();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5154d.f5128b.mo12304a(this.f5151a, this.f5152b, this.f5153c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createAdLoaderBuilder(C0722b.m769a(this.f5151a), this.f5152b, this.f5153c, 14300000);
    }
}
