package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final /* synthetic */ class aba implements Runnable {

    /* renamed from: a */
    private final abq f1294a;

    /* renamed from: b */
    private final abg f1295b;

    /* renamed from: c */
    private final Class f1296c;

    /* renamed from: d */
    private final aap f1297d;

    /* renamed from: e */
    private final Executor f1298e;

    aba(abq abq, abg abg, Class cls, aap aap, Executor executor) {
        this.f1294a = abq;
        this.f1295b = abg;
        this.f1296c = cls;
        this.f1297d = aap;
        this.f1298e = executor;
    }

    public final void run() {
        aau.m1657a(this.f1294a, this.f1295b, this.f1296c, this.f1297d, this.f1298e);
    }
}
