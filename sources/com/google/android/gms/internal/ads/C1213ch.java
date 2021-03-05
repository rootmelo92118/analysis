package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ch */
public final class C1213ch extends NativeAd.Image {

    /* renamed from: a */
    private final C1210ce f5307a;

    /* renamed from: b */
    private final Drawable f5308b;

    /* renamed from: c */
    private final Uri f5309c;

    /* renamed from: d */
    private final double f5310d;

    public C1213ch(C1210ce ceVar) {
        Drawable drawable;
        this.f5307a = ceVar;
        Uri uri = null;
        try {
            C0719a a = this.f5307a.mo11155a();
            if (a != null) {
                drawable = (Drawable) C0722b.m770a(a);
                this.f5308b = drawable;
                uri = this.f5307a.mo11156b();
                this.f5309c = uri;
                double d = 1.0d;
                d = this.f5307a.mo11157c();
                this.f5310d = d;
            }
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
        drawable = null;
        this.f5308b = drawable;
        try {
            uri = this.f5307a.mo11156b();
        } catch (RemoteException e2) {
            aai.m1625b("", e2);
        }
        this.f5309c = uri;
        double d2 = 1.0d;
        try {
            d2 = this.f5307a.mo11157c();
        } catch (RemoteException e3) {
            aai.m1625b("", e3);
        }
        this.f5310d = d2;
    }

    public final Drawable getDrawable() {
        return this.f5308b;
    }

    public final Uri getUri() {
        return this.f5309c;
    }

    public final double getScale() {
        return this.f5310d;
    }
}
