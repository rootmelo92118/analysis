package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.de */
final class C2229de implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f8354a;

    /* renamed from: b */
    private final /* synthetic */ zzfv f8355b;

    /* renamed from: c */
    private final /* synthetic */ zzk f8356c;

    /* renamed from: d */
    private final /* synthetic */ C2217ct f8357d;

    C2229de(C2217ct ctVar, boolean z, zzfv zzfv, zzk zzk) {
        this.f8357d = ctVar;
        this.f8354a = z;
        this.f8355b = zzfv;
        this.f8356c = zzk;
    }

    public final void run() {
        C2286i d = this.f8357d.f8302b;
        if (d == null) {
            this.f8357d.mo14235r().mo14830d_().mo14841a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f8357d.mo14442a(d, this.f8354a ? null : this.f8355b, this.f8356c);
        this.f8357d.m10753I();
    }
}
