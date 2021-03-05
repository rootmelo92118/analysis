package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zl */
public final class C1839zl extends C1768wv {

    /* renamed from: a */
    private final aam f6935a;

    /* renamed from: b */
    private final String f6936b;

    public C1839zl(Context context, String str, String str2) {
        this(str2, zzbv.zzlf().mo13207b(context, str));
    }

    public final void onStop() {
    }

    private C1839zl(String str, String str2) {
        this.f6935a = new aam(str2);
        this.f6936b = str;
    }

    public final void zzki() {
        this.f6935a.mo10027a(this.f6936b);
    }
}
