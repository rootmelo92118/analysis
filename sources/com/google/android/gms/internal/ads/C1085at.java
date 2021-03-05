package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.at */
public final class C1085at extends C1211cf {

    /* renamed from: a */
    private final Drawable f2462a;

    /* renamed from: b */
    private final Uri f2463b;

    /* renamed from: c */
    private final double f2464c;

    public C1085at(Drawable drawable, Uri uri, double d) {
        this.f2462a = drawable;
        this.f2463b = uri;
        this.f2464c = d;
    }

    /* renamed from: a */
    public final C0719a mo11155a() {
        return C0722b.m769a(this.f2462a);
    }

    /* renamed from: b */
    public final Uri mo11156b() {
        return this.f2463b;
    }

    /* renamed from: c */
    public final double mo11157c() {
        return this.f2464c;
    }
}
