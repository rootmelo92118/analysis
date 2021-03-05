package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ht */
final class C1361ht implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f5447a;

    /* renamed from: b */
    private final /* synthetic */ C1357hp f5448b;

    C1361ht(C1357hp hpVar, String str) {
        this.f5448b = hpVar;
        this.f5447a = str;
    }

    public final void run() {
        this.f5448b.f5441a.loadData(this.f5447a, "text/html", "UTF-8");
    }
}
