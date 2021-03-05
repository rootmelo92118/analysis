package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.p039a.C0722b;

final class bqv extends brd<C1519np> {

    /* renamed from: a */
    private final /* synthetic */ Activity f5140a;

    /* renamed from: b */
    private final /* synthetic */ bqt f5141b;

    bqv(bqt bqt, Activity activity) {
        this.f5141b = bqt;
        this.f5140a = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5140a, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5141b.f5133g.mo12839a(this.f5140a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createAdOverlay(C0722b.m769a(this.f5140a));
    }
}
