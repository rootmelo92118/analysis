package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.p039a.C0722b;
import java.util.HashMap;

final class brb extends brd<C1219cn> {

    /* renamed from: a */
    private final /* synthetic */ View f5163a;

    /* renamed from: b */
    private final /* synthetic */ HashMap f5164b;

    /* renamed from: c */
    private final /* synthetic */ HashMap f5165c;

    /* renamed from: d */
    private final /* synthetic */ bqt f5166d;

    brb(bqt bqt, View view, HashMap hashMap, HashMap hashMap2) {
        this.f5166d = bqt;
        this.f5163a = view;
        this.f5164b = hashMap;
        this.f5165c = hashMap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12322a() {
        bqt.m6273b(this.f5163a.getContext(), "native_ad_view_holder_delegate");
        return new bua();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12324b() {
        return this.f5166d.f5134h.mo12518a(this.f5163a, this.f5164b, this.f5165c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12323a(bsh bsh) {
        return bsh.createNativeAdViewHolderDelegate(C0722b.m769a(this.f5163a), C0722b.m769a(this.f5164b), C0722b.m769a(this.f5165c));
    }
}
