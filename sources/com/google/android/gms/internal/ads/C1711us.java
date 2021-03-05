package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.us */
public final class C1711us extends C1721vb {

    /* renamed from: a */
    private volatile C1709uq f6606a;

    /* renamed from: b */
    private volatile C1712ut f6607b;

    /* renamed from: c */
    private volatile C1710ur f6608c;

    /* renamed from: d */
    private volatile C1716ux f6609d;

    public C1711us(C1710ur urVar) {
        this.f6608c = urVar;
    }

    /* renamed from: a */
    public final void mo13032a(C1709uq uqVar) {
        this.f6606a = uqVar;
    }

    /* renamed from: a */
    public final void mo13033a(C1712ut utVar) {
        this.f6607b = utVar;
    }

    /* renamed from: a */
    public final void mo13034a(C1716ux uxVar) {
        this.f6609d = uxVar;
    }

    /* renamed from: a */
    public final void mo13029a(C0719a aVar) {
        if (this.f6606a != null) {
            this.f6606a.mo13020d();
        }
    }

    /* renamed from: a */
    public final void mo13030a(C0719a aVar, int i) {
        if (this.f6606a != null) {
            this.f6606a.mo13013a(i);
        }
    }

    /* renamed from: b */
    public final void mo13035b(C0719a aVar) {
        if (this.f6607b != null) {
            this.f6607b.mo13016a(C0722b.m770a(aVar).getClass().getName());
        }
    }

    /* renamed from: c */
    public final void mo13037c(C0719a aVar) {
        if (this.f6608c != null) {
            this.f6608c.onRewardedVideoAdOpened();
        }
    }

    /* renamed from: d */
    public final void mo13038d(C0719a aVar) {
        if (this.f6608c != null) {
            this.f6608c.onRewardedVideoStarted();
        }
    }

    /* renamed from: e */
    public final void mo13039e(C0719a aVar) {
        if (this.f6608c != null) {
            this.f6608c.onRewardedVideoAdClosed();
        }
    }

    /* renamed from: a */
    public final void mo13031a(C0719a aVar, zzawd zzawd) {
        if (this.f6608c != null) {
            this.f6608c.zzc(zzawd);
        }
    }

    /* renamed from: f */
    public final void mo13040f(C0719a aVar) {
        if (this.f6608c != null) {
            this.f6608c.zzkh();
        }
    }

    /* renamed from: b */
    public final void mo13036b(C0719a aVar, int i) {
        if (this.f6607b != null) {
            this.f6607b.mo13017a(C0722b.m770a(aVar).getClass().getName(), i);
        }
    }

    /* renamed from: g */
    public final void mo13041g(C0719a aVar) {
        if (this.f6608c != null) {
            this.f6608c.onRewardedVideoAdLeftApplication();
        }
    }

    /* renamed from: h */
    public final void mo13042h(C0719a aVar) {
        if (this.f6608c != null) {
            this.f6608c.onRewardedVideoCompleted();
        }
    }

    /* renamed from: a */
    public final void mo13028a(Bundle bundle) {
        if (this.f6609d != null) {
            this.f6609d.mo13014a(bundle);
        }
    }
}
