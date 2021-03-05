package com.google.android.gms.internal.ads;

final class bmk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f4756a;

    /* renamed from: b */
    private final /* synthetic */ long f4757b;

    /* renamed from: c */
    private final /* synthetic */ blj f4758c;

    bmk(blj blj, String str, long j) {
        this.f4758c = blj;
        this.f4756a = str;
        this.f4757b = j;
    }

    public final void run() {
        this.f4758c.f4662a.mo12515a(this.f4756a, this.f4757b);
        this.f4758c.f4662a.mo12514a(this.f4758c.toString());
    }
}
