package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bk */
final class C2181bk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzag f8198a;

    /* renamed from: b */
    private final /* synthetic */ zzk f8199b;

    /* renamed from: c */
    private final /* synthetic */ C2168ay f8200c;

    C2181bk(C2168ay ayVar, zzag zzag, zzk zzk) {
        this.f8200c = ayVar;
        this.f8198a = zzag;
        this.f8199b = zzk;
    }

    public final void run() {
        zzag b = this.f8200c.mo14351b(this.f8198a, this.f8199b);
        this.f8200c.f8159a.mo14538l();
        this.f8200c.f8159a.mo14513a(b, this.f8199b);
    }
}
