package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bo */
final class C2185bo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzfv f8210a;

    /* renamed from: b */
    private final /* synthetic */ zzk f8211b;

    /* renamed from: c */
    private final /* synthetic */ C2168ay f8212c;

    C2185bo(C2168ay ayVar, zzfv zzfv, zzk zzk) {
        this.f8212c = ayVar;
        this.f8210a = zzfv;
        this.f8211b = zzk;
    }

    public final void run() {
        this.f8212c.f8159a.mo14538l();
        this.f8212c.f8159a.mo14515a(this.f8210a, this.f8211b);
    }
}
