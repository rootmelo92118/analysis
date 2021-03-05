package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.p039a.C0722b;

final class bra extends brd<C1214ci> {

    /* renamed from: a */
    private final /* synthetic */ FrameLayout f5159a;

    /* renamed from: b */
    private final /* synthetic */ FrameLayout f5160b;

    /* renamed from: c */
    private final /* synthetic */ Context f5161c;

    /* renamed from: d */
    private final /* synthetic */ bqt f5162d;

    bra(bqt bqt, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f5162d = bqt;
        this.f5159a = frameLayout;
        this.f5160b = frameLayout2;
        this.f5161c = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5161c, "native_ad_view_delegate");
        return new btz();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5162d.f5130d.mo12517a(this.f5161c, this.f5159a, this.f5160b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createNativeAdViewDelegate(C0722b.m769a(this.f5159a), C0722b.m769a(this.f5160b));
    }
}
