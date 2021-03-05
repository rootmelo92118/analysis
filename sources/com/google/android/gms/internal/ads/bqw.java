package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.p039a.C0722b;

final class bqw extends brd<brw> {

    /* renamed from: a */
    private final /* synthetic */ Context f5142a;

    /* renamed from: b */
    private final /* synthetic */ zzwf f5143b;

    /* renamed from: c */
    private final /* synthetic */ String f5144c;

    /* renamed from: d */
    private final /* synthetic */ bqt f5145d;

    bqw(bqt bqt, Context context, zzwf zzwf, String str) {
        this.f5145d = bqt;
        this.f5142a = context;
        this.f5143b = zzwf;
        this.f5144c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5142a, "search");
        return new btw();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5145d.f5127a.mo12305a(this.f5142a, this.f5143b, this.f5144c, (C1437ko) null, 3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createSearchAdManager(C0722b.m769a(this.f5142a), this.f5143b, this.f5144c, 14300000);
    }
}
