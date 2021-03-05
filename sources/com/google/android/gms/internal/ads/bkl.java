package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class bkl implements bkc {

    /* renamed from: a */
    private boolean f4566a;

    /* renamed from: b */
    private long f4567b;

    /* renamed from: c */
    private long f4568c;

    /* renamed from: d */
    private bae f4569d = bae.f3272a;

    /* renamed from: a */
    public final void mo12076a() {
        if (!this.f4566a) {
            this.f4568c = SystemClock.elapsedRealtime();
            this.f4566a = true;
        }
    }

    /* renamed from: b */
    public final void mo12079b() {
        if (this.f4566a) {
            mo12077a(mo11631w());
            this.f4566a = false;
        }
    }

    /* renamed from: a */
    public final void mo12077a(long j) {
        this.f4567b = j;
        if (this.f4566a) {
            this.f4568c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final void mo12078a(bkc bkc) {
        mo12077a(bkc.mo11631w());
        this.f4569d = bkc.mo11632x();
    }

    /* renamed from: w */
    public final long mo11631w() {
        long j = this.f4567b;
        if (!this.f4566a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4568c;
        if (this.f4569d.f3273b == 1.0f) {
            return j + azl.m4557b(elapsedRealtime);
        }
        return j + this.f4569d.mo11515a(elapsedRealtime);
    }

    /* renamed from: a */
    public final bae mo11624a(bae bae) {
        if (this.f4566a) {
            mo12077a(mo11631w());
        }
        this.f4569d = bae;
        return bae;
    }

    /* renamed from: x */
    public final bae mo11632x() {
        return this.f4569d;
    }
}
