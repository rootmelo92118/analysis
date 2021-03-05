package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class bas {

    /* renamed from: a */
    private final Handler f3305a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bar f3306b;

    public bas(Handler handler, bar bar) {
        this.f3305a = bar != null ? (Handler) bjy.m5688a(handler) : null;
        this.f3306b = bar;
    }

    /* renamed from: a */
    public final void mo11556a(bbv bbv) {
        if (this.f3306b != null) {
            this.f3305a.post(new bat(this, bbv));
        }
    }

    /* renamed from: a */
    public final void mo11558a(String str, long j, long j2) {
        if (this.f3306b != null) {
            this.f3305a.post(new bau(this, str, j, j2));
        }
    }

    /* renamed from: a */
    public final void mo11557a(zzfs zzfs) {
        if (this.f3306b != null) {
            this.f3305a.post(new bav(this, zzfs));
        }
    }

    /* renamed from: a */
    public final void mo11555a(int i, long j, long j2) {
        if (this.f3306b != null) {
            this.f3305a.post(new baw(this, i, j, j2));
        }
    }

    /* renamed from: b */
    public final void mo11559b(bbv bbv) {
        if (this.f3306b != null) {
            this.f3305a.post(new bax(this, bbv));
        }
    }

    /* renamed from: a */
    public final void mo11554a(int i) {
        if (this.f3306b != null) {
            this.f3305a.post(new bay(this, i));
        }
    }
}
