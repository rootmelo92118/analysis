package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C0926p;

@C1598qn
public final class act {

    /* renamed from: a */
    private final Context f1356a;

    /* renamed from: b */
    private final adc f1357b;

    /* renamed from: c */
    private final ViewGroup f1358c;

    /* renamed from: d */
    private zzbdk f1359d;

    public act(Context context, ViewGroup viewGroup, afl afl) {
        this(context, viewGroup, afl, (zzbdk) null);
    }

    private act(Context context, ViewGroup viewGroup, adc adc, zzbdk zzbdk) {
        this.f1356a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f1358c = viewGroup;
        this.f1357b = adc;
        this.f1359d = null;
    }

    /* renamed from: a */
    public final void mo10134a(int i, int i2, int i3, int i4) {
        C0926p.m1315b("The underlay may only be modified from the UI thread.");
        if (this.f1359d != null) {
            this.f1359d.mo13357a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo10135a(int i, int i2, int i3, int i4, int i5, boolean z, adb adb) {
        if (this.f1359d == null) {
            C1719v.m8118a(this.f1357b.mo10179h().mo10053a(), this.f1357b.mo10173c(), "vpr2");
            this.f1359d = new zzbdk(this.f1356a, this.f1357b, i5, z, this.f1357b.mo10179h().mo10053a(), adb);
            this.f1358c.addView(this.f1359d, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            this.f1359d.mo13357a(i, i2, i3, i4);
            this.f1357b.mo10170a(false);
        }
    }

    /* renamed from: a */
    public final zzbdk mo10133a() {
        C0926p.m1315b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f1359d;
    }

    /* renamed from: b */
    public final void mo10136b() {
        C0926p.m1315b("onPause must be called from the UI thread.");
        if (this.f1359d != null) {
            this.f1359d.mo13367i();
        }
    }

    /* renamed from: c */
    public final void mo10137c() {
        C0926p.m1315b("onDestroy must be called from the UI thread.");
        if (this.f1359d != null) {
            this.f1359d.mo13372n();
            this.f1358c.removeView(this.f1359d);
            this.f1359d = null;
        }
    }
}
