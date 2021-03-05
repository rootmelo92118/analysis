package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hv */
final class C1363hv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f5451a;

    /* renamed from: b */
    private final /* synthetic */ C1357hp f5452b;

    C1363hv(C1357hp hpVar, String str) {
        this.f5452b = hpVar;
        this.f5451a = str;
    }

    public final void run() {
        this.f5452b.f5441a.loadUrl(this.f5451a);
    }
}
