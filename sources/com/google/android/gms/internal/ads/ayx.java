package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

public final class ayx extends aza {

    /* renamed from: d */
    private final View f3136d;

    public ayx(axq axq, String str, String str2, akd akd, int i, int i2, View view) {
        super(axq, str, str2, akd, i, 57);
        this.f3136d = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11418a() {
        if (this.f3136d != null) {
            DisplayMetrics displayMetrics = this.f3147a.mo11370a().getResources().getDisplayMetrics();
            axy axy = new axy((String) this.f3149c.invoke((Object) null, new Object[]{this.f3136d, displayMetrics}));
            amf amf = new amf();
            amf.f2040a = axy.f3084a;
            amf.f2041b = axy.f3085b;
            amf.f2042c = axy.f3086c;
            this.f3148b.f1893M = amf;
        }
    }
}
