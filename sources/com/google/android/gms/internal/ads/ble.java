package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

public final class ble {

    /* renamed from: a */
    private final Handler f4649a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bld f4650b;

    public ble(Handler handler, bld bld) {
        this.f4649a = bld != null ? (Handler) bjy.m5688a(handler) : null;
        this.f4650b = bld;
    }

    /* renamed from: a */
    public final void mo12099a(bbv bbv) {
        if (this.f4650b != null) {
            this.f4649a.post(new blf(this, bbv));
        }
    }

    /* renamed from: a */
    public final void mo12101a(String str, long j, long j2) {
        if (this.f4650b != null) {
            this.f4649a.post(new blg(this, str, j, j2));
        }
    }

    /* renamed from: a */
    public final void mo12100a(zzfs zzfs) {
        if (this.f4650b != null) {
            this.f4649a.post(new blh(this, zzfs));
        }
    }

    /* renamed from: a */
    public final void mo12097a(int i, long j) {
        if (this.f4650b != null) {
            this.f4649a.post(new bli(this, i, j));
        }
    }

    /* renamed from: a */
    public final void mo12096a(int i, int i2, int i3, float f) {
        if (this.f4650b != null) {
            this.f4649a.post(new blk(this, i, i2, i3, f));
        }
    }

    /* renamed from: a */
    public final void mo12098a(Surface surface) {
        if (this.f4650b != null) {
            this.f4649a.post(new bll(this, surface));
        }
    }

    /* renamed from: b */
    public final void mo12102b(bbv bbv) {
        if (this.f4650b != null) {
            this.f4649a.post(new blm(this, bbv));
        }
    }
}
