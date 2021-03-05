package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ej */
public final class C1270ej extends C1245dm {

    /* renamed from: a */
    private final NativeCustomTemplateAd.OnCustomClickListener f5344a;

    public C1270ej(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f5344a = onCustomClickListener;
    }

    /* renamed from: a */
    public final void mo12502a(C1233da daVar, String str) {
        this.f5344a.onCustomClick(C1237de.m6723a(daVar), str);
    }
}
