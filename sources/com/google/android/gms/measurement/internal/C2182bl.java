package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bl */
final class C2182bl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzag f8201a;

    /* renamed from: b */
    private final /* synthetic */ String f8202b;

    /* renamed from: c */
    private final /* synthetic */ C2168ay f8203c;

    C2182bl(C2168ay ayVar, zzag zzag, String str) {
        this.f8203c = ayVar;
        this.f8201a = zzag;
        this.f8202b = str;
    }

    public final void run() {
        this.f8203c.f8159a.mo14538l();
        this.f8203c.f8159a.mo14514a(this.f8201a, this.f8202b);
    }
}
