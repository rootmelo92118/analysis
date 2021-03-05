package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class ayl implements Callable {

    /* renamed from: a */
    private final axq f3122a;

    /* renamed from: b */
    private final akd f3123b;

    public ayl(axq axq, akd akd) {
        this.f3122a = axq;
        this.f3123b = akd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.f3122a.mo11385l() != null) {
            this.f3122a.mo11385l().get();
        }
        akd k = this.f3122a.mo11384k();
        if (k == null) {
            return null;
        }
        try {
            synchronized (this.f3123b) {
                aum.m4184a(this.f3123b, aum.m4186a((aum) k));
            }
            return null;
        } catch (aul unused) {
            return null;
        }
    }
}
