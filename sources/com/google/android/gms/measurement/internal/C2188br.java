package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.br */
final class C2188br implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f8217a;

    /* renamed from: b */
    private final /* synthetic */ String f8218b;

    /* renamed from: c */
    private final /* synthetic */ String f8219c;

    /* renamed from: d */
    private final /* synthetic */ long f8220d;

    /* renamed from: e */
    private final /* synthetic */ C2168ay f8221e;

    C2188br(C2168ay ayVar, String str, String str2, String str3, long j) {
        this.f8221e = ayVar;
        this.f8217a = str;
        this.f8218b = str2;
        this.f8219c = str3;
        this.f8220d = j;
    }

    public final void run() {
        if (this.f8217a == null) {
            this.f8221e.f8159a.mo14540p().mo14333w().mo14429a(this.f8218b, (C2212co) null);
            return;
        }
        this.f8221e.f8159a.mo14540p().mo14333w().mo14429a(this.f8218b, new C2212co(this.f8219c, this.f8217a, this.f8220d));
    }
}
